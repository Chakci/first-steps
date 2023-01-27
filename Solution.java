import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
      
Scanner math = new Scanner(System.in);

double a = math.nextDouble();
double b = math.nextDouble();
double c = math.nextDouble();
double D = (Math.pow(b,2)) - 4 * a * c;
 if (D > 0){
   double x1 = (-b + Math.sqrt(D)) / (2 * a);
   double x2 = (-b - Math.sqrt(D)) / (2 * a);
   System.out.println("Первый корень = " + x1 + ", второй корень = " + x2 + ".");

}
else if (D == 0){
  double x;
  x = -b / (2 * a);
   System.out.println("Уравнение имеет один корень который равен " + x);
}
else {
  System.out.println("Корней нет");
}
}
}