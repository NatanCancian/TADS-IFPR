import{
    categorias,
    produtos,
    movimentacoes,
    usuariosMock,
    gerarIdCategoria,
    gerarIdProduto,
    gerarIdMovimentacao
} from './mockData'

import type{
    Categoria,
    Produto,
    Movimentacao,
    TipoMovimentacao,
    LoginResponse,
} from '../types';

function simularDelay<T>(valor: T): Promise<T> {
    return new Promise((resolve) => {
        setTimeout(() => resolve(valor), 300);
    });
}

export const authApi = {
    login: (email: string, senha: string): Promise<LoginResponse> =>{
        const usuario = usuariosMock.find((u) => u.email === email);
        
        if(!usuario || usuario.senha !== senha){
            return Promise.reject({
                response: {data: { message: 'Email ou senha inválidos'}}
            });
        }
        const tokenFalso = `mock-token-${usuario.id}-${Date.now()}`      
        return simularDelay({
            accessToken : tokenFalso,
            usuario: {id: usuario.id, 
                      nome: usuario.nome,
                      email: usuario.email
            }
        })
    }
}   
