/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.ejb;

import com.project.beans.Libro;
import java.util.ArrayList;
import javax.ejb.Stateful;

@Stateful
public class Biblioteca implements BibliotecaLocal {

    ArrayList<Libro> libri = new ArrayList<>();
    
    @Override
    public void aggiungiLibro(Libro l) {
        libri.add(l);
    }

    @Override
    public ArrayList<Libro> getLibri() {
        return libri;
    }

    
    
    
}
