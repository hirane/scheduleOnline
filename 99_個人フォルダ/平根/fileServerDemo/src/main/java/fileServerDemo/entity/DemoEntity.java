package fileServerDemo.entity;

import lombok.Getter;
import lombok.Setter;

//@Entity
//@Table(name = "fruits", schema = "fileServerDemo")
@Getter
@Setter
public class DemoEntity {

//	@Id
//	@Column(nullable = false)
	String name;

	String color;
}
