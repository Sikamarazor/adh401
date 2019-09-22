package models;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.PersonEntity;

@ManagedBean(name = "person")
@SessionScoped

public class Person implements Serializable {
private static final long serialVersionUID = 001L;
	
	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destationCountry;
	private String accNumber;
	private String amount;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return destinationPassport;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}
	public String getDestationCountry() {
		return destationCountry;
	}
	public void setDestationCountry(String destationCountry) {
		this.destationCountry = destationCountry;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getAmount() {
		return accNumber;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public PersonEntity getEntity()
	{
		PersonEntity personEntity = new PersonEntity();
		personEntity.setName(name);
		personEntity.setSourcePassport(sourcePassport);
		personEntity.setDestinationBank(destinationBank);
		personEntity.setDestinationPassport(destinationPassport);
		personEntity.setDestationCountry(destationCountry);
		personEntity.setAccNumber(accNumber);
		personEntity.setAmount(amount);
		return personEntity;
	}
}
