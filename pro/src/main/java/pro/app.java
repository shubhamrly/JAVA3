package pro;

import javax.persistence.*;

@Entity
@Table (name ="em")
public class app {
	
@Id	
@Column (name="eid")
int id;
@Column(name="ename")
String name;
@Column(name="esal")
int sal;
public app() {}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}

}
