import java.util.Scanner;
 

 /*
* Ad Soyad: ömer doğan
* Ogrenci No: 250541101
* Tarih: [TARIH]
* Aciklama: GeometrikHesap
*/

        public class GeometrikHesap{
                public static void main (String[]Args){
                       Scanner input = new Scanner(System.in);
final double pi = 3.141595;
                       //Girdi kelimesini istediğim gibi kullanabilirim ama anlaşılır olmasına dikkat etmeliyim

                        System.out.println("Dairenin yarı çapınız giriniz.");
                        Double yaricap = input.nextDouble();
                        

                        System.out.println("Dairenin alanı :"+ pi * yaricap * yaricap );
                        System.out.println("Dairenin çevresi:" + 2 * pi * yaricap );
                        System.out.println("Dairenin çapı :" + 2 * yaricap);
                        System.out.println("Kürenin hacmi:" + 4/3 * pi * yaricap );
                        System.out.println("Kürenin yüzey alanı :" + 4 * pi * yaricap * yaricap );



                }
        }