import java.io.*;
import java.util.*;
class StringReduction 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();

		/*while(true)
		{ */   
			 if(str.contains("ab") || str.contains("ba") || str.contains("ac") ||
				str.contains("ca") || str.contains("bc") || str.contains("cb") )
			 {
			 	str=str.replace("ab","c");
			 	str=str.replace("ba","c");
			 	str=str.replace("ac","b");
			 	str=str.replace("ca","b");
			 	str=str.replace("bc","a");
			 	str=str.replace("cb","a");
			 }

			/* else
			 	break;
		}*/

		System.out.println(str);
		
	}
}