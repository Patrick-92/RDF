package modelo;

import java.util.ArrayList;

public class Filme {
	private String titulo;
	private String ano;
	private String diretor;
	private String genero;
	private ArrayList<String> premios;
	private ArrayList<Ator> atores;
	
	public Filme() {

	}
	
	public Filme(String titulo, String ano, String diretor) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.diretor = diretor;
		this.genero = genero;
		this.premios = premios;
	}
	
	public Filme (String titulo){
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public ArrayList<String> getPremios() {
		return premios;
	}
	public void setPremios(ArrayList<String> premios) {
		this.premios = premios;
	}
	public ArrayList<Ator> getAtores() {
		return atores;
	}
	public void setAtores(ArrayList<Ator> atores) {
		this.atores = atores;
	}
}
