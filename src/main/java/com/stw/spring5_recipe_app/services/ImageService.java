package com.stw.spring5_recipe_app.services;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Usuario
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
