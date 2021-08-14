package vertex;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) { //основной метод, где прописываются остальные методы и вывод результата
        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

    public static double getNumber() { //прописываем метод для получения чисел от пользователя
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        if (sc.hasNextDouble()) { //проверяем, если введенное пользователем значение оказалось числом
            return sc.nextDouble();
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод."); //если нет - выводим сообщение об ошибке
            return getNumber(); //и снова запускаем метод
        }
    }

    public static char getOperation(){ //прописываем метод для выбора операции
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите номер операции:\n1 - прибавить\n2 - отнять\n3 - умножить\n4 - разделить");
        int operationNumber = 0; //задаем переменную для номера операции
        if (sc.hasNextInt()){ //проверяем, если введенное пользователем значение оказалось целым числом
            operationNumber = sc.nextInt(); //присваиваем это введенное число переменной для номера операции
        } else {
            System.out.println("Вы ввели не число! Повторите ввод!");
            return getOperation();
        }
        switch (operationNumber){ //прописываем случай для каждого верного значения номера операции
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Неправильная операция! Повторите ввод!");
                return getOperation();
    }
}

    public static double add (double num1, double num2){ //прописываем метод add - операция сложения
    return num1+num2;
    }

    public static double sub(double num1, double num2) { //прописываем метод sub - операция вычитания
        return num1-num2;
    }

    public static double mul(double num1, double num2) { //прописываем метод mul - операция умножения
        return num1*num2;
    }

    public static double div(double num1, double num2) { //прописываем метод div - операция деления
        if(num2 != 0.0) { //нам нужно проверить, что не делим на ноль
            return num1/num2;
        } else {
            System.out.println("На 0 делить нельзя!");
            return Double.NaN;
        }
    }

    public static double calc(double num1, double num2, char operation) { //прописываем метод самого калькулятора
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            default:
                return Double.NaN;
        }
    }
}
