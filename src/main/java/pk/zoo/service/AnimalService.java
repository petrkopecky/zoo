package pk.zoo.service;

import pk.zoo.model.Animal;
import pk.zoo.model.Employee;

import java.util.List;

public interface AnimalService {
    void addAnimal(Animal animal, List<Employee> caredByList);
    void removeAnimal(Animal animal);

    void addCaredByToAnimal(Employee employee,Animal animal);
}
