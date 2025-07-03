function calcularMedia(){
    //Criar as referências com os elementos da página
    let inNome = document.getElementById("inNome");
    let inNota1 = document.getElementById("inNota1");
    let inNota2 = document.getElementById("inNota2");
    let outSituacao = document.getElementById("outSituacao");
    let outMedia = document.getElementById("outMedia");

    //obter os valores dos inputs
    const nome = inNome.value;
    const nota1 = Number(inNota1.value);
    const nota2 = Number(inNota2.value);

    //calcular a média


    let media = (nota1 + nota2)/2;

    outMedia.textContent = "Média das Notas :" + media;

    if(media >=7){
        outSituacao.textContent = "Parabéns " + nome + "! Vocâ foi aprovado(a)";
        outSituacao.style.color = "blue";
    }
    else if(media >= 4){
        outSituacao.textContent = "Atenção " + nome + "! Você foi para Exame";
        outSituacao.style.color = "green";
    }else{
        outSituacao.textContent = "Ops " + nome + "! Você foi reprovado";
        outSituacao.style.color = "red";
    }

}
document.getElementById("btResultado").addEventListener("click",calcularMedia);
