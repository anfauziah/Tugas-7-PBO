/* Nama 	: RESKY AYU DEWI TALASARI
	Nim 	: 13020180128
	waktu	: 20 april 2020
	tugas 7
*/

//nomor 6
//Program menggabungkan antar abstract class dan interface
public abstract class Binatang{
	protected String nama;
	protected int jmlKaki;
	public Binatang(String nama, int jmlKaki){
	this.nama=nama;
	this.jmlKaki=jmlKaki;
	}
  
	public void setNama(String nama){
	this.nama=nama;
	}
 
	public String getNama(){
	return nama;
	}
 
	public void setKaki(int jmlKaki){
	this.jmlKaki=jmlKaki;
	}
 
	public int getKaki(){
	return jmlKaki;
	}
 
	public void displayBinatang(){
	System.out.println("Nama: "+getNama());
	System.out.println("Jumlah Kaki: "+getKaki());
	}
 }