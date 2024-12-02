import models.Persona;
import models.genericos.*;

public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();
        Caja<Par> cajaPar = new Caja<>();

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(20);
        cajaPersona.guardar(persona);

        cajaString.guardar("Guardo un String");
        cajaInteger.guardar(10);
        

        Par<String, Integer> parStringInteger = new Par<>();
        Par<Integer, String> parIntegerString = new Par<>();
        
        parStringInteger.establecerClave("perro");
        parStringInteger.establecerValor(45);
        parIntegerString.establecerClave(12345);
        parIntegerString.establecerValor("tres");


        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());
        System.out.println(cajaPersona.obtener());

        System.out.println(parIntegerString.obtenerClave() + " | " + parIntegerString.obtenerValor());
        System.out.println(parStringInteger.obtenerClave() + " | " + parStringInteger.obtenerValor());

        Persona[] people = {
            new Persona("Paula", 20),
            new Persona("Diego", 9),
            new Persona("Rosa", 12),
            new Persona("Rubén", 44),
            new Persona("Teresa", 18),
            new Persona("Iván", 17),
            new Persona("Julia", 21),
            new Persona("Adriana", 39),
            new Persona("Sergio", 48),
            new Persona("Lorena", 23),
        };

        


        
        int contMayor = persona.tamanioMayor(people);
        Persona[] arrMayor = persona.mayoresDeEdad(people, contMayor);

        int contMenor = persona.tamanioMenor(people);
        Persona[] arrMenor= persona.menoresDeEdad(people, contMenor);


        Par<String, Integer>[] parMayorEdad = new Par[contMayor];
        Par<Integer, String>[] parMenorEdad = new Par[contMenor];

        System.out.println("MAYORES DE EDAD");
        for (int i = 0; i < arrMayor.length; i++){
            parMayorEdad[i] = new Par<>();
            parMayorEdad[i].establecerClave(arrMayor[i].getNombre());
            parMayorEdad[i].establecerValor(arrMayor[i].getEdad());
            System.out.println(parMayorEdad[i].obtenerClave() + " - " + parMayorEdad[i].obtenerValor());
        }
        
        System.out.println("MENORES DE EDAD");
        for (int i = 0; i < arrMenor.length; i++){
            parMenorEdad[i] = new Par<>();
            parMenorEdad[i].establecerClave(arrMenor[i].getEdad());
            parMenorEdad[i].establecerValor(arrMenor[i].getNombre());
            System.out.println( parMenorEdad[i].obtenerClave() + " - " + parMenorEdad[i].obtenerValor());
        }
    }
}
