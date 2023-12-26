package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversion(8000));
        System.out.println(proxy.getCompte(1));
        System.out.println(proxy.getComptes());
    }
}
