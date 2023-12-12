

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.techkonnect.entity")
@ComponentScan({"com.techkonnect"})
@EnableJpaRepositories({"com.techkonnect.repository"})
public class TechKonnectJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechKonnectJavaApplication.class, args);
	}

}
