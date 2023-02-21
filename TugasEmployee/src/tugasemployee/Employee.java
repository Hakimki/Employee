/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasemployee;

/**
 *
 * @author Fahmi Hakim
 */
public class Employee {
    private int nip;
    private String name;
    private String status;
    private int gaji;
    private int bonus;
    private int potongan;
       private int waktukerja;

    public Employee(int nip, String name, String status, int gaji, int bonus, int potongan, int par4) {
        this.nip = nip;
        this.name = name;
        this.status = status;
        this.gaji = gaji;
        this.bonus = bonus;
        this.potongan = potongan;
           this.waktukerja = waktukerja;
    }

    

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getGaji() {
        return gaji;
    }
      public int getWaktuKerja() {
        return waktukerja;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getPotongan() {
        return potongan;
    }

    public void setPotongan(int potongan) {
        this.potongan = potongan;
    }

   
    public int calculateGaji() {
        int gajiBersih = gaji;
        if (status.equals("menikah")) {
            gajiBersih += bonus;
        }
        if (waktukerja < 8) {
            gajiBersih -= 100000;
        }
        if (potongan > 0) {
            gajiBersih -= potongan;
        }
        return gajiBersih;
    }
    
   

    public static void main(String[] args) {
        Employee employee1 = new Employee(123, "John Doe", "menikah", 3000000, 10000000, 0, 7);
        Employee employee2 = new Employee(456, "Jane Smith", "bujang", 3000000, 0, 50000, 9);

        System.out.println("Gaji " + employee1.getName() + ": " + employee1.calculateGaji());
        System.out.println("Gaji " + employee2.getName() + ": " + employee2.calculateGaji());
    }
}










