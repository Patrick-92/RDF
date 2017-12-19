package webService;

import javax.xml.ws.Endpoint;

public class ServidorAtorPublicar {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8081/TEBD", new ServidorAtorRDF());
	}
}
