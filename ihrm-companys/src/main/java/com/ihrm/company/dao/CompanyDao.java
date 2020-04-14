package com.ihrm.company.dao;

import com.ihrm.entity.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 企业数据访问接口
 * JpaRepository提供了基本的增删改查
 * JpaSpecifificationExecutor用于做复杂的条件查询
 */
public interface CompanyDao  extends JpaRepository<Company, String>,
        JpaSpecificationExecutor<Company> {
}
