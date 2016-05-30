package com.sandarkin.so.q37526576;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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

  @RequestMapping(value = "/html", produces = "text/html")
  public ModelAndView getUserHtml() throws Exception {
    return new ModelAndView("user", Collections.singletonMap("user", this.user));
  }
}
