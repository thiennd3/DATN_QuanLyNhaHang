package datn_quanlynhahang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
    @GetMapping("/home")
    public String gethome()
    {
        return "index";
    }
}
