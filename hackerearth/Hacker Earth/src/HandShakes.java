
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HandShakes {
    public static void main(String xy[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len=Integer.parseInt(br.readLine());
        for(int i=0; i<len;i++)
        {
            int num = Integer.parseInt(br.readLine());
            System.out.println((num*(num-1))/2);
        }
        
    }
    
}
