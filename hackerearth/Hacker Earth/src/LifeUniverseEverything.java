
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author suraj
 */
class LifeUniverseEverything {

    public static void main(String x[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            String str = br.readLine();
            if(str.equals("42"))
                break;
            else
                System.out.println(str);
            
        }
    }
}
