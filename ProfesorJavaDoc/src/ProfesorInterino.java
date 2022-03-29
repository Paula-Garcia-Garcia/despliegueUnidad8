


/**
 * @author paulagg
 * Subclase que hereda de la superclase Profesor.
 *
 *
 */
public class ProfesorInterino extends Profesor{

	
	/**
	 * Declaraci�n de nueva propiedad de la subclase.
	 */
	private double complementoEsp;

	/**
	 * Constructor sin par�metros que llama al super.
	 */
	public ProfesorInterino() {
		super();
		// TODO Auto-generated constructor stub
	}

	

    /**
     * Constructor de ProfesorInterino con par�metros.
     * 
     * @param idProfesor  C�digo identificativo del profesor. Lo hereda de la superclase Profesor.
     * @param nombre	  Nombre del profesor. Lo hereda de la superclase Profesor.
     * @param apellidos	  Apellidos del profesor. Lo hereda de la superclase Profesor.
     * @param sueldo_base Sueldo base del profesor. Lo hereda de la superclase Profesor.
     * 
     *Inicializaci�n a 600 de la propiedad complementoEsp.
     */
    public ProfesorInterino(String idProfesor, String nombre, String apellidos, double sueldo_base) {
		super(idProfesor, nombre, apellidos, sueldo_base);
		this.complementoEsp = 600;
	}

	/**
	 * M�todo getter de complementoEsp.
	 * @return Devuelve complementoEsp.
	 */
	public double getComplementoEsp() {
		return complementoEsp;
	}

	/**
	 * M�todo setter de complementoEsp.
	 * @param complementoEsp Contiene como par�metro la propiedad complementoEsp.
	 */
	public void setComplementoEsp(double complementoEsp) {
		this.complementoEsp = complementoEsp;
	}
	
	/**
	 * M�todo p�blico espec�fico de la subclase ProfesorInterino que calcula la n�mina
	 * de los profesores que pertenecen a esta subclase.
	 * @return Devuelve el importe de la n�mina.
	 */
	public double importeNomina() {
		double nomina;
		nomina = getSueldo_base() + complementoEsp;
		return nomina;
	}
	/**
	 *M�todo toString que devuelve una cadena para imprimir por pantalla las propiedades de la clase
	 *Profesor y sus valores junto a la propiedad complementoEsp de la subclase ProfesorInterino.
	 *Para ello, hace una llamada al m�todo toString() de la superclase, y la concatena con la nueva propiedad.
	 */
	@Override
	public String toString() {
		return "ProfesorInterino [" + super.toString()+ " complementoEsp=" + complementoEsp + "]\n";
	}
	
}
