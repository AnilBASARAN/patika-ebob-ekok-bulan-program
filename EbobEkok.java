import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1,number2;

        System.out.print("Birinci sayıyı giriniz:   ");
        number1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz:   ");
        number2 = input.nextInt();

        int kucuk = number1-number2 > 0 ? number2 : number1;
        int buyuk = number1 == kucuk ? number2 : number1;

        int ebob = 1;
        int i = 1;

        while(i <= kucuk){
            if(kucuk % i == 0 && buyuk % i == 0){
             ebob = i > ebob ? i : ebob;
            }
            i++;
        }

        int ekok = kucuk*buyuk/ebob;
        System.out.println(kucuk +" ve "+ buyuk+"'un Ebobu:  "+ebob);
        System.out.println(kucuk +" ve "+ buyuk+"'un Ekoku:  "+ekok);

    }
}
