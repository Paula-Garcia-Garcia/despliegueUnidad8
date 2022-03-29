
/**
 * @author paulagg
 * Subclase que hereda de la superclase Profesor.
 *
 */
public class ProfesorTitular extends Profesor {

	/**
	 * Declaración de dos nuevas propiedades específicas de la subclase. 
	 */
	private double complementoDestino = 500;
	private int antig;
	
	/**
	 * Constructor sin parámetros que llama al super.
	 */
	public ProfesorTitular() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de ProfesorTitular con parámetros.
	 * 
	 * @param idProfesor  Código identificativo del profesor. Lo hereda de la superclase Profesor. 
	 * @param nombre	  Nombre del profesor. Lo hereda de la superclase Profesor.
	 * @param apellidos	  Apellidos del profesor. Lo hereda de la superclase Profesor.
	 * @param sueldo_base Sueldo base del profesor. Lo hereda de la superclase Profesor.
	 * @param complemento Propiedad específica de la subclase declarada anteriormente.
	 * @param antig		  Propiedad específica de la subclase declarada anteriormente.	
	 */
	public ProfesorTitular(String idProfesor, String nombre, String apellidos, double sueldo_base, double complemento,
			int antig) {
		super(idProfesor, nombre, apellidos, sueldo_base);
		this.complementoDestino = complementoDestino;
		this.antig = antig;
	}
	
	/**
	 * Método getter de complementoDestino.
	 * @return Devuelve complementoDestino.
	 */
	public double getComplementoDestino() {
		return complementoDestino;
	}
	/**
	 * Método setter de complementoDestino.
	 * @param complementoEsp Contiene como parámetro la propiedad complementoDestino.
	 */
	public void setComplemento(double complementoDestino) {
		this.complementoDestino = complementoDestino;
	}
	/**
	 * Método getter de antig.
	 * @return Devuelve antig.
	 */
	public int getAntig() {
		return antig;
	}
	/**
	 * Método setter de antig.
	 * @param complementoEsp Contiene como parámetro la propiedad antig.
	 */
	public void setAntig(int antig) {
		this.antig = antig;
	}
	/**
	 *Método toString que devuelve una cadena para imprimir por pantalla las propiedades de la clase
	 *Profesor y sus valores junto a las propiedades compementoDestino y antig de la subclase ProfesorTitular.
	 *Para ello, hace una llamada al método toString() de la superclase, y las concatena con la nueva propiedad.
	 */
	@Override
	public String toString() {
		return  "ProfesorTitular ["+super.toString() + "complemento=" + complementoDestino + ", antig=" + antig + "]\n";
	}
	/**
	 * Método público específico de la subclase ProfesorInterino que calcula la nómina
	 * de los profesores que pertenecen a esta subclase.
	 * @return Devuelve el importe de la nómina.
	 */
	public double importeNomina() {
		int [] trienio = {1, 2, 3, 4, 5, 6};
		double [] porcentaje = {1.01, 1.02,1.05, 1.06, 1.07, 1.08};
		double nomina = 0;
		double importe=0;
		
		try {
		for (int i=0; i<trienio.length; i++) {
			if (antig == trienio[i]) {
			importe = porcentaje[i];
				 

				}
			}
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("Quita el igual en el for");
			System.exit(-1);//Detiene la aplicación sin errores
		}
		nomina = getSueldo_base() * importe + complementoDestino;
		return nomina;
	}
	
}
