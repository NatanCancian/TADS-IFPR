let ativo: boolean = false;
let idade: number = 20;
let nome: string = "Nelson";

let notas: number[] = [8, 9.5, 7];                
let tags: Array<string> = ["POO", "TypeScript", "IFPR"];

let coordenada: [number,number] = [25.40, -54.00];

enum Perfil {
    ADMIN = "ADMIN",
    USER = "USER"
}

let perfil: Perfil = Perfil.USER; 

console.log(ativo, idade, nome, notas, tags, coordenada, perfil, Perfil);