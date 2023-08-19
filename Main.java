import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double c;
        boolean d;
        a = 1;
        b = 2;
        d = 1 > 2 && (1 < 3 || 2 < 4);
        if (1 < 2 && (1 < 3 || 2 < 4)) {
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            sc.close();
        } else {
            Scanner sc = new Scanner(System.in);
            c = sc.nextDouble();
            sc.close();
        }
        System.out.println(a);
        System.out.println(b);
    }
}

