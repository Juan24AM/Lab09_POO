package com.example.model;
import java.io.Serializable;

/**
 *
 * @author Juan24AM
 */
public abstract class Estudiante implements Serializable {
    private String codigo;
    private String apellidos;
    private String nombres;
    private String semestreIngreso;

    public Estudiante(String codigo, String apellidos, String nombres, String semestreIngreso) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.semestreIngreso = semestreIngreso;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSemestreIngreso() {
        return semestreIngreso;
    }

    public void setSemestreIngreso(String semestreIngreso) {
        this.semestreIngreso = semestreIngreso;
    }
    
    // Métodos abstractos
    public abstract double pagoParcialPension();
    public abstract double calcularDescuentos();
    
    // Métodos no abstractos
    public double pagoFinalPension() {
        return pagoParcialPension() - calcularDescuentos();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo: ").append(codigo)
                .append("\nApellidos: ").append(apellidos)
                .append("\nNombres: ").append(nombres)
                .append("\nSemestre de ingreso: ").append(semestreIngreso);
        return sb.toString();
    }
}

interface Descuento {
    double descPorcentajeIGV = 0.19; // Constante para el descuento del 19% del IGV
}