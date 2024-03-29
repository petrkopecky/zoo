package pk.zoo.model;

public class Visitor extends Person {
    private String id;
    private double credit;

    public Visitor(String firstName,String secondName,String id,Double credit) {
        super(firstName,secondName);
        this.id = id;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
