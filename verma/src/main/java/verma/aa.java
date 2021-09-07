package verma;

import javax.persistence.*;

@Entity 
@Table(name ="emp")
public class aa {
@Id
@Column(name="id")
	int id;
@Column (name="name")
String name;
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

}
