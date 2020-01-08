package cuentas;

/**
 * Esta clase simula el comportamiento de una cuenta bancaría con sus atributos
 * de nombre, CCC, saldo y tipo de interes y nos va a permitir crear cuentas
 * bancarias y hacer operaciones de consulta de saldo, ingreso y retirada de
 * dinero de la misma
 * 
 * @author pedrof
 * @version 1.0
 * @since 08/01/2020
 * 
 */
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	/**
	 * Constructor por defecto de la clase CCuenta. Inicializará nombre y cuenta a
	 * null y saldo y tipo de interes a 0.0
	 */
	public CCuenta() {
	}

	/**
	 * Constructor parametrizado de la clase CCuenta. Inicializará nombre, cuenta y
	 * saldo al valor pasado por parámetro al crear una instancia de la clase y
	 * tipoInteres a 0.0 ya que no se asigna nada al mismo en la inicialización a
	 * pesar de pedirla como parámetro
	 * 
	 * @param nom - Nombre de la cuenta a crear
	 * @param cue - Número de la cuenta a crear
	 * @param sal - Saldo inicial de la cuenta a crear
	 * @param tipo - Tipo de interes aplicado a la cuenta a crear 
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Devuelve el nombre de la cuenta bancaria consultada
	 * 
	 * @return nombre de la cuenta bancaria que llama al método
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna el nonbre pasado por parámetro a la cuenta bancaria que ejecuta el
	 * método
	 * 
	 * @param nombre Nombre a asignar a la cuenta que llama al método  
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el número de la cuenta bancaria consultada (CCC)
	 * 
	 * @return número de la cuenta bancaria que llama al método
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Asigna el número de cuenta pasado por parámetro a la cuenta bancaria que
	 * ejecuta el método
	 * 
	 * @param cuenta Numero de cuenta a asignar a la cuenta que llama al método 
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el saldo de la cuenta bancaria consultada
	 * 
	 * @return saldo de la cuenta bancaria que llama al método
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Asigna el saldo pasado por parámetro a la cuenta bancaria que ejecuta el
	 * método
	 * 
	 * @param saldo Saldo a asignar a la cuenta que llama al método 
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el tipo de interés aplicado a la cuenta bancaria consultada
	 * 
	 * @return tipo de interés aplicado a la cuenta bancaria que llama al método
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Asigna el tipo de interés pasado por parámetro a la cuenta bancaria que
	 * ejecuta el método
	 * 
	 * @param tipoInteres Tipo de interés a asignar a la cuenta que llama al método 
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * Devuelve el estado del saldo de la cuenta bancaria consultada
	 * 
	 * @return saldo de la cuenta bancaria que llama al método
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Ingresa la cantidad pasada por parámetro en la cuenta bancaria que ejecuta el
	 * método Si el saldo a ingresar es negativo, contempla dicho error y no ingresa
	 * nada
	 * 
	 * @param cantidad Cantidad a ingresar en la cuenta que llama al método.
	 * @throws Exception Si la cantidad a ingresar es negativa, no se ingresa nada y se resuelven con una excepción
	 * @see <a href =
	 *      https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html> Clase
	 *      Exception del API de java </a>
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Retira la cantidad pasada por parámetro de la cuenta bancaria que ejecuta el
	 * método Si el saldo de la cuenta bancaria es menor o igual a 0 o si se intenta
	 * retirar una cantidad de dinero superior al saldo de la cuenta en cuestión, no
	 * hará nada el método Como salida normal, se obtendrá una reducción del saldo
	 * de la cuenta en la cantidad retirada
	 * 
	 * @param cantidad Cantidad a retirar en la cuenta que llama al método.
	 * @throws Exception Si la cantidad a retirar es negativa o mayor al saldo actual de la cuenta, no se retira nada y se resuelven con una excepción
	 * @see <a href =
	 *      https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html> Clase
	 *      Exception del API de java </a>
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}
}
