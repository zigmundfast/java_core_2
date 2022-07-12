public class lession1 {
    public static void main(String[] args){
        System.out.println("hello world");
        // примитивы
        // нравиться ли вам кофе??
        // true - да ; false- нет
        Boolean answer = false;
        System.out.println("Нравиться ли Вам кофе??");
        System.out.println(answer);

        //  хранит значени от -128 до 128
        byte bt = - 128;

        // Больше значение  - 32765 до 32767
        Short sh = 32000;

        // Диапазон - 2 147 483 648 до 2 147 483 649
        int number = - 2_000_000_000;

        // Диапазон до 2 в 64 степени
        long ln = 8_000_000_000L;

        // Числа с плавающей точкой
        float fl = 3.12234F;
        System.out.println(fl);

        double db = 3.12345678901234567890;
        System.out.println(db);

        double number1 = 10;
        int number2 = 3;
        double result = number1 / number2;
        double result1 = number1 + number2;
        double result2 = number1 - number2;
        double result3 = number1 * number2;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // Символы
        char ch = 105 + 1;
        System.out.println(ch);

        int[] array = new int[5];
        array[0]=10;
        System.out.println(array[0]);

//        char[] arrayChar = new char[5];
//        arrayChar[0]='v';
//        arrayChar[1]='o';
//        arrayChar[2]='d';
//        arrayChar[3]='k';
//        arrayChar[4]='a';
//        System.out.println(arrayChar);


        String vodka = "Водка";
        System.out.println(vodka);
        String ForChapaev= "Водка для Чапаева";
        // Конкатенация
        String resultChapaev= vodka + ForChapaev;
        System.out.println(resultChapaev);

        System.out.println("Информация: " + true);

        char[] newArray = new char[]{'В','о','д','к','а'};


    }
}
