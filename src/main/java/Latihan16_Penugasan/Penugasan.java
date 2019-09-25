/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan16_Penugasan;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk menampilkan penugasan aritmatika
 */
public class Penugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10 ;
        int b = 20 ; 
        int c = 0 ;
        
        System.out.println("Nilai a =" +a);
        System.out.println("Nilai B =" +b);
        System.out.println("Nilai C =" +c+"\n");
        
        c = a + b;
        System.out.println("c = a + b =" +c);
        c += a;
        System.out.println("c += a ="+c);
        c -= a;
        System.out.println("c -= a ="+c);
        c *= a;
        System.out.println("c *= a ="+c);
        
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a ="+c);
        
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = " +c);
        c <<= 2;
        System.out.println("c <<= 2 ="+c);
        c >>=2;
        System.out.println("c >>= 2 ="+c);
        c >>=2;
        System.out.println("c >>= a =" + c);
        c &= a;
        System.out.println("c &= 2 ="+c);
        c ^= a;
        System.out.println("c ^= a ="+c);
        c |= a;
        System.out.println("c |= a ="+c);
    }
    
}
