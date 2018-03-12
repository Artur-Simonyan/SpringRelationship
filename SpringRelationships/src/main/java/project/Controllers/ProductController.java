package project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import project.models.ProductModel;
import project.repository.departmentRepository.CRUDdepartmentImpl;
import project.repository.productRepository.CRUDproductImpl;

@Controller
public class ProductController {
    @Autowired
    CRUDproductImpl cruDproduct;
    @Autowired
    CRUDdepartmentImpl cruDdepartment;


    @RequestMapping(value = "addProduct",method = RequestMethod.GET)
    public ModelAndView addProduct(){
        return new ModelAndView ( "addProduct","addProduct",new ProductModel () );
    }

    @RequestMapping(method = RequestMethod.POST,value = "addProduct")
    public ModelAndView addProduct( @ModelAttribute("addProduct") ProductModel productModel,
                                    @ModelAttribute("addProduct") ProductModel departmantModel){
        cruDproduct.save ( productModel );
        cruDproduct.save ( departmantModel );
        return new ModelAndView ( "redirect:/addInfo" );
    }

    @RequestMapping(method = RequestMethod.GET,value = "delete/{id}")
    public ModelAndView delete(@PathVariable("id") int id ){
        cruDproduct.delete ( cruDproduct.find ( id ) );
        return new ModelAndView ( "redirect:/product" );
    }
    @RequestMapping(method = RequestMethod.GET,value = "edit/{id}")
    public ModelAndView edit(@PathVariable("id") int id){
        ProductModel productModel=cruDproduct.find ( id );
        return new ModelAndView (  "editProduct","productModel",productModel);
    }

    @RequestMapping(method = RequestMethod.POST,value = "edit")
    public ModelAndView edit(@ModelAttribute ProductModel productModel,
                             @ModelAttribute ProductModel departmantModel){
        ProductModel correntProductName = cruDproduct.find ( productModel.getProductId () );
        correntProductName.setProductName (productModel.getProductName ()  );
        correntProductName.setDepartmantForProduct (departmantModel.getDepartmantForProduct () );
        cruDproduct.save (  correntProductName);
        cruDproduct.save ( departmantModel );
        return new ModelAndView ( "redirect:/product" );
    }

}
