package np;
import javax.persistence.*;
@Entity
@Table(name = "emp")
public class emp {
  @Id
	@Column (name ="eid")
     int id;
  @Column(name = "ename")
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
