/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proodos2024b.saek.school;
public class School {
    public static void main(String[] args) {
        
        Mathima mathima1 = new Mathima();
        mathima1.setKodikos("P1");
        mathima1.setPerigrafi("Pliroforiki I");

        Mathima mathima2 = new Mathima();
        mathima2.setKodikos("I1");
        mathima2.setPerigrafi("Istoria I");

        Mathima mathima3 = new Mathima();
        mathima3.setKodikos("F1");
        mathima3.setPerigrafi("Fysiki I");

        Mathima mathima4 = new Mathima();
        mathima4.setKodikos("M1");
        mathima4.setPerigrafi("Mathimatika I");

        Mathima mathima5 = new Mathima();
        mathima5.setKodikos("G1");
        mathima5.setPerigrafi("Glwassa I");

    
        Taksi taksi1 = new Taksi();
        taksi1.setKodikos("E1");
        taksi1.setPerigrafi("Ergastirio 1");

        Taksi taksi2 = new Taksi();
        taksi2.setKodikos("E2");
        taksi2.setPerigrafi("Ergastirio 2");

        
        mathima1.setTaksi(taksi1);
        mathima2.setTaksi(taksi2);

      
        Kathigitis kathigitis1 = new Kathigitis();
        kathigitis1.setOnoma("Minas");
        kathigitis1.setEpitheto("Sioutis");
        kathigitis1.setAmka("848291984");
        kathigitis1.setMathima(mathima1);

       
        Mathitis mathitis1 = new Mathitis();
        mathitis1.setOnoma("Giwrgos");
        mathitis1.setEpitheto("Fwtopoulos");
        mathitis1.setArithmosMitroou("499282797");

        mathitis1.setMathimata(new Mathima[]{mathima1, mathima2, mathima3, mathima4, mathima5});
        
        kathigitis1.printDetails();
        mathitis1.printDetails();
    }
}


