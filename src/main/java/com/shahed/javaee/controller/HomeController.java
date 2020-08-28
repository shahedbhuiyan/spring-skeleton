package com.shahed.javaee.controller;

import com.shahed.javaee.dtos.Account;
import com.shahed.javaee.dtos.Person;
import com.shahed.javaee.dtos.ResponseMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/home")
public class HomeController extends BaseController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("message", "Spring MVC Java Configuration Example");
        System.out.println(getPropertyValue("project.author.name"));
        return "home";
    }

    @ResponseBody
    @GetMapping(value = "/toResponse")
    public ResponseMessage toResponse(){
        return new ResponseMessage();
    }

    @ResponseBody
    @GetMapping(value = "/argumentHandler")
    public Account argumentHandler(Account account){
        /*Map<String,Account> response = new HashMap<String, Account>();
        response.put("data",account);*/
        return account;
    }

    @ResponseBody
    @RequestMapping(value = "/saveObj", method = RequestMethod.POST)
    public Person savePerson(@RequestBody Person person){
        return person;
    }

    @ResponseBody
    @RequestMapping(value = "/saveObj", method = RequestMethod.GET)
    public Person getPerson(Person person){
        return person;
    }

    @RequestMapping(value = "/jquery", method = RequestMethod.GET)
    public String getJquery(){
        return "jquery";
    }

    @RequestMapping(value = "/angular", method = RequestMethod.GET)
    public String getAngular(){
        return "angular";
    }

    @RequestMapping(value = "/vue", method = RequestMethod.GET)
    public String getVue(){
        return "vue";
    }


    //Implementing JPA without hibernate query
    //different jpa Native queries
    //different types of object mapper
    //REST template different types of request
    //ajax different types of request
    //mapping nested json to object
    //https://mkyong.com/java/jackson-2-convert-java-object-to-from-json/
    //https://mkyong.com/spring-mvc/spring-mvc-refactoring-a-jquery-ajax-post-example/
    //https://lankydan.dev/2017/03/11/passing-data-transfer-objects-with-get-in-spring-boot
    //https://www.javacodegeeks.com/2018/10/how-bind-requestparam-object-spring.html
    //configuring AOP
    //writing CTE, RANK, OVER, PARTITION BY
    //sql statement logging
    //writing log into files

    //JPA relationship
    //Writing JPQL for sami complex query -- https://thoughts-on-java.org/query-complex-jpa-hibernate/
    //https://thoughts-on-java.org/jpa-native-queries/
    //https://vladmihalcea.com/why-you-should-use-the-hibernate-resulttransformer-to-customize-result-set-mappings/
    //https://thoughts-on-java.org/dto-projections/
}
