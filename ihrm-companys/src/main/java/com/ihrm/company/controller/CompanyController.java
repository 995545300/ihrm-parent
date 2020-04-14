package com.ihrm.company.controller;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.company.service.CompanyService;
import com.ihrm.entity.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    /**
     * 保存企业信息
     * @param company
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    public Result add(@RequestBody Company company){
         companyService.add(company);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据企业id更新企业信息
     * @param id
     * @param company
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value = "id") String id, @RequestBody Company company){
        company.setId(id);
        companyService.update(company);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据企业id删除企业信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result update(@PathVariable(value = "id") String id){

        companyService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 根据企业id获取企业信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable(value = "id") String id){

        Company company = companyService.findById(id);
        return new Result(ResultCode.SUCCESS,company);
    }

    /**
     * 获取企业列表数据
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    public Result findAll(){

        List<Company> companys = companyService.findAll();
        return new Result(ResultCode.SUCCESS,companys);
    }

}
