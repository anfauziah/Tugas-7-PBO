
/* 	Nama 	: RESKY AYU DEWI TALASARI
	Nim 	: 13020180128
	waktu	: 20 april 2020
	tugas 7
*/

//nomor 7
//Program inheritance interface
public class Data implements MataKuliah{

	@Override
	public void namaMhs() {
		System.out.println("aNama Mahasiswa = Irma Nurkhofifah M.");
		
	}

	@Override
	public String stb() {
		return "13020180096";
	}
	
	@Override
	public String mk() {
		return "Pemrograman Berorientasi Objek";
	}
	
}