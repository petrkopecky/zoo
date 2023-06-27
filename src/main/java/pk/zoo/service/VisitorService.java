package pk.zoo.service;

import pk.zoo.model.Visitor;

public interface VisitorService {
    void registerVisitor(String firtNam,String secondName, String id, Double credit);
    void addCredit(Visitor visitor, Double credit);

    void checkIn(String visitorId) throws VisitorNotFoundException;


}
