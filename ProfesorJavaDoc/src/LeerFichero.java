import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


/**
 * @author paulagg
 * Clase que contiene el método para leer el fichero almacenado en la ruta especificada y la creación del Arraylist de Nomina.
 */
public class LeerFichero {
	/**
	 * @param args
	 * @throws ClassNotFoundException Excepción que controla que la clase no exista.
	 * @throws FileNotFoundException  Excepción que controla que el fichero no exista .
	 * @throws IOException			  Excepción que controla que se haya producido un error en la entrada/salida. 
	 */
	public static void main(String[] args)  throws ClassNotFoundException, FileNotFoundException, IOException {
		
		ArrayList<Nomina> listadoNomina = new ArrayList<>();
		leer(listadoNomina);
	}


	/**
	 * Método que se encarga de leer el fichero. Para ello, utiliza las clases ObjectInputStream y FileInputStream, y
	 * las funciones readObject y close.
	 * 
	 * @param listadoNomina Contiene como parámetro listadoNomina.
	 * @throws ClassNotFoundException Excepción que controla que la clase no exista.
	 * @throws FileNotFoundException  Excepción que controla que el fichero no exista.
	 * @throws IOException			  Excepción que controla que se haya producido un error en la entrada/salida. 
	 */
	public static void leer (ArrayList<Nomina>listadoNomina) throws ClassNotFoundException, FileNotFoundException, IOException {
		ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("G:\\CICLO DAW\\SEGUNDO\\DESPLIEGUE\\Unidad 8\\ListadoProfesores.dat"));
		listadoNomina = (ArrayList<Nomina>) entrada.readObject();
		entrada.close();
		System.out.println(listadoNomina.toString());
		
	}
}