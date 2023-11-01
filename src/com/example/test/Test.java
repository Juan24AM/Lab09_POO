package com.example.test;

import com.example.estudiantes.EstudiantePostgrado;
import com.example.estudiantes.EstudiantePregrado;

/**
 *
 * @author USER
 */
public class Test {

    public static void main(String[] args) {
        EstudiantePregrado ep1
                = new EstudiantePregrado("A",
                        20d,
                        "Estatal",
                        "Esponja",
                        "Bob",
                        "2020-I");
        EstudiantePregrado ep2
                = new EstudiantePregrado("A",
                        20d,
                        "Particular",
                        "Estrella",
                        "Patricio",
                        "2020-I");
        
        System.out.println(ep1);
        System.out.println("");
        System.out.println(ep2);
        System.out.println("");
        
        EstudiantePostgrado epp1 = new 
        EstudiantePostgrado(
                "Bachiller", 
                "Olaya", 
                "Luis Miguel", 
                "2020-I"
        );
        
        EstudiantePostgrado epp2 = new 
        EstudiantePostgrado(
                "Titulado", 
                "Castillo", 
                "Pedro", 
                "2021-II"
        );
        
        System.out.println(epp1);
        System.out.println("");
        System.out.println(epp2);
                
    }

}