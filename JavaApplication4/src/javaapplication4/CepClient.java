/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author cassiano.moralles
 */
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
 
class CepClient {
 
    public static void main(String args[]) throws Exception {
        URL url = new URL("http://127.0.0.1:9871/cep?wsdl");
        QName qname = new QName("http://127.0.0.1:9871/","CepServerImplService");
        Service ws = Service.create(url, qname);
        CepServer cep = ws.getPort(CepServer.class);

        Endereco endereco = cep.consultar(41810215);
 
        System.out.println("Estado: " + endereco.estado);
        System.out.println("Cidade: " + endereco.cidade);
        System.out.println("Bairro: " + endereco.bairro);
    }
}