document.getElementById('buscar').addEventListener('click', async () => {
    const cidade = document.getElementById('cidade').value;
    if (!cidade) {
        alert('Por favor, digite o nome da cidade.');
        return;
    }

    try {
        const response = await fetch(`/previsao/${cidade}`);
        if (!response.ok) {
            throw new Error('Cidade não encontrada.');
        }

        const data = await response.json();

        // Atualiza a interface
        document.getElementById('nome-cidade').textContent = data.cidade;
        document.getElementById('temperatura').textContent = `${data.temperatura}°C`;
        document.getElementById('condicao').textContent = data.condicao;
        document.getElementById('umidade').textContent = data.umidade;
        document.getElementById('data').textContent = new Date().toLocaleDateString('pt-BR');
    } catch (error) {
        alert(error.message);
    }
});