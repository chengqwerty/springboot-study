package som.example.boot.study.config.autowired;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal {

    public String getName() {
        return "tiger";
    }

}
