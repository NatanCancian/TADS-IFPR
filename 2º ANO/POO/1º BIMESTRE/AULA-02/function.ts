function somar(a: number, b: number): number {
    return a + b; 
}

console.log(somar(2,3));

const subtrair = (c: number, d: number): number => c - d;

console.log(subtrair(15,5));

function logar(mensagem: string) : void{
    console.log(mensagem);
}

logar("Ok");

function falha(motivo: string): never{
    throw new Error(motivo);
}

console.log("Antes...");
falha("Erro proposital ");
console.log("Depois...");