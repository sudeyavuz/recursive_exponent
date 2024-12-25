package JAVA101;
import java.util.Scanner;
public class otuzdorduncu_ornek {
    static int power(int base,int exp){
        if (exp==0){
            return 1;
        }
        return base*power(base,exp-1);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while (true) {
            System.out.print("taban değerini giriniz: ");
            int base = input.nextInt();
            System.out.print("üs değerini giriniz: ");
            int exp = input.nextInt();

            int result = power(base,exp);

            System.out.println("Sonuç: " + result);
        }
    }
}
