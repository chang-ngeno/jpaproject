package tk.macoz.blog.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tk.macoz.blog.demo.Models.UserCompany;

public interface UserCompanyRepository extends JpaRepository<UserCompany, Long> {
	UserCompany findByUsername(String username);
}
