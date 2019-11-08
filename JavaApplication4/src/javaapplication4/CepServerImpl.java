/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import javax.jws.WebService;

@WebService(endpointInterface = "javaapplication4.CepServer")
public class CepServerImpl implements CepServer {

    public Endereco consultar(int cep) {
        Endereco endereco = new Endereco();
        endereco.estado = "BA";
        endereco.cidade = "Salvador";
        endereco.bairro = "Pituba";

        return endereco;
    }
}