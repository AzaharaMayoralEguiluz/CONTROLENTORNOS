/*
11. Una empresa dedicada a la venta de material escolar quiere calcular el importe de la nómina de sus trabajadores.
Para ello se pide:
• Introducir los nombres de los trabajadores, la categoría a la que pertenecen y el importe de las ventas que han efectuado.
• Obtener el siguiente informe.
INFORME DE TRABAJADORES
NOMBRE CATEGORIA IMPORTE VENTAS IMPORTE COMISIÓN IMPORTE A PERCIBIR
Notas:
 Se debe de comprobar que la categoría del trabajador exista
 Los cálculos son los siguientes:
• Importe Comisión=Importe Ventas* Porcentaje Comisión
• Importe a Percibir = Sueldo Base (en función de la categoría) + Importe Comisión
 */
package mayoralazaharaejercicio11arrays;


/**
 *
 * @author Mayoral Eguiluz, Azahara
 */
public class Trabajador {

    private String nombre;
    //private String categoria;
    private int categoria;
    private float importeVentas;

    /**
     * Constructor trabajador
     *
     * @param nombre nombre del trabajador
     * @param categoria categoria del trabajador que metemos
     * @param importeVentas las ventas totales de dicho trabajador
     */
    public Trabajador(String nombre, int categoria, int importeVentas) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.importeVentas = importeVentas;
    }//Cierre del constructor Trabajador

    /**
     * Getter del nombre del trabajador
     *
     * @return nombre del trabajador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter de la categoria del trabajador
     *
     * @return categoria del trabajador
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * Importe de ventas totales
     *
     * @return ventas totales de un trabajador
     */
    public float getImporteVentas() {
        return importeVentas;
    }

    /**
     * Setter del nombre del trabajador
     *
     * @param nombre Nombre del trabajador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter de la categoria de un trabajador
     *
     * @param categoria Categoria del trabajador
     */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    /**
     * Importe total de ventas
     *
     * @param importeVentas Importe de ventas totales del trabajador
     */
    public void setImporteVentas(float importeVentas) {
        this.importeVentas = importeVentas;
    }

    /**
     * Metodo para grabar los datos de cada uno de los trabajadores en su
     * posición
     *
     * @param nombre Nombre del empleado
     * @param categoria categoria del empleado
     * @param importeVentas Ventas del empleado
     */
    public void grabar(String nombre, int categoria, float importeVentas) {
        setNombre(nombre);
        this.setCategoria(categoria);
        this.setImporteVentas(importeVentas);

    }
}

