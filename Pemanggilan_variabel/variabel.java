
package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {


  
    public static void main(String[] args) {
        //+,-,*,/
       
       
        
        /*System.out.println("hasil penjumlahan a + b : ");
        System.out println("a+b");
        
        System.out.println("hasil pengurangan a - b : ");
        System.out.println ("a-b");

        System.out.println("hasil perkalian a * b :");
        System.out.println("a*b");

        System.out.pintln("hasil pembagian a / b : ");
        System.out.println("a / b" */
        
    /*   int luas;
       int alas = 17;
       int tinggi = 19;
       
          System.out.print("nilai alas :");
          System.out.println(alas);
          
          System.out.print("nilai tinggi :");
          System.out.println(tinggi);
          
          luas = alas * tinggi;
          System.out.print("luas segetiga adaalah: ");
          System.out.println(luas);
    
   
    }
    
}*/
     int persegi;
        int segitiga;
        int persegi_panjang;
               
       Scanner input= new Scanner (System.in);
   //luas persegi
        System.out.println("Diketahui sisi persegi = 10cm");
        System.out.print("Inputan hasil luas persegi dengan rumus Sisi * Sisi :");      
     persegi = input.nextInt();
        System.out.println("Luas persegi adalah :"+persegi);
        System.out.println("");
   //luas segitiga
        System.out.println("Diketahui alas segitiga = 4cm");
        System.out.println("Tinggi segitiga = 6cm");
        System.out.print("Inputan hasil luas segitiga dengan rumus 2/(Alas * Tinggi) :");
     segitiga = input.nextInt();
        System.out.println("Luas segitiga adalah :"+segitiga);
        System.out.println("");
  //luas persegi_panjang
        System.out.println("Diketahui panjang persegi panjang = 5cm");
        System.out.println("Lebar persegi panjang = 3cm");
        System.out.print("Inputan hasil luas persegi panjang dengan rumus Panjang * Lebar :");
     persegi_panjang = input.nextInt();
        System.out.println("Luas persegi panjang adalah :"+persegi_panjang);
        
        
     
       
    }
    
}
