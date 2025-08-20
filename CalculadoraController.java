package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Operacion;

public class CalculadoraController {
    public double sumar(double a, double b) {
        Operacion op = new Operacion(a, b);
        return op.sumar();
    }

    public double restar(double a, double b) {
        Operacion op = new Operacion(a, b);
        return op.restar();
    }
}
