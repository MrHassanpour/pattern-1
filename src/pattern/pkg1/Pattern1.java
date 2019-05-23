/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.pkg1;

import java.util.Scanner;

/**create pattern like below
5432*
543*1
54*21
5*321
*4321
 * @author alireza hassanpour
 */
public class Pattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number you want to display");
        int numb =sc.nextInt();
        int i,j,lines=numb;  
   for(i=1;i<=lines;i++){// this loop is used to print the lines  
      for(j=lines;j>=1;j--){// this loop is used to print numbers in a line  
          if(j!=i)  
           System.out.print(j);  
           else  
            System.out.print("*");  
   }  
   System.out.println("");  
   }  
    }
    
}
