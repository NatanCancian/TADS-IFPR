import { exibirMensagem } from "@utils/msg";
import { executarParte1 } from "./exercises/parte1";
import { executarParte2 } from "./exercises/parte2";
import { executarParte3 } from "./exercises/parte3";
import { executarParte4 } from "./exercises/parte4";
import { executarParte5 } from "./exercises/parte5";
import { fecharIO, perguntar } from "./utils/io";

async function main() {
    try {
        
       const opcao = (await perguntar(`
        Escolha uma opção:
           1 - Parte 1
           2 - Parte 2
           3 - Parte 3
           4 - Parte 4
           5 - Parte 5
           6 - Executar tudo
           Digite: `)).trim();

       switch (opcao) {
        case "1":
            await executarParte1();
            break;

        case "2":
            await executarParte2();
            break;
        
        case "3":
            await executarParte3();
            break;

        case "4":
            await executarParte4();
            break;

        case "5":
            await executarParte5();
            break;

        case "6":
            await executarParte1();
            await executarParte2();
            await executarParte3();
            await executarParte4();
            await executarParte5();
            break;

        default:
            exibirMensagem("Opção Inválida");
        }
    }catch(e){
            exibirMensagem(`Erro! ${e}`);
        }finally {
    fecharIO();
  }
}
main();