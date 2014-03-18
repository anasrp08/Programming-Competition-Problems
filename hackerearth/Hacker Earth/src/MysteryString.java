
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

class MysteryString {
    
    

    public static void main(String x[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int len=Integer.parseInt(br.readLine());
        
        while(len>0)
        {
            String str[]=br.readLine().split(" ");
            
            char ch[]=str[0].toCharArray();
            int dis=Integer.parseInt(str[1]);
            
            for(int i=0;i<ch.length;i++)
            {
                ch[i] = (char)(ch[i]+dis);
                if(ch[i]>'z')
                    ch[i] =(char) (ch[i]%'z' + 'a'-1);
                if((int)ch[i]<(int)'a')
                    ch[i] =(char) (ch[i]%'z' + 'a'-1);
                
            }
            System.out.println(ch);
        
            len--;
        }
    }

//System.out.println(str);
    
}
