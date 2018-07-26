package tk.macoz.blog.demo.Models;

import javax.persistence.*;
/*import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import java.util.Calendar;*/

@Entity
@Table(name = "user_person_dtls")
public class UserPerson extends User {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_person_id", updatable = false, nullable = false)
    private long id;
    
    @Column(name="first_name")
    private String fName;
    
    @Column(name="surname")
    private String surname;

	public UserPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public UserPerson(long id, String fName, String surname) {
		super();
		this.id = id;
		this.fName = fName;
		this.surname = surname;
	}



	public UserPerson(String fName, String surname) {
		super();
		this.fName = fName;
		this.surname = surname;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
    
    /*@Column(name = "date_of_birth")
    private Calendar dateOfBirth;*/
}
