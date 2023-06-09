package com.poly.datn.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListProductOfBrand {
    private Integer id;

    private String brandName;

    private String image;

    private Set<ProductOfBrandResponse> products = new LinkedHashSet<>();
}
