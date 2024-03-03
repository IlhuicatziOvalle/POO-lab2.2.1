package Practica_010324;

class Persona{
    //Atributos
    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    private double altura;

    //Metodos set y get
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public String getGenero(){
        return genero;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public double getAltura(){
        return altura;
    }
    //Metodo para comer
    public void comer(String comida){
        System.out.println(nombre+" esta comiendo"+comida);
    }
    //Metodo para dormir
    public void dormir(int horas){
        System.out.println(nombre+" esta durmiendo durante"+horas+"horas");
    }
    //Metodo para ejercicio
    public void hacerEjercicio(String tipoEjercicio){
        System.out.println(nombre+" esta haciendo ejercicio de tipo"+tipoEjercicio);
    }
}

public class Metodos {
    public static void main(String[] args) {
        //crear objeto tipo persona
        Persona persona=new Persona();

        //Establecer atributos
        persona.setNombre("Juan");
        persona.setEdad(25);
        persona.setGenero("masculino");
        persona.setDireccion("Calle 123, Ciudad");
        persona.setAltura(1.75);

        //imprimir datos de la persona
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Género: " + persona.getGenero());
        System.out.println("Dirección: " + persona.getDireccion());
        System.out.println("Altura: " + persona.getAltura());

        // Llamar a los métodos
        persona.comer("Pizza");
        persona.dormir(8);
        persona.hacerEjercicio("Correr");
    }
}
