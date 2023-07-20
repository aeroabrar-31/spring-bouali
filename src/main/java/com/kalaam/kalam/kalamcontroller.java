package com.kalaam.kalam;

import com.kalaam.kalam.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping("employee")
public class kalamcontroller {

    @Autowired
    private employee emp;

//    @GetMapping("meth")
//    public String meth()
//    {
//        return "index.html";
//    }

    @RequestMapping (path="/kalam/src/processform",method = RequestMethod.POST)
    public String newmeth()
    {
       return "index.html";
    }
}
