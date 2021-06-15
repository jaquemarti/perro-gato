
/**
 * Write a description of class perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro
{
    // instance variables - replace the example below with your own
    private int edad=0;
    private String nombre= "perro";
    //siempre que se define una variable tipo float debes agregar f al final
    private float peso=1.0f; 

    /**
     * Constructor for objects of class Perro
     */
    //edad humana se multipica por 7 y se devuelve
    public int edadHumana()
    {
       return edad*7;
    }

    public String Interactuar(){
        return "Guau";
    }
    public void imprimeinformacion(){
        System.out.println("Es un perro comiendo carne "+edad+" años y me llamo: "+nombre);
    }
    Perro (int pEdad, String pNombre, float pPeso){
        edad = pEdad;
        nombre = pNombre;
        peso = pPeso;
    } 
    
    public void alimentar(int tipoDecomida){
    if (tipoDecomida==0)
        System.out.println("Es un perro comiendo carne");
    else
        System.out.println("Es un perro comiendo croqueta");
    
    }
}