package JavaHW1;

import java.util.Scanner;

// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 
// Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000
public class hw1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = console.nextInt();
        System.out.print("Input a power: ");
        int stepen = console.nextInt();

        

        // System.out.println("Digit: " + num);
        // System.out.println("Stepen: " + stepen);

        if(num != 0 && stepen != 0){
            float res = powMy(num, stepen);
            PrintConsole(res);
        }else{
            System.out.println("Не определено");
        }
        console.close();
    }

    public static float powMy(float value, float powValue) {
        float result = 1;
        if(powValue < 0){
            for (int i = 0; i >= powValue; i--) {
                result = result * value;
            }
            result = 1 / result;
        }
        else{
            for (int i = 1; i <= powValue; i++) {
                result = result * value;
            }
        }
        return result;
     }

    public static float PrintConsole(float num){
        System.out.println(num);
        return num;
    }


}
