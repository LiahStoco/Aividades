/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class testaEmpregados {
    public static void main(String[] args) {
        empregado obj1 = new empregado("Maria","Souza");
        empregado obj2 = new empregado("Jo�o","Luiz");
        
        JOptionPane.showMessageDialog(null, 
                "Qtde de objetos: " + empregado.getContador()
                , "Aten��o", JOptionPane.INFORMATION_MESSAGE);
    }
}
