package project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import project.models.infoModel;
import project.repository.infoRepository.CRUDinfoImpl;
import project.repository.productRepository.CRUDproductImpl;

@Controller
public class InfoController {
    @Autowired
    CRUDproductImpl cruDproduct;
    @Autowired
    CRUDinfoImpl cruDinfo;

    @RequestMapping(value = "addInfo",method = RequestMethod.GET)
    public ModelAndView addInfo(){
        return new ModelAndView ( "addInfo","addInfo",new infoModel () );
    }

    @RequestMapping(method = RequestMethod.POST,value = "addInfo")
    public ModelAndView addInfo( @ModelAttribute("addInfo") infoModel price,
                                 @ModelAttribute("addInfo") infoModel quanity,
                                 @ModelAttribute("addInfo") infoModel date){
        cruDinfo.save ( price );
        cruDinfo.save ( quanity );
        cruDinfo.save ( date );
        return new ModelAndView ( "redirect:/info" );
    }

    @RequestMapping(method = RequestMethod.GET,value = "deleteInfo/{id}")
    public ModelAndView delete(@PathVariable("id") int id ){
        cruDinfo.delete ( cruDinfo.find ( id ) );
        return new ModelAndView ( "redirect:/info" );
    }
    @RequestMapping(method = RequestMethod.GET,value = "editInfo/{id}")
    public ModelAndView edit(@PathVariable("id") int id){
        infoModel infoModel=cruDinfo.find ( id );
        return new ModelAndView (  "editInfo","infoModel",infoModel);
    }

    @RequestMapping(method = RequestMethod.POST,value = "editInfo")
    public ModelAndView edit(@ModelAttribute infoModel infoModel){
        infoModel correntinfo = cruDinfo.find (infoModel.getInfoId () );
        correntinfo.setPrice (infoModel.getPrice ()  );
        correntinfo.setQuanity (infoModel.getQuanity () );
        cruDinfo.save (  infoModel);
        return new ModelAndView ( "redirect:/info" );
    }

}
