
export class Produto{
    private nome: string;
    private preco: number;
    private estoque: number;

    constructor(nome:string, preco:number, estoque: number){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
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

    public getEstoque(): number{
        return this.estoque;
    }

    public setEstoque(quantidade: number): void{
        if(quantidade >= 0){ 
        this.estoque = quantidade;
        }
    }

    public adicionarEstoque(quantidade: number): void{
        if(quantidade >= 0){ 
        this.estoque += quantidade;
        }
    }

    public removerEstoque(quantidade: number): void{
        if(quantidade >= 0){ 
        this.estoque -= quantidade;
        }
    }

    public exibirProduto():string{
        return `Nome: ${this.nome}, Preço: ${this.preco}, Estoque ${this.estoque}`;
    }
}