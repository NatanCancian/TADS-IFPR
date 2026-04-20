export function executarParte1(): void {

    function ex01()  {
        const nome: string = "Natan";
        const idade: number = 23;
        const curso: string = "TADS";
        console.log(`EXERCÍCIO 1:\nNome: ${nome}\n Idade: ${idade}\n Curso: ${curso}\n Estou aprendendo TypeScript!`);
    }

    function ex02() {
        let nome;
        let idade1;
        let _valor;
        let $preco;
        let usuarioNome;
        console.log(`\nEXERCÍCIO 2:\nVálidos: let nome; let idade1; let _valor; let $preco; let usuarioNome;\n\nInválidos:
        let 1nome; -> começa com número
        let nome-completo; -> hífen não permitido
        let let; -> palavra reservada
        let nome completo; -> espaço
        let @email; -> caractere inválido `);
    }
    function ex03() {
        var x = 10; // tem escopo global/função inteira
        let y = 20; // tem escopo de bloco/local 
        const z = 30; // não pode ser reatribuído
        y = 50; // é permitido

        console.log(`\nEXERCÍCIO 3: var x = 10; tem escopo global(código inteiro) e de função, porém não respeita função,
         se fizer um if, e tiver var lá dentro, é possível "vazar" o valor da var, para a função, fora do 
         bloco do if , e sofre o hoisting\n
         let y = 20; tem escopo de bloco/local, só existe dentro de sua área de declaração sofre o hoisting
         mas n consegue acessar\n
         const z = 30; tem escopo de bloco/local, similar a let, e não pode ser reatribuída
         y = 50; isso é permitido, z = 40 isso não é permitido `);
    }

    function ex04() {
        const nome = "Natan";
        const nota1 = 8;
        const nota2 = 7;
        const media = (nota1 + nota2) / 2;

        console.log(`\nEXERCÍCIO 4:\nAluno: ${nome}
       Nota 1: ${nota1}
       Nota 2: ${nota2}
       Média: ${media}`);
    }
    ex01();
    ex02();
    ex03();
    ex04();
}
