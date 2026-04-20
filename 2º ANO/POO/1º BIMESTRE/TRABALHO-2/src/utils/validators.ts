export function verificarVazio(valor: string, campo: string): string {
  if (!valor.trim()) {
    throw new Error(`${campo} é obrigatório`);
  } 
  return valor;
}

export function validarIdade(idade: number) {
  if (!Number.isInteger(idade) || idade < 0 || idade > 120) {
    throw new Error("Idade inválida");
  }
}

export function ehPar(numero: number): boolean {
  return numero % 2 === 0;
}

export function testarInteiro(valor: number): void{ 
    if(!Number.isInteger(valor)){
     throw new Error(`${valor} não é inteiro`);
    }else{
      console.log(`${valor} é inteiro`)
    }
}

export function entre(n: number, min: number, max: number, nomeCampo: string): number {
  if (n < min || n > max) {
    throw new Error(`"${nomeCampo}" deve estar entre ${min} e ${max}. Valor: ${n}`);
  }
  return n;
}

export function parseNumeroInteiro(valor: string, nomeCampo: string): number {
  const v = verificarVazio(valor, nomeCampo);
  const n = Number(v);

  if (!Number.isInteger(n)) {
    throw new Error(`"${nomeCampo}" deve ser um número inteiro. Você informou: ${valor}`);
  }

  return n;
}