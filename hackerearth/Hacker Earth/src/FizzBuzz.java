
import java.util.Scanner;


class FizzBuzz {
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);     
        int len=sc.nextInt();
        
        while(len>0)
        {
            int num = sc.nextInt();
            int num1 = sc.nextInt();
            
            
            for(int i=num;i<=num1;i++)
            {
                if(i%15==0)
                    System.out.println("FizzBuzz");
                else
                    if(i%3==0)
                        System.out.println("Fizz");
                else
                    if(i%5==0)
                        System.out.println("Buzz");
                else
                        System.out.println(i);
            }
            
            len--;
        }
    }
}
