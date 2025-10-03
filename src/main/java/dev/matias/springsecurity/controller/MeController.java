// package dev.matias.springsecurity.controller;

// import dev.matias.springsecurity.entities.User;
// import dev.matias.springsecurity.repository.UserRepository;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.core.annotation.AuthenticationPrincipal;
// import org.springframework.security.oauth2.jwt.Jwt;
// import org.springframework.web.bind.annotation.CookieValue;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import java.util.Map;
// import java.util.Set;
// import java.util.UUID;
// import java.util.stream.Collectors;

// @RestController
// public class MeController {

//     private final UserRepository userRepository;

//     public MeController(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }

//     @GetMapping("/me")
//     public ResponseEntity<Map<String, Object>> getMe(@CookieValue(name = "JWT") String token) {
//     if (token == null || token.isEmpty()) {
//         return ResponseEntity.status(401).build();
//     }

    // vou ter de criar uma função que faça uma ponte entre o back end e o front para levar o token ao front sem ser  via cookie

    // Jwt jwt = jwtDecoder().decode(token); 

    // User user = userRepository.findById(UUID.fromString(jwt.getSubject()))
    //                           .orElseThrow();

    // Set<String> roles = user.getRoles().stream()
    //                         .map(r -> r.getName().toLowerCase())
    //                         .collect(Collectors.toSet());

    // return ResponseEntity.ok(Map.of(
    //         "username", user.getUsername(),
    //         "roles", roles
    // ));
// }

// }
