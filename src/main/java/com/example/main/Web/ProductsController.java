package com.example.main.Web;

import com.example.main.Product;
import com.example.main.Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductsController {
  private final ProductService productService;

  public ProductsController(ProductService productService){
    this.productService = productService;
  }

  /*@RequestMapping("/products")*/
  @GetMapping("/products")
  public String viewProducts(Model model){
    var products = productService.findAll();
    model.addAttribute("products", products);

    return "products.html";
  }

  /*@RequestMapping(path = "/products", method = RequestMethod.POST)*/
  @PostMapping("/products")
  /*public String addProduct(@RequestParam String name, @RequestParam Double price, Model model) {
    Product p = new Product();
    p.setName(name);
    p.setPrice(price);*/
  public String addProduct(Product p, Model model) {
    productService.addProduct(p);

    var products = productService.findAll();
    model.addAttribute("products", products);

    return "products.html";
  }
}
