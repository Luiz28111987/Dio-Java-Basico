public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo", 10),
	RIO_DE_JANEIRO ("RJ", "Rio de Janeiro", 11),
	PIAUI ("PI", "Piaui", 12),
	MARANHAO ("MA", "Maranhão", 13),
	CEARA ("CE", "Ceara", 14);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public int getIbge() {
		return ibge;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

}