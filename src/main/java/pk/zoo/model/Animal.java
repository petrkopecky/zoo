package pk.zoo.model;

public class Animal {

    private Long ain;
    private AnimalKind kind;
    private String name;
    private Double weight;

    public AnimalKind getKind() {
        return kind;
    }

    public void setKind(AnimalKind kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Long getAin() {
        return ain;
    }

    public void setAin(Long ain) {
        this.ain = ain;
    }
}
