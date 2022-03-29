
/**
 * @author paulagg
 * Subclase que hereda de la superclase Profesor.
 *
 */
public class ProfesorTitular extends Profesor {

	/**
	 * Declaraci�n de dos nuevas propiedades espec�ficas de la subclase. 
	 */
	private double complementoDestino = 500;
	private int antig;
	
	/**
	 * Constructor sin par�metros que llama al super.
	 */
	public ProfesorTitular() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de ProfesorTitular con par�metros.
	 * 
	 * @param idProfesor  C�digo identificativo del profesor. Lo hereda de la superclase Profesor. 
	 * @param nombre	  Nombre del profesor. Lo hereda de la superclase Profesor.
	 * @param apellidos	  Apellidos del profesor. Lo hereda de la superclase Profesor.
	 * @param sueldo_base Sueldo base del profesor. Lo hereda de la superclase Profesor.
	 * @param complemento Propiedad espec�fica de la subclase declarada anteriormente.
	 * @param antig		  Propiedad espec�fica de la subclase declarada anteriormente.	
	 */
	public ProfesorTitular(String idProfesor, String nombre, String apellidos, double sueldo_base, double complemento,
			int antig) {
		super(idProfesor, nombre, apellidos, sueldo_base);
		this.complementoDestino = complementoDestino;
		this.antig = antig;
	}
	
	/**
	 * M�todo getter de complementoDestino.
	 * @return Devuelve complementoDestino.
	 */
	public double getComplementoDestino() {
		return complementoDestino;
	}
	/**
	 * M�todo setter de complementoDestino.
	 * @param complementoEsp Contiene como par�metro la propiedad complementoDestino.
	 */
	public void setComplemento(double complementoDestino) {
		this.complementoDestino = complementoDestino;
	}
	/**
	 * M�todo getter de antig.
	 * @return Devuelve antig.
	 */
	public int getAntig() {
		return antig;
	}
	/**
	 * M�todo setter de antig.
	 * @param complementoEsp Contiene como par�metro la propiedad antig.
	 */
	public void setAntig(int antig) {
		this.antig = antig;
	}
	/**
	 *M�todo toString que devuelve una cadena para imprimir por pantalla las propiedades de la clase
	 *Profesor y sus valores junto a las propiedades compementoDestino y antig de la subclase ProfesorTitular.
	 *Para ello, hace una llamada al m�todo toString() de la superclase, y las concatena con la nueva propiedad.
	 */
	@Override
	public String toString() {
		return  "ProfesorTitular ["+super.toString() + "complemento=" + complementoDestino + ", antig=" + antig + "]\n";
	}
	/**
	 * M�todo p�blico espec�fico de la subclase ProfesorInterino que calcula la n�mina
	 * de los profesores que pertenecen a esta subclase.
	 * @return Devuelve el importe de la n�mina.
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
			System.exit(-1);//Detiene la aplicaci�n sin errores
		}
		nomina = getSueldo_base() * importe + complementoDestino;
		return nomina;
	}
	
}
