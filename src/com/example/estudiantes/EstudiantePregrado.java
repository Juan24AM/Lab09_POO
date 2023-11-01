package com.example.estudiantes;

import com.example.model.Estudiante;

/**
 *
 * @author Juan24AM
 */
public class EstudiantePregrado extends Estudiante {

    public static int getContador() {
        return contador;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }
    private String categoría; // (A o B)
    private Double promedioPonderado;
    private String colegioProcedencia; // (Estatal o Particular)
    private static int contador = 1;

    public EstudiantePregrado(String categoría, Double promedioPonderado, String colegioProcedencia, String apellidos, String nombres, String semestreIngreso) {
        super(String.format("EPRE%04d", contador), apellidos, nombres, semestreIngreso);
        this.categoría = categoría;
        this.promedioPonderado = promedioPonderado;
        this.colegioProcedencia = colegioProcedencia;
        contador++;
    }
    
    @Override
    public double pagoParcialPension() {
        switch (categoría.toUpperCase()) {
            case "A" -> {
                switch (colegioProcedencia.toLowerCase()) {
                    case "estatal" -> {
                        return 320;
                    }
                    case "particular" -> {
                        return 450;
                    }
                }
            }
            case "B" -> {
                switch (colegioProcedencia.toLowerCase()) {
                    case "estatal" -> {
                        return 300;
                    }
                    case "particular" -> {
                        return 420;
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public double calcularDescuentos() {
        if (promedioPonderado > 13) {
            return pagoParcialPension() * 0.08;
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\nCategoria: ").append(categoría)
                .append("\nPromedio Ponderado: ").append(promedioPonderado)
                .append("\nColegio Procedencia: ").append(colegioProcedencia)
                .append("\nPago Paricual Pension: ").append(pagoParcialPension())
                .append("\nDescuento: ").append(calcularDescuentos())
                .append("\nPago Final Pension: ").append(super.pagoFinalPension());
        return sb.toString();
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public Double getPromedioPonderado() {
        return promedioPonderado;
    }

    public void setPromedioPonderado(Double promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }

    public String getColegioProcedencia() {
        return colegioProcedencia;
    }

    public void setColegioProcedencia(String colegioProcedencia) {
        this.colegioProcedencia = colegioProcedencia;
    }
}
