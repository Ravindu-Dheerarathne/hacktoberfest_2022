public class PrintFibonacci {
  
  public static void main(String args[]) {    
    int count=10;      
    printFibonacci(count - 2);
  }  
  
  static void printFibonacci(int count) { 
    int n1 = 0, n2 = 1, n3 = 0; 
    
    if(count > 0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" " + n3);   
         printFibonacci(count - 1);    
     }    
  }    
}
