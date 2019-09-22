package controller;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import models.Person;
import service.PersonEJB;
import entities.PersonEntity;

@ManagedBean(name = "personcontroller")
@SessionScoped
public class PersonController {
	
	@EJB
    private PersonEJB personEJB;
    
  //from form
  	@ManagedProperty(value="#{person}")
    private Person person;
  	
    private List<PersonEntity> personList = new ArrayList<>();
    
    public List<PersonEntity> getPersonList() {
    	personList = personEJB.findEmployees();
        return personList;
    }
 
   public String viewTransaction(){
        return "transactionList.xhtml";
    }
   
    public String addNewTransaction() {
    	personEJB.addNew(person.getEntity());
      //  employeeList = employeeEJB.findEmployees();
        return "transactionList.xhtml";
    }

	public Person getPerson() {
		return person;
	}
	public String gotoAdd() {
		return "index.xhtml";
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
