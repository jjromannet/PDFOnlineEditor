package net.jjroman.dev.jee.webapp.backend;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class TestJSFStringService implements Serializable{

    public String uppercase(String toUppercase) {
        if(toUppercase == null) return "";
        return new String(toUppercase).toUpperCase();
    }
}