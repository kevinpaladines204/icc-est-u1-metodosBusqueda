public class App {
    MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

    public static void main(String[] args) {
        App app = new App();
        int[] numeros = {100, 500, 700, 300, 200, 400, 900};
        int buscar = 200;

        int resultado = app.metodosBusqueda.busquedaLineal(numeros, buscar);

        if (resultado != -1) {
            System.out.println("El Elemento "+ "'"+buscar+"'" + " se encuentra en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}
