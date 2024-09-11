

 import java.util.Scanner;

public class pratik {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner ımp = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        matematik=ımp.nextInt();

        System.out.print("Fizik notunuz:");
        fizik=ımp.nextInt();

        System.out.print("Kimya notunuz:");
        kimya=ımp.nextInt();

        System.out.print("Türkçe notunuz:");
        turkce=ımp.nextInt();

        System.out.print("Tarih notunuz:");
        tarih=ımp.nextInt();

        System.out.print("Müzik notunuz:");
        muzik=ımp.nextInt();

        int toplam=(matematik+fizik+kimya+turkce+tarih+muzik);
        double ortalama=toplam/6;
        System.out.println("Ortalamanız ="+ortalama);

        String str= ortalama>60 ? "GEÇTİ" : "KALDI";

        System.out.println("DERSTEN GEÇME DURUMU:"+str);
    }








}
