/*
 * Testa_Empregado.java
 *
 * Created on 10 de Setembro de 2007, 11:01
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Administrador
 */
public class Testa_Empregado {
    
    /** Creates a new instance of Testa_Empregado */
    public Testa_Empregado() {
    }
    
   public static void main(String[] args) {
      System.out.println("*** Exemplo da utiliza��o do modificador static ***");
      // mostrando a quantidade de objetos na mem�ria
      System.out.println("Quantidade de Empregados antes da instancia��o: " +
              empregado.getContador());
      
      //criando dois objetos
      empregado e1 = new empregado("Marcos","Moreira");
      empregado e2 = new empregado("Michele","Oliveira");
      
      //mostrando a quantidade de objetios na mem�ria
      System.out.println("Quantidade de Empregados depois da instancia��o");
      System.out.println("Utilizando e1.getContador(): " + e1.getContador());
      System.out.println("Utilizando e2.getContador(): " + e2.getContador());
      System.out.println("Utilizando empregado.getContador(): " + empregado.getContador());
      
      // mostrando as informa��es do nome e sobrenome
      System.out.println("Empregado 1: " + e1.getNome() + " " + e1.getSobrenome());
      System.out.println("Empregado 2: " + e2.getNome() + " " + e2.getSobrenome());
      
      // retirando as informa��es dos objetos da mem�ria
      // fazendo com que a JVM marque cada objeto para a coleta de lixo
      e1 = null;
      e2 = null;
      
      // pede que o sistema execute a coleta de lixo agora
      System.gc();
      
      // mostra o contador depois de chamar o cletor de lixo, 
      // o valor depende da execu��o imediata ou n�o do gc
      System.out.println("Empregados depois de System.gc(): " + empregado.getContador());

      
      System.out.println("\n\n\nSe ainda n�o saiu da mem�ria, continue tentando ... ");
      while(empregado.getContador()>0)
      {
          System.gc();
          System.out.println("Empregados depois de System.gc(): " + empregado.getContador());
      }
        
        
    }
    
}
