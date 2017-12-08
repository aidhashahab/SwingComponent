/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Pulau {

private String namaPulau;
private String describtion;

    public Pulau() {
    }

    public Pulau(String namaPulau, String describtion) {
        this.namaPulau = namaPulau;
        this.describtion = describtion;
    }

    public String getNamaPulau() {
        return namaPulau;
    }

    public void setNamaPulau(String namaPulau) {
        this.namaPulau = namaPulau;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    @Override
    public String toString() {
        return this.namaPulau; //To change body of generated methods, choose Tools | Templates.
    }


}
