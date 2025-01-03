package com.codewithsarvesh.ecom.controller;

import com.codewithsarvesh.ecom.dto.FakeStoreProductResponseDTO;
import com.codewithsarvesh.ecom.dto.ProductResponseDTO;
import com.codewithsarvesh.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/products")
    public  List<FakeStoreProductResponseDTO> getAllProducts(){
        List<FakeStoreProductResponseDTO> responseDTO = productService.getAllProducts();
        return responseDTO;
    }

    @GetMapping("/{id}")
    public ResponseEntity getProductById(@PathVariable("id") int id){
        FakeStoreProductResponseDTO responseDTO = productService.getProductById(id);
        return ResponseEntity.ok(responseDTO);
    }

}
