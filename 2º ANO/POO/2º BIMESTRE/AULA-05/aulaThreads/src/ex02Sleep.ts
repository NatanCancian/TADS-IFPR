function sleep(ms: number): Promise<void>{
    return new Promise((resolve) => setTimeout(resolve, ms));
}

class MonitorSimples{
    private monitorando: boolean = true;

    public async iniciar(): Promise<void>{
        console.log("Iniciando monitoramento...");

        let contador = 0;

        while(this.monitorando && contador < 5){
            console.log("Monitorando recurso...");
            contador++;
            await sleep(1000);
        }

        console.log("Monitoramento finalizado.");
    }

    public parar(): void{
        this.monitorando = false;
    }
}

const monitor = new MonitorSimples();
monitor.iniciar();

export{}