package com.codewithsarvesh.ecom.service;

import com.codewithsarvesh.ecom.client.FakeStoreClient;
import com.codewithsarvesh.ecom.dto.FakeStoreProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("fakeStoreProductService")
public class FakeStoreClientServiceImpl implements ProductService{
    @Autowired
    private FakeStoreClient fakeStoreClient;
    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {

        List<FakeStoreProductResponseDTO> products =  fakeStoreClient.getAllProducts();
        return products;
    }

    @Override
    public FakeStoreProductResponseDTO getProductById(int id) {
        return fakeStoreClient.getProductById(id);
    }
}
