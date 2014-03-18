
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suraj
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class FinalVoyege {
    
    

    public static void main(String xy[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int len=Integer.parseInt(br.readLine());
        
        while(len>0)
        {
        
            int num = Integer.parseInt(br.readLine());
            int w[]=new int[num];
            int v[]=new int[num];
            int max_load= Integer.parseInt(br.readLine());
            
            String str=br.readLine();
            String s[]=str.split(" ");
            for(int i=0;i<num;i++)
            {
                w[i]=Integer.parseInt(s[i]);
            }
            s=br.readLine().split(" ");
            for(int i=0;i<num;i++)
            {
                v[i]=Integer.parseInt(s[i]);
            }
            
            for(int i=0;i<num-1;i++)
            {
                for(int j=0;j<num-i-1;j++)
                {
                    if(w[j]<w[j+1])
                    {
                        int t=w[j];
                        w[j]=w[j+1];
                        w[j+1]=t;
                        
                        t=v[j];
                        v[j]=v[j+1];
                        v[j+1]=v[j];
                    }
                }
                
            }
            
            /*for(int x:w)
            {
                System.out.println(x);
            }*/
            int sum=0;
            for(int a:w)
            {
                if(a<)
            }
        
            len--;
        }
    }

//System.out.println(str);
    
}
