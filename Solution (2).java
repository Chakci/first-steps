import java.util.Scanner;
public class Solution {
  
    public static void main(String[] args) 
    {
   Scanner math = new Scanner(System.in);
double PK = math.nextDouble();
double PS = math.nextDouble();
 double storona, radius;
 storona = Math.sqrt(PK);
 radius = Math.sqrt(PS / Math.PI);
System.out.println( storona );
System.out.println( radius );
if (storona >= radius) {
  System.out.println("Круг поместиться в квадрат, а квадрат в круг нет.");
}
else {
  System.out.println("Квадрат поместиться в круг, а круг в квадрат нет.");
}
    }

}
