/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoradigital;

/**
 *
 * @author Bryan
 */
public class CalculadoraLogica {
    private double numero1;
    private double numero2;
    private String operacion;

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setNumero1(double numero) {
        this.numero1 = numero;
    }

    public void setNumero2(double numero) {
        this.numero2 = numero;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double calcularResultado() {
        switch (operacion) {
            case "sumar":
                return numero1 + numero2;
            case "restar":
                return numero1 - numero2;
            case "multiplicar":
                return numero1 * numero2;
            case "dividir":
                return numero1 / numero2;
            default:
                throw new UnsupportedOperationException("Operación no soportada, vuelta a intentarlo");
        }
    }
    
}
