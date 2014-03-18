import java.io.*;
import java.util.*;
class TimeConvert
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/*int time=Integer.parseInt(br.readLine());

		System.out.println((time/60)+":"+(time%60));
		*/

		
		String time = br.readLine();
		// String time2 = br.readLine();

		String t[] = time.split("-");

		String t1[] = t[0].split(":");

		int h1 = Integer.parseInt(t1[0]);
		int m1 = Integer.parseInt(t1[1].substring(0,2));
		String d1 = t1[1].substring(2,4);



		String t2[] = t[1].split(":");

		int h2 = Integer.parseInt(t2[0]);
		int m2 = Integer.parseInt(t2[1].substring(0,2));
		String d2 = t2[1].substring(2,4);

		if()



	}
}

