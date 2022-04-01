package demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import demo.model.User;
import demo.repository.UserRepository;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repo) {

        return args -> {
            User aruna = new User(1L,
				 "Aruna","email","password");
            User second = new User(2L,"second","email","password");
            repo.save(aruna);
            repo.save(second);

        };
    } 
}