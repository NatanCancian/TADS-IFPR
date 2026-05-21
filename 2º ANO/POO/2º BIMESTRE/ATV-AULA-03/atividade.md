Crie um programa em TypeScript usando polimorfismo.

O sistema deverá possuir uma classe abstrata chamada `Personagem`.

A classe `Personagem` deverá ter:

- atributo `nome`;
- atributo `energia`;
- método abstrato `atacar()`;
- método concreto `exibirStatus()`.

Depois, crie pelo menos três classes filhas:

- `Guerreiro`;
- `Mago`;
- `Arqueiro`.

Cada classe deverá implementar o método `atacar()` de forma diferente.

### Requisitos

1. criar uma classe abstrata `Personagem`;
2. criar três classes filhas;
3. sobrescrever o método `atacar()`;
4. criar uma lista do tipo `Personagem[]`;
5. percorrer a lista com `for...of`;
6. chamar os métodos `exibirStatus()` e `atacar()` para cada personagem.