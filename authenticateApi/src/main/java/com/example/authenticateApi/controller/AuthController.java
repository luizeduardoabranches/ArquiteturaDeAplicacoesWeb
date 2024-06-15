package com.example.authenticateApi.controller;
import com.example.authenticateApi.model.LoginRequest;
import com.example.authenticateApi.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        String token = authService.generateToken(request.getUsername());
        return token;
    }

    @GetMapping("/username/{token}")
    public String extractUsername(@PathVariable String token) {
        String username = authService.extractUsername(token);
        return username;
    }

    // Qualquer um irá acessar
    @GetMapping("/comum")
    public String getUser(Authentication authentication) {
        return "Usuário comum: " + authentication.getName();
    }

    // Somente o admin irá acessar
    @Secured("ADMIN")
    @GetMapping("/admin")
    public String onlyAdmin(Authentication authentication) {
        return "Usuário admin: " + authentication.getName();
    }

    // Somente o moderador irá acessar
    @Secured("MODERADOR")
    @GetMapping("/moderador")
    public String onlyMod(Authentication authentication) {
        return "Usuário moderador: " + authentication.getName();
    }
}
