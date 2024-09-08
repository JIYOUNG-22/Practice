package com.dyong.management.product.view;

import com.dyong.common.SearchCondition;
import com.dyong.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // 주석을 지우고 다음 네 가지 메소드를 작성하세요.

    /* 1. 전체 조회한 목록 출력하는 메소드 */
    public void printAllProductList(List<ProductDTO> productList) {

        //    (조건) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.
        for(ProductDTO product : productList) {
            System.out.println(product);
        }

    }

    /* 2. 조건에 따라 조회한 목록을 출력하는 메소드 */
    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        //    (조건 1) SearchCondition 객체로 검색 조건이 무엇인지 출력하세요.
        System.out.println("검색조건 : " + searchCondition.getOption() + " "
                +" 검색어 : " + searchCondition.getValue());
        //    (조건 2) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.
        for(ProductDTO product : productList) {
            System.out.println(product);
        }

    }

    /* 3. 성공메시지를 출력하는 메소드*/
    public void printSuccessMessage(String successCode) {

        //    (조건) 성공코드를 전달받아 성공을 알리는 메시지를 출력하세요.
        String successMessage = "";

        switch(successCode) {
            case "registProduct":
                successMessage = "제품 정보 등록에 성공했습니다."; break;
            case "updateProduct":
                successMessage = "제품 정보 수정에 성공했습니다."; break;
            case "deleteProduct":
                successMessage = "제품 정보 삭제에 성공했습니다."; break;
        }

        System.out.println(successMessage);
    }

    /* 4. 에러메시지를 출력하는 메소드 */
    public void printErrorMessage(String errorCode) {

        //    (조건) 에러코드를 전달받아 에러를 알리는 메시지를 출력하세요.
        String errorMessage = "";

        switch(errorCode) {
            case "selectList":
                errorMessage = "제품 목록 조회에 실패했습니다."; break;
            case "selectProductByCondition":
                errorMessage = "조건부 제품 목록 조회에 실패했습니다."; break;
            case "registProduct":
                errorMessage = "제품 정보 등록에 실패했습니다."; break;
            case "updateProduct":
                errorMessage = "제품 정보 수정에 실패했습니다."; break;
            case "deleteProduct":
                errorMessage = "제품 정보 삭제에 실패했습니다."; break;
        }

        System.out.println(errorMessage);

    }

}