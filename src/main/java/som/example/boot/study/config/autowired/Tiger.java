package som.example.boot.study.config.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal {

    private Lion lion;

    @Autowired
    public void setLion(Lion lion) {
        this.lion = lion;
    }

    public String getName() {
        return "tiger";
    }

}
