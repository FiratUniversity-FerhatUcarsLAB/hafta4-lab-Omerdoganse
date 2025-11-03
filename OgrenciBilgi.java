
import java.util.Scanner;
        public class OgrenciBilgi{
            public static void main(String []Args){
            Scanner input = new Scanner(System.in);

            System.out.println("------ÖĞRECİ BİLGİ SİSTEMİ------");
/*
 * Ad Soyad: Ömer Doğan
 * Ogrenci No: 123456
 * Tarih: 31.10.2025
 * Aciklama: Öğrenci Bilgi Sistemi
 */
                System.out.println("Adınızı Gİriniz");
                String ad = input.next();

                System.out.println("Soyadınızı giriniz");
                String soyad = input.next();

                System.out.println("Yaşınızı giriniz");
                int yas = input.nextInt();

                System.out.println("Numaranızı giriniz");
                int ogrenciNo = input.nextInt();

                // 3️⃣ Çıktıyı ekrana düzenli biçimde yazdır
                System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
                 System.out.printf("Ad Soyad: %s %s\n", ad, soyad);
                 System.out.printf("Ogrenci No: %d\n", ogrenciNo);
                 System.out.printf("Yas: %d\n", yas);
                 
                 input.close();




                

    }
        }