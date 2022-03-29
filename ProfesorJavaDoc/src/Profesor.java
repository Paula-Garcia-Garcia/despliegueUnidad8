

/**
 * @author paulagg
 * Superclase de la cual heredarán ProfesorTitular y ProfesorInterino.
 *
 */
public class Profesor {

	private String IdProfesor;
	private String nombre;
	private String apellidos;
	private double sueldo_base;
	/**
	 * Constructor sin parámetros que llama al super.
	 */
	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor de Profesor con parámetros.
	 * Contiene la excepción SueldoMinimoException creada por el autor de la aplicación, que controla
	 * que el sueldo sea menor de 1000.
	 * 
	 * @param idProfesor  Código identificativo del profesor.
	 * @param nombre	  Nombre del profesor.
	 * @param apellidos	  Apellidos del profesor.
	 * @param sueldo_base Sueldo base del profesor.
	 */
	public Profesor(String idProfesor, String nombre, String apellidos, double sueldo_base) {
		super();
		IdProfesor = idProfesor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		if (sueldo_base < 1000) {
			try {
				throw new SueldoMinimoException("El sueldo es menor de 1000.");	
			}
			catch(SueldoMinimoException ex) {
				System.out.println(ex.getMessage());
			}
		}
		else {
		this.sueldo_base = sueldo_base;
	}
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
	 * @param idProfesor Contiene como parámetro la propiedad idProfesor.
	 */
	
	public void setIdProfesor(String idProfesor) {
		IdProfesor = idProfesor;
	}
	
	/**
	 * Método getter de nombre.
	 * @return Devuelve nombre.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método setter de nombre.
	 * @param idProfesor Contiene como parámetro la propiedad nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método getter de apellidos.
	 * @return Devuelve apellidos.
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * Método setter de apellidos.
	 * @param idProfesor Contiene como parámetro la propiedad apellidos.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * Método getter de sueldo_base.
	 * @return Devuelve sueldo_base.
	 */
	public double getSueldo_base() {
		return sueldo_base;
	}
	/**
	 * Método setter de sueldo_base.
	 * @param idProfesor Contiene como parámetro la propiedad sueldo_base.
	 */
	public void setSueldo_base(double sueldo_base) {
		this.sueldo_base = sueldo_base;
	}
	
	/**
	 *Método toString que devuelve una cadena para imprimir por pantalla las propiedades de la clase
	 *Profesor y sus valores.
	 */
	@Override
	public String toString() {
		return "IdProfesor=" + IdProfesor + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", sueldo_base=" + sueldo_base + ", ";
	}
	
	
}
