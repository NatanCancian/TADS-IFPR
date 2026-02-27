function somar(a, b) {
    return a + b;
}
console.log(somar(2, 3));
var subtrair = function (c, d) { return c - d; };
console.log(subtrair(15, 5));
function logar(mensagem) {
    console.log(mensagem);
}
logar("Ok");
function falha(motivo) {
    throw new Error(motivo);
}
console.log("Antes...");
falha("Erro proposital ");
console.log("Depois...");
