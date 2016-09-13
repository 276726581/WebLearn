package com.timogroup.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by TimoRD on 2016/9/12.
 */
@Controller
@RequestMapping
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> index() {
        Map<String, String> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }
}
