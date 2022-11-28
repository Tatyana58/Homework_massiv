import static com.sun.tools.doclint.Entity.forall;
import static com.sun.tools.doclint.Entity.or;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа - Массивы");

        System.out.println("1 задача. Задание №1");
        // 1 задача
        //Объявите три массива:
        //1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        int[] id = new int[3];
        int k=1;
        for (int i=0; i<3;i++){
            id[i]=k;
            k++;
            System.out.println("Заполнили массив id ["+i+"] = "+id[i]);
        }
        System.out.println(" ");


        System.out.println("Задание №2");
        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        double[] chickenWeight = {1.57, 7.654, 9.986};
        for (int i=0;i<3;i++) {
            System.out.println(i+" значение массива, в котором хранится дробное число - "+chickenWeight[i]);
        }

        System.out.println(" ");

        System.out.println("Задание №3");
        //3. Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int[] datyBirth = new int[3];
        datyBirth[0]=30;
        datyBirth[1]=1;
        datyBirth[2]=1978;
        System.out.println("Дата рождения: "+datyBirth[0]+"."+datyBirth[1]+"."+datyBirth[2]);
        System.out.println(" ");
        double[] product= new double[4];
        product[0]=30.5;
        product[1]=10.5;
        product[2]=5.5;
        product[3]=3.15;
        double productLong=product[0];
        double productWidth=product[1];
        double productHeight=product[2];
        double productWeight=product[3];
        System.out.println("Размеры изделия: ");
        System.out.println("длинна: "+productLong+" ширина: "+productWidth+" высота: "+productHeight+" вес: "+productWeight);
        System.out.println(" ");

        System.out.println("2 задача. Задание №1");
        //2 задача
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
        //через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        //см выше.
        System.out.print(id[0]+","+id[1]+","+id[2]+"  ");
        //System.out.print(chickenWeight[y] + "," + chickenWeight[y += 1] + "," + chickenWeight[y += 1] + " ");
        int y=0;
        while (y<3) {
            System.out.print(chickenWeight[y]+",");
            y++;
        }
            System.out.print(datyBirth[0] + "," + datyBirth[1] + "," + datyBirth[2] + " ");
            System.out.print(productLong + "," + productWidth + "," + productHeight + "," + productWeight);
        }
}