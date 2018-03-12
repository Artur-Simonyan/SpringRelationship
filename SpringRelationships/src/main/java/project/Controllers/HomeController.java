package project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import project.repository.infoRepository.CRUDinfoImpl;
import project.repository.productRepository.CRUDproductImpl;
import project.repository.staffRepository.CRUDinterfaceImplementation;


@Controller
public class HomeController {
    @Autowired
    CRUDinterfaceImplementation crud;
    @Autowired
    CRUDproductImpl cruDproduct;
    @Autowired
    CRUDinfoImpl cruDinfo;

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }
    @RequestMapping(value = "/staff")
    public ModelAndView staffpage(){
        return new ModelAndView ( "staff", "infos",crud.findAll());
    }
    @RequestMapping(value = "/staffSalary")
    public ModelAndView salarypage(){
        return new ModelAndView ( "staffSalary","salaryinfo",crud.findAll () );
    }
    @RequestMapping(value = "/product")
    public ModelAndView productpage(){
        return new ModelAndView ( "product","productinfo",cruDproduct.findAll () );
    }
    @RequestMapping(value = "/info")
    public ModelAndView infopage(){
        return new ModelAndView ( "info","inf",cruDinfo.findAll () );
    }

}
