package com.example.sprint_2_api.dto.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailResponse {
    private IProductDetail product;
    private List<IImageDto> images;
}
