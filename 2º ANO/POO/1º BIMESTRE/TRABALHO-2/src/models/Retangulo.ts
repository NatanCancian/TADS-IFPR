export class Retangulo {
    //private base: number;
    //private altura: number;

  constructor(private base: number, private altura: number) {
        this.base = base;
        this.altura = altura;
  }

  calcularArea() {
    return this.base * this.altura;
  }

  calcularPerimetro() {
    return 2 * (this.base + this.altura);
  }
}