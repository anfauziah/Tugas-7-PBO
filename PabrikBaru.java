/* Nama 	: RESKY AYU DEWI TALASARI
	Nim 	: 13020180128
	waktu	: 20 april 2020
	tugas 7
*/

//nomor 4
//Program penerapan interface
public class PabrikBaru{
 public static void main (String[] args) {
test();
 }
 static void test(){
 PabrikSepatu SupplierSepatu;
 SupplierSepatu = new PabrikSepatu("Adidas","Jalan Merdeka 123");
 System.out.println("Informasi Perusahaan : "+"\n"+SupplierSepatu);
}
}