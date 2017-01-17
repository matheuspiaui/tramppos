/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramppos.service;

import com.tramppos.domain.Endereco;
import com.tramppos.repository.EnderecoRepository;
import java.util.List;

/**
 *
 * @author matheus
 */
public class EnderecoService {
    
    private EnderecoRepository enderecoRepository;

    //contrutor
    public EnderecoService() 
    {
        this.enderecoRepository = new EnderecoRepository();
    }

    //getter e setter
    public EnderecoRepository getEnderecoRepository() {
        return enderecoRepository;
    }
    public void setEnderecoRepository(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }
    
    // comandos
    public void insert(Endereco endereco){
        getEnderecoRepository().insert(endereco);
    }    
    public void update(Endereco endereco){
        getEnderecoRepository().update(endereco);
    }
    public void delete(Endereco endereco){
        getEnderecoRepository().delete(endereco);
    }
    
    ///
    // Metodos que retornam lista
    ///
    public List<Endereco> consult(){
        return getEnderecoRepository().consult();
    }
    
}