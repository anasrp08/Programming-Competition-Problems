//For this challenge you will determine if the mode equals the mean in an array.
import java.io.*;
class MeanMode
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();

		System.out.println(result(str));
		//st=st.substring(11,st.length()-1); // Start index is inclusive End index is exclusive
		/*String arr[]=st.split(",");
		int a[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			a[i]=Integer.parseInt(arr[i]);
		}
		//int num=Integer.parseInt(br.readLine());
		
		int mode=a[a.length/2];
		int mean=0 , sum=0;

		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		mean=sum/a.length;
		if(mean==mode)
			System.out.println("1"); //true
		else
			System.out.println("0"); //false
			*/
	}

	public static int result(String str)
	{
		str=str.replace("new int[] {","");
		str=str.replace("}","");
		String s[];
		if(str.contains(", "))
			s=str.split(", ");
		else
			s=str.split(",");

		int a[]=new int[s.length];

		for(int i=0;i<s.length;i++)
			a[i]=Integer.parseInt(s[i]);

		if(mode(a)==mean(a))
			return 1;
		else
			return 0;
	}

	public static int mode(int a[])
	{
		int rescount=0 , resnum=0;

		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=0;j<a.length;j++)
			{
				if(a[i] == a[j] && i!=j)
					count++;
			}
			if(count>rescount)
			{
				rescount=count;
				resnum=a[i];
			}
		}

		if(rescount==1)
			return -1; //only positive input
		else
			return resnum;
	}

	public static int mean(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];

		}

		return sum/a.length ;
	}
}