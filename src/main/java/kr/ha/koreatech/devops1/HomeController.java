package kr.ha.koreatech.devops1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
  @GetMapping("/")
  public String getMethodName(@RequestParam String param) {
      return "index.html";
  }
  
}
