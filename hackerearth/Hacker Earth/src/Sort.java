
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Sort {
    public static void main(String xy[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len=Integer.parseInt(br.readLine());
        int a[]=new int[len];
        for(int i=0;i<len;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        for(int x:a)
        {
            System.out.println(x);
        }
    }
}
