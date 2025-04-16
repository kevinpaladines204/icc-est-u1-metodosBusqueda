package controllers;
import models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinaria {
    private Persona[] people;
    private ShowConsole pantalla;
    
    public MetodosBusquedaBinaria(Persona[] people){
        this.pantalla= new ShowConsole();
        this.people= people;
        pantalla.showMessage("Metodo de busqueda binario");
    }

    private int findPersonaByCode(int code){
        int bajo = 0;
        int alto = people.length -1 ;

        while(alto >= bajo){
            int central= (alto + bajo)/2;

            if(people[central].getCode() == code){
                return central;
            }
            if(people[central].getCode()>code){
                alto=central-1;
            }else{
                bajo= central+1;
            }
        }
        return -1;
    }

    public void showPersonaByCode(){
        int codeToFind=pantalla.inputCode();
        int indexPerson=findPersonaByCode(codeToFind);
        if(indexPerson >= 0){
            pantalla.showMessage("Persona con código: " + codeToFind + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }else{
            pantalla.showMessage("Persona no encontrada");
        }
    }


    private int findPersonaByName(String name){
        int bajo = 0;
        int alto = people.length -1;

        while(alto>= bajo){
            int central= (alto +bajo)/2;

            if(people[central].getName().equals(name)){
                return central;
            }
            if(people[central].getName().compareTo(name)>0){
                alto=central -1;
            }else{
                bajo= central +1;
            }
        }
        return -1;
    }


    public void showPersonaByName(){
        String nameToFind = pantalla.inputName();
        int indexPerson = findPersonaByName(nameToFind);
    
        if (indexPerson == -1) {
            pantalla.showMessage("Persona con nombre: " + nameToFind + " no encontrada");
        } else {
            pantalla.showMessage("Persona con nombre: " + nameToFind + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }


}