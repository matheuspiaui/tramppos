/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matheus.teste;

import com.tramppos.domain.Foto;
import com.tramppos.domain.Servico;
import com.tramppos.service.FotoService;
import java.util.List;


/**
 *
 * @author matheus
 */
public class FotoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Foto foto = new Foto(); 
        FotoService fotoService = new FotoService();        
        Servico servico = new Servico();
        
        servico.setId(2);
//        Pessoa pessoa = new Pessoa();
//        
//        2
//        servico.setId(1);
//        pessoa.setId(1);
//        
//        foto.setPessoa(pessoa);
//        foto.setServico(servico);
//        foto.setDescricao("teste");
//        foto.setTitulo("Teste Titulo");
//        foto.setLink("teste.jpg");
//        
//        Date data = new Date(System.currentTimeMillis());
//        System.out.println("Data: " + data.toString());
//        System.out.println("Year: " + data.getYear());
//        System.out.println("Month: " + data.getMonth());
//        System.out.println("Day: " + data.getDay());
//
//        
//        foto.setDataPestagem(data);
//        //        fotoService.insert(foto);
//        
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date(System.currentTimeMillis());
//        
//        SimpleDateFormat year = new SimpleDateFormat("yyyy");
//        SimpleDateFormat month = new SimpleDateFormat("MM");
//        SimpleDateFormat day = new SimpleDateFormat("dd");
//        
//        System.out.println("Data: " + format.format(date));
//        System.out.println("Year: " + year.format(date));
//        System.out.println("Month: " + month.format(date));
//        System.out.println("Day: " + day.format(date));
        
        System.out.println("Teste Foto: "+ fotoService.consult(servico).toString());
//          System.out.println("Teste Foto: "+ fotoService.consult().toString());
          
//          com.matheus.util.Util.printList((List<Object>) (Object) fotoService.consult());
             
    }
    
}
