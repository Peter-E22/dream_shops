package com.dream.dreamshops.dto;

import lombok.Data;

@Data
public class ImageDto {
    private Long imageId;
    private String imageName;
    private String description;
    private String downloadUrl;

    public void setId(Long id) {
        
    }
}
