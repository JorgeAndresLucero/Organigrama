package uniandes.cupi2.organigrama.mundo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Aspirante implements Serializable
{
	
    
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Indicador de versi�n para la serializaci�n
     */
    private static final long serialVersionUID = 200L;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * El c�digo que identifica el aspirante
     */
    private String codigo;

    /**
     * El nombre del aspirante
     */
    private String nombre;
    private Cargo cargo;

    /**
     * La fecha de ingreso del aspirante a la empresa
     */
  
    private ArrayList aspirantes;
    

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    /**
     * Crea un aspirante
     * @param id El c�digo del aspirante
     * @param nombreP el nombre del aspirante. nombreElem != null
     * @param fechaP La fecha de ingreso del aspirante a la empresa
     */
    public Aspirante( String id, String nombreP, Cargo cargoas )
    {
        codigo = id;
        nombre = nombreP;
        cargo = cargoas;
        aspirantes = new ArrayList( );
        verificarInvariante( );
    }
    
    
    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el c�digo del aspirante
     * @return El c�digo del aspirante
     */
    public String darCodigo( )
    {
        return codigo;
    }

    /**
     * Retorna el nombre del aspirante
     * @return El nombre del aspirante
     */
    public String darNombre( )
    {
        return nombre;
    }
    
    public Cargo darCargo( )
    {
        return cargo;
    }

    /**
     * Retorna la fecha de ingreso del aspirante
     * @return la fecha de ingreso del aspirante a la empresa
     */
    
    /**
     * Retorna una cadena que identifica el aspirante
     * @return La cadena que identifica el aspirante
     */
    public String toString( )
    {
        return codigo;
    }

    // -----------------------------------------------------------------
    // Invariante
    // -----------------------------------------------------------------

    /**
     * Verifica el invariante de la clase <br>
     * <b>inv:</b> <br>
     * codigo != null && codigo != "" <br>
     * nombre != null && nombre != "" <br>
     * fechaIngreso != null
     */
    private void verificarInvariante( )
    {
        assert ( codigo != null ) : "El c�digo del aspirante no puede ser null";
        assert ( !codigo.equals( "" ) ) : "El c�digo del aspirante no puede ser vac�o";
        assert ( nombre != null ) : "El nombre del aspirante no puede ser null";
        assert ( !nombre.equals( "" ) ) : "El nombre del aspirante no puede ser vac�o";
      
    }
}
	
	


