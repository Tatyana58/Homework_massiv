import static com.sun.tools.doclint.Entity.or;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа - Массивы");
        int[] weights={90,91,93,85,87,88,89,0,0,0,0};
        weights[0]=90;
        int januaryWeight=weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january=0;
        System.out.println(weights[january]);
        for (int i = 0; i < 11; i++) {
            System.out.println(weights[i]);
        }
    }
}