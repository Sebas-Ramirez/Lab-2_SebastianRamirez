package lab.pkg2_sebastianramirez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_SebastianRamirez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList personajes = new ArrayList();
        Random random = new Random();
        String personaje,raza,descripcion,nacionalidad;
        double peso,estatura;
        int edad;
        for (int i = 0; i < 4; i++) {
            switch (random.nextInt(5)) {
                case 0:
                    personajes.add(new Personajes("Clerigo","Humano",1.89,178,45,"Soporte","Norfair"));
                    break;
                case 1:
                    personajes.add(new Personajes("Mago","Enano",1.70,150,60,"Defensa","Zebes"));
                break;
                case 2:
                    personajes.add(new Personajes("Picaro","Mediano",1.76,180,56,"Tanque","Brinstar"));
                    break;
                case 3:
                    personajes.add(new Personajes("Barbaro","Humano",1.95,230,50,"Tanque","Crateria"));
                    break;
            }
        }
        System.out.println("Bienvenido a Codest!");
        System.out.println("1.Creacion de personajes\n"
                + "2. Modificar personajes\n"
                + "3. Ver atributos de un personaje\n"
                + "4. Eliminar personajes\n"
                + "5. Combate\n"
                + "6. Salir\n"
                + "Ingrese opcion: ");
        switch (input.nextInt()) {
            case 1:
                System.out.println("");
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
