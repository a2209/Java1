import java.util.*;
class Palindrome{
  public static void main(String args[]){
    int r, sum=0 , temp;
    int n = 989;
    temp = n;
    while(n>0){
      r=n%10;
      sum=(sum*10)+r;
      n=n/10;
    }
    if(temp==sum)
      System.out.println(" It is a palindrone number");
    else
        System.out.println("It is not a palindrome number");

    
  }
}
