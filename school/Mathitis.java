/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodos2024b.saek.school;
public class Mathitis {
    private String onoma;
    private String epitheto;
    private String arithmosMitroou; 
    private Mathima[] mathimata = new Mathima[5]; 

   
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

    public String getArithmosMitroou() {
        return arithmosMitroou;
    }

    public void setArithmosMitroou(String arithmosMitroou) {
        this.arithmosMitroou = arithmosMitroou;
    }

    public Mathima[] getMathimata() {
        return mathimata;
    }

    public void setMathimata(Mathima[] mathimata) {
        if (mathimata.length == 5) {
            this.mathimata = mathimata;
        } else {
            System.out.println("Mathiti ksypna thes 5 mathimata!");
        }
    }

   
    public void printDetails() {
        System.out.println("Mathitis: " + onoma + " " + epitheto + ", AM: " + arithmosMitroou);
        System.out.println("Mathimata:");
        for (Mathima mathima : mathimata) {
            if (mathima != null) {
                System.out.println("- " + mathima.getKodikos() + ": " + mathima.getPerigrafi());
            }
        }
    }
}

