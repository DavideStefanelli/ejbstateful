/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.ejb;

import com.project.beans.Libro;
import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author web4e
 */
@Local
public interface BibliotecaLocal {
    
    public void aggiungiLibro(Libro l);
    public ArrayList<Libro> getLibri();
    
}
