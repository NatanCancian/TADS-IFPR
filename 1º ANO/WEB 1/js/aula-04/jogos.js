let clubes = [];
const inClube = document.getElementById("inClube");
const outLista = document.getElementById("outLista");
const btAdicionar = document.getElementById("btAdicionar");
const btListar = document.getElementById("btListar");
const btMontar = document.getElementById("btMontar");

function adicionarClube(){

    const nome = inClube.value.trim();

    if(!nome){
        alert("Informe o nome do clube");
        inClube.focus();
        return;
    }

    clubes.push(nome);

    inClube.value = "";
    inClube.focus();                                                                  
}

function listarClubes(){
    if(clubes.length  === 0){
        outLista.textContent = "Não há clubes na lista...";
        return
    }

    outLista.textContent = clubes
        .map((clube, i)=> `${i + 1}.${clube}`)
        .join("\n")
    }

    function montarJogos(){
        const tamanho_vetor = clubes.length;

        if(tamanho_vetor === 0 || tamanho_vetor %2 !== 0){
            alert("Deve haver número par de clubes");
            inClube.focus();
            return;
        }

        const jogos = clubes
            .slice(0, tamanho_vetor/2)
            .map((clube, i) => `${clube} x ${clubes[tamanho_vetor -1 -i]}`)
            .join("\n");

        outLista.textContent = jogos;

    }

btAdicionar.addEventListener("click", adicionarClube);
btListar.addEventListener("click", listarClubes);
btMontar.addEventListener("click", montarJogos);