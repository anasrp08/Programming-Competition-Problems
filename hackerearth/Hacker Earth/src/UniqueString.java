
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UniqueString {

    public static void main(String xy[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len=Integer.parseInt(br.readLine());
        
        for(int jk=0;jk<len;jk++)
        {
            String str=br.readLine();

            char ch[]=str.toCharArray();
            for(int i=0;i<ch.length;i++)
            {
                for(int j=0;j<ch.length;j++)
                {
                    if(i!=j && ch[i]==ch[j])
                        ch[j]=0;
                }
            }
            for(char x:ch)
            {   
                if(x!=0)
                    System.out.print(x);
            }
        }

    }
}
