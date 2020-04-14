package com.ihrm.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
/**
 * 分页
 *      {
 *          “success”：“成功”，
 *          “code”：10000
 *          “message”：“ok”，
 *          ”data“：{
 *              total：//总条数
 *              rows ：//数据列表
 *          }
 *      }
 *
 *
 */
@Data
@NoArgsConstructor
public class PageResult<T> {
    public Long total;
    private List<T> rows;
}
