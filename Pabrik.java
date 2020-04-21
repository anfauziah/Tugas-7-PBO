/* Nama 	: RESKY AYU DEWI TALASARI
	Nim 	: 13020180128
	waktu	: 20 april 2020
	tugas 7
*/

//nomor 4
//Program penerapan interface
interface Pabrik{
static final String PROVINSI = "Jawa Barat";
public void setNama(String namaBaru);
public void setAlamat(String alamatBaru);
 public String getNama();
 public String getAlamat();
}
class PabrikSepatu implements Pabrik{
 String nama, alamat;
public PabrikSepatu(String namaBaru, String alamatBaru){
nama = namaBaru;
alamat = alamatBaru;
   }
public void setNama(String namaBaru){
 nama = namaBaru;
 }
public void setAlamat(String alamatBaru){
alamat = alamatBaru;
 }
 public String getNama(){
 return nama;
 }
  public String getAlamat(){
 return alamat;
 }
  public String getProvinsi(){
 return PROVINSI;
 }
 public String toString(){
return
"Nama       : "+nama+"\n"+
"Alamat            : "+alamat+"\n"+
"Provinsi   : "+PROVINSI+"\n"; 
 }
}
