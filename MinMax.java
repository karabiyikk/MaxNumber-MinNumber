package Donguler;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, adet, max = 0, min = 0;
        System.out.print("Kaç adet sayı deneyeceksiniz : ");
        adet = input.nextInt();

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". Sayı : ");
            sayi = input.nextInt();
            if (i == 1) {
                max = sayi;
                min = sayi;
            }
            if (sayi > max) {
                max = sayi;
            } else if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("En Küçük Sayı : " + min);
        System.out.println("En Büyük Sayı : " + max);
    }
}
