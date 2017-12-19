package modelo;

import java.util.ArrayList;

public class Ator {
	private int idAtor;
	private String nome;
	private String premios;
	private String conjuge;
	private String filho;
	private String nascimento;
	private String nacionalidade;
	private String enderecoAtual;
	private ArrayList<String> filmes; 
	
	public Ator(String nome){
		this.nome = nome;
	}
	
	public Ator(int idAtor, String nome, String premios, String conjuge, String filho, String nascimento,
			String nacionalidade, String enderecoAtual) {
		super();
		this.setIdAtor(idAtor);
		this.setNome(nome);
		this.setPremios(premios);
		this.setConjuge(conjuge);
		this.setFilho(filho);
		this.setNascimento(nascimento);
		this.setNacionalidade(nacionalidade);
		this.setEnderecoAtual(enderecoAtual);
	}
	
	public Ator(int idAtor, String nome, String conjuge, String filho, String nascimento,
			String nacionalidade, String enderecoAtual) {
		super();
		this.setIdAtor(idAtor);
		this.setNome(nome);
		this.setConjuge(conjuge);
		this.setFilho(filho);
		this.setNascimento(nascimento);
		this.setNacionalidade(nacionalidade);
		this.setEnderecoAtual(enderecoAtual);
	}
	
	public Ator(String nome, String premios, String conjuge, String filho, String nascimento,
			String nacionalidade, String enderecoAtual) {
		this.setNome(nome);
		this.setConjuge(conjuge);
		this.setFilho(filho);
		this.setNascimento(nascimento);
		this.setNacionalidade(nacionalidade);
		this.setEnderecoAtual(enderecoAtual);
		this.filmes = new ArrayList<String>();
	}
	
	public Ator(){
		
	}

	public int getIdAtor() {
		return idAtor;
	}

	public void setIdAtor(int idAtor) {
		this.idAtor = idAtor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPremios() {
		return premios;
	}

	public void setPremios(String premios) {
		this.premios = premios;
	}

	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	public String getFilho() {
		return filho;
	}

	public void setFilho(String filho) {
		this.filho = filho;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getEnderecoAtual() {
		return enderecoAtual;
	}

	public void setEnderecoAtual(String enderecoAtual) {
		this.enderecoAtual = enderecoAtual;
	}

	public ArrayList<String> getFilmes() {
		return filmes;
	}

	public void setFilmes(ArrayList<String> filmes) {
		this.filmes = filmes;
	}
	
	public void inserirFilme(String filme){
		this.filmes.add(filme);
	}
}
