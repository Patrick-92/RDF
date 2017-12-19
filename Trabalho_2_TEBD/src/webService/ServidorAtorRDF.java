package webService;

import java.util.ArrayList;

import javax.jws.WebService;

import camadaDeNegocio.FilmeLeitura;
import modelo.Filme;

@WebService(endpointInterface = "webService.ServidorAtor")
public class ServidorAtorRDF implements ServidorAtor{
	FilmeLeitura filme = new FilmeLeitura();
	
	public ArrayList<Filme> filmes(String nome) {
		return filme.listaFilmes(nome);
	}
	
}
