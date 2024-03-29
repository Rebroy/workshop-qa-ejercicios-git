package ejerciciosgit;

public class Ejercicios {
    public static void main(String args[]) {
        cambiarNombre();
        capacidadVehiculo();
        distanciaRecorrida();
        mostrarEdad();
        tipoVehiculo();
        mostrarCancionFavorita();
        mostrarComidaFavorita();
        mostrarPeliculaFavorita();
        mostrarLibroFavorito();
        sumarNumeros();
        restarNumeros();
        multiplicarNumeros();
        dividirNumeros();
    }

    public static void cambiarNombre() {
        // Se debe cambiar el valor de la variable nombre
        String nombre = "Autobol";
        System.out.println("Mi nombre es: " + nombre);
    }

    public static void capacidadVehiculo() {
        // Se debe cambiar el valor de la variable capacidad
        String capacidad = "1500 Kg";
        System.out.println("La capacidad del vehiculo es de: " + capacidad);
    }

    public static void distanciaRecorrida() {
        // Se debe cambiar el valor de la variable distancia
        String distancia = "50 Km";
        System.out.println("La distancia recorrida fue de: " + distancia);
    }

    public static void mostrarEdad() {
        // Se debe cambiar el valor de la variable edad
        int edad = 35;
        System.out.println("Mi edad es: " + edad + " años");
    }

    public static void tipoVehiculo() {
        // Se debe cambiar el valor de la variable vehiculo
        String vehiculo = "Mazda";
        System.out.println("Mi vehiculo es un(a): " + vehiculo);
    }

    public static void mostrarCancionFavorita() {
        // Se debe cambiar el valor de la variable cancion
        String cancion = "índigo";
        System.out.println("Mi canción favorita es: " + cancion);
    }

    public static void mostrarComidaFavorita() {
        // Se debe cambiar el valor de la variable comida
        String comida = "Japonesa";
        System.out.println("Mi comida favorita es: " + comida);
    }

    public static void mostrarPeliculaFavorita() {
        // Se debe cambiar el valor de la variable pelicula
        String pelicula = "Juegos del trono ";
        System.out.println("Mi pelicula favorita es: " + pelicula);
    }

    public static void mostrarLibroFavorito() {
        // Se debe cambiar el valor de la variable libro
        String libro = "Angeles y Demonios";
        System.out.println("Mi libro favorito es: " + libro);
    }

    public static void sumarNumeros() {
        // Se debe cambiar el valor de los numeros a sumar, variable a y b
        int a = 15;
        int b = 20;
        int resultado = a + b;

        System.out.println("La suma de " + a + " + " + b + " es: " + resultado);
    }

    public static void restarNumeros() {
        // Se debe cambiar el valor de los numeros a restar, variable a y b
        int a = 500;
        int b = 500;
        int resultado = a - b;

        System.out.println("La resta de " + a + " - " + b + " es: " + resultado);
    }

    public static void multiplicarNumeros() {
        // Se debe cambiar el valor de los numeros a multiplicar, variable a y b
        int a = 2;
        int b = 6;
        int resultado = a * b;

        System.out.println("La multiplicación de " + a + " * " + b + " es: " + resultado);
    }

    public static void dividirNumeros() {
        // Se debe cambiar el valor de los numeros a dividir, variable a y b
        int a = 8;
        int b = 2;
        int resultado = a / b;

        System.out.println("La división de " + a + " entre " + b + " es: " + resultado);
    }
}
