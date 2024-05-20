package Tugas_12.TugasMandiri.Data;

public class Sapi implements Peternakan {
	
	private String makanan;
	
	public Sapi() {
		
	}

	@Override
	public void Makan() {
		makanan = "rumput";
		System.out.print("sapi makan : " + makanan);
	}



}
