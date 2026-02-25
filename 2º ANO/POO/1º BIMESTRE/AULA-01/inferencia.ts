let curso = "TADS"; //inferido como STRING
//curso = 10;

let ano: number; //anotação explícita
ano = 2026;

function dobro(x:number){
    return x * 2; // retorno inferido como number
}

console.log(dobro(10));