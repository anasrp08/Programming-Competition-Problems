import java.io.*;
import java.util.*;

class LongestLine
{
	public static void main(String[] args) throws IOException {

		File file =new File(args[0]);
		BufferedReader br=new BufferedReader(new FileReader(file));
		
		String line;
		int num = Integer.parseInt(br.readLine());
		int i=0;
		String arr[] = new String[100];
		while((line=br.readLine())!=null)
		{
			arr[i] = line;
			i++;
		}
		Arrays.sort(arr, Collections.reverseOrder());

		System.out.print(arr[0]);
		System.out.print(arr[1]);
		

		/*String str[] = {"A","a","Ab"};
		Arrays.sort(str, Collections.reverseOrder());
		System.out.println(str[0]);
		*/

	}
}