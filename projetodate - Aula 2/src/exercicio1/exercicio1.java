/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Thiago Einloft
 * trazer diferenças entre dias e anos entre hoje e data de nascimento
 * -> Dica: ver constantes de ChronoUnit
 * Retornar o dia da semana do natal desse ano(25/12).
 */
public class exercicio1 {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1989, Month.NOVEMBER, 13);
        LocalDate hoje = LocalDate.now();
        
        long intervalo = ChronoUnit.DAYS.between(dataNascimento, hoje);
        
        MonthDay diaNatal = MonthDay.of(12,25);
        LocalDate dataNatal = diaNatal.atYear(Year.now().getValue());
        
        
        
        
        System.out.println(intervalo);
        System.out.println(dataNatal.getDayOfWeek());
        
        
    }
}
