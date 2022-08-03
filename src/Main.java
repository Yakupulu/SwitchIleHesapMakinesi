import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, secim;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz:");
        n1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz:");
        n2 = input.nextInt();
        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nYapmak istediginiz islemin numarasini giriniz:");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplam:" + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma:" + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpim:" + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Bir sayi 0'a bolunemez.Tekrar deneyiniz");
                        break;
                    default:
                        System.out.println("Bolme:" + (n1 / n2));
                }
                break;
            default:
                System.out.println("Yanlis deger girdiniz.Tekrar deneyiniz");

        }


    }
}
