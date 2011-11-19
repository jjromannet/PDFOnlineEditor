package net.jjroman.dev.jee.webapp.backend;
 
import javax.faces.bean.*;
 
@ManagedBean(name="demoJSF2Service")
@ApplicationScoped
public class TestJSFService {
 
  public String reverse(String name) {
    return new StringBuffer(name).reverse().toString().toLowerCase();
  }
}