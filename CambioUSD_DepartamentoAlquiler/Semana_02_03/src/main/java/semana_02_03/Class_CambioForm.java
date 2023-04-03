/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_02_03;

/**
 *
 * @author PC
 */
public class Class_CambioForm {
    private int codigo;
    private String marca;
    private String color;
    private double precioDolares;

    public Class_CambioForm(int codigo, String marca, String color, double precioDolares) {
        this.codigo = codigo;
        this.marca = marca;
        this.color = color;
        this.precioDolares = precioDolares;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioDolares() {
        return precioDolares;
    }

    public void setPrecioDolares(double precioDolares) {
        this.precioDolares = precioDolares;
    }

    public double getPrecioSoles() {
        return this.precioDolares * 3.28;
    }

    public double getPrecioEuros() {
        return this.precioDolares / 1.11;
    }

    public void disminuirPrecioDolares(double porcentaje) {
        this.precioDolares *= (1 - porcentaje/100);
    }

    // método listado
    public String toString() {
        return "Código: " + codigo +
               "\nMarca: " + marca +
               "\nColor: " + color +
               "\nPrecio en dólares: " + precioDolares +
               "\nPrecio en soles: " + getPrecioSoles() +
               "\nPrecio en euros: " + getPrecioEuros();
    }
}
