function mudarTexto(){
    document.getElementById("message").innerText = 
    "Texto Alterado com Sucesso";
}

function mudarEstilo(){
    const p = document.getElementById("message");

    p.style.color = "blue";
    p.style.fontSize = "32px";
}

function substituirTexto(){
    let nomeNovo = document.getElementById("nome").value;
    document.getElementById("message").innerText = "Olá " + nomeNovo;
}
