package com.codewithsarvesh.ecom.exception;

import com.codewithsarvesh.ecom.controller.ProductController;
import com.codewithsarvesh.ecom.dto.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackageClasses = ProductController.class)
public class ProductControllerExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity noProductExceptionHandler(ProductNotFoundException pe){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                pe.getMessage(),404
        );
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);

    }
}
