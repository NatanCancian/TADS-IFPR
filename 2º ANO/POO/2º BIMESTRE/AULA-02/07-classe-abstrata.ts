/* Continue o código criando novas classes que herdam de FormaGeométrica
 * As classes devem ser:
 * Retângulo, Triângulo, Círculo
 * Cada classe deve implementar o método: calcularArea(): number;
 */

abstract class FormaGeometrica{
    public abstract calcularArea(): number;
}

class Quadrado extends FormaGeometrica{
    private lado: number;

    constructor(lado: number){
        super();
        this.lado = lado;    
    }
    public calcularArea(): number {
        return this.lado * this.lado;
    }
}

const quadrado = new Quadrado(5);
console.log(`${quadrado.constructor.name}Área: ${quadrado.calcularArea()}`);

class Retangulo extends FormaGeometrica{
    private base: number;
    private altura : number;

    constructor(base: number, altura: number){
        super();
        this.base = base;
        this.altura = altura;    
    }

    public calcularArea(): number{
        return this.base * this.altura;
    }
}

const retangulo = new Retangulo(10,10);
console.log(`${retangulo.constructor.name}Área: ${retangulo.calcularArea()}`);

class Triangulo extends FormaGeometrica{
    private lado: number;

    constructor(lado: number){
        super();
        this.lado = lado;    
    }

    public calcularArea(): number{
        return ((Math.pow(this.lado,2)) * Math.sqrt(3))/4;
    }
}
const triangulo = new Triangulo(10);
console.log(`${triangulo.constructor.name}Área: ${triangulo.calcularArea()}`);



class Circulo extends FormaGeometrica{
    private raio: number;

    constructor(raio: number){
        super();
        this.raio = raio;    
    }

    public calcularArea(): number{
        return ((Math.PI) * Math.pow(this.raio,2));
    }
}
const circulo = new Circulo(10);
console.log(`${circulo.constructor.name}Área: ${circulo.calcularArea()}`);


export{};
// USAR CLASSE ABSTRATA QUANDO QUER BLOQUEAR INSTANCIAÇÃO NA SUPERCLASSE, NAQUELE ESCOPO ESPECÍFICO 
// INTERFACE PARA PADRONIZAR O PROJETO GERAL 