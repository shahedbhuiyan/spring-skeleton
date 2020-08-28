package com.shahed.javaee.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/datetime/")
final class DateTimeController {

    @RequestMapping(value = "date", method = RequestMethod.GET)
    public LocalDate processDate(@RequestParam("date") LocalDate date) {
        return date;
    }

    //datetime=2020-01-31T16:30:55.989
    @RequestMapping(value = "datetime", method = RequestMethod.GET)
    public LocalDateTime processDateTime(@RequestParam("datetime") LocalDateTime dateAndTime) {
        return dateAndTime;
    }

    @RequestMapping(value = "datetimeWithAnnotation", method = RequestMethod.GET)
    public LocalDateTime processDateTimeWithAnnotation(@RequestParam("datetime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDateTime dateAndTime) {
        ////https://www.petrikainulainen.net/programming/spring-framework/spring-from-the-trenches-parsing-date-and-time-information-from-a-request-parameter/
        return dateAndTime;
    }
}
