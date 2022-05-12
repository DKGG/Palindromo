/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author emers
 */
public class Palindromo {    
    public static void main(String[] args) {
       String digitado = "";
       Scanner scan = new Scanner(System.in);
       System.out.println("Digite a palavra: ");
       //leitor de dados
       digitado = scan.next();
       //transformando a stringe em vetor de char
       char[] charArray = digitado.toCharArray();       
       if(verificaPalindromo(charArray)){
           System.out.println("É palindromo");
       }
       else{
           System.out.println("Não é palindromo");
       }       
    }
    private static boolean verificaPalindromo(char[] vetorPalavra) {
       char[] invertido = new char[vetorPalavra.length];
       int j = vetorPalavra.length;
       //inverte a palavra
       for(int i = 0;i<vetorPalavra.length;i++){           
            j--;
            invertido[i] = vetorPalavra[j];          
       }
        // retorna a booleana      
       if(Arrays.equals(invertido, vetorPalavra)){          
           return true;
       }       
       return false;
    }  
}
