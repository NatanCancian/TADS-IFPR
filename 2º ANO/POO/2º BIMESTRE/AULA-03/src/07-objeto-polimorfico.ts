class Pedido{
    private numero: number;
    private status: string;

    constructor(numero: number){
        this.numero = numero;
        this.status = "Criado";
    }

    public exibirStatus(): void{
        console.log(`Pedido nº ${this.numero} | Status: ${this.status}`);
    }

    public pagar(): void{
        this.status = "Pago";
    }

    public enviar(): void{
        this.status = "Enviado";
    }

    public entregar(): void{
        this.status = "Entregue";
    }
}

const pedido = new Pedido(1001);

pedido.exibirStatus();

pedido.pagar();
pedido.exibirStatus();

pedido.enviar();
pedido.exibirStatus();

pedido.pagar();
pedido.exibirStatus();

export{};