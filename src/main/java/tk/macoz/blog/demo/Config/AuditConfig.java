package tk.macoz.blog.demo.Config;

import java.util.Optional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Configuration
@EnableJpaAuditing
class AuditConfig {
	public static class SecurityAuditor implements AuditorAware<String> {
		@Override
		public Optional<String> getCurrentAuditor() {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			String username = auth.getName();
			return Optional.of(username);
		}
	}

	@Bean
	public AuditingEntityListener createAuditingListener() {
		return new AuditingEntityListener();
	}

	@Bean
	public AuditorAware<String> createAuditorProvider() {
		return new SecurityAuditor();
	}
}