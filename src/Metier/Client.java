/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toshiba
 */
public class Client {
    
    int NumeroCL;
    String nomCL;
    String prenomCL;
    String nationalite;
    int tel;
    String email;
    String cin;
    String numPass;
    String login;
    String mdp;
     List<Circuit> cl= new ArrayList<Circuit>();

    public Client( String login, String mdp) {
      
        this.login = login;
        this.mdp = mdp;
    }

    public Client(String nomCL) {
        this.nomCL = nomCL;
    }
    

    

    public int getNumeroCL() {
        return NumeroCL;
    }

    public void setNumeroCL(int NumeroCL) {
        this.NumeroCL = NumeroCL;
    }

    public String getNomCL() {
        return nomCL;
    }

    public void setNomCL(String nomCL) {
        this.nomCL = nomCL;
    }

    public String getPrenomCL() {
        return prenomCL;
    }

    public void setPrenomCL(String prenomCL) {
        this.prenomCL = prenomCL;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNumPass() {
        return numPass;
    }

    public void setNumPass(String numPass) {
        this.numPass = numPass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public List<Circuit> getCl() {
        return cl;
    }

    public void setCl(List<Circuit> cl) {
        this.cl = cl;
    }

    @Override
    public String toString() {
        return "Client{" + "NumeroCL=" + NumeroCL + ", nomCL=" + nomCL + ", prenomCL=" + prenomCL + ", nationalite=" + nationalite + ", tel=" + tel + ", email=" + email + ", cin=" + cin + ", numPass=" + numPass + ", login=" + login + ", mdp=" + mdp + ", cl=" + cl + '}';
    }

  

   
   
         
    
}
