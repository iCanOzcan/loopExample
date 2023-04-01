import java.util.Scanner;

public class loopEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double toplam=0; int div=0;
        System.out.print("bir sayi giriniz:");
        int sayi = input.nextInt();
        for(int i = 1; i<sayi; i++){
            if(i%3==0 & i%4==0){
                System.out.println(i);
                toplam+=i;
                div++;
            }
        }
        System.out.println(toplam);
        System.out.println(div);
        double result = toplam/div;
        System.out.println("0 dan "+sayi+" a kadar girilen sayilarin ortalamasi :"+result);
    }
}