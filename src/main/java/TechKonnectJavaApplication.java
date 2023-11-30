

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan({"com.techkonnect","com.firstproject"})
public class TechKonnectJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechKonnectJavaApplication.class, args);
	}

}
