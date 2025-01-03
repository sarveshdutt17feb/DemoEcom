package com.codewithsarvesh.ecom.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(String msg){
        super(msg);
    }
}
