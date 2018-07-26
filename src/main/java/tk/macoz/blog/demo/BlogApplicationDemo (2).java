package tk.macoz.blog.demo;

import tk.macoz.blog.demo.Models.UserCompany;
import tk.macoz.blog.demo.Repo.UserCompanyRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApplicationDemo {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplicationDemo.class, args);
		
	}
	
	@Bean
	public CommandLineRunner appDemo(UserCompanyRepository urepository) {
		return (args) -> {			
			// Create users: admin/admin user/user
			UserCompany user1 = new UserCompany("user","user@system.com", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6");
			UserCompany user2 = new UserCompany("admin","user@system.com", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C");
			urepository.save(user1);
			urepository.save(user2);
		};
	}	

}
