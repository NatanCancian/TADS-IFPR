class Usuario {
  //private nome: string;
  //private perfil: string;

  constructor(private nome: string, private perfil: string = "aluno") {
    //this.nome = nome;
    //this.perfil = perfil;
  }

  public exibir(): void {
    console.log(`${this.nome} - ${this.perfil}`);
  }
}

const u1 = new Usuario("Ana");
const u2 = new Usuario("Carlos", "professor");

u1.exibir();
u2.exibir();