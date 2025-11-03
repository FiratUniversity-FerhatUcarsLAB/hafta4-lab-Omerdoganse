import java.util.Scanner;

public class MaasHesap {

    // Çalışan adı soyadı (String)
    // Aylık brüt maaş (double, TL)
    // Haftalık çalışma saati (int)
    // Mesai saati sayısı (int)/
    public static void main(String[] Args) {

        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        Scanner input = new Scanner(System.in);
        System.out.println("Adınızı giriniz");
        String ad = input.next();
        System.out.println("Aylık bürüt maaşınızı giriniz.");
        Double burut = input.nextDouble();
        System.out.println("Haftalık çalışma saatinizi yazınız.");
        int calismasaati = input.nextInt();
        System.out.println("Mesai saat sayınızı giriniz");
        int mesaiSaatSayisi = input.nextInt();
        double mesaiUcreti = (burut / 160) * mesaiSaatSayisi * 3 / 2;
        double toplamGelir = burut + mesaiUcreti;
        double bürütMaaş = burut;
        /*
         * KESİNTİLER
         * SGK: Toplam Gelir × 0.14
         * Gelir Vergisi: Toplam Gelir × 0.15
         * Damga Vergisi: Toplam Gelir × 0.00759
         * Toplam Kesinti= SGK + Gelir V. + Damga V.
         */

        // SGK KESİNTİSİ
        double sgk = toplamGelir * SGK_ORANI;
        // gelir vrg
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;

        // sdamga verg
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        // toplam kesinti
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        // Net maaş
        double netMaaş = toplamGelir - toplamKesinti;
        // HESAPLANACAK İSTATİSTİKLER
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        // SAATLİK NET KAZANÇ
        double saatkilNetKazanç = netMaaş / 176 ;
        // GÜNLÜK NET KAZANÇ 
            double günlükNetKazanç = netMaaş / 22;


            System.out.println("--------------------------");
            System.out.println("      MAAŞ BORDOSU        ");
            System.out.println("--------------------------");
            System.out.println("ÇALIŞAN : ÖMER DOĞAN");
            System.out.println("GELİRLER:" );
            System.out.println("Brut maaş :" + burut  );
            System.out.println("Mesai ücreti (10 saat) :" + mesaiUcreti );
            System.out.println("--------------------------");
            System.out.printf("Toplam gelir : %.2f" , toplamGelir);
            System.out.println("                          ");
            System.out.println("KESİNTİLER:");
            System.out.println("KESİNTİLER:");
            System.out.printf("SGK Kesintisi(14.0%%): %.2f\n", sgk);
            System.out.printf("Gelir Vergisi(15.0%%): %.2f\n", gelirVergisi);
            System.out.printf("Damga Vergisi(0.8%%): %.2f\n", damgaVergisi);
            System.out.println("--------------------------");

            System.out.printf("Toplam kesinti : %.2f\n", toplamKesinti);
            System.out.printf("NET MAAŞ : %.2f\n", netMaaş);
            input.close();
    }
}