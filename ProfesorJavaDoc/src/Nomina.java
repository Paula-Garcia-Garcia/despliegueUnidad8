import java.io.Serializable;

/**
 * @author paulagg
 *	Clase que implementa Serializable para poder ser grabada en un fichero.
 */
public class Nomina implements Serializable {
	
	private String IdProfesor;
	private double ImporteNomina;
	/**
	 * Constructor sin par�metros.
	 */
	public Nomina() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param idProfesor 	C�digo identificativo del profesor.
	 * @param importeNomina	Importe de la n�mina del profesor.
	 */
	public Nomina(String idProfesor, double importeNomina) {
		super();
		IdProfesor = idProfesor;
		ImporteNomina = importeNomina;
	}
	
	/**
	 * M�todo getter de idProfesor.
	 * @return Devuelve idProfesor.
	 */
	public String getIdProfesor() {
		return IdProfesor;
	}
	/**
	 * M�todo setter de idProfesor.
	 * @param complementoEsp Contiene como par�metro la propiedad idProfesor.
	 */
	public void setIdProfesor(String idProfesor) {
		IdProfesor = idProfesor;
	}
	/**
	 * M�todo getter de importeNomina.
	 * @return Devuelve importeNomina.
	 */
	public double getImporteNomina() {
		return ImporteNomina;
	}
	/**
	 * M�todo setter de importeNomina.
	 * @param complementoEsp Contiene como par�metro la propiedad importeNomina.
	 */
	public void setImporteNomina(double importeNomina) {
		ImporteNomina = importeNomina;
	}
	/**
	 *M�todo toString que devuelve una cadena para imprimir por pantalla las propiedades de la clase
	 *N�mina y sus valores.
	 */
	@Override
	public String toString() {
		return "Nomina [IdProfesor=" + IdProfesor + ", ImporteNomina=" + ImporteNomina + "] \n";
	}
	
	
	
}
