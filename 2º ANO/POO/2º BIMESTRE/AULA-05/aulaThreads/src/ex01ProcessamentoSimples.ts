class ProcessadorSimples{
    public processar(): void{
        for(let i = 0; i < 10; i++){
            console.log(`Processamento de dados ${i}`);
        }
    }
}

const processador = new ProcessadorSimples();
processador.processar();

export {};
