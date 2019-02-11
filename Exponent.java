/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.cc3;

import java.util.Scanner;
public class Exponent {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to calculates:");
    int num = sc.nextInt();
    System.out.println("the square resuilt is :" +squares(num)+"\nThe cube resuilt is :"+cubes(num));
    
}
     static int squares(int num){
         return num* num;
         
         
     }
     static int cubes(int num){
         return num * num *num;
     }
}
