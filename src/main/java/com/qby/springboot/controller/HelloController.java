package com.qby.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/hello")
    public Map<String, Object> map() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from t_employee");
        return maps.get(0);
    }
}
