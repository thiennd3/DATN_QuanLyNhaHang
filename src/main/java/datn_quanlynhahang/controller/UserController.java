package datn_quanlynhahang.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/Calculator/{id}")
    public  ResponseEntity<?> addNumner(@PathVariable int id)
    {
        System.out.println(id);
        return null;
    }
}
