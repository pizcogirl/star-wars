
/**
 * Genera nombres de tipo StarWars, de la siguiente forma:
 * - Tu nombre seria:
 *  - Toma las tres primeras letras de tu apellido real
 *  - Toma las tres primeras letras de tu nombre real
 * - Tu apellido seria:
 *  - Toma las tres primeras letras del apellido real de tu madre
 *  - Añade las tres primeras letras de la ciudad real donde nacistes
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // Guarda el numero de posiciones que tenemos que tomar de cada palabra para formar el nombre
    private static final int POSICIONES = 3;
   

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
       
    }

    /**
     *Genera nombres tipo StarWars
     *@param Apellido Tu apellido
     *@param Nombre Tu nombre
     *@param ApellidoMaterno Tu segundo apellido
     *@param Ciudad Ciudad de nacimiento
     */
    public String sampleMethod(String nombre, String apellido, String apellidoMaterno, String ciudad)
    {
        String resultado = "";
        // Generamos el nombre
        resultado = apellido.substring(0, POSICIONES) + nombre.toLowerCase().substring(0, POSICIONES);
        // Generamos el apellido
        resultado = resultado + " " + apellidoMaterno.substring(0, POSICIONES) + ciudad.toLowerCase().substring(0, POSICIONES);
        // Devuelve el nombre
        return resultado;
    }
}
