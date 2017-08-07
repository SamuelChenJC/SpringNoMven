package com.chen.contro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Chenpi on 2017/8/3.
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = "/printHello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "chenjincai");
        return "hello";
    }

    // @RequestMapping("/modelAndView")
    // public ModelAndView printModelAndView(HttpServletRequest request, HttpServletResponse response) {
    //
    //     ModelAndView modelAndView = new ModelAndView();
    //
    //     modelAndView.addObject("message", "ModelAndView Hello World");
    //     modelAndView.setViewName("modelview");
    //
    //     return modelAndView;
    // }
}
