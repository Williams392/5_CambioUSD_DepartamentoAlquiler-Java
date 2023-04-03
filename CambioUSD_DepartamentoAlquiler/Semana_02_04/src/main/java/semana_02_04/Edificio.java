/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_02_04;


public class Edificio {
    private int codigo;
    private int numDepartamentos;
    private int numContrato;
    private double costoDepartamento;

    public Edificio(int codigo, int numDepartamentos, int numContrato, double costoDepartamento) {
        this.codigo = codigo;
        this.numDepartamentos = numDepartamentos;
        this.numContrato = numContrato;
        this.costoDepartamento = costoDepartamento;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumDepartamentos() {
        return numDepartamentos;
    }

    public void setNumDepartamentos(int numDepartamentos) {
        this.numDepartamentos = numDepartamentos;
    }

    public int getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(int numContrato) {
        this.numContrato = numContrato;
    }

    public double getCostoDepartamento() {
        return costoDepartamento;
    }

    public void setCostoDepartamento(double costoDepartamento) {
        this.costoDepartamento = costoDepartamento;
    }

    public double getPrecioDolares() {
        return numDepartamentos * costoDepartamento;
    }

}
