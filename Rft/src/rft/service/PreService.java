package rft.service;

import java.util.List;
import rft.Pre;
import rft.LoginFuncao;

/**
 * PreService - camada de serviço que encapsula chamadas à LoginFuncao (DAO)
 * e fornece uma interface orientada a negócio para a UI.
 * Isso ajuda a aplicar o princípio de responsabilidade única (SOLID).
 */
public class PreService {

    public PreService() {
    }

    public List<Pre> listarPresenca() {
        return LoginFuncao.listarPresenca();
    }

    public List<Pre> buscarPorNome(String nome) {
        return LoginFuncao.buscarPorNomePr(nome);
    }

    public boolean cadastrarPresenca(Pre p) {
        return LoginFuncao.cadastrarpr(p);
    }
}