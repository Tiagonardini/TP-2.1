package clase;

import java.util.ArrayList;
import java.util.List;

public class Personas {
    private List<Persona> personas;

    public Personas (Persona... p) {
        this.personas = List.of(p);
    }

    public List<Persona> filtro (Condicion c){
        List <Persona> resultado = new ArrayList<>();
        for (Persona persona : this.personas){
            if (c.condicion(persona)){
                resultado.add(persona);
            }
        }
        return resultado;
    }


    public List<Persona> nombresQueEmpiezanConE(List<Persona> p) {
        List<Persona> resultado = new ArrayList<>();
        for (Persona persona : p) {
            if (persona.nombre().startsWith("E")) {
                resultado.add(persona);
            }
        }
        return resultado;
    }
    public List<Persona> nombresCuyaCantidadDeLetrasEsPar(List<Persona> p) {
        List<Persona> resultado = new ArrayList<>();
        for (Persona persona : p) {
            if (persona.nombre().length() % 2 == 0) {
                resultado.add(persona);
            }
        }
        return resultado;
    }
}
