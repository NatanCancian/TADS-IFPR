class Calculadora{

    public somar(a:number, b:number):number{
        return a + b;
    }
    
    public subtrair(a:number, b:number):number{
        return a - b;
    }
    
    public exibirMsg():void{
        console.log("Executando operação....");
    }
}

const calc = new Calculadora();
calc.exibirMsg();
console.log("Objeto Calc:");
console.log("Soma: ", calc.somar(10,5));
console.log("Subtrair", calc.subtrair(20,5));

const calc2 = new Calculadora();
calc.exibirMsg();
console.log("Objeto Calc2:");
console.log("Soma: ", calc.somar(20,5));
console.log("Subtrair", calc.subtrair(25,5));


