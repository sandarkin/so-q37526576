package com.sandarkin.so.q37526576;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;

@Controller
@RequestMapping("/default")
public class DefaultController {

  private final User user;

  public DefaultController() {
    this.user = new User("superuser", "secret", "superuser@mail.com");
  }

  @RequestMapping("/json")
  @ResponseBody
  public User getUserJson() {
    return this.user;
  }

  @RequestMapping(value = "/html", produces = "application/json")
  public ModelAndView getUserHtml(HttpServletResponse response) throws Exception {
    response.setContentType("application/json");
    return new ModelAndView("user", Collections.singletonMap("user", this.user));
  }
}
