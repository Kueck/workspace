package cl.curso.java.prueba_dos.cpoblete.ejercicio1;

/**
 * @author Camilo Poblete
 *
 */
public class Persona {

	private String nombre;
	private String rut;
	private int edad;
	private int altura;
	private int peso;
	
	
	/**
	 * Constructo por defecto
	 */
	public Persona(){
		
		this.nombre="n/a";
		this.rut="n/a";
		this.edad=0;
		this.altura=0;
		this.peso=0;	
	}

	/**
	 * Constructor con parametros
	 * @param nombre
	 * @param rut
	 * @param edad
	 * @param altura
	 * @param peso
	 */
	public Persona(String nombre, String rut, int edad, int altura, int peso) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @return
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	/**
	 * @return
	 * Metodo calcularImc
	 * retorna un valor entero el cual sera:
	 *  1 en caso de sobrepeso
	 * 	0 en caso de estar en el peso ideal
	 * 	-1 en caso de esta bajo el peso normal
	 */
	public int calcularImc(){
			
			int pesoIdeal=(this.getPeso()/(this.getAltura()*this.getAltura()));
			
			if(this.getPeso()==pesoIdeal)
			{
			return 0;
			}else{
				if(this.getPeso()<pesoIdeal){
					return -1;
				}else{
					return 1;
				}
			}
		}
	
	
	/**
	 * @return
	 * Metodo esMayorDeEdad
	 * retorna un valor booleano el cual sera:
	 * true en caso de que la edad sea mayor o igual a 18
	 * false en caso de que la edad sea menor a 18
	 */
	public boolean esMayorDeEdad(){
		
		return this.getEdad()>=18;
		
	}
	
}
