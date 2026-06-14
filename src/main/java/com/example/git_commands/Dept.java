package com.example.git_commands;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Dept {

  public String getName() {
    return "Information Technology";
}
