package datn_quanlynhahang.controller;

import datn_quanlynhahang.model.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @PostMapping("/addUser")
    @ResponseBody
    public  UserDTO addNumner(@RequestBody UserDTO userDTO)
    {
        return userDTO;
    }


}
