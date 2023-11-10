/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class Ligneactiv {
    String jour ;
    Circuit crt;
    Activite act;
    
    List<Activite> A = new ArrayList<Activite>();

    public Ligneactiv(String jour, Circuit crt, Activite act) {
        this.jour = jour;
        this.crt = crt;
        this.act = act;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public Circuit getCrt() {
        return crt;
    }

    public void setCrt(Circuit crt) {
        this.crt = crt;
    }

    public Activite getAct() {
        return act;
    }

    public void setAct(Activite act) {
        this.act = act;
    }

    public List<Activite> getA() {
        return A;
    }

    public void setA(List<Activite> A) {
        this.A = A;
    }

    @Override
    public String toString() {
        return "Ligneactiv{" + "jour=" + jour + ", crt=" + crt + ", act=" + act + ", A=" + A + '}';
    }
    
    
    
}
