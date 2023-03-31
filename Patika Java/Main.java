import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.println("Turkce notunuzu giriniz : ");
        turkce = input.nextInt();

        System.out.println("Tarih notonuzu giriniz : ");
        tarih = input.nextInt();

        System.out.println("Muzik notunuzu giriniz : ");
        muzik = input.nextInt();
        //Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
        System.out.println("Matematik notu : " + matematik);
        System.out.println("Fizik notu : " + fizik);
        System.out.println("Kimya notu : " + kimya);
        System.out.println("Turkce notu : " + turkce);
        System.out.println("Tarih notu : " + tarih);
        System.out.println("Muzik notu : " + muzik);

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("ortalamanız; " + sonuc);
        boolean kosul = sonuc >= 60;
        String durum = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);
    }
}
