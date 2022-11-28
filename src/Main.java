import static com.sun.tools.doclint.Entity.or;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа - Массивы");

        System.out.println("Задание №1");
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
        System.out.print("Дата рождения: "+datyBirth[0]+"."+datyBirth[1]+"."+datyBirth[2]);
        }
    }