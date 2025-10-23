
package pkg9_percabangan_if_else;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       /*int a= 10, b= 15;
       if (a>b){
           System.out.println("nilai a lebih besar dari b");     
       }
     
       else {
           System.out.println("nilai yang anda masukan tidak sesuai");
*/
       String nama, nim, kelas, alamat;
       int ujian;
       
        System.out.println("selamat datang, silahkan input data diri");
        System.out.println("===============DATA MAHASISWA===============");
        System.out.print("nama = ");
        nama = input.nextLine();
        System.out.print("nim = ");
        nim =input.nextLine();
        System.out.print("kelas = ");
        kelas =input.nextLine();
        System.out.print("alamat = ");
        alamat =input.nextLine();
        System.out.println("=============================================");
        System.out.println("");
        System.out.println("nama "+nama +" nim "+nim);
        System.out.println("kelas "+kelas);
        System.out.println("alamat "+alamat);
        System.out.println("");
        System.out.print("masukan niali ujian ahir anda = ");
        ujian =input.nextInt();
        if (ujian >90){
            System.out.println("selamat anda jeius");
        }
        else if (ujian >75){
            System.out.println("selamat anda lulus ujian");    
        }
         
         else {
            System.out.println("mohon maaf, anda tidak lulus. tetap semangat >.<");
        }
    }
    
    
    }