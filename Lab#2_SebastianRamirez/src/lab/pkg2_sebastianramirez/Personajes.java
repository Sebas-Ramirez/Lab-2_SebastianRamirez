package lab.pkg2_sebastianramirez;
public class Personajes {
    private String personaje;
    private String raza;
    private double estatura;
    private int peso;
    private int años;
    private String descripcion;
    private String nacionalidad;
    private int hp;
    private int cs;
    private int ac;
    private int dg;

    public Personajes() {
        
    }

    public Personajes(String personaje, String raza, double estatura, int peso, int años, String descripcion, String nacionalidad,
        int hp, int cs, int ac, int dg) {
        this.personaje = personaje;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.años = años;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
        this.hp = hp;
        this.cs = cs;
        this.ac = ac;
        this.dg = dg;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCs() {
        return cs;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getDg() {
        return dg;
    }

    public void setDg(int dg) {
        this.dg = dg;
    }

    @Override
    public String toString() {
        return "Personajes{" + "personaje=" + personaje + ", raza=" + raza + '}';
    }
    
}
