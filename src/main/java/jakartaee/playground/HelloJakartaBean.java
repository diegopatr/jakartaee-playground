package jakartaee.playground;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class HelloJakartaBean {
    public String getMessage() {
        return "Hello, Jakarta EE!";
    }
}
