package vallegrande.edu.pe.model;

public class Producto {
    // Atributos
    String nombre;
    double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método
    public void mostrarProducto() {
        System.out.println("Producto: " + "laptop" + " Precio: " + "2500.0");
    }
}
