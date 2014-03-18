
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suraj
 */
public class FibonacciNumber {
    
    public static void main(String xy[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int len=Integer.parseInt(br.readLine());
        
        for(int i=0;i<len-1;i++)
        {
            int num=Integer.parseInt(br.readLine());
            System.out.println(fibo(num));
        }
        
    }
    
    private static int fibo(int num)
    {
        if(num ==1)
            return 1;
        else
            if(num ==2)
                return 2;
        else
            {
                int a=1;
                int b=2;
                int c=3;
                num-=2;
                while(num!=0)
                {
                    c=a+b;
                    a=b;
                    b=c;
                    num--;
                }
                return c;
            }
        
        
                
    }
    
}
