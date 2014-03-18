
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CompilerVision {
    public static void main(String x[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="" , temp="";
        String tp="//";
        
        while(true)
            
        {
            try{
                str=br.readLine();
                int pos=str.indexOf(tp);
                if(pos==-1)
                {
                   str=str.replace("->",".");

                }
                else
                {
                    temp=str.substring(pos);
                    str=str.substring(0,pos);
                    str=str.replace("->",".");
                    
                    str=str+temp;

                }
                System.out.println(str);
            }
            catch(Exception e)
            {
            
            }

        }
    }
}
//System.out.println(str);