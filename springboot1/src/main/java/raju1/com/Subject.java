package raju1.com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="ravi1")
public class Subject 
{
@Id
private String id;
private String name;
private String email;
public Subject()
{
	
}
public Subject(String id,String name)
{
	super();
	this.id=id;
	this.name=name;
}
public Subject(String email) {
	super();
	this.email = email;
}
public String getId()
{
	return id;
}
public void setId(String id) 
{
	this.id = id;
}
public String getName() 
{
	return name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void setName(String name)
{
	this.name = name;
}
}
