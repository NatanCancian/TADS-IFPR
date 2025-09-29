function limparEstilos() {
    document.querySelectorAll(".paragrafo, #paragrafo-unico, .destacado").forEach(el => {
        el.style.backgroundColor = "";
    });
}

function selecionarPorId() {
    limparEstilos();
    const elemento = document.getElementById("paragrafo-unico");
    elemento.style.backgroundColor = "lightblue";
    alert("Selecionado com getElementById");
}

function selecionarPorClasse() {
    limparEstilos();
    const elementos = document.getElementsByClassName("paragrafo");
    for (let el of elementos) {
        el.style.backgroundColor = "lightgreen";
    }
    alert("Selecionado com getElementsByClassName");
}

function selecionarPorTag() {
    limparEstilos();
    const elementos = document.getElementsByTagName("p");
    for (let el of elementos) {
        el.style.backgroundColor = "lightcoral";
    }
    alert("Selecionado com getElementsByTagName");
}

function selecionarQuery() {
    limparEstilos();
    const elemento = document.querySelector(".paragrafo");
    elemento.style.backgroundColor = "lightpink";
    alert("Selecionado com querySelector (retorna o primeiro)");
}

function selecionarQueryTodos() {
    limparEstilos();
    const elementos = document.querySelectorAll(".paragrafo");
    elementos.forEach(el => {
        el.style.backgroundColor = "lightgray";
    });
    alert("Selecionado com querySelectorAll");
}
