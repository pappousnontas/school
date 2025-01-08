/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodos2024b.saek.school;
public class Taksi {
    private String kodikos;
    private String perigrafi; 
 
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

   
    public void printDetails() {
        System.out.println("Taksi: " + kodikos + " - " + perigrafi);
    }
}
