package BirinciHafta;
import java.util.Scanner;
public class DortVeBesinKatlari {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Girdiğiniz Sayıya Kadar Olan 4 ve 5'in Katlarını Bulacağınız Algoritma. \nHoşgeldiniz.");
        System.out.print("\nİstediğiniz sayıyı giriniz:");
        int sayi = input.nextInt();

        for(int i = 1 ; i<=sayi; i++){
            if(i%4==0 || i%5==0){
                System.out.println("4 ve 5'in Katları Olan Sayılar:"+i);
            }
        }
    }
}
