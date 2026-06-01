import { ConjuntoEmprestimos } from "./ConjuntoEmprestimos";
import { Emprestimo } from "./Emprestimo";
import { EmprestimoTA } from "./EmprestimoTA";
import { EmprestimoComDesconto } from "./EmprestimoComDesconto";
import { EmprestimoEducacional } from "./EmprestimoEducacional";
import { EmprestimoComJurosProgressivo } from "./EmprestimoComJurosProgressivo";
import { EmprestimoMoradia } from "./EmprestimoMoradia";
import { EmprestimoVeiculo } from "./EmprestimoVeiculo";
import { EmprestimoComFiador } from "./EmprestimoComFiador";

class ConjuntoEmprestimosPoli {
  public static main(): void {
    const ce = new ConjuntoEmprestimos(8);

    ce.adicionaEmprestimo(new Emprestimo(200, 3, 1));
    ce.adicionaEmprestimo(new EmprestimoTA(500, 4, 2, 15));
    ce.adicionaEmprestimo(new EmprestimoComDesconto(1000, 5, 2, 10));
    ce.adicionaEmprestimo(new EmprestimoEducacional(1000, 5, 2, 2));
    ce.adicionaEmprestimo(new EmprestimoComJurosProgressivo(1000, 5, 2, 1));
    ce.adicionaEmprestimo(new EmprestimoMoradia(100000, 240, 1.5, true));
    ce.adicionaEmprestimo(new EmprestimoVeiculo(50000, 72, 2, "usado"));
    ce.adicionaEmprestimo(new EmprestimoComFiador(10000, 12, 2, true));

    let status: boolean;

    do {
      status = ce.proximasParcelas();
    } while (status);
  }
}

ConjuntoEmprestimosPoli.main();
