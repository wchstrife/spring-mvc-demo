package app03a.controller;

        import app03a.domain.Product;
        import app03a.form.ProductForm;
        import app03a.service.ProductService;
        import org.apache.commons.logging.Log;
        import org.apache.commons.logging.LogFactory;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.servlet.ModelAndView;
        import org.springframework.web.servlet.mvc.Controller;
        import org.springframework.web.servlet.mvc.support.RedirectAttributes;

        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;

/**
 * Created by wangchenghao on 2017/7/20.
 */
@org.springframework.stereotype.Controller
public class ProductController {

    private static final Log logger = LogFactory.getLog("ProductController.class");

    @Autowired
    private ProductService productService;

    @RequestMapping("/product_input")
    public String inputProduct(){
        logger.info("inputProduct calles");
        return "ProductForm";
    }

    @RequestMapping(value = "/product_save", method = RequestMethod.POST)
    public String saveProduct(ProductForm productForm, RedirectAttributes redirectAttributes){
        logger.info("saveProduct called");

        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try{
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        //添加到实体类

        Product saveProduct = productService.add(product);

        redirectAttributes.addFlashAttribute("message", "The product was successfully added");

        return "redirect:/product_view/" + saveProduct.getId();
    }

    @RequestMapping("/product_view/{id}")
    public String viewProduct(@PathVariable Long id, Model model){
        Product product = productService.get(id);
        model.addAttribute("product", product);

        return "ProductView";
    }


}



