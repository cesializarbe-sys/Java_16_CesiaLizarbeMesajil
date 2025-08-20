package vallegrande.edu.pe.view;

import vallegrande.edu.pe.model.Persona;
import vallegrande.edu.pe.model.OperacionesExtra;
import vallegrande.edu.pe.model.Saludo;
import vallegrande.edu.pe.model.Producto;

public class AppPruebas {
    public static void main(String[] args) {
        // Actividad 2: Clase con atributos y métodos
        Persona persona = new Persona();
        persona.nombre = "Cesia";
        persona.edad = 17;
        persona.mostrarInfo();

        // Actividad 3: Método con valor de retorno
        OperacionesExtra opExtra = new OperacionesExtra();
        int resultado = opExtra.multiplicar(5, 3);
        System.out.println("Multiplicación: " + resultado);

        // Actividad 4: Método con parámetros
        Saludo saludo = new Saludo();
        saludo.saludar("Cesia");

        // Actividad 5: Clase con constructor
        Producto producto = new Producto("Laptop", 2500.00);
        producto.mostrarProducto();
    }
}
