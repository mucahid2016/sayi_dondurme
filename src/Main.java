import java.util.Scanner;

public class Main {
    static int dondur(int n, boolean dNoktasi, int sayac) {
        if (dNoktasi) {
            if (n > 0) {
                System.out.print(n + " ");
                sayac++;
                return dondur(n - 5, true, sayac);
            } else {
                return dondur(n, false, sayac);
            }
        } else {
            System.out.print(n + " ");
            if (sayac > 0) {
                sayac--;
                return dondur(n + 5, false, sayac);
            } else {
                return 0;
            }
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Değerini Giriniz: ");
        int n = input.nextInt();

        System.out.print("Çıktı: ");
        dondur(n, true, 0);
    }
}
