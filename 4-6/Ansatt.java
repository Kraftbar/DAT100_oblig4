
public class Ansatt {
	private Ansatt [] ansattListe;	

	private String fornavn;
	private String etternavn;
	private String epostadresse;
	private String telefon;
	private Kontor kontor;
	//test
	
	//God natt <3<3. 
	public Ansatt(String fornavn, String etternavn, String epostadresse, String telefon, Kontor kontor) {
		setFornavn(fornavn);
		setEtternavn(etternavn);
		setEpostadresse(epostadresse);
		setTelefon(telefon);
		setKontor(kontor);
	}
	

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getEpostadresse() {
		return epostadresse;
	}

	public void setEpostadresse(String epostadresse) {
		this.epostadresse = epostadresse;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Kontor getKontor() {
		return kontor;
	}

	public void setKontor(Kontor kontor) {
		this.kontor = kontor;
	}




	public String toString() {
		return "Fornavn:   " + fornavn + "\n"
			+ "etternavn: " + etternavn + "\n"
			+ "Epost:     " + epostadresse + "\n"
			+ "Telefon:   " + telefon + "\n"
			+ "Kontor:    " + kontor.toString() + "\n";
	}
}
