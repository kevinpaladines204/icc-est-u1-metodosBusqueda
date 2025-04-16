import controllers.MetodosBusqueda;
import models.Persona;

public class App {
    public static void main(String[] args)throws Exception{
        Persona[] personas= new Persona[7];
        personas[0]= new Persona(101, "Juan");
        personas[1]= new Persona(102, "Maria");
        personas[2]= new Persona(103, "Carlos");
        personas[3]= new Persona(104, "Ana");
        personas[4]= new Persona(105, "Luis");
        personas[5]= new Persona(106, "Sofia");
        personas[6]= new Persona(107, "Pedro");
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda(personas);

        metodosBusqueda.showPersona(0);

    }
}




//App app = new App();
//int[] numeros = {100, 500, 700, 300, 200, 400, 900};
//int buscar = 200;

//int resultado = app.metodosBusqueda.busquedaLineal(numeros, buscar);

//if (resultado != -1) {
    //System.out.println("El Elemento "+ "'"+buscar+"'" + " se encuentra en la posición: " + resultado);
//} else {
//    System.out.println("Elemento no encontrado");
//}