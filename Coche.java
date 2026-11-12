public class Coche {
 
	private String modelo;
	private String matricula;
	private String conductor;
	 
	public Coche(String _modelo, String _matricula) {
		modelo = _modelo;
		matricula = _matricula;
	}
	 
	public void setConductor(String _conductor) {
		conductor = _conductor;
	}
	 
	public String getConductor() {
		return conductor;
	}
	 
	public void mostrarInfo() {
		System.out.println(modelo + ", " + matricula + ", " + conductor);
	}
}