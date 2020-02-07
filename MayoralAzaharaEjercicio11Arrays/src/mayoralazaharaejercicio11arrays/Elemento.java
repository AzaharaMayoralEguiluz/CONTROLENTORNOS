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
public class Elemento {
    float importe;
    float porcentageDeComision;
/**
 * Constructor de Elemento, en este caso la comision a percibir de un empleado
 * @param importe el rango del importe, para asignar la comision a percibir
 * @param porcentageDeComision Porcentage de comision por ventas realizadas
 */
    public Elemento(float importe, float porcentageDeComision) {
        this.importe = importe;
        this.porcentageDeComision = porcentageDeComision;
    }// Cierre del constructor Elemento
    
/**
 * Importes limites
 * @return el importe para asignar una comisión.
 */
    public float getImporteLimite() {
        return importe;
    }
/**
 * Porcentages de comisión segun ventas
 * @return el porcentaje asignado según las ventas.
 */
    public float getPorcentageDeComision() {
        return porcentageDeComision;
    }
    
    
    
}

