
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suraj
 */
class SherlockHolmesAmdTheMystery {
    public static void main(String xy[])
    {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        
        while(len>0)
        {
            int sum=0;
            int a=sc.nextInt();
            
            for(int i=0;i<a;i++)
                sum=sum+sc.nextInt();
            if(sum%a==0)
            {
                System.out.println("YES");
            }
            else
                
                System.out.println("NO");
            
        
            len--;
        }
    
    }
}
