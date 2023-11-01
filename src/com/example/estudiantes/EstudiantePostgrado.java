package com.example.estudiantes;

import com.example.model.Estudiante;

/**
 *
 * @author Juan24AM
 */
public class EstudiantePostgrado extends Estudiante {

    private String gradoAcademico; // (Bachiller Titulado)
    private static int contador = 1;

    public EstudiantePostgrado(String gradoAcademico, String apellidos, String nombres, String semestreIngreso) {
        super(String.format("EPOS%04d", contador), apellidos, nombres, semestreIngreso);
        this.gradoAcademico = gradoAcademico;
        contador++;
    }

    @Override
    public double calcularDescuentos() {
        return 0;
    }

    @Override
    public double pagoParcialPension() {
        switch (gradoAcademico.toLowerCase()) {
            case "bachiller" -> {
                return 400;
            }
            case "titulado" -> {
                return 350;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\nGrado Academico: ").append(gradoAcademico)
                .append("\nPago Paricual Pension: ").append(pagoParcialPension())
                .append("\nPago Final Pension: ").append(super.pagoFinalPension());
        return sb.toString();
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
}