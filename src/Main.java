public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа - Массивы");

        System.out.println("1 задача. Задание №1");
        // 1 задача
        //Объявите три массива:
        int[] id = new int[3];
        int k=1;
        for (int i = 0; i < 3; i++) {
            id[i] = k;
            k++;
            System.out.println("Заполнили массив id [" + i + "] = " + id[i]);
        }
        System.out.println(" ");
        //1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.


        System.out.println("Задание №2");
        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        double[] chickenWeight = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " значение массива, в котором хранится дробное число - " + chickenWeight[i]);
        }

        System.out.println(" ");

        System.out.println("Задание №3");
        //3. Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int[] datyBirth = new int[3];
        datyBirth[0] = 30;
        datyBirth[1] = 1;
        datyBirth[2] = 1978;
        System.out.println("Дата рождения: " + datyBirth[0] + "." + datyBirth[1] + "." + datyBirth[2]);
        System.out.println(" ");
        double[] product = new double[4];
        product[0] = 30.5;
        product[1] = 10.5;
        product[2] = 5.5;
        product[3] = 3.15;
        double productLong = product[0];
        double productWidth = product[1];
        double productHeight = product[2];
        double productWeight = product[3];
        System.out.println("Размеры изделия: ");
        System.out.println("длинна: " + productLong + " ширина: " + productWidth + " высота: " + productHeight + " вес: " + productWeight);
        System.out.println(" ");

        System.out.println("2 задача. Задание №1");
        //2 задача
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
        //через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        //см выше.
        int h=3; // длинна массива
        for (int x = 0; x < h; x++) {
            System.out.print(id[x]);
            if (x < h - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int x = 0; x < h; x++) {
            System.out.print(chickenWeight[x]);
            if (x < h - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");

        for (int x = 0; x < h; x++) {
            System.out.print(datyBirth[x]);
            if (x < h - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        System.out.println(productLong + "," + productWidth + "," + productHeight + "," + productWeight);
        System.out.println(" ");


        System.out.println("3 задача.");
        //3 задача
        //Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива,
        // а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке,
        // а элементы другого массива – на другой.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        //Если во втором задании в консоль у вас вывелся результат
        //1, 2, 3
        //1.57, 7.654, 9.986
        //*произвольнGые элементы третьего массива*
        //То в третьем задании результат должен быть
        // 3, 2, 1
        //9.986, 7.654, 1.57
        //*произвольные элементы третьего массива в обратном порядке*
        int l=0; // длинна массива
        for (int x = 2; x >= l; x--) {
            System.out.print(id[x]);
            if (x >= l + 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int x = 2; x >= l; x--) {
            System.out.print(chickenWeight[x]);
            if (x >= l + 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");

        for (int x = 2; x >= l; x--) {
            System.out.print(datyBirth[x]);
            if (x >= l + 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        System.out.println("Вариант 1");
        System.out.println(productWeight + "," + productHeight + "," + productWidth + "," + productLong);
        System.out.println("Вариант 2");
        for (int x = 3; x >= l; x--) {
            System.out.print(product[x]);
            if (x >= l + 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("4 задача.");
        // 4 задача
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        // Распечатайте результат преобразования в консоль.
        int s=1;
        for (int i = 0; i < 3; i++) {
            if (s % 2 != 0) {
                s++;
                id[i] = s;
            }else {
                id[i] = s;
                s++;
            }
            System.out.println("Преобразованный массив id[" + i + "] = " + id[i]);
        }
    }
}