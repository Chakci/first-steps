/*В переменной centimeters записано количество сантиметров.
В переменную meters нужно записать количество полных метров в centimeters (1 метр = 100 см).
Для вычисления используй переменную centimeters и оператор деления.
Для объявления и инициализации meters используй одну команду.*/
public class Solution {

    public static void main(String[] args) {
        int centimeters = 243;

        int meters = centimeters / 100; 

        System.out.println(meters);
    }
}