/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodate;

import java.time.LocalDate;
import java.time.Month;


/**
 *
 * @author 631520227
 */
public class testeData1 {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();

        LocalDate dataNascimento = LocalDate.of(1998, Month.APRIL, 1);
        
        System.out.println("Dia:"+dataNascimento.getDayOfMonth());
        System.out.println("Mês:"+dataNascimento.getMonth());
        System.out.println("Ano:"+dataNascimento.getYear());
        
        
        
        LocalDate amanha = dataHoje.plusDays(1);
        
        System.out.println("Amanhã é: "+amanha);
        
              
    }
    
    
    
    
}
