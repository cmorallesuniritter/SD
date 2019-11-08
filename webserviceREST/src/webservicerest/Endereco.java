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
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Endereco {

    public String estado;
    public String cidade;
    public String bairro;
}