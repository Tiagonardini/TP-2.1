import clase.Persona;
import clase.Personas;
import clasesLambdas.AprendiendoLambdas;
import org.junit.Test;
import org.junit.platform.engine.support.descriptor.FileSystemSource;

import java.util.ArrayList;
import java.util.List;


public class Main {
    @Test
    public void testLambdaA(){
        AprendiendoLambdas a = new AprendiendoLambdas();
        a.unMetodo((b) -> { System.out.println("abcd" + b);});
        a.unMetodo(() -> System.out.println("abcd"));
        a.unMetodo((variable) -> {System.out.println("abcd");});
        a.unMetodo((String variable) -> {System.out.println("abcd"); return true;});
        a.unMetodo((Long variable) -> {
            System.out.println("abcd");
            return 10L;
        });
    }

    @Test
    public void testLambdaB(){
        AprendiendoLambdas a = new AprendiendoLambdas();
        //a
        a.unMetodo((String largoString) -> largoString.length() % 2 == 0);
        //b
        a.unMetodo((String ax) -> ax.startsWith("a"));
    }

    @Test
    public void testLambdaPersona(){
        var persona1  = new Persona ("Emiliano","Zapata");
        var persona2  = new Persona ("Hector","Zapata");
        var persona3  = new Persona ("Emmanuel","Nardini");

        var personas = new Personas(persona1, persona2, persona3);

        var personasQueEmpiezenConE = personas.filtro((p) -> p.personaQueEmpiezaCon("E"));
        var personasConNombrePar = personas.filtro((p) -> p.nombreCuyaCantidadDeLetrasEsPar());

//        for (Persona persona : personasQueEmpiezenConE){
//            System.out.println(persona.toString());
//        }

        for (Persona persona : personasConNombrePar){
            System.out.println(persona.toString());
        }

    }
}
