class Produto{
    private nome: string;
    private preco: number;

    constructor(nome:string, preco:number){
        this.nome = nome;
        this.preco = preco;
    }

    public getNome(): string{
        return this.nome;
    }

    public setNome(nome: string): void{
        this.nome = nome;
    }

    public getPreco(): number{
        return this.preco;
    }

    public setPreco(preco: number): void{
        if(preco >= 0){ 
        this.preco = preco;
        }
    }
}

const produto1 = new Produto("Notebook", 3500);

console.log("Nome inicial: ", produto1.getNome());
console.log("Preço inicial: ", produto1.getPreco());

produto1.setNome("Notebook Gamer");
produto1.setPreco(7500);

console.log("Nome inicial: ", produto1.getNome());
console.log("Preço inicial: ", produto1.getPreco());