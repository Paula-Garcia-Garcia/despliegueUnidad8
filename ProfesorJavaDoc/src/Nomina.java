import java.io.Serializable;

/**
 * @author paulagg
 *	Clase que implementa Serializable para poder ser grabada en un fichero.
 */
public class Nomina implements Serializable {
	
	private String IdProfesor;
	private double ImporteNomina;
	/**
	 * Constructor sin parámetros.
	 */
	public Nomina() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param idProfesor 	Código identificativo del profesor.
	 * @param importeNomina	Importe de la nómina del profesor.
	 */
	public Nomina(String idProfesor, double importeNomina) {
		super();
		IdProfesor = idProfesor;
		ImporteNomina = importeNomina;
	}
	
	/**
	 * Método getter de idProfesor.
	 * @return Devuelve idProfesor.
	 */
	public String getIdProfesor() {
		return IdProfesor;
	}
	/**
	 * Método setter de idProfesor.
	 * @param complementoEsp Contiene como parámetro la propiedad idProfesor.
	 */
	public void setIdProfesor(String idProfesor) {
		IdProfesor = idProfesor;
	}
	/**
	 * Método getter de importeNomina.
	 * @return Devuelve importeNomina.
	 */
	public double getImporteNomina() {
		return ImporteNomina;
	}
	/**
	 * Método setter de importeNomina.
	 * @param complementoEsp Contiene como parámetro la propiedad importeNomina.
	 */
	public void setImporteNomina(double importeNomina) {
		ImporteNomina = importeNomina;
	}
	/**
	 *Método toString que devuelve una cadena para imprimir por pantalla las propiedades de la clase
	 *Nómina y sus valores.
	 */
	@Override
	public String toString() {
		return "Nomina [IdProfesor=" + IdProfesor + ", ImporteNomina=" + ImporteNomina + "] \n";
	}
	
	
	
}
