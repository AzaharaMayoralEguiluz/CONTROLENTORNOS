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
El porcentaje para calcular el importe de la comisión se obtiene en función de las ventas que ha 
realizado el trabajador según la siguiente tabla:

Dependiendo de la categoría a la que pertenece el trabajador se obtiene el sueldo base
Categoría SUELDO BASE
Administrativo 1000€
Operador 1100€
Programador 1500€
Analista 2000€
 */
package mayoralazaharaejercicio11arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mayoral Eguiluz, Azahara
 */
public class Empresa {

    Trabajador[] trabajadores;//trabajador tiene conjunto de trabajadores

    Categoria[] categorias;//Categoria tiene conjunto de categorias

    Elemento[] tablaLimites;//Elemento tiene conjunto de elementos (elemento=Comisión)

    /**
     * Constructor de empresa asignando tabla de comisiones, te crea el espacio
     * para los trabajadores que asines y crea las categorias existentes.
     */
    public Empresa() {

        tablaLimites = new Elemento[]{
            new Elemento(10000f, 0.05f),
            new Elemento(15000f, 0.1f),
            new Elemento(20000f, 0.15f),
            new Elemento(25000f, 0.20f),
            new Elemento(Float.MAX_VALUE, 0.25f)// cambiarle a float en todos

        };
        /**
         * Si no pasas el numero de trabajadores crea automaticamente este con 2
         * empleados. O con los que asignes.
         *
         */
        trabajadores = new Trabajador[2];

        categorias = new Categoria[]{
            new Categoria("Administrativo", 1000),
            new Categoria("Operador", 1100),
            new Categoria("Programador", 1500),
            new Categoria("Analista", 2000)
        };

    }// Cierre del constructor Empresa

    /**
     * Constructor de empresa asignando tabla de comisiones, te crea el espacio
     * para los trabajadores que asines y crea las categorias existentes.
     *
     * @param numeroTrabajadores Hay que pasarle el numero de trabajadores, para
     * trabajar con lo que tu necesites.
     */
    public Empresa(int numeroTrabajadores) {

        tablaLimites = new Elemento[]{
            new Elemento(10000f, 0.05f),
            new Elemento(15000f, 0.1f),
            new Elemento(20000f, 0.15f),
            new Elemento(25000f, 0.20f),
            new Elemento(Float.MAX_VALUE, 0.25f)
        };
        trabajadores = new Trabajador[numeroTrabajadores];

        categorias = new Categoria[]{
            new Categoria("Administrativo", 1000),
            new Categoria("Operador", 1100),
            new Categoria("Programador", 1500),
            new Categoria("Analista", 2000)
        };
    }

    /**
     * Inicializa los trabajadores.
     */
    public void crearTrabajadores() {

        for (int numeroTrabajador = 0; numeroTrabajador < trabajadores.length; numeroTrabajador++) {
            trabajadores[numeroTrabajador] = new Trabajador("", 0, 0);

        }
    }

    /**
     * Pedir datos de trabajadores con un for.
     */
    public void meterDatosTrabajadores() {
        String nombre;
        int categoria;
        float ventas;
        for (int numeroTrabajador = 0; numeroTrabajador < trabajadores.length; numeroTrabajador++) {
            nombre = pedirNombre();
            categoria = pedirCategoria();
            ventas = ventasRealizadas();
            trabajadores[numeroTrabajador].grabar(nombre, categoria, ventas);

        }

    }

    /**
     * Metodo para visualizar las categorias existentes
     */
    public void visualizarCategoria() {
        for (int ncat = 0; ncat < categorias.length; ncat++) {
            System.out.println(ncat + " " + categorias[ncat].getCategoria());
        }
    }

    /**
     * Busca en la tabla el rango en el cual se encuentran las ventas del
     * empleado y le asigna una comision segun sus ventas.
     *
     * @param importeVentas necesita el importe de ventas para compararlo en la
     * tabla
     * @return el porcentage de comision del empleado
     */
    public float porcentageAPercibir(float importeVentas) {
        float recibir = 0;
        int i = 0;
        boolean encontrado = false;
        while (i < tablaLimites.length && !encontrado) {
            if (importeVentas < tablaLimites[i].getImporteLimite()) {

                encontrado = true;

            } else {
                i++;
            }
        }
        return tablaLimites[i].getPorcentageDeComision();

    }

    /**
     * INFORME DE TRABAJADORES NOMBRE CATEGORIA IMPORTE VENTAS IMPORTE COMISIÓN
     * IMPORTE A PERCIBIR
     */
    public void mostrarInforme() {

        for (int numeroTrabajador = 0; numeroTrabajador < trabajadores.length; numeroTrabajador++) {

            System.out.println(
                    "Nombre del trabajador:" + trabajadores[numeroTrabajador].getNombre()
                    + "\t"
                    + "La categoria del trabajador es: " + categorias[trabajadores[numeroTrabajador].getCategoria()].getCategoria()
                    + "\t"
                    + //categoria 
                    "El importe de ventas realizado: " + trabajadores[numeroTrabajador].getImporteVentas()
                    + "\t"
                    + categorias[trabajadores[numeroTrabajador].getCategoria()].getSueldoBase()
                    + "\t"
                    + porcentageAPercibir(trabajadores[numeroTrabajador].getImporteVentas())
                    + "\t"
                    + (categorias[trabajadores[numeroTrabajador].getCategoria()].getSueldoBase()) + trabajadores[numeroTrabajador].getImporteVentas() * porcentageAPercibir(trabajadores[numeroTrabajador].getImporteVentas())
            );

        }
    }

    /**
     * metodo para pedir nombre
     *
     * @return nombre del empleado
     */
    public String pedirNombre() {
        String nombre = "";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        System.out.println("Introduzca el nombre del empleado. ");

        try {
            nombre = teclado.readLine();
        } catch (IOException ex) {
            System.out.println(" Error técnico, avise a su informático");
        }
        return nombre;
    }

    /**
     * Metodo para asignar las ventas totales a un empleado
     *
     * @return ventas realizadas
     */
    public float ventasRealizadas() {

        float importeVentas = 0;
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        System.out.println("Introduzca el importe de ventas del empleado. ");
        try {
            importeVentas = -1;
            while (importeVentas < 0) /**
             * para que al menos el valor de ventas sea un 0 y no un numero
             * negativo.
             */
            {
                importeVentas = Float.parseFloat(teclado.readLine());
            }
        } catch (IOException ex) {
            System.out.println(" Error técnico, avise a su informático");
        }
        return importeVentas;

    }
    
    /**
     * metodo para pedir categoria
     *
     * @return la categoria del empleado
     */
    public int pedirCategoria() {

        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        visualizarCategoria();
        System.out.println("Introduzca la categoria del empleado. ");

        int elegido = 0;
        boolean correcto = false;
        while (!correcto) {

            try {

                elegido = Integer.parseInt(teclado.readLine());
                if (elegido < 0 || elegido > categorias.length - 1) {
                    System.out.println("Introduzca categoria correcta.");

                } else {
                    correcto = true;
                }

            } catch (NumberFormatException ex) {
            } catch (IOException ex) {
                System.out.println(" Error técnico, avise a su informático");
            }

        }
        return elegido;
    }

    
}

