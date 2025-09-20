package com.sk.InventoryMgmtSystem.services;

import com.sk.InventoryMgmtSystem.dtos.CategoryDTO;
import com.sk.InventoryMgmtSystem.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
