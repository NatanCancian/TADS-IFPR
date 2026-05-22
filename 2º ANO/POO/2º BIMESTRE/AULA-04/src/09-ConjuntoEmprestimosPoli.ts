import { Emprestimo } from "./06-Emprestimo";
import { EmprestimoTA } from "./07-EmprestimoTA";
import { ConjuntoEmprestimos } from "./08-ConjuntoEmprestimos";

export class ConjuntoEmprestimosPoli{
    public static main(): void{
        const ce = new ConjuntoEmprestimos(5);
        ce.adicionaEmprestimo(new Emprestimo(200,3,1));
        ce.adicionaEmprestimo(new EmprestimoTA(400,4,2,15));
        ce.adicionaEmprestimo(new Emprestimo(300,2,1));
        ce.adicionaEmprestimo(new Emprestimo(450,3,2));
        ce.adicionaEmprestimo(new EmprestimoTA(700,2,3,10));

        let status : boolean;
        do{
            status = ce.proximaParcelas();
        }while(status);
    }
}