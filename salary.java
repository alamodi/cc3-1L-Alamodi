/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.cc3;

/**
 *
 * @author m304user
 */
import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter regular hours : ");
        double RegularHours = sc.nextDouble();
        System.out.print("Enter pay rate : ");
        double PayRate = sc.nextDouble();
        System.out.print("Enter overtime  : ");
        double Overtime = sc.nextDouble();
        
        System.out.println(" The weekly salary is : " + cal_saraly( RegularHours, PayRate,  Overtime ));
    }
    
    
    static double cal_saraly(double RegularHours, double PayRate, double Overtime ){
        
        return (PayRate  * RegularHours ) + ((Overtime * 1.5) * RegularHours ) ;
    
    
    }
    
}

    

