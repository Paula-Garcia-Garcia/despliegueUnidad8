


/**
 * @author paulagg
 * Subclase que hereda de la superclase Profesor.
 *
 *
 */
public class ProfesorInterino extends Profesor{

	
	/**
	 * Declaración de nueva propiedad de la subclase.
	 */
	private double complementoEsp;

	/**
	 * Constructor sin parámetros que llama al super.
	 */
	public ProfesorInterino() {
		super();
		// TODO Auto-generated constructor stub
	}

	

    /**
     * Constructor de ProfesorInterino con parámetros.
     * 
     * @param idProfesor  Código identificativo del profesor. Lo hereda de la superclase Profesor.
     * @param nombre	  Nombre del profesor. Lo hereda de la superclase Profesor.
     * @param apellidos	  Apellidos del profesor. Lo hereda de la superclase Profesor.
     * @param sueldo_base Sueldo base del profesor. Lo hereda de la superclase Profesor.
     * 
     *Inicialización a 600 de la propiedad complementoEsp.
     */
    public ProfesorInterino(String idProfesor, String nombre, String apellidos, double sueldo_base) {
		super(idProfesor, nombre, apellidos, sueldo_base);
		this.complementoEsp = 600;
	}

	/**
	 * Método getter de complementoEsp.
	 * @return Devuelve complementoEsp.
	 */
	public double getComplementoEsp() {
		return complementoEsp;
	}

	/**
	 * Método setter de complementoEsp.
	 * @param complementoEsp Contiene como parámetro la propiedad complementoEsp.
	 */
	public void setComplementoEsp(double complementoEsp) {
		this.complementoEsp = complementoEsp;
	}
	
	/**
	 * Método público específico de la subclase ProfesorInterino que calcula la nómina
	 * de los profesores que pertenecen a esta subclase.
	 * @return Devuelve el importe de la nómina.
	 */
	public double importeNomina() {
		double nomina;
		nomina = getSueldo_base() + complementoEsp;
		return nomina;
	}
	/**
	 *Método toString que devuelve una cadena para imprimir por pantalla las propiedades de la clase
	 *Profesor y sus valores junto a la propiedad complementoEsp de la subclase ProfesorInterino.
	 *Para ello, hace una llamada al método toString() de la superclase, y la concatena con la nueva propiedad.
	 */
	@Override
	public String toString() {
		return "ProfesorInterino [" + super.toString()+ " complementoEsp=" + complementoEsp + "]\n";
	}
	
}
