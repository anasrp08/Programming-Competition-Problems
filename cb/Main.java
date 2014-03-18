import java.util.*; 
import java.io.*;

class Function {  
  int CheckNums(int num1, int num2) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    if(num1>num2)
      return 1;
    else
    if(num2>num1)
      return 2;
      else
      return -1;
    
       
    
    
  }      
}

class Main {
  public static void main (String[] args) throws IOException {  
   
    // keep this function call here     

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //Scanner  sc = new Scanner(System.in);
    Function c = new Function();
    /*int a=sc.nextInt();
    int b=sc.nextInt();
    */
    String str=br.readLine();
    //int a=Integer.parseInt(br.readLine());
    //int b=Integer.parseInt(br.readLine());
    int x=c.CheckNums(str);
    if(x==1)
      System.out.print("false");
    else
    if(x==2)
      System.out.println("true");
    else
      System.out.println("-1");
  }
} 








  