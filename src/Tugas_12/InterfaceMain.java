
package Tugas_12;

public class InterfaceMain {
    public static void main(String[] args)  {
       KartuElektronik kartu = new KartuElektronik("if111", "123");
       System.out.println(kartu.otentikasi("123"));
    }
}
