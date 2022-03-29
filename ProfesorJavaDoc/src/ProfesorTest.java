
	/*
	 * 
	 * @author paulagg
	 * @since  28/03/2022
	 * @version 1.0
	 * 
	 * 
	 * <h3>Este ejercicio trata sobre una superclase llamada Profesor de la cual heredan dos clases m�s, llamadas 
	 * ProfesorInterino y ProfesorTitular. Con estas clases se generan ArrayLists con los datos de los profesores.
	 * Posteriormente, se graba un fichero el cual se va a utilizar para imprimir por pantalla las n�minas de 
	 * cada uno de estos profesores y la suma de todas ellas.</h3>
	 * 
	 * 
	 * **/
	


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Creamos la clase principal, donde se van a desarrollar la mayor parte de los m�todos que gestionan la aplicaci�n.
 * 
 * **/
public class ProfesorTest {
	

	/**
	 * Este m�todo es el principal de la aplicaci�n. Contiene las declaraciones de los ArrayLists y
	 * las llamadas a los m�todos est�ticos que hacen funcionar la aplicaci�n.
	 * 
	 * @param args
	 * @throws ClassNotFoundException Excepci�n que controla que la clase no exista.
	 * @throws FileNotFoundException  Excepci�n que controla que el fichero no exista .
	 * @throws IOException 			  Excepci�n que controla que se haya producido un error en la entrada/salida. 
	 */
	public static void main(String[] args)  throws ClassNotFoundException, FileNotFoundException, IOException {
		ArrayList<Profesor> listadoProfesor = new ArrayList<>();
		ArrayList<Nomina> listadoNomina = new ArrayList<>();
		cargarProfesores(listadoProfesor);
		imprimirListin(listadoProfesor);
		cargarNomina(listadoProfesor, listadoNomina);
		leerNomina(listadoNomina);
		grabarFichero(listadoNomina);
		importeTotalNominaProfesorado(listadoNomina);
		
		//cargarNomina2(listadoNomina, listadoProfesor);
		
	}

	/**
	 * En este m�todo se a�adir�n los datos de los diferentes profesores, tanto interinos como titulares, listadoProfesor
	 * creado en el m�todo main.
	 * 
	 * @param listadoProfesor Contiene como par�metro listadoProfesor.
	 * 
	 */
	public static void cargarProfesores (ArrayList<Profesor>listadoProfesor) {
		
		listadoProfesor.add(new ProfesorInterino("45221887-K","Jos�", "Hern�ndez L�pez",1789.00));
		listadoProfesor.add(new ProfesorInterino("72332634-L","Andr�s", "Molt� Parra",1200));
		listadoProfesor.add(new ProfesorInterino("34998128-M","Jos�", "R�os Mesa", 1800.00));
		listadoProfesor.add(new ProfesorTitular("73-k","Juan", "P�rez P�rez", 1900.00, 500, 2));
		listadoProfesor.add(new ProfesorTitular("88-L","Alberto", "Centa Mota",1800, 500, 3));
		listadoProfesor.add(new ProfesorTitular("81-F","Maria", "Mota P�rez",1700, 500, 5));
		
		
	}
	
	/**
	 * Este m�todo carga la n�mina de cada profesor. Recorre el ArrayList listadoProfesor, y dependiendo
	 * de a qu� subclase pertenezca el profesor, calcula la n�mina de una manera o de otra.
	 * Luego, carga el ArrayList listadoNomina con el id del profesor y el sueldo calculado.
	 * 
	 * @param listadoProfesor Contiene como par�metro el listadoNomina.
	 * @param listadoNomina	  Contiene como par�metro el listadoProfesor.
	 */
	public static void cargarNomina (ArrayList<Profesor>listadoProfesor, ArrayList<Nomina>listadoNomina) {
		double sueldo=0;
		String idProf="";
		for (Profesor prof: listadoProfesor) {
			idProf = prof.getIdProfesor();
			
			if (prof instanceof ProfesorInterino) {
				sueldo = ((ProfesorInterino) prof).importeNomina();
				//idProf = prof.getIdProfesor();
		}
			else {
				sueldo = ((ProfesorTitular) prof).importeNomina();
				//idProf = prof.getIdProfesor();
			}
			
			listadoNomina.add(new Nomina(idProf, sueldo));
	}
		
		
	}

	/**
	 * Este m�todo se encarga de leer el ArrayList cargado con los datos de las n�minas.
	 * 
	 * @param listadoNomina Contiene como par�metro listadoNomina.
	 */
	public static void leerNomina (ArrayList<Nomina>listadoNomina){
		for (Nomina nomina : listadoNomina){
			System.out.println(nomina);
		}
		}
		
	
	/**
	 * Este m�todo realiza la funci�n de imprimir el listado de profesores.
	 * Para ello, recorre el ArrayList de la clase Profesor (listadoProfesor).
	 * 
	 * @param listadoProfesor Contiene como par�metro listadoProfesor.
	 */
	public static void imprimirListin (ArrayList<Profesor>listadoProfesor) {
		for (Profesor profesor:listadoProfesor) {
			System.out.println(profesor);
			
		}
	}
	
	/**
	 * En este m�todo se graba un fichero almacenado en la ruta especificada con el ArrayList listadoNomina.
	 * Para ello, utiliza las clases ObjectOutputStream y FileOutputStream, y las funciones writeObject y close.
	 * 
	 * @param listadoNomina Contiene como par�metro listadoNomina.
	 * @throws ClassNotFoundException Excepci�n que controla que la clase no exista.
	 * @throws FileNotFoundException  Excepci�n que controla que el fichero no exista .
	 * @throws IOException 			  Excepci�n que controla que se haya producido un error en la entrada/salida. 
	 */
	public static void grabarFichero (ArrayList<Nomina>listadoNomina) throws ClassNotFoundException, FileNotFoundException, IOException {
		ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("G:\\CICLO DAW\\SEGUNDO\\DESPLIEGUE\\Unidad 8\\ListadoProfesores.dat"));
		 salida.writeObject(listadoNomina);
	     salida.close();
	}
	

	
	/**
	 * Este m�todo se encarga de calcular el importe total de las n�minas de los profesores.
	 * Para ello, en primer lugar lee el fichero con las clases ObjectInputStream y FileinputStream, y
	 * las funciones readObject y close. Luego, recorre listadoNomina y por �ltimo, suma los importes y los imprime.
	 * 
	 * @param  listadoNomina Contiene como par�metro listadoNomina.
	 * @return Devuelve una variable en la que se guarda la suma de todas las n�minas.
	 * @throws ClassNotFoundException Esta excepci�n controla que la clase no exista.
	 * @throws FileNotFoundException  Esta excepci�n controla que el fichero no exista.
	 * @throws IOException			  Esta excepci�n controla que se haya producido un error en la entrada/salida
	 */
	public static double importeTotalNominaProfesorado (ArrayList<Nomina>listadoNomina) throws ClassNotFoundException, FileNotFoundException, IOException {
		double aux=0;
		ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("G:\\CICLO DAW\\SEGUNDO\\DESPLIEGUE\\Unidad 8\\ListadoProfesores.dat"));
		listadoNomina = (ArrayList<Nomina>) entrada.readObject();
		entrada.close();
		
		for (Nomina nomina: listadoNomina) {
			aux = aux + nomina.getImporteNomina();
			
			
		}
		System.out.println("El importe total de las n�minas del profesorado es "+aux);
		return aux;
	}
}


