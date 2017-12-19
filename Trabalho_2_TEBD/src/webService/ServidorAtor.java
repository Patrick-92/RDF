package webService;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import modelo.Filme;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ServidorAtor {
	@WebMethod ArrayList<Filme> filmes(String nome);
}
