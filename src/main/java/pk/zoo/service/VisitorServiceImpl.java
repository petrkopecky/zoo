package pk.zoo.service;

import pk.zoo.model.Visitor;

import java.util.HashMap;
import java.util.Map;

public class VisitorServiceImpl implements VisitorService {
    Map<String,Visitor> visitors;

    public void init(){
        visitors = new HashMap<String, Visitor>();
    }
    @Override
    public void registerVisitor(String firstName, String secondName, String id, Double credit) {
        visitors.put(id,new Visitor(firstName,secondName,id,credit));
    }

    @Override
    public void addCredit(Visitor visitor, Double credit) {
        visitors.get(visitor.getId()).setCredit(credit);

    }

    @Override
    public void checkIn(String visitorId) throws VisitorNotFoundException {
        if(visitors.get(visitorId)==null){
            throw  new VisitorNotFoundException();
        }
    }
}
