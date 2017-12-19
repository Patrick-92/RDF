package camadaDeDados;

import java.io.InputStream;
import java.util.ArrayList;

import org.apache.jena.iri.impl.Main;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;

import modelo.Ator;
import modelo.Filme;

public class FilmeRDF {
	static final String inputFileName  = "C:/Users/Patrick/Dropbox/Faculdade/7º período/T.E.B.D/RDF/Trabalho_2_TEBD/Atores.rdf";
	
	public Filme filme (String nomeAtor){		
		
		Model model = ModelFactory.createDefaultModel();
		Filme filme = new Filme();

	    InputStream in = FileManager.get().open( inputFileName );
	    if (in == null) {
	        throw new IllegalArgumentException( "File: " + inputFileName + " not found");
	    }
	    
	    FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
	    model = FileManager.get().loadModel(inputFileName);
	    
	    /*String sparql = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> "
	  			  + "PREFIX	vcard: <http://www.w3.org/2001/vcard-rdf/3.0#> "
	  		+ "SELECT ?nomeCompleto ?filmes ?lista"
	  		+ " WHERE "
	  		+ "{ ?y vcard:FN ?nomeCompleto . "
	  		+ "	?x vcard:LABEL ?filmes ."
	  		+ "	?y vcard:hasRole ?x ."
	  		+ "FILTER (?nomeCompleto = \"" + nomeAtor + "\")"
	  		+ "}";
	    */
	    
//	    String sparql = "PREFIX vcard:   <http://www.w3.org/2001/vcard-rdf/3.0#>"+
//
//			"SELECT * WHERE {"
//			 + 	"?actor vcard:FN ?x ."
//			 + "?movie vcard:hasRole ?actor ."
//			 + "?movie vcard:TITLE ?y ."
//			 +"FILTER(?x = \""+ nomeAtor + "\")"
//			 +	"}";
	    
	    String sparql = "PREFIX vcard:   <http://www.w3.org/2001/vcard-rdf/3.0#>"
			+ " SELECT * WHERE {"
			+ "?x vcard:LABEL ?genero ."
			+ "?y vcard:hasGender ?x ."
			+ "?y vcard:TITLE ?titulo ."
 			+ "?y vcard:BDAY ?anoLancamento ."
 			+ "?y vcard:FN ?diretor ."
			+ "FILTER(?titulo = \"" + nomeAtor + "\")"
			+ "}";
	    
	    Query query = QueryFactory.create(sparql);
	    
	    QueryExecution qexec = QueryExecutionFactory.sparqlService("http://localhost:3030/filme2/query", sparql);
	    
	    try {
			ResultSet results = qexec.execSelect();
			while ( ((org.apache.jena.query.ResultSet) results).hasNext() ) {
				
				QuerySolution soln = (results).nextSolution();
				Literal titulo = soln.getLiteral("titulo");
				Literal ano = soln.getLiteral("anoLancamento");
				Literal diretor = soln.getLiteral("diretor");
				Literal genero = soln.getLiteral("genero");
				
				filme.setTitulo(titulo.toString());
				filme.setAno(ano.toString());
				filme.setDiretor(diretor.toString());
				if (filme.getGenero() == null) {
					filme.setGenero(genero.toString());
				} else {
					filme.setGenero(filme.getGenero() + ", " + genero.toString());
				}
				
				System.out.println(filme.getDiretor());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	    qexec.close();
	    
		return filme;
	}
}
