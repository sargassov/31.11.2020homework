package pack;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        byte randomByte = 5; // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        short randomShort = 1;
        int  randomInt = 2;
        long randomLong = 3l;
        boolean randomBool = false;
        char randomChar = 'C';
        float randomFloat = 2.2f;
        double randomDouble = 3.3;
        String randomString = "randomString";
        System.out.println("randomByte = " + randomByte + "\nrandomShort = " + randomShort + "\n" +
                "randomLong = " + randomLong + "\nrandomBool = " + randomBool + "\nrandomChar = " + randomChar +
                "\nrandomFloat = " + randomFloat + "\nrandomDouble = " + randomDouble + "\nrandomString = " +
                randomString + "\n\n");

//
        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        int answer = abcdMethod(randomByte, randomInt, randomLong, randomShort);
        System.out.println("a * (b + (c / d) = " + answer + "\n\n");

        //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        randomShort = (short) (Math.random() * 14);
        randomInt = (int) (Math.random() * 15);
        System.out.println("randomShort = " + randomShort + " and randomInt = " + randomInt);
        boolean isBetween10and20 = amountOfTwoValuesBetween10and20(randomShort, randomInt);
        System.out.println("Is amount of " + randomShort + " and " + randomInt + " between 10 and 20: " + isBetween10and20 + "\n\n");

        //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        randomInt = randomInt - randomShort;
        upperOrLowerThanZero(randomInt);

        //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        boolean isLowerThanZero = lowerThanZeroCheck(randomInt);
        System.out.println("randomInt = " + randomInt + "\nis randomInt lower than 0: " + isLowerThanZero + "\n\n");

        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        randomString = "Александр";
        helloMethod(randomString);

        //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        isLeapYear();
    }

    private static void isLeapYear(){
        Scanner scanner = new Scanner(System.in);
        boolean leap;
        System.out.println("\n\nEnter a random year: ");
        int year = scanner.nextInt();
        if(year % 400 == 0) leap = true;
        else if(year % 100 == 0) leap = false;
        else if(year % 4 == 0) leap = true;
        else leap = false;

        System.out.println(year + " year is leap year: " + leap);
    }

    private static void helloMethod(String name){
        System.out.println("Привет, " + name);
    }

    private static boolean lowerThanZeroCheck(int value){
        return value < 0;
    }

    private static boolean amountOfTwoValuesBetween10and20(short a, int b){
        int amountOfTwo = (a + b);
        return amountOfTwo >= 10 && amountOfTwo <= 20;
    }

    private static void upperOrLowerThanZero(int value){
        System.out.println("randomInt = " + value);
        if(value >= 0) System.out.println("Положительное число\n\n");
        else System.out.println("Отрицательное число\n\n");

    }


    private static int abcdMethod(byte aByte, int bInt, long cLong, short dShort) {
        int returned = 0;
        try {
            returned = (int) (aByte * (bInt + (cLong / dShort)));
        } catch (ArithmeticException ex) {
            System.out.println("\n\n\t\t\tYou can't divide by zero\n\n\n");
        }
        return returned;
    }

}
