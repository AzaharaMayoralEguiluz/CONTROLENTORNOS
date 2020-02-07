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
public class MayoralAzaharaEjercicio11Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empresa miEmpresa = new Empresa();
                
         
        miEmpresa.crearTrabajadores();
        miEmpresa.meterDatosTrabajadores();
        miEmpresa.mostrarInforme();

    }

}

