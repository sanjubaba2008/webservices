package com.example.webservice;

import com.example.webservice.dao.IUserRepo;
import com.example.webservice.models.User;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AppRunner implements CommandLineRunner {

    IUserRepo iUserRepo;

    public AppRunner(IUserRepo iUserRepo) {
        this.iUserRepo = iUserRepo;
    }


    @Override
    public void run(String... args) throws Exception {
        iUserRepo.save(new User("sanjaya","sanjaya428@gmail.com"));
        iUserRepo.save(new User("sumit","sumit@gmail.com"));
        iUserRepo.save(new User("ushma","ushma@gmail.com"));
        iUserRepo.save(new User("aayan","aayan@gmail.com"));
        iUserRepo.save(new User("aaria","aaria@gmail.com"));
        iUserRepo.save(new User("ruby","ruby@gmail.com"));
        iUserRepo.save(new User("rohinee","rohinee@gmail.com"));

    }
}
