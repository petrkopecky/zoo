package pk.zoo.service;

import pk.zoo.model.Animal;
import pk.zoo.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalServiceImpl implements AnimalService {
    Map<Long, Animal> animals;
    Map<Long, List<Employee>> animalsCarers;

    public void init() {
        animals = new HashMap<Long, Animal>();
        animalsCarers = new HashMap<Long, List<Employee>>();
    }

    @Override
    public void addAnimal(Animal animal, List<Employee> caredByList) {
        animals.put(animal.getAin(), animal);
        animalsCarers.put(animal.getAin(), caredByList);

    }

    @Override
    public void removeAnimal(Animal animal) {
        animals.remove(animal.getAin());
        //animalsCarers.remove(animal.getAin());
    }

    @Override
    public void addCaredByToAnimal(Employee employee, Animal animal) {
        List<Employee> carers = animalsCarers.get(animal.getAin());

        if (carers == null) {
            List<Employee> carersNew = new ArrayList<Employee>();
            carersNew.add(employee);
            animalsCarers.put(animal.getAin(), carersNew);
        }else {
            carers.add(employee);
        }

    }
}
