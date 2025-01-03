package com.codewithsarvesh.ecom.service;

import com.codewithsarvesh.ecom.dto.FakeStoreProductResponseDTO;
import com.codewithsarvesh.ecom.dto.ProductResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ProductService {
    List<FakeStoreProductResponseDTO> getAllProducts();
    FakeStoreProductResponseDTO getProductById(int id);
}
