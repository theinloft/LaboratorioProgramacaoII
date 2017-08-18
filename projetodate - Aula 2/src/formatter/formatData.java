/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import util.Console;

/**
 *
 * @author Thiago Einloft
 */
public class formatData {
    public static void main(String[] args) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje.format(formatador));
        
        String dataString = Console.scanString("Digite a data de nascimento:");
        LocalDate dataNasc = LocalDate.parse(dataString,formatador);
        System.out.println(dataNasc);
    }
}
