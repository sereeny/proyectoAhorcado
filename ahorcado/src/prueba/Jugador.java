package prueba;

public class Jugador {
	private int puntaje;
	private String nombre;

	public int getVidas() {
		return puntaje;
	}

	public void setVidas(int vidas) {
		this.puntaje = vidas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador(int pts, String nombre) {
		super();
		this.puntaje = pts;
		this.nombre = nombre;
	}
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Jugador() {
		super();
	}

	@Override
	public String toString() {
		return "Jugador [vidas=" + puntaje + ", nombre=" + nombre + "]";
	}

	//el jugador aumentara sus pts, se le daran 3 pts por cada partida ganada
	public void aumentarPuntos(int puntos) {
		this.puntaje = this.puntaje + puntos;
	}
	
}
