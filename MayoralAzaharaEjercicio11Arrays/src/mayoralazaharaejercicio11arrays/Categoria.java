/*
11. Una empresa dedicada a la venta de material escolar quiere calcular el importe de la nómina de sus trabajadores.
Para ello se pide:
• Introducir los nombres de los trabajadores, la categoría a la que pertenecen y el importe de las ventas que han efectuado.
• Obtener el siguiente informe.
INFORME DE TRABAJADORES
NOMBRE  CATEGORIA   IMPORTE     VENTAS  IMPORTE     COMISIÓN    IMPORTE A PERCIBIR
Notas:
 Se debe de comprobar que la categoría del trabajador exista
 Los cálculos son los siguientes:
• Importe Comisión=Importe Ventas* Porcentaje Comisión
• Importe a Percibir = Sueldo Base (en función de la categoría) + Importe Comisión
 */
package mayoralazaharaejercicio11arrays;

/**
 *
 * @author Mayoral Eguiuluz, Azahara
 */

public class Categoria {

    private String nombreCategoria;

    private int sueldoBase;

    /**
     * Constructor de Categoria, dandole un nombre y un sueldo
     * @param nombreCategoria El nombre de la categoria
     * @param sueldoBase el sueldo base de la categoria asignada
     */
    public Categoria(String nombreCategoria, int sueldoBase) {
        this.nombreCategoria = nombreCategoria;
        this.sueldoBase = sueldoBase;
    }// Cierre del constructor Categoria
    

    /**
     * Getter de la catgoria
     * @return El nombre de la categoria
     */
    public String getCategoria() {
        return nombreCategoria;
    }

    /**
     *Getter del sueldo base
     * @return el sueldo base
     */
    public int getSueldoBase() {
        return sueldoBase;
    }

}

