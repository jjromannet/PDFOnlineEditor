package net.jjroman.dev.jee.webapp.backend;
 
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.inject.Inject; 

@Named
@SessionScoped
public class TestJSFBackendBean implements Serializable {

    @Inject
    private TestJSFStringService tjssService;

    private String title = "";

    /* Getters & Setters */ 

    public void setTjssService(TestJSFStringService tjssService) {
        this.tjssService = tjssService;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /* Bussiness logic */

    public String getUppercasedTitle() {
        return tjssService.uppercase(title);
    }
}
