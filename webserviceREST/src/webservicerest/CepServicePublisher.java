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
import java.util.HashMap;
import java.util.Map;

import com.sun.grizzly.http.SelectorThread;
import com.sun.jersey.api.container.grizzly.GrizzlyWebContainerFactory;
import java.io.IOException;

public class CepServicePublisher {

    public static void main(String[] args) {        
        final String baseUri = "http://localhost:9888/";
        final Map initParams = new HashMap();

        // Register the package that contains your javax.ws.rs-annotated beans here
        initParams.put("com.sun.jersey.config.property.packages","webservicerest");

        System.out.println("Starting grizzly...");
        try {
            SelectorThread threadSelector;
            threadSelector = GrizzlyWebContainerFactory.create(baseUri, initParams);
            System.out.println(String.format("Jersey started with WADL " + "available at %sapplication.wadl.", baseUri));
        }
        catch(IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}