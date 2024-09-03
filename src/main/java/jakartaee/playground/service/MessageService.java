package jakartaee.playground.service;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakartaee.playground.model.Message;

import java.util.List;

@Stateless
public class MessageService {
    @PersistenceContext
    private EntityManager em;

    public void create(Message message) {
        em.persist(message);
    }

    public Message find(Long id) {
        return em.find(Message.class, id);
    }

    public List<Message> list() {
        return em.createQuery("SELECT m FROM Message m", Message.class).getResultList();
    }
}
