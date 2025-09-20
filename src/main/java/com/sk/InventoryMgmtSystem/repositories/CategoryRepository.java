package com.sk.InventoryMgmtSystem.repositories;

import com.sk.InventoryMgmtSystem.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
