package tk.macoz.blog.demo.Models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
//import java.util.List;
//import tk.macoz.blog.demo.Models.Contact;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name ="user_type")
@EntityListeners(value = AuditingEntityListener.class)
public abstract class User extends AuditModel {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", updatable = false, nullable = false)
    private long id;
    
    @NotBlank
    @Column(name="username")
    @Size(max = 20)
    private String username;
    
    @NotBlank
    @Email
    @Column(name = "email")
    private String email;
    
    //@JsonIgnore
    @NotBlank
    @Column(name = "password")
    private String password;
    
    @Column(name = "user_type")
    private String userType;
    
    @CreatedBy
    @JoinColumn(name = "created_by")
    private User createdBy;
    
    @CreatedDate
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    
    @LastModifiedBy
    @JoinColumn(name = "updated_by")
    private User updatedBy;
    
    @LastModifiedDate
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
    
    public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public User(@NotBlank @Size(max = 20) String username, @NotBlank @Email String email,
			@NotBlank String password, String userType) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public User getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(User updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}
    
   /* @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Contact> contacts ;*/
    
    
}
