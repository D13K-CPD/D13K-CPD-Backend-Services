package com.cpd.hotel_system.hotel_management_service_api.repository;

import com.cpd.hotel_system.hotel_management_service_api.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, String> {
}
