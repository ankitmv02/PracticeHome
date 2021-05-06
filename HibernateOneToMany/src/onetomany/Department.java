package onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
@Id
@Column(name="D_Id")
private int d_id;
private String d_name;

@OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
Set<Employee> semp=new HashSet<>();

public int getD_id() {
	return d_id;
}

public void setD_id(int d_id) {
	this.d_id = d_id;
}

public String getD_name() {
	return d_name;
}

public void setD_name(String d_name) {
	this.d_name = d_name;
}

public Set<Employee> getSemp() {
	return semp;
}

public void setSemp(Set<Employee> semp) {
	this.semp = semp;
}


}
