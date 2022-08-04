import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        matematik= inp.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik=inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya=inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih=inp.nextInt();

        System.out.print("Müzik Notunuz");
        muzik= inp.nextInt();

        int toplam =matematik+fizik+kimya+turkce+tarih+muzik;
        double ortalama=toplam/6;

        boolean gecmekalma=ortalama>60;

        String orta =ortalama>60 ? "Sınıfı Geçti":"Sınıfta Kaldınız";

        System.out.println(orta +"\t"+ortalama);




    }

}
