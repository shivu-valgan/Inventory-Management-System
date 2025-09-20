package com.sk.InventoryMgmtSystem.repositories;

import com.sk.InventoryMgmtSystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}