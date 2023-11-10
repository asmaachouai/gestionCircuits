/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author hp
 */
public class Activite {
    int idActiv ;
    String nomActiv;

    public Activite(int idActiv, String nomActiv) {
        this.idActiv = idActiv;
        this.nomActiv = nomActiv;
    }

    public int getIdActiv() {
        return idActiv;
    }

    public void setIdActiv(int idActiv) {
        this.idActiv = idActiv;
    }

    public String getNomActiv() {
        return nomActiv;
    }

    public void setNomActiv(String nomActiv) {
        this.nomActiv = nomActiv;
    }

    @Override
    public String toString() {
        return "Activite{" + "idActiv=" + idActiv + ", nomActiv=" + nomActiv + '}';
    }
    
    
    
}
