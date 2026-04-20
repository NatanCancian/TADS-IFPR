export class Lampada {
  private ligada: boolean = false;

  public ligar(): void {
    this.ligada = true;
    console.log("*clack*")
  }

   public desligar(): void {
    this.ligada = false;
    console.log("*clack*")
  }

  public estaLigada(): string {
    if (this.ligada) {
        return "\nA lâmpada está ligada.\n";
    } else {
        return "\nA lâmpada está desligada.\n";
    }
  }
}