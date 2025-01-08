/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodos2024b.saek.school;
public class Mathima {
    private String kodikos; 
    private String perigrafi; 
    private Taksi taksi; 

    public String getKodikos() {
        return kodikos;
    }

    public void setKodikos(String kodikos) {
        this.kodikos = kodikos;
    }

    public String getPerigrafi() {
        return perigrafi;
    }

    public void setPerigrafi(String perigrafi) {
        this.perigrafi = perigrafi;
    }

    public Taksi getTaksi() {
        return taksi;
    }

    public void setTaksi(Taksi taksi) {
        this.taksi = taksi;
    }

    public void printDetails() {
        System.out.println("Mathima: " + kodikos + " - " + perigrafi);
        if (taksi != null) {
            System.out.println("Taksi: " + taksi.getKodikos() + " - " + taksi.getPerigrafi());
        }
    }
}
