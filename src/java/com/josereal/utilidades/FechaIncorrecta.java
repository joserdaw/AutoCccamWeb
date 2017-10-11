package com.josereal.utilidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose
 */
public class FechaIncorrecta extends Exception{
    public FechaIncorrecta(String fecha){
        super(fecha);
    } 
}
