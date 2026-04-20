import { exibirMensagem } from "../utils/msg";
import { Produto } from "../models/Produto";
import { Pessoa } from "../models/Pessoa";
import { Retangulo } from "../models/Retangulo";
import { ContaBancaria } from "../models/ContaCorrente";
import { Funcionario, Gerente, Patrao } from "../models/Funcionario";
import { Temperatura } from "../models/Temperatura";
import { Televisao } from "../models/Televisao";

export function executarParte4() {

    function ex17() {
        exibirMensagem("EXERCÍCIO 17:");
        const pessoa1 = new Pessoa("Natan", 23);
        exibirMensagem(pessoa1.apresentar());
    }

    function ex18() {
        exibirMensagem("\nEXERCÍCIO 18:");
        const produto1 = new Produto("Notebook", 3500, 8);
        produto1.adicionarEstoque(1);
        produto1.removerEstoque(2);
        exibirMensagem(produto1.exibirProduto());
    }

    function ex19() {
        exibirMensagem("\n EXERCÍCIO 19:");
        const retangulo1 = new Retangulo(100, 200);
        exibirMensagem(`Área: ${retangulo1.calcularArea()}`);
        exibirMensagem(`Perímetro: ${retangulo1.calcularPerimetro()}`);
    }

    function ex20() {
        exibirMensagem("\n EXERCÍCIO 20:");
        const conta1 = new ContaBancaria("Natan", 5000);
        conta1.depositar(100);
        conta1.sacar(200);
        conta1.consultarSaldo();
        conta1.sacar(7000);
        exibirMensagem(`Saldo atual: R$ ${conta1.consultarSaldo().toFixed(2)}`);
    }

    function ex21() {
        exibirMensagem("\n EXERCÍCIO 21:");
        const funcionario = new Funcionario("Natan", 3000, 500);
        const gerente = new Gerente("Gerente-Natan", 5000, 1000);
        const patrao = new Patrao("Patrão-Natan", 10000, 50);
        gerente.verBonus();
        patrao.mostrarSalario();
        patrao.nome;
        // patrao.receber();// ERRO: private só dentro da classe Patrao
        // console.log(gerente.salario);// ERRO: private só dentro da classe Gerente
        // Acesso Externo

        console.log(gerente.nome);
        console.log(funcionario.nome);   // OK: public é livre
        // console.log(funcionario.bonus); // ERRO: protected só dentro da classe ou filhas
        // console.log(funcionario.salario); // ERRO: private só dentro da classe Funcionario

        funcionario.mostrarSalario(); // OK: chamando um método público que lê um dado privado
    }

    function ex22() {
       exibirMensagem("\n EXERCÍCIO 22:");
       const t = new Temperatura();
       t.celcius = 25;
       exibirMensagem(`Temperatura atual: , ${t.celcius}`);
       t.celcius = -300;
       exibirMensagem(`Após tentar definir -300: , ${t.celcius}`);
       t.celcius = 100;
       exibirMensagem(`Após tentar definir 100: , ${t.celcius}`);
    }

    function ex23() {
        exibirMensagem("\n EXERCÍCIO 23:");
        const tv = new Televisao();
        tv.setCanal(7);
        exibirMensagem(`Canal ${tv.getCanal()}`);
    }
    ex17();
    ex18();
    ex19();
    ex20();
    ex21();
    ex22();
    ex23();
}

