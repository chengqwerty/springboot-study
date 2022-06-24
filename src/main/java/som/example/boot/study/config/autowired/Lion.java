package som.example.boot.study.config.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal {

    private Tiger tiger;

    @Autowired
    public void setTiger(Tiger tiger) {
        this.tiger = tiger;
    }

    public String getName() {
        return "lion";
    }

}
