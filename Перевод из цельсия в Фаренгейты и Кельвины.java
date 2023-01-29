import java.util.*;
import java.util.Scanner;
public class Solution {
  
    public static void main(String[] args) 
    {
   Scanner math = new Scanner(System.in);
   double C = math.nextDouble();
   double F = (C * 1.8) + 32;
   double K = C + 273.15;
   System.out.printf("Градусов Фаренгейта %f2\nГрадусов Кельвина %f2 ", F, K);
    }

}
