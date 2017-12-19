package camadaDeNegocio;

import java.util.ArrayList;

import camadaDeDados.AtorRDF;
import modelo.Ator;

public class AtorLeitura {
	private AtorRDF consulta = new AtorRDF();
	//private ArrayList<Ator> atores = new ArrayList<>();
	
	public AtorLeitura() {
	}
	
	public ArrayList<Ator> listaAtor(){
		//atores = ;
		return consulta.filmesAtores(consulta.listaAtores());
	}
}
