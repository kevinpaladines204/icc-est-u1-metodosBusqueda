package views;

import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner;

    public ShowConsole(){
        this.scanner = new Scanner(System.in);
        showBanner();
    }

    public void showBanner(){
        System.out.println("---- Metodos de Busqueda ----");
    }


    public int inputCode(){
        System.out.println("Ingrese el codigo ");
        int code = scanner.nextInt();
        scanner.nextLine();
        return code;
    }


    public void showMessage(String message){
        System.out.println(message);
    }

    public String inputName(){
        System.out.println("Ingrese el nombre ");
        String name = scanner.nextLine();
        return name;
    }
}