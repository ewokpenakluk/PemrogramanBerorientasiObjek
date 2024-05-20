package Tugas_12.TugasMandiri.Aplikasi;

import Tugas_12.TugasMandiri.Data.*;

public class PeternakanApp {
	public static void main(String[] args) {
		Sapi s = new Sapi();
		ayam a = new ayam();
		s.Makan();
		System.out.println();
		a.Makan();
	}
}
