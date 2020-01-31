package lab.pkg2_sebastianramirez;
public class Personajes {
    private String personaje;
    private String raza;
    private double estatura;
    private double peso;
    private int años;
    private String descripcion;
    private String nacionalidad;

    public Personajes() {
    }

    public Personajes(String personaje, String raza, double estatura, double peso, int años, String descripcion, String nacionalidad) {
        this.personaje = personaje;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.años = años;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
    }
    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAños(int años) {
        this.años = años;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getPersonaje() {
        return personaje;
    }
    public String getRaza() {
        return raza;
    }
    public double getEstatura() {
        return estatura;
    }
    public double getPeso() {
        return peso;
    }
    public int getAños() {
        return años;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
}
