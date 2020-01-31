package lab.pkg2_sebastianramirez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_SebastianRamirez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Personajes> personajes = new ArrayList();
        Random random = new Random();
        String personaje,raza,descripcion,nacionalidad;
        double peso,estatura;
        int edad;
        int hp,ac,cs,dg;
        for (int i = 0; i < 4; i++) {
            switch (random.nextInt(5)) {
                case 0:
                    personajes.add(new Personajes("Clerigo","Humano",1.89,178,45,"Soporte","Norfair",random.nextInt(36)+40
                    ,97,40,random.nextInt(10)+5));
                    break;
                case 1:
                    personajes.add(new Personajes("Mago","Enano",1.70,150,60,"Defensa","Zebes",random.nextInt(21)+80
                    ,101,20,random.nextInt(6)+5));
                break;
                case 2:
                    personajes.add(new Personajes("Picaro","Mediano",1.76,180,56,"Tanque","Brinstar",random.nextInt(11)+50
                    ,80,50,random.nextInt(10)+5));
                    break;
                case 3:
                    personajes.add(new Personajes("Barbaro","Humano",1.95,230,50,"Tanque","Crateria",random.nextInt(35)+40
                    ,93,65,random.nextInt(16)+15));
                    break;
            }
        }
        System.out.println("Bienvenido a Codest!");
        System.out.print("1.Creacion de personajes\n"
                + "2. Modificar personajes\n"
                + "3. Ver atributos de un personaje\n"
                + "4. Eliminar personajes\n"    
                + "5. Combate\n"
                + "6. Salir\n"
                + "Ingrese opcion: ");
        switch (input.nextInt()) {
            case 1:
                System.out.print("1.Clerigo\n"
                        + "2. Barbaro\n"
                        + "3. Mago\n"
                        + "4. Picaro\n"
                        + "Ingrese su opcion: ");
                switch (input.nextInt()) {
                    case 1:
                        personaje = "Clerigo";
                        break;
                    case 2:
                        personaje = "Barbaro";
                        break;
                    case 3:
                        personaje = "Mago";
                        break;
                    case 4:
                        personaje = "Picaro";
                        break;
                }
                System.out.println("Ingrese raza: ");
                System.out.print("1. Mediano\n"
                        + "2. Enano\n"
                        + "3. Elfo\n"
                        + "4. Humano\n"
                        + "Ingrese su opcion: ");
                switch (input.nextInt()) {
                    case 1:
                        raza = "Mediano";
                        break;
                    case 2:
                        raza = "Enano";
                        break;
                    case 3:
                        raza = "Elfo";
                        break;
                    case 4:
                        raza = "Humano";
                        break;
                }
                System.out.print("Ingrese estatura del personaje: ");
                estatura = input.nextDouble();
                System.out.print("Ingrese peso del personaje: ");
                peso = input.nextInt();
                System.out.print("Ingrese edad del personaje: ");
                edad = input.nextInt();
                System.out.print("Ingrese descripcion del personaje: ");
                descripcion = input.next();
                System.out.print("1. Norfair\n"
                        + "2. Brinstar\n"
                        + "3. Maridia\n"
                        + "4. Zebes\n"
                        + "5. Crateria\n"
                        + "Ingrese su opcion;");
                switch (input.nextInt()) {
                    case 1:
                        nacionalidad ="Norfair";
                        break;
                    case 2:
                        nacionalidad ="Brinstar";
                        break;
                    case 3:
                        nacionalidad = "Maridia";
                        break;
                    case 4:
                        nacionalidad = "Zebes";
                        break;
                    case 5:
                        nacionalidad ="Crateria";
                        break;
                    default:
                        throw new AssertionError();
                }
                switch (raza) {
                    case "Mediano":
                        hp = random.nextInt(11)+50;
                        break;
                    case "Enano":
                        hp = random.nextInt(21)+80;
                        break;
                    case "Elfo":
                        hp = random.nextInt(21)+50;
                        break;
                    case "Humano":
                        hp = random.nextInt(36)+40;
                        break;
                }//fin switch hp
                switch (personaje) {
                    case "Clerigo":
                        cs = 97;
                        break;
                    case "Barbaro":
                        cs = 93;
                        break;
                    case "Mago":
                        cs = 101;
                        break;
                    case "Picaro":
                        cs = 80;
                        break;
                }//fin switch cs
                switch (personaje) {
                    case "Clerigo":
                        ac = 40;
                        break;
                    case "Barbaro":
                        ac = 65;
                        break;
                    case "Mago":
                        ac = 20;
                        break;
                    case "Picaro":
                        ac = 50;
                        break;
                }//fin switch ac
                switch (personaje) {
                    case "Clerigo":
                        dg = random.nextInt(11)+5;
                        break;
                    case "Barbaro":
                        dg = random.nextInt(16)+15;
                        break;
                    case "Mago":
                        dg = random.nextInt(6)+5;
                        break;
                    case "Picaro":
                        dg = random.nextInt(11)+15;
                        break;
                }
                personajes.add(new Personajes(personaje,raza,estatura,peso,edad,descripcion,nacionalidad,hp,cs,ac,dg));
                
            break;//fin creacion presonaje  
            default:
                throw new AssertionError();
        }
    }
    
}
