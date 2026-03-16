package com.dream.dreamshops.service.image;

import com.dream.dreamshops.dto.ImageDto;
import com.dream.dreamshops.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List <ImageDto> saveImages(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);

}
