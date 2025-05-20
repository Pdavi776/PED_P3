package Menus;

import OS.OS;

public class MenuPrincipal {
    public static void mostrarMenu() {
        OS.limpiarPantalla(); // Limpiar pantalla
        System.out.println("MENÚ AB de enteros  \n");
        System.out.println("1. Crear los AB de enteros");
        System.out.println("2. Listado de claves en InOrden");
        System.out.println("3. Listado de claves en InOrden Converso");
        System.out.println("4. Listado de claves en PreOrden");
        System.out.println("5. Listado de claves en PostOrden");
        System.out.println("6. Listado de claves por Niveles");
        System.out.println("7. Comprobar si dos árboles son iguales");
        System.out.println("8. Comprobar Simetría de un AB");
        System.out.println("9. Comprobar Parientes");
        System.out.println("10.  Valor mínimo de cada nivel");
        System.out.println("11.  Comprobar suma de claves");
        System.out.println("12.  Vaciar Árbol Modo 1  (sin recorrer el árbol)");
        System.out.println("13.  Vaciar Árbol Modo 2  (recorriendo todos sus nodos)");
        System.out.println("0. Salir\n");
        System.out.print("Elija opción: ");
    }
}
