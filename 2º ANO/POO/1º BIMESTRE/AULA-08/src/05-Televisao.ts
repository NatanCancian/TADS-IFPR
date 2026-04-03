class Televisao {
  private canal: number;
  private volume: number;
  private ligada: boolean;

  constructor() {
    this.canal = 1;
    this.volume = 10;
    this.ligada = false;
  }

  public ligar(): void {
    this.ligada = true;
  }

  public desligar(): void {
    this.ligada = false;
  }

  public setCanal(canal: number): void {
    if (canal >= 1 && canal <= 999) {
      this.canal = canal;
    }
  }

  public aumentarVolume(): void {
    if (this.volume < 100) {
      this.volume++;
    }
  }

  public diminuirVolume(): void {
    if (this.volume > 0) {
      this.volume--;
    }
  }

  public exibirStatus(): void {
    console.log(`Ligada: ${this.ligada}`);
    console.log(`Canal: ${this.canal}`);
    console.log(`Volume: ${this.volume}`);
  }
}

const tv = new Televisao();
tv.ligar();
tv.setCanal(12);
tv.aumentarVolume();
tv.exibirStatus();