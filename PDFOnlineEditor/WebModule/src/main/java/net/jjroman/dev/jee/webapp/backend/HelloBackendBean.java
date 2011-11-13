package net.jjroman.dev.jee.webapp.backend;

import net.jjroman.dev.jee.pdfonlineconverter.ejb.LayerManager;
import net.jjroman.dev.jee.pdfonlineconverter.ejb.UserManager;
import net.jjroman.dev.jee.pdfonlineconverter.ejb.PdfConverter;
import javax.naming.NamingException;
import javax.naming.Context;
import javax.naming.InitialContext;
import org.apache.log4j.Logger;

public class HelloBackendBean {
    private final static Logger l = Logger.getLogger( HelloBackendBean.class.getName() );
	private LayerManager layerManager = null;
	private UserManager userManager = null;
	private PdfConverter pdfConverter = null;
	
	public HelloBackendBean (){
        Context ctx = null;
        try{
           ctx = new InitialContext();
        }catch (NamingException nex){
           l.error("context initializaiton error", nex);
           return;
        }
        try{
            layerManager = (LayerManager) ctx.lookup("java:global/PDFOnlineEditorEAR/EjbLayerManager-2.0/LayerManagerBean");
            userManager = (UserManager) ctx.lookup("java:global/PDFOnlineEditorEAR/EjbUserManager-2.0/UserManagerBean");
            pdfConverter = (PdfConverter) ctx.lookup("java:global/PDFOnlineEditorEAR/EjbPdfConverter-2.0/PdfConverterBean");
        }catch (NamingException nex){
            l.error("JNDI errors", nex);
        }
	}
	
	public String getHelloStringsFromLayerManager(){
        if(layerManager == null){
            return "error";
        }
		return layerManager.getHelloString(this.getClass().getCanonicalName());
	}
	
	public String getHelloStringsFromUserManager(){
        if(userManager == null){
            return "error";
        }
		return userManager.getHelloString(this.getClass().getCanonicalName());
	}
	
	public String getHelloStringsFromPdfConverter(){
        if(pdfConverter == null){
            return "error";
        }
		return pdfConverter.getHelloString(this.getClass().getCanonicalName());
	}
	
}
