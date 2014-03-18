
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem: What is String Made Of
 * @author suraj
 */
class StringMadeOf {
    public static void main(String xy[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        System.out.println(str.length());
        int val[]={6,2,5,4,5,5,6,3,7,6};
        
        int sum=0;
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            sum+=val[(int)ch-48];

        }
        System.out.println(sum);
        
        
    }
    
/*    private static int value(char ch)
    {
        switch(ch)
        {
            case '0':return 6;
            
            case '1':return 2;
            case '2':return 5;
            
            case '3':return 4;
            case '4':return 5;
            case '5':return 5;
            case '6':return 6;
            case '7':return 3;
            case '8':return 7;
            case '9':return 6;
                   // 6376
        }
        return 0;
    }
*/}
