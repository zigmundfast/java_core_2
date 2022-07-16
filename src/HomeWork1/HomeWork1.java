package HomeWork1;

import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже) используя String.trim()
        //затроить (Можно вызвать тольку одну команду System.out.println())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
        String hiworld = hi.replace(" ","") + world.toLowerCase();
        String newstr = hiworld + newLine + hiworld + newLine + hiworld;
        System.out.println(newstr);

        //Задача №2
        //Создать переменные с ростом (!в метрах), весом в кило.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0345645
        double height = 1.87;
        double weight = 105;
        double index = weight/(height*height);
        System.out.println(index);

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche
        String[] arrayIndex = new String[] {"a", "b", "c", "d", "e"};
        System.out.println(Arrays.toString(arrayIndex).replace("[","").replace("]","")
                .replace(" ","").replace(",","") );
        arrayIndex [3] = "h";
        String str = Arrays.toString(arrayIndex).replace("[","").replace("]","")
                .replace(" ","").replace(",","");
        System.out.println(str);


        





    }
}
