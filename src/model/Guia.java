package model;

public class Guia extends Persona {
    private String idiomaPrincipal;
    private int anosExperiencia;

    public Guia(String rut, String nombre, int edad, Direccion direccion, String idiomaPrincipal, int anosExperiencia) {
        super(rut, nombre, edad, direccion);
        this.idiomaPrincipal = idiomaPrincipal;
        this.anosExperiencia = anosExperiencia;
    }

    public String getIdiomaPrincipal() { return idiomaPrincipal; }
    public void setIdiomaPrincipal(String idiomaPrincipal) { this.idiomaPrincipal = idiomaPrincipal; }

    public int getAnosExperiencia() { return anosExperiencia; }
    public void setAnosExperiencia(int anosExperiencia) { this.anosExperiencia = anosExperiencia; }
    
    public String toString() {
        return super.toString() + " | Idioma: " + idiomaPrincipal + " | Experiencia: " + anosExperiencia + " años";
    }
}
