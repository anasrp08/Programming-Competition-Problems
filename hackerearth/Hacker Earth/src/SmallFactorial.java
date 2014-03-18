
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class SmallFactorial {
    public static void main(String xy[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int len=Integer.parseInt(br.readLine());
        
        for(int i=0;i<len;i++)
        {
            String str=br.readLine();

            System.out.println(fact(Integer.parseInt(str)));
        }
        
    }
    private static BigInteger fact(int n)
    {
        if(n==1)
            return BigInteger.ONE;
        else return (new BigInteger(String.valueOf(n))).multiply(fact(n-1));
    }
}


