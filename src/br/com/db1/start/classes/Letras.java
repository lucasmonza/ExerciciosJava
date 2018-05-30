package br.com.db1.start.classes;

public class Letras {
	private String umTextoQualquer="LUCASHenrique";
	private String nomeCurso="DB1START";
	
	public String exercicio1() {
		return umTextoQualquer.toUpperCase();
	}
	public String exercicio2() {
		return umTextoQualquer.toLowerCase();
	}
	public Integer exercicio3() {
		return nomeCurso.length();
	}
	public String getUmTextoQualquer() {
		return umTextoQualquer;
	}
	public void setUmTextoQualquer(String umTextoQualquer) {
		this.umTextoQualquer = umTextoQualquer;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
}