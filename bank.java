package tugasrpl;

import javax.swing.JOptionPane;

public class bank {
 private String nama_nsb,pin,norek_nsb,no_t;
 private double s,saldo_awal,saldo_akhir;
 private double setor,ambil,jum;
 
 public void setnsb1(){
    nama_nsb=JOptionPane.showInputDialog("Masukan nama anda ?");
    norek_nsb=JOptionPane.showInputDialog("Masukan No. Rekening anda ?");
 }

public void setnsb2(){
    String dat=JOptionPane.showInputDialog("Masukan Saldo awal (min Rp 50.000)?");
    saldo_awal=Double.parseDouble(dat);
    saldo_akhir=saldo_awal;
    if (saldo_akhir<50000)
    {JOptionPane.showMessageDialog(null,"Maaf saldo awal min Rp 50.000");}
    else
    {
    saldo_akhir=saldo_awal;}
} 
public void ambil(){
String data=JOptionPane.showInputDialog("Masukan jumlah pengambilan ?");
    ambil=Double.parseDouble(data);
    if (saldo_akhir<50000)
    {JOptionPane.showMessageDialog(null,"Maaf saldo anda kurang");}
    else
    {
    JOptionPane.showMessageDialog(null,"Pengambilan Rp. "+ambil+" Berhasil !");
    saldo_akhir=saldo_akhir-ambil;}
}
public void transfer(){
no_t=JOptionPane.showInputDialog("Masukan norek tujuan ?");
String data=JOptionPane.showInputDialog("Masukan jumlah yang akan ditransfer ?");
jum=Double.parseDouble(data);
saldo_akhir=saldo_akhir-jum;
}
public void setnsb3(){
    {
    String data=JOptionPane.showInputDialog("Masukan jumlah nominal setoran (min Rp 1000)?");
    setor=Double.parseDouble(data);
    if (setor<1000)
    {JOptionPane.showMessageDialog(null,"Maaf Setoran minimal Rp 1000");}
    else
    {
    JOptionPane.showMessageDialog(null,"Setoran Rp. "+setor+" Berhasil!");
    saldo_akhir=saldo_akhir+setor;}
    }
}
 public String getb(){
     return nama_nsb;
 }
  public String geta(){
     return norek_nsb;
 }
  public double getc(){
      return saldo_akhir;
  }
  public double getd(){
      return jum;
      
  }
  public String gete(){
      return no_t;
  }
}

package tugasrpl;

import javax.swing.JOptionPane;

public class menu_utama extends bank{
 public static void main(String[] args){
     int pilih1;
        
        nasabah coba=new nasabah();  
        nasabah Tombol;
        Tombol = coba;
       
        int x=0;
        do
        {String data2=JOptionPane.showInputDialog(" ++= *BANK MAJU MUNDUR* =++ \n 1. Nasabah Baru "
                + "\n 2. Setoran \n 3. Transfer  \n 4. Mengambil \n 5. Exit \n "
                + " Masukan Pilihan Anda?");
          pilih1=Integer.parseInt(data2);
          switch(pilih1){
              case 1:
              Tombol.setnsb1();
              Tombol.setnsb2();
              Tombol.getnsb1();
              break;
               
              case 2:
              Tombol.setnsb3();
              Tombol.getnsb1();
              break;
                  
              case 3:
              Tombol.transfer();
              Tombol.getnsb4();
              break;
                  
              case 4:
              Tombol.ambil();
              Tombol.getnsb1();               
              break;
                  
              case 5:
               System.exit(0);
              break;
                  
          }    
              x++;
          }      while (x>0);     
        }
}
package tugasrpl;

import javax.swing.JOptionPane;

public class nasabah extends bank{
   

public void getnsb1(){
    JOptionPane.showMessageDialog(null,"Data Nasabah \n"
+ "Nama Nasabah : "+getb()+"\n"
+ "No rekening : "+geta()+"\n"
+ "Saldo : Rp "+getc()+"\n");
}

public void getnsb4(){
JOptionPane.showMessageDialog(null,"Data Nasabah \n"
+ "Nama Nasabah : "+getb()+"\n"
+ "No rekening : "+geta()+"\n"
+ "No rekening tujuan : "+gete()+"\n"
+ "Jumlah Transfer : "+getd()+"\n"
+ "Saldo : Rp "+getc()+"\n");
}
}




