package text4;

import java.util.HashSet;
import java.util.Set;

public class Student {
	public String name;
	public String id;
	public Set courses;
	public Student(String id,String name) {
		this.id=id;
		this.name=name;
		this.courses=new HashSet();
	}
}
