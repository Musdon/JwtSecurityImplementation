package com.musdon.springsecwithjwt;

import com.musdon.springsecwithjwt.domain.Role;
import com.musdon.springsecwithjwt.domain.User;
import com.musdon.springsecwithjwt.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SpringsecwithjwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecwithjwtApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }



    @Bean
    CommandLineRunner runner(UserService userService){
        return args -> {
          userService.saveRole(new Role(null, "ROLE_USER"));
          userService.saveRole(new Role(null, "ROLE_MANAGER"));
          userService.saveRole(new Role(null, "ROLE_ADMIN"));
          userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

          userService.saveUser(new User(null, "Musa Ajibade", "Musa", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Maryam Ajibade", "Maryam", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Mutiat Ajibade", "Mutiat", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Umar Ajibade", "Umar", "1234", new ArrayList<>()));

            userService.addRoleToUser("Musa", "ROLE_USER");
            userService.addRoleToUser("Maryam", "ROLE_MANAGER");
            userService.addRoleToUser("Mutiat", "ROLE_ADMIN");
            userService.addRoleToUser("Umar", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("Musa", "ROLE_ADMIN");
            userService.addRoleToUser("Musa", "ROLE_SUPER_ADMIN");






        };
    }

}
