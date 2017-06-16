package info.leihao.javaweb.configservlet;

import org.springframework.web.WebApplicationInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        System.out.println("Initializing WebAppInitializer");
        ServletRegistration.Dynamic myServlet = servletContext.addServlet("myServlet2", MyServlet.class);
        myServlet.addMapping("/myservlet4/");
        myServlet.setLoadOnStartup(2);

    }
}
