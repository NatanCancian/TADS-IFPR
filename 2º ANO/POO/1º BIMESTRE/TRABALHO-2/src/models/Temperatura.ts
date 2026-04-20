export class Temperatura{
    private _celcius: number = 0;

    public get celcius(): number{
        return this._celcius;
    }

    public set celcius(valor: number){
        if(valor >= -273.15){
            this._celcius = valor;
        }
    }
}
