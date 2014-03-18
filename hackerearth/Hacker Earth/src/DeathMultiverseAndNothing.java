
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suraj
 */
class DeathMultiverseAndNothing {

    public static void main(String xy[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len=Integer.parseInt(br.readLine());
        int a;
        for(int i=0;i<len;i++)
        {
            a=Integer.parseInt(br.readLine());
            System.out.println(a-1);
        }
        
    }
}
