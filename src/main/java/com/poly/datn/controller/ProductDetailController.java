package com.poly.datn.controller;

import com.poly.datn.dto.request.ProductDetailRequest;
import com.poly.datn.dto.response.ProductDetailResponse;
import com.poly.datn.service.ProductDetailService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.poly.datn.controller.router.Router.API.BASE;
import static com.poly.datn.controller.router.Router.API.PRODUCT_DETAIL;

@RestController
@RequestMapping(BASE +PRODUCT_DETAIL)
@RequiredArgsConstructor
@Tag(name = BASE +PRODUCT_DETAIL)
public class ProductDetailController {
    private final ProductDetailService productDetailService;

    @PostMapping
    ResponseEntity<ProductDetailResponse> getProductDetailService(@Valid @RequestBody ProductDetailRequest request) {
        ProductDetailResponse productDetailResponse = productDetailService.getProductDetail(request);
        return ResponseEntity.ok(productDetailResponse);
    }
}
