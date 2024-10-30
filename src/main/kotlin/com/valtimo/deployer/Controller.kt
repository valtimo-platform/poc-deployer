package com.valtimo.deployer

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class Controller {

    @GetMapping("/index")
    fun index(): ModelAndView {
        val mav = ModelAndView("index")
        mav.addObject("introText", "Deployer")
        return mav
    }

    @GetMapping("/deploy")
    fun deploy() = ModelAndView("deploy")

    @GetMapping("/service-details")
    fun serviceDetails() = ModelAndView("service-details")

}
