package som.example.boot.study.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertiesComponent implements CommandLineRunner {

    private Environment environment;

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(environment.getProperty("app.log.path"));
    }

}
