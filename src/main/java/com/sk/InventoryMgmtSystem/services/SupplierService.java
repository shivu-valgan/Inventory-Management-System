package com.sk.InventoryMgmtSystem.services;
import com.sk.InventoryMgmtSystem.dtos.Response;
import com.sk.InventoryMgmtSystem.dtos.SupplierDTO;

public interface SupplierService {

    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);

}
