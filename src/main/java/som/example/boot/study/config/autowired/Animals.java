package som.example.boot.study.config.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Animals {

    private List<Animal> animals;

    @Autowired
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
