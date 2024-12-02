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


    public int tamanio(Persona[] person){
        int contMayor = 0;
        for(Persona elemento: person){
            if(elemento.getEdad() >= 18){
                contMayor++;
            } else{
                
            }
        }
        return contMayor;
    }


    public Persona[] mayoresDeEdad(Persona[] persona){
        int contMayor = 0;
        for(Persona elemento: persona){
            if(elemento.getEdad() >= 18){
                contMayor++;
            }
        }


        Persona[] arregloMayores = new Persona[contMayor];
        for (int i = 0; i < persona.length; i++){
            if(persona[i].getEdad() >= 18){
                arregloMayores[i].setEdad(persona[i].getEdad()); 
                arregloMayores[i].setNombre(persona[i].getNombre()); 
            }
        }

        return arregloMayores;
    }

    public Persona[] menoresDeEdad(Persona[] persona){
        int contMenor = 0;
        for(Persona elemento: persona){
            if(elemento.getEdad() < 18){
                contMenor++;
            }
        }


        Persona[] arrMenores = new Persona[contMenor];
        for (int i = 0; i < persona.length; i++){
            if(persona[i].getEdad() < 18){
                arrMenores[i].setEdad(persona[i].getEdad());
                arrMenores[i].setNombre(persona[i].getNombre());  
            }
        }

        return arrMenores;
    }

   /*  public Persona[] menoresDeEdad(Persona[] persona){
        int cont = 0;
        for(Persona elemento: persona){
            if(elemento.getEdad() < 18){
                cont++;
            }
        }

        Persona[] arregloMenores = new Persona[cont];
        int i = 0;
        for(Persona elemento: persona){
            if(elemento.getEdad() < 18){
                arregloMenores[i].setEdad(elemento.getEdad()); 
                i++;
            }
        }

        return arregloMenores;
    }*/

    @Override
    public String toString(){
        return "Persona{" + " Nombre=" + nombre + ", edad=" + edad  + "}"; 
    }
    

}
