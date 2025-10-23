
package pkg8_percabangan_if;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
     /*   int a= 10;
        int b=5;
        if (a>b){
        System.out.println("nilai variabel a lebih besar dari b");
    }
        if (a<b){
            System.out.println("nilai variabel a lebih kecil dari b");
        }
        if (a==b){
            System.out.println("nilai variabel a samadengan variabel b");
        }
*/
     Scanner input = new Scanner (System.in);
    int a;
     int b;
        System.out.println("hallo, selamat datang");
        System.out.println("silahkan masukan nilai yang akan kalian gunakan");
        System.out.print("nilai a = ");
     a = input.nextInt();
        System.out.print("nilai b= ");
     b = input.nextInt();
    
        System.out.println("nilai a= "+a);
        System.out.println("nilai b = "+b);
       if (a < b){
            System.out.println("nilai a lebih kecil dari b");
        }
        if (a>b){
            System.out.println("nilai a lebih besar dari b");
        }
       
         
     
    }
    
}
