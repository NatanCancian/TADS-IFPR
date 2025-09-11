/*document.addEventListener("DOMContentLoaded", function() {
    const botaoAdicionar = document.querySelector("button");
    
    const entradaTarefa = document.getElementById("entradaTarefa");
    //Campo de entrada para tarefa
    const listaTarefas = document.getElementById("listaTarefas");
    //Lista onde as tarefas serã adicionadas
//Adiciona o evento de clique no botão
botaoAdicionar.addEventListener("click", function (){
const tarefaTexto = entradaTarefa.value.trim(); //Pega o texto da tarefa
    
//Verifica se a tarefa não está vazia     
if(tarefaTexto != ""){
    //Cria um novo item da lista
    const li = document.createElement("li");
    li.classList.add("list-group-item", "d-flex", "justify-content-between", "align-items-center");

    //Cria o texto da tarefa
    li.textContent = tarefaTexto;

    //Cria o botão de editar
    const btnEditar = document.createElement("button");
    btnEditar.classList.add("btn", "btn-warning", "btn-sm", "me-2");
    btnEditar.textContent = "Editar";

    //Cria o botão para remover a tarefa
    const btnRemover = document.createElement("button");
    btnRemover.classList.add("btn", "btn-danger", "btn-sm");
    btnRemover.textContent = "Remover";

    //Adiciona o evento de clique para remover a tarefa
    btnRemover.addEventListener("click", function() {
        listaTarefas.removeChild(li);
    });

    //Adiciona o botão de remover ao item da lista
    li.appendChild(btnRemover);
    //tarefaTexto

    //Adiciona tarefa à lista
    listaTarefas.appendChild(li);

    //Limpa o campo de entrada
    entradaTarefa.value = "";
} else{
    alert("Por favor, insira uma tarefa válida!");
 } 
});
});
 */
document.addEventListener("DOMContentLoaded", function() {
    const botaoAdicionar = document.getElementById("nova-tarefa");
    const entradaTarefa = document.getElementById("entradaTarefa");
    const listaTarefas = document.getElementById("listaTarefas");

    botaoAdicionar.addEventListener("click", function () {
        const tarefaTexto = entradaTarefa.value.trim();

        if (tarefaTexto !== "") {
            const li = document.createElement("li");
            li.classList.add("list-group-item", "d-flex", "justify-content-between", "align-items-center");

            // Cria o span com o texto da tarefa
            const spanTexto = document.createElement("span");
            spanTexto.textContent = tarefaTexto;

            // Botões de ação
            const containerBotoes = document.createElement("div");

            // Botão Editar
            const btnEditar = document.createElement("button");
            btnEditar.classList.add("btn", "btn-warning", "btn-sm", "me-2");
            btnEditar.textContent = "Editar";

            // Botão Remover
            const btnRemover = document.createElement("button");
            btnRemover.classList.add("btn", "btn-danger", "btn-sm");
            btnRemover.textContent = "Remover";

            // Evento de remover
            btnRemover.addEventListener("click", function() {
                listaTarefas.removeChild(li);
            });

            // Evento de editar
            btnEditar.addEventListener("click", function () {
                if (btnEditar.textContent === "Editar") {
                    // Trocar para modo de edição
                    const inputEditar = document.createElement("input");
                    inputEditar.type = "text";
                    inputEditar.value = spanTexto.textContent;
                    inputEditar.classList.add("form-control", "form-control-sm");

                    li.replaceChild(inputEditar, spanTexto);
                    btnEditar.textContent = "Salvar";
                } else {
                    // Salvar edição
                    const novoTexto = li.querySelector("input").value.trim();
                    if (novoTexto !== "") {
                        spanTexto.textContent = novoTexto;
                        li.replaceChild(spanTexto, li.querySelector("input"));
                        btnEditar.textContent = "Editar";
                    } else {
                        alert("A tarefa não pode ser vazia.");
                    }
                }
            });

            containerBotoes.appendChild(btnEditar);
            containerBotoes.appendChild(btnRemover);

            li.appendChild(spanTexto);
            li.appendChild(containerBotoes);

            listaTarefas.appendChild(li);

            entradaTarefa.value = "";
        } else {
            alert("Por favor, insira uma tarefa válida!");
        }
    });
});