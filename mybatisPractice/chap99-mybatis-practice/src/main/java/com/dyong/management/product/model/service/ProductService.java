package com.dyong.management.product.model.service;

import com.dyong.common.SearchCondition;
import com.dyong.management.product.model.dao.ProductDAO;
import com.dyong.management.product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.dyong.common.Template.getSqlSession;

// Service 역할에 해당하는 메소드를 작성
public class ProductService {

    // 1. 자주 사용할 DAO 객체를 선언하세요.
    private ProductDAO productDAO;


    /* 2. 전체 제품 목록을 조회하는 로직을 작성하세요. */
    public List<ProductDTO> selectAllProductList() {

        SqlSession sqlSession = getSqlSession();

        productDAO = sqlSession.getMapper(ProductDAO.class);
        List<ProductDTO> productList = productDAO.selectAllProductList();

        sqlSession.close();

        return productList;

    }

    /* 3. 조건에 따른 제품 목록을 조회하는 로직을 작성하세요. */
    public List<ProductDTO> selectProductByCondition(SearchCondition searchCondition) {

        SqlSession sqlSession = getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> productList = productDAO.selectProductByCondition(searchCondition);

        sqlSession.close();

        return productList;

    }

    /* 4. 제품 정보를 등록하는 로직을 작성하세요. */
    public boolean registNewProduct(ProductDTO product) {

        SqlSession sqlSession = getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.insertProduct(product);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;

    }

    /* 5. 제품 정보를 수정하는 로직을 작성하세요. */
    public boolean modifyProductInfo(ProductDTO product) {

        SqlSession sqlSession = getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.updateProduct(product);

        if(result>0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result>0;

    }

    /* 6. 제품 정보를 삭제하는 로직을 작성하세요. */
    public boolean deleteProduct(Map<String, String> parameter) {

        int productCode = Integer.parseInt(parameter.get("productCode"));

        SqlSession sqlSession = getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.deleteProduct(productCode);

        if(result>0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        return result > 0;

    }
}
