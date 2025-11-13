let listaTransacoes = [];
  
  let editando = false;
  
  function adicionarTransacao(e) {
    e.preventDefault();
  
    let idTransacao = document.getElementById("idTransacao").value;
    let descricao = document.getElementById("descricao").value;
    let valor = document.getElementById("valor").value;
    let tipo = document.getElementById("tipo").value;
    let data = document.getElementById("data").value;
  
    if (descricao == "" || valor == "" || tipo == "" || data == "") {
      alert("Por favor, preencha todos os campos!");
      return;
    }
  
    if (editando == true) {
      salvarEdicao(idTransacao, descricao, parseFloat(valor), tipo, data);
      return;
    }
  
    let novaTransacao = {
      id: listaTransacoes.length > 0 ? listaTransacoes[listaTransacoes.length - 1].id + 1 : 1,
      descricao: descricao,
      valor: parseFloat(valor),
      tipo: tipo,
      data: data
    };
  
    listaTransacoes.push(novaTransacao);
  
    // Simulação da API (POST)
    /*
    fetch('URL_DA_API/transacoes', {
      method: 'POST',
      body: JSON.stringify(novaTransacao),
      headers: { 'Content-Type': 'application/json' }
    })
    .then(res => res.json())
    .then(dados => console.log("Transação criada:", dados))
    .catch(erro => console.log("Erro na API:", erro));
    */
  
    document.getElementById("formTransacao").reset();
    mostrarTransacoes();
  }
  
  function mostrarTransacoes() {
    let corpoTabela = document.querySelector("#tabelaTransacoes tbody");
    corpoTabela.innerHTML = "";
  
    for (let i = 0; i < listaTransacoes.length; i++) {
      let t = listaTransacoes[i];
      let linha = document.createElement("tr");
  
      linha.innerHTML = `
        <td>${t.id}</td>
        <td>${t.descricao}</td>
        <td>${t.valor.toFixed(2)}</td>
        <td>${t.tipo}</td>
        <td>${t.data}</td>
        <td>
          <button onclick="editarTransacao(${t.id})">Editar</button>
          <button onclick="excluirTransacao(${t.id})">Excluir</button>
        </td>
      `;
  
      corpoTabela.appendChild(linha);
    }
  
    // Simulação da API (GET)
    /*
    fetch('URL_DA_API/transacoes')
      .then(res => res.json())
      .then(dados => console.log("Transações:", dados))
      .catch(erro => console.log("Erro na API:", erro));
    */
  }
  
  function editarTransacao(id) {
    let transacaoEncontrada = listaTransacoes.find(function(t) {
      return t.id === id;
    });
  
    if (!transacaoEncontrada) {
      alert("Transação não encontrada!");
      return;
    }
  
    document.getElementById("idTransacao").value = transacaoEncontrada.id;
    document.getElementById("descricao").value = transacaoEncontrada.descricao;
    document.getElementById("valor").value = transacaoEncontrada.valor;
    document.getElementById("tipo").value = transacaoEncontrada.tipo;
    document.getElementById("data").value = transacaoEncontrada.data;
  
    editando = true;
  }
  
  function salvarEdicao(id, descricao, valor, tipo, data) {
    let indice = listaTransacoes.findIndex(function(t) {
      return t.id == id;
    });
  
    if (indice == -1) {
      alert("Erro ao editar!");
      return;
    }
  
    listaTransacoes[indice] = {
      id: Number(id),
      descricao: descricao,
      valor: valor,
      tipo: tipo,
      data: data
    };
  
    // Simulação da API (PUT)
    /*
    fetch(`URL_DA_API/transacoes/${id}`, {
      method: 'PUT',
      body: JSON.stringify(listaTransacoes[indice]),
      headers: { 'Content-Type': 'application/json' }
    })
    .then(res => res.json())
    .then(dados => console.log("Transação atualizada:", dados))
    .catch(erro => console.log("Erro na API:", erro));
    */
  
    document.getElementById("formTransacao").reset();
    editando = false;
    mostrarTransacoes();
  }

  function excluirTransacao(id) {
    listaTransacoes = listaTransacoes.filter(function(t) {
      return t.id !== id;
    });
  
    // Simulação da API (DELETE)
    /*
    fetch(`URL_DA_API/transacoes/${id}`, {
      method: 'DELETE'
    })
    .then(res => res.json())
    .then(dados => console.log("Transação excluída:", dados))
    .catch(erro => console.log("Erro na API:", erro));
    */
  
    mostrarTransacoes();
  }
  
  document.getElementById("formTransacao").addEventListener("submit", adicionarTransacao);
  
  mostrarTransacoes();
  