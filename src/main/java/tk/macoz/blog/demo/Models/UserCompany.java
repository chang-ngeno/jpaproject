package tk.macoz.blog.demo.Models;

import javax.persistence.*;/*
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;*/

import java.util.Date;
//import java.util.List;

@Entity
@Table(name = "user_company_dtls")
@DiscriminatorValue("nonindividual")
public class UserCompany extends User {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_company_id", updatable = false, nullable = false)
    private long id;
    
    @Column(name="company_name")
    private String compName;
    
    @Column(name="company_registration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date compRegDate;

	public UserCompany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserCompany(String username, String email,  String password) {
		super(username, email, password, password);
		// TODO Auto-generated constructor stub
	}

	public UserCompany(String compName, Date compRegDate) {
		super();
		this.compName = compName;
		this.compRegDate = compRegDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public Date getCompRegDate() {
		return compRegDate;
	}

	public void setCompRegDate(Date compRegDate) {
		this.compRegDate = compRegDate;
	}

	@Override
	public String toString() {
		return super.toString()+ " {UserCompany [id=" + id + ", compName=" + compName + ", compRegDate=" + compRegDate + "]}";
	}
    
    /*@OneToMany
    @JoinColumn(name = "company_directors_id")
    private List<UserPerson> Directors;*/
    
}
