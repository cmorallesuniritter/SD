/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicerest;

/**
 *
 * @author cassiano.moralles
 */
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cep")
public class CepService {

    @GET
    @Path("/consultar/{param1}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Endereco consultar(@PathParam("param1") int cep) {

        Endereco endereco = new Endereco();
        endereco.estado = "BA";
        endereco.cidade = "Salvador";
        endereco.bairro = "Pituba";

        return endereco;
    }
    
    
    @GET
    @Path("/alterarestado/{param1}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Endereco alterarestado(@PathParam("param1") String estado) {

        Endereco endereco = new Endereco();
        endereco.estado = estado;
        endereco.cidade = "Salvador";
        endereco.bairro = "Pituba";

        return endereco;
    }
}