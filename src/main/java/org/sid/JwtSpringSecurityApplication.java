package org.sid;

import java.util.stream.Stream;

import org.sid.dao.TaskRepository;
import org.sid.enties.AppRole;
import org.sid.enties.AppUser;
import org.sid.enties.Task;
import org.sid.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class JwtSpringSecurityApplication  {//implements CommandLineRunner
	@Autowired
	private TaskRepository taskRepository;
	@Autowired
 private AccountService accountService;
	
	public static void main(String[] args) {
		SpringApplication.run(JwtSpringSecurityApplication.class, args);
	}
	
	//cette instanciation est impérative sini la fonction de hashage dans securityConfig  ne fonctionnera pas
	@Bean
	public BCryptPasswordEncoder getPE(){
		return new BCryptPasswordEncoder();
	}

/*	@Override
	public void run(String... args) throws Exception {
		
		accountService.saveUser( new AppUser(null,"admin","1234"));
		accountService.saveUser( new AppUser(null,"user","1234"));
		
		accountService.saveRole(new AppRole(null, "ADMIN"));
		accountService.saveRole(new AppRole(null, "USER"));
		
		accountService.addRoleToUser("admin", "ADMIN");
		accountService.addRoleToUser("admin", "USER");
		accountService.addRoleToUser("user", "USER");
		
		//création et insertion des tasks
	Stream.of("T1","T2","T3").forEach(t->{
			taskRepository.save(new Task(null, t));
	});
	//affichage des tasks
	taskRepository.findAll().forEach(t->{
		System.out.println(t.getTaskName());
	});
		
	}*/
}
