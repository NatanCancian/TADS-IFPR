function insert(num){
    var numero = document.getElementById('resultado').innerHTML;
    document.getElementById('resultado').innerHTML = numero + num;
}

function limpar(){
    document.getElementById('resultado').innerHTML = null;
}

function apagar(){
    var resultado = document.getElementById('resultado').innerHTML;
    document.getElementById('resultado').innerHTML = resultado.slice(0, resultado.length -1);
}

function calcular(){
     var resultado = document.getElementById('resultado').innerHTML;
     if(resultado){
        document.getElementById('resultado').innerHTML = eval(resultado);
     }else{
        alert('Insira valores na calculadora!');
     }
}