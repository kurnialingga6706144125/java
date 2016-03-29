/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;
import java.util.Scanner;
/**
 *
 * @author Praktikum
 */
public class Jurnal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bil=new Scanner(System.in);
        int a=bil.nextInt() ;
        long fib[]=new long[a];

         fib[0]=0;
         fib[1]=1;
            
            for(int i=2; i<a; i++){
                fib[i]=fib[i-1]+fib[i-2];
            }
            for(int i=0; i<a; i++){
                System.out.println(fib[i]+"");
            }
           
            
        }
    }
    

