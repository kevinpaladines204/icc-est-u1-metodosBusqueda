package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda{

    private ShowConsole showConsole;
    private Persona [] people;

    public MetodosBusqueda(Persona[] persons){
        showConsole= new ShowConsole();
        this.people = persons;

    }

    public int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    //@parametro code a buscar
    //return posicion de la persona encontrada

    public int findPersonaByCode(int code){
        for (int i = 0; i < people.length; i++) {
            if(people[i].getCode() == code){
                return i;
            }

        }
        return -1;
    }

    public void showPersona(int position){
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonaByCode(codeToFind);
        if(indexPerson >=0){
            showConsole.showMessage("Persona con el codigo:" + codeToFind + "encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        }else{
            showConsole.showMessage("Persona no encontrada");
        }

    }

    /**public int findPersonByName(String name){
        return -1;
    }

    public void showPersonaByName(){
        String nameToFind = showConsole.inputName();
        int indexPerson = findPersonByName(nameToFind);
    }**/
}
