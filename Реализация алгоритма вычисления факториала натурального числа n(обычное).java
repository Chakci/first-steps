import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
      
Scanner math = new Scanner(System.in);
int n = math.nextInt();
int factorial = 1;
for (int i = 1; i <= n; i++){
  factorial = factorial * i;
}
System.out.println(factorial);
}
}