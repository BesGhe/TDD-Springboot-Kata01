package com.codedifferently.phonebook.people.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people") //all other mapping would be /people/ ??
public class PersonController {
    //autowired, get all, get individual, post one, delete, put(update)

   // @Autowired - Why services instead of repos?

    //@GetMapping("") so it's only /people to show everyone




}
