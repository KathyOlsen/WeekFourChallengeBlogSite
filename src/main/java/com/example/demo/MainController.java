package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/index")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/gitHub1")
    public String gitHub1(){
        return "gitHub1";
    }

    @RequestMapping("/gitHub2")
    public String gitHub2(){
        return "gitHub2";
    }

    @RequestMapping("/programDesignAlgorithms1")
    public String programDesignAlgorithms1(){
        return "programDesignAlgorithms1";
    }

    @RequestMapping("/programDesignAlgorithms2")
    public String programDesignAlgorithms2(){
        return "programDesignAlgorithms2";
    }

    @RequestMapping("/coreJava1")
    public String coreJava1(){
        return "coreJava1";
    }

    @RequestMapping("/coreJava2")
    public String coreJava2(){
        return "coreJava2";
    }

    @RequestMapping("/objectOrientedJava1")
    public String objectOrientedJava1(){
        return "objectOrientedJava1";
    }

    @RequestMapping("/objectOrientedJava2")
    public String objectOrientedJava2(){
        return "objectOrientedJava2";
    }

    @RequestMapping("/htmlCssBootstrap1")
    public String htmlCssBootstrap1(){
        return "htmlCssBootstrap1";
    }

    @RequestMapping("/htmlCssBootstrap2")
    public String htmlCssBootstrap2(){
        return "htmlCssBootstrap2";
    }

    @RequestMapping("/aboutBootcamp")
    public String aboutBootcamp(){
        return "aboutBootcamp";
    }

    @RequestMapping("/authorProfile")
    public String authorProfile(){
        return "authorProfile";
    }

}
