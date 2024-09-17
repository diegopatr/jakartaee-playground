package jakartaee.playground;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class GreetingBean {
    private String name;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        this.message =  "Hello, " + name + "!";
    }

    @Override
    public String toString() {
        return "GreetingBean{" +
               "name='" + name + '\'' +
               ", message='" + message + '\'' +
               "} " + this.hashCode();
    }
}
