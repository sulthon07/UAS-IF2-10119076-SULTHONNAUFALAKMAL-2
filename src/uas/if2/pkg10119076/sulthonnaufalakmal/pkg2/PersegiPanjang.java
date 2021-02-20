/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119076.sulthonnaufalakmal.pkg2;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class PersegiPanjang {
    
    public static void main(String[] args) {
    int panjang, lebar, luas;
    Scanner scan = new Scanner(System.in);
    System.out.print("panjang : ");
    panjang = scan.nextInt();
    System.out.print("lebar : ");
    lebar = scan.nextInt();
    luas = panjang * lebar;
    System.out.println("Luas Persegi Panjang " + luas);
  }
}
