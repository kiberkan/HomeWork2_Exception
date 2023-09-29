import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {

    }
    public static float Task1(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите любую десятичную дробь: ");
            float num = Float.parseFloat(scanner.nextLine());
            return num;
        } catch (NumberFormatException e){
            System.out.println("Ошибка, повторите попытку");
        }
        return 0;
    }
    public static void Task2(){
        int[] intArray = {2,35,7,5,4,2,2,9,4};
        try {
            int d = 0;
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
    public static void Task3(){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void Task4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        if(string.isEmpty()){
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        System.out.println(string);
    }
}