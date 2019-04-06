public class Cliente{
	private String ID;
	private String cognome;
	private String nome;
	private String telefono;
	private int gradoSoddisfazione;
	
	public Cliente(String ID,String cognome,String nome,String telefono) {
		this.ID = ID;
		this.cognome = cognome;
		this.nome = nome;
		this.telefono = telefono;
		this.gradoSoddisfazione = 0;
		
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getGradoSoddisfazione() {
		return gradoSoddisfazione;
	}

	public void setGradoSoddisfazione(int gradoSoddisfazione) {
		this.gradoSoddisfazione = gradoSoddisfazione;
	}

	public void modificaDati(String ID,String cognome,String nome,String telefono,int gradoSoddisfazione) {
		this.ID = ID;
		this.cognome = cognome;
		this.nome = nome;
		this.telefono = telefono;
		this.gradoSoddisfazione = gradoSoddisfazione;
	}

	
	
}