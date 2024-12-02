package models;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Asigna el nombre pasado al atributo nombre de la clase
        this.edad = edad; // Asigna la edad pasada al atributo edad de la clase
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    public int tamanioMayor(Persona[] person){
        int contMayor = 0;
        for(Persona elemento: person){
            if(elemento.getEdad() >= 18){
                contMayor++;
            } 
        }
        return contMayor;
    }

    public int tamanioMenor(Persona[] person){
        int contMenor = 0;
        for(Persona elemento: person){
            if(elemento.getEdad() < 18){
                contMenor++;
            } 
        }
        return contMenor;
    }


    public Persona[] mayoresDeEdad(Persona[] personas, int contMayor) {
        Persona[] arregloMayores = new Persona[contMayor];
        int f = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() >= 18) {
                arregloMayores[f] = personas[i]; 
                f++;
            }
        }
        return arregloMayores;
    }
    

    public Persona[] menoresDeEdad(Persona[] personas, int contMenor){
        Persona[] arrMenores = new Persona[contMenor];
        int j = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() < 18) {
                arrMenores[j] = personas[i]; 
                j++;
            }
        }
        return arrMenores;
    }
    

}
