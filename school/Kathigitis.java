/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodos2024b.saek.school;
public class Kathigitis {
private String onoma;
    private String epitheto;
    private String amka;
    private Mathima mathima;

   
    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEpitheto() {
        return epitheto;
    }

    public void setEpitheto(String epitheto) {
        this.epitheto = epitheto;
    }

    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
    }

    public Mathima getMathima() {
        return mathima;
    }

    public void setMathima(Mathima mathima) {
        this.mathima = mathima;
    }


    public void printDetails() {
        System.out.println("Kathigitis: " + onoma + " " + epitheto + ", AMKA: " + amka);
        if (mathima != null) {
            System.out.println("Didaskei: " + mathima.getKodikos() + " - " + mathima.getPerigrafi());
        }
    }    
    
}
