import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz!");
        a=input.nextInt();
        System.out.println("İkinci sayıyı giriniz!");
        b=input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz!");
        c=input.nextInt();

        if((a<b)&&(a<c)){
            if(b<c) {
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");
            }
        }else if((b<a)&&(b<c)){
            if(c<a){
                System.out.println("b<c<a");
            }else{
                System.out.println("b<a<c");
            }
        }else{
            if(b<a){
                System.out.println("c<b<a");
            }else{
                System.out.println("c<a<b");
            }
        }
    }
}
