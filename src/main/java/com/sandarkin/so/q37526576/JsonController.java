package com.sandarkin.so.q37526576;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;

@RestController
@RequestMapping("/rest")
public class JsonController {

  private final User user;

  public JsonController() {
    this.user = new User("superuser", "secret", "superuser@mail.com");
  }

  @RequestMapping("/json")
  public User getUserJson() {
    return this.user;
  }

  @RequestMapping(value = "/html")
  public ModelAndView getUserHtml(HttpServletResponse response) throws Exception {
    response.setContentType("application/json");
    return new ModelAndView("user", Collections.singletonMap("user", this.user));
  }
}
