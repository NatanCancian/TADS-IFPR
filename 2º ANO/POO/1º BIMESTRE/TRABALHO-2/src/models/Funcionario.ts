//-> Classe base (Pai)
export class Funcionario {
    public nome: string;       // PUBLIC: Acessível de qualquer lugar
    private salario: number;   // PRIVATE: Acessível APENAS dentro desta classe
    protected bonus: number;   // PROTECTED: Acessível nesta classe e nas classes filhas

    constructor(nome: string, salario: number, bonus: number) {
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
    }

    public mostrarSalario(): void {
        // O private pode ser acessado aqui dentro
        console.log(`O salário de ${this.nome} é R$ ${this.salario}`);
    }
}

// Classe derivada (Filha)
export class Gerente extends Funcionario {
    public verBonus(): void {
        // O protected pode ser acessado na classe filha
        console.log(`O bônus do gerente é R$ ${this.bonus}`);
        
        // console.log(this.salario); // ERRO! private não é visível aqui
    }
}

export class Patrao extends Gerente{
    private receber(): void{
        console.log(`O patrão recebe ${this.bonus}`);
        // console.log(this.salario); // ERRO! private não é visível aqui, mesma lógica dá anterior
    }
}