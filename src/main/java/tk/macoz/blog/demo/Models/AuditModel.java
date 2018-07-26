package tk.macoz.blog.demo.Models;

import javax.persistence.*;
//import java.time.Instant;
//import org.springframework.data.annotation.*;
//import tk.macoz.blog.demo.Models.*;

@MappedSuperclass
public abstract class AuditModel {
    
    /*@Column(name = "created_on",nullable = false, updatable = false)
    @CreatedDate
    //@Temporal(TemporalType.TIMESTAMP)
    private Instant createdOn;
    
    @JoinColumn(name = "created_by")
    @CreatedBy
    private User_ createdBy;
    
    @Column(name = "updated_on")
    @LastModifiedDate
    //@Temporal(TemporalType.TIMESTAMP)
    private Instant updatedOn;
    
    @JoinColumn(name = "updated_by")
    @LastModifiedBy
    private User_ updatedBy;*/
    
}
