package CaglaSonmez;

import java.util.Scanner;

public class TamBolunenSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int adet = 0;

        for (int i=1; i<=sayi; i++ ) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }
        double ortalama = (double) toplam / adet;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);

    }
}
