package com.shahed.javaee.controller;

import com.shahed.javaee.dtos.FieldItem;
import com.shahed.javaee.entity.Person;
import com.shahed.javaee.service.VueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class VueController {

    @Autowired
    private VueService vueService;

    @RequestMapping(value = "/vue/save", method = RequestMethod.GET)
    public void save(){
        Person person = new Person();
        person.setFirstName("Mahtab");
        person.setLastName("Uddin Shahed");
        person.setEmail("shahedbhuiyan.uiu@live.com");
        vueService.save(person);
    }

    @RequestMapping(value = "/vue/js/index", method = RequestMethod.GET)
    public String index(){
        return "vue";
    }

    @ResponseBody
    @RequestMapping(value = "/get/dynamic/field/list", method = RequestMethod.GET)
    public List<FieldItem> getDynamicFieldList(){
        return vueService.getDynamicFieldList();
    }

}
