package de.htwsaar.vs.chat.contrller;


import de.htwsaar.vs.chat.handler.AuthHandler;
import de.htwsaar.vs.chat.model.User;
import de.htwsaar.vs.chat.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/neochat")
@AllArgsConstructor
public class AuthController {


    private final UserService userService;

//    @PostMapping("/signup")
//    public Mono<> signup(@RequestBody User user){
////        authHandler.signup()
//        return  userService.createUser(user);
//    }




}
