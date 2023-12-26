package ws;

import jakarta.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9090/", new BanqueService());
        System.out.println("Deploying JAX-WS Server on http://localhost:9090/");
    }
}
