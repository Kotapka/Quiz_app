package com.example.Quiz_app.users;

import com.example.Quiz_app.mailSender.EmailSenderService;
import lombok.ToString;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final EmailSenderService emailSenderService;
    @Autowired
    public UserService(UserRepository userRepository, EmailSenderService emailSenderService) {
        this.userRepository = userRepository;
        this.emailSenderService = emailSenderService;
    }

    public Users registerUser(Users user){
        Integer code = randomCode();
        String codeString = Integer.toString(code);
        emailSenderService.sendSimpleEmail(user.getEmail(),"Witamy w koloni","Dziękujemy za utworzenie konta w naszej aplikacji, wcale nie wykradawmy twoich danych :)");
        return user;
    }
    public Users loginUser(Users user){
        return user;
    }
    public void saveUserFromApi(Users user) {
        userRepository.save(user);
    }
    public boolean checkCredentials(Users apiUser) {
        Users user = userRepository.findByLogin(apiUser.getLogin());
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(apiUser.getPassword());
    }

    public List<Users> getUser(){
        return userRepository.findAll();
    }

    public int randomCode(){
        Random rand = new Random();
        int randomNum = rand.nextInt((9999 - 1111) + 1) + 1111;
        return randomNum;
    }
}

