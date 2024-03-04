package Tugas2;
//Latihan 1


import java.util.Scanner;

class PersegiPanjang {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Panjang : ");
     double panjang = input.nextDouble();

     System.out.print("Lebar : ");
     double lebar = input.nextDouble();

     double luas = panjang * lebar;
     double keliling = 2 * (panjang + lebar);

     System.out.println("Luas : " + luas);
     System.out.println("Keliling : " + keliling);

     input.close();
 }
}
