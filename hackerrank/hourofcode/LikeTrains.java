import java.util.*;
import java.text.*;
class LikeTrains
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("00");
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2=sc.nextInt();
		int m2 = sc.nextInt();

		int h= h1+h2;
		int m=m1+m2;
		if(m>59)
		{

			h++;
			m=m-60;
		}

		if(h>23)
			h=h-24;




		System.out.println(d.format(h)+" "+d.format(m));
	}
}