/**
 * Created by 1610608 on 3/28/2018.
 */import java.util.Scanner;
public class laba2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть 0 для обчислення заданих чисел або 1 для вводу з клавіатури : ");
        int k = in.nextInt();
        int x=0;
        double a=0;
        double b=0;
        double c=0;
        /**Введення заданих чисел*/
        if ( k == 0) {
            x = 2;
            a = 0.75;
            b = 1.1;
            c = 0.4;
        }
       else if( k == 1)
        {
            System.out.print("Введите знаение х: ");
            x = in.nextInt();
            System.out.print("Введите значения a: ");
            a = in.nextDouble();
            System.out.print("Введите значения b: ");
            b = in.nextDouble();
            System.out.print("Введите значения c: ");
            c = in.nextDouble();
        }
         else {
            System.out.println("Ви ввели не вірне значення. Будь-ласка перевірте його ще раз або спробуйте виконати дію пізніше.");
            System.out.println("You have entered a wrong value. Please check it again or try an action later.");
        }
        System.out.println(Math.pow(Math.sin((a * x - 1) / (Math.pow(b, 3) * Math.sqrt(Math.pow(x, 2) - c))), -1) + Math.pow(Math.tan(b / (a * Math.pow(x, 2) + c)), -1));
    }
}
