export class Televisao {
  private canal: number = 1;

  setCanal(canal: number) {
    this.canal = canal; // this refere ao atributo da classe, canal dps do = é só a variavél 
    //                     passada como parâmetro 
  }

  getCanal() {
    return this.canal;
  }
}