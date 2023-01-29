import java.util.*;
import java.util.Scanner;
public class Solution 
{
  Scanner math = new Scanner(System.in);
  public static long RecursionFactorial(int n)
  {
    if (n==0 || n==1)
    return 1;
    else
    return n *  RecursionFactorial(n - 1);
  }
 public static void main (String[] args) 
  {
    System.out.println(RecursionFactorial(6));

  }
}
