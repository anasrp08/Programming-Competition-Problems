import java.util.*;
class Johny{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//System.out.println("Number of test cases");
		int test=sc.nextInt();
		int cur=0;
		while(cur<test){
			//System.out.println("Number of elements");
			int num=sc.nextInt();
			int a[]=new int[num];
			for(int i=0;i<num;i++)
			{
				a[i]=sc.nextInt();
			}
				//System.out.println("Initial position");
			    int x=sc.nextInt();
			    int search=a[x-1];
			    Arrays.sort(a);
				System.out.println(pos(a,search)+1);
				
		cur++;
		
			}
			
		}
		
		/*private static int pos(int a[],int value , int low, int high)
		{
			//int low=0,high=a.length;
			if(low<high)
			{
				int mid=(low+high)/2;
				if(a[mid]==value)
				return mid;
				if(a[mid]>value){
					low=mid+1;
					return pos(a,value,low,high);
					}
				if(a[mid]<value) {
					high=mid-1;
					return pos(a,value,low,high);
					}
			}
			}*/
			
	    public static int pos(int[] a, int b) {
  /*  if (a.length == 0) {
      return false;
    }*/
    int low = 0;
    int high = a.length-1;

    while(low <= high) {
      int middle = (low+high) /2; 
      if (b> a[middle]){
        low = middle +1;
      } else if (b< a[middle]){
        high = middle -1;
      } else { // The element has been found
        return middle; 
      }
    }
    return 0;
  }
			
	}
	
	
