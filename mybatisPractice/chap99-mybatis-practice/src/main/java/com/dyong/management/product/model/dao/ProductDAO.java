package com.dyong.management.product.model.dao;

import com.dyong.management.product.model.dto.ProductDTO;

import java.util.List;

// * 주석을 지우고 Mapper interface(= DAO class) 역할을 하도록 내용을 작성하세요.
public interface ProductDAO {

    List<ProductDTO> selectAllProductList();



}