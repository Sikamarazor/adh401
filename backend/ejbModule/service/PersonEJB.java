package service;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.PersonEntity;;

/**
 * Session Bean implementation class PersonEJB
 */
@Stateless
@LocalBean

public class PersonEJB {
	@PersistenceContext
	private EntityManager em;
	
    public PersonEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(PersonEntity personEntity)
    {
    	System.out.println("============================");
    	System.out.println(personEntity.getAmount());
    	em.persist(personEntity);
    }
    public List<PersonEntity> findEmployees() {
    	List<PersonEntity> person = em.createQuery("Select e from adh401 e"
    			,PersonEntity.class).getResultList();
    	return person;
    }

}
