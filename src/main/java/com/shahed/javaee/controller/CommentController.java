package com.shahed.javaee.controller;

import com.shahed.javaee.dtos.CommentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentController {


    @RequestMapping(value = "/api/comment", method = RequestMethod.POST)
    @ResponseBody
    public CommentDTO add(@RequestBody CommentDTO comment) {
        //https://www.petrikainulainen.net/programming/spring-framework/spring-from-the-trenches-adding-validation-to-a-rest-api/
        return comment;
    }
}
