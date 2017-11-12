package com.dmall.service;

import com.dmall.common.ServerResponse;
import com.dmall.pojo.Category;

import java.util.List;

/**
 * Created by liuhuan on 2017/9/7.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
