import java.util.Scanner;

/**
 * UcakBiletiHesaplama
 */
public class UcakBiletiHesaplama {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km,yas,tip;
        System.out.print("Mesafeyi giriniz : ");
        km = scan.nextInt();
        System.out.print("\nYaşınızı giriniz : ");
        yas = scan.nextInt();
        System.out.print("\nYolculuk tipini seçiniz (1=Tek gidiş , 2= Gidiş/Dönüş) :"); 
        tip = scan.nextInt();

        double normalFiyat,yasIndirimi,tipIndirimi;

        if(km > 0  && yas > 0 && (tip==1  || tip==2)){ 
            normalFiyat = km * 0.10;
            if(yas < 12){
                yasIndirimi = normalFiyat * 0.5 ; //İndirim oranını hesaplıyor.
            }else if (yas >= 12 &&  yas <=24){
                yasIndirimi = normalFiyat * 0.10;
            }else if(yas >= 65){
                yasIndirimi = normalFiyat * 0.30;
            }else{
                yasIndirimi = 0;
            }
            normalFiyat -= yasIndirimi; //Fiyattan indirim payını çıkarıyor.
            if(tip == 2){
                tipIndirimi = normalFiyat * 0.20;
                normalFiyat = (normalFiyat - tipIndirimi) * 2 ;
            }
            System.out.println("Bilet tutarı : " + normalFiyat + "$");
        }else{
            System.out.println("Girdiğiniz değerler eksik veya yanlış lütfen tekrar deneyiniz !");
        }
    }
}