import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi ;
        Scanner alici = new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz : ");
        sayi = alici.nextInt();
        for (int i =0;sayi>=i;i++){
            if (i%3==0&&i%4==0){
                System.out.println(i);


            }
        }

    }
}