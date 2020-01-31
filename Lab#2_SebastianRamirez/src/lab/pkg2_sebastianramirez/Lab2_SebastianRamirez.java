package lab.pkg2_sebastianramirez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_SebastianRamirez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Personajes> personajes = new ArrayList();
        Random random = new Random();
        String personaje = "",raza = "",descripcion,nacionalidad;
        double estatura;
        int edad,peso;
        int hp = 0,ac = 0,cs = 0,dg = 0;
        for (int i = 0; i < 4; i++) {
            switch (random.nextInt(4)) {
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
        while (true) {
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
                System.out.println("Clase: "+personaje);
                System.out.println("Raza: "+raza);
                System.out.println("Estatura: "+estatura);
                System.out.println("Peso: "+peso);
                System.out.println("Edad: "+edad);
                System.out.println("Descripcion: "+descripcion);
                System.out.println("Nacionalidad: "+nacionalidad);
                System.out.println("Hit Points: "+hp);
                System.out.println("Critic Strike: "+cs);
                System.out.println("Armor Class: "+ac);
                System.out.println("Damage: "+dg);
            break;//fin creacion presonaje  
            case 3://listar atributos
                for (int i = 0; i < personajes.size(); i++) {
                    System.out.println("["+i+"] "+personajes.get(i).getPersonaje());
                }
                System.out.print("Ingrese posicion: ");
                int p = input.nextInt();
                System.out.println("Clase: "+personajes.get(p).getPersonaje());
                System.out.println("Raza: "+personajes.get(p).getRaza());
                System.out.println("Estatura: "+personajes.get(p).getEstatura());
                System.out.println("Peso: "+personajes.get(p).getPeso());
                System.out.println("Edad: "+personajes.get(p).getAños());
                System.out.println("Descripcion: "+personajes.get(p).getDescripcion());
                System.out.println("Nacionalidad: "+personajes.get(p).getNacionalidad());
                break;
            case 2://modificacion personaje
                for (int i = 0; i < personajes.size(); i++) {
                    System.out.println("["+i+"] "+personajes.get(i).getPersonaje());
                }
                System.out.println("Ingrese la posicion del personaje");
                int pos = input.nextInt();
                System.out.println("Que desea modificar?\n"
                        + "1. Clase\n"
                        + "2. Raza\n"
                        + "3. Estatura\n"
                        + "4. Peso\n"
                        + "5. Años\n"
                        + "6. Descripcion\n"
                        + "7. Nacionalidad\n"
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
                        }personajes.get(pos).setPersonaje(personaje);
                        break;
                    case 2:
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
                        }personajes.get(pos).setRaza(raza);
                        break;
                    case 3:
                        System.out.print("Ingrese estatura del personaje: ");
                        personajes.get(pos).setEstatura(input.nextDouble());
                        break;
                    case 4:
                        System.out.print("Ingrese peso: ");
                        personajes.get(pos).setPeso(input.nextInt());
                        break;
                    case 5:
                        System.out.print("Ingrese años: ");
                        personajes.get(pos).setAños(input.nextInt());
                        break;
                    case 6:
                        System.out.print("Ingrese descripcion: ");
                        personajes.get(pos).setDescripcion(input.next());
                        break;
                    case 7:
                        System.out.print("1. Norfair\n"
                                + "2. Brinstar\n"
                                + "3. Maridia\n"
                                + "4. Zebes\n"
                                + "5. Crateria\n"
                                + "Ingrese su opcion;");
                        switch (input.nextInt()) {
                            case 1:
                                nacionalidad = "Norfair";
                                break;
                            case 2:
                                nacionalidad = "Brinstar";
                                break;
                            case 3:
                                nacionalidad = "Maridia";
                                break;
                            case 4:
                                nacionalidad = "Zebes";
                                break;
                            case 5:
                                nacionalidad = "Crateria";
                                break;
                            default:
                                throw new AssertionError();
                        }personajes.get(pos).setNacionalidad(nacionalidad);
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 4:
                for (int i = 0; i < personajes.size(); i++) {
                    System.out.println("["+i+"] "+personajes.get(i).getPersonaje());
                }
                System.out.print("Ingrese el personaje que desea eliminar: ");
                personajes.remove(input.nextInt());
                break;//fin remove
            case 5:
                int numero,jugada;
                for (int i = 0; i < personajes.size(); i++) {
                    System.out.println("["+i+"] "+personajes.get(i).getPersonaje());
                }
                System.out.print("Elija su personaje jugador: ");
                int J1 = input.nextInt();
                int computadora = random.nextInt(personajes.size());
                while (computadora==J1) {
                    computadora = random.nextInt(personajes.size()+1);
                }
                boolean turno = true;
                while (personajes.get(J1).getHp()>0&&personajes.get(computadora).getHp()>0) {
                    if(turno){
                        System.out.println("Es tu turno Jugador 1");
                        System.out.println("Hit Points: "+personajes.get(J1).getHp());
                        System.out.println("Critic Strike: "+personajes.get(J1).getCs());
                        System.out.println("Armor Class: "+personajes.get(J1).getAc());
                        System.out.println("Damage: "+personajes.get(J1).getDg());
                        System.out.println("1. Atacar\n"
                                + "2. Defender\n"
                                + "Ingrese su opcion: ");
                        int opcion = input.nextInt();
                        if(opcion==1){
                            numero = random.nextInt(100)+1;
                            if(numero>personajes.get(computadora).getAc()){
                                System.out.println("Acerto");
                                if(numero>personajes.get(computadora).getCs()){
                                    System.out.println("Inflije doble de daño");
                                    personajes.get(computadora).setHp(personajes.get(J1).getDg()*2-personajes.get(computadora).getHp());
                                }else
                                    personajes.get(computadora).setHp(personajes.get(J1).getDg()-personajes.get(computadora).getHp());
                            }
                        }else if(opcion==2){
                            System.out.println("Jugador Defiende");
                            personajes.get(J1).setAc(personajes.get(J1).getAc()+15);
                        }turno = false;
                    }else{
                        jugada = random.nextInt(2);
                        if(jugada==1){
                            System.out.println("Va la computadora");
                            System.out.println("Hit Points: " + personajes.get(computadora).getHp());
                            System.out.println("Critic Strike: " + personajes.get(computadora).getCs());
                            System.out.println("Armor Class: " + personajes.get(computadora).getAc());
                            System.out.println("Damage: " + personajes.get(computadora).getDg());
                            numero = random.nextInt(100) + 1;
                            if (numero > personajes.get(J1).getAc()) {
                                System.out.println("Acerto");
                                if (numero > personajes.get(computadora).getCs()) {
                                    System.out.println("Inflije doble de daño");
                                    personajes.get(J1).setHp(personajes.get(computadora).getDg() * 2 - personajes.get(J1).getHp());
                                } else {
                                    personajes.get(J1).setHp(personajes.get(computadora).getDg() - personajes.get(J1).getHp());
                                }
                            }  
                        }else if(jugada==0){
                            System.out.println("Computadora Defiende");
                            personajes.get(computadora).setAc(personajes.get(computadora).getAc()+15);
                        }
                        turno = true;
                    }
                }System.out.println("Termino el juego");
                System.exit(0);
                break;
            case 6:
                System.exit(0);
            default:
                throw new AssertionError();
        }
    }
    }//fin del main  
}
