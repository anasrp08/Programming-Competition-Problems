import java.util.*; 
import java.io.*;

class Function {  
  int FirstFactorial(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    int res=1;
    res=num*(num+1)/2;   
    return res;
    
  }      
}

class Main {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.FirstFactorial(s.nextInt())); 
    
  }
}           

