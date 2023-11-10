/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Toshiba
 */
public class Circuit {
    Statement st;
    Connection conn;
    int IDC;
    int NbJours;
    int c;

    public Circuit( int NbJours, int c) {
       
        this.NbJours = NbJours;
        this.c = c;
    }

   

    public int getIDC() {
        return IDC;
    }

    public void setIDC(int IDC) {
        this.IDC = IDC;
    }

    public int getNbJours() {
        return NbJours;
    }

    public void setNbJours(int NbJours) {
        this.NbJours = NbJours;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Circuit{" + "IDC=" + IDC + ", NbJours=" + NbJours + ", c=" + c + '}';
    }


    

 

   

   
    
}
