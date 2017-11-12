package com.dmall.service;

import com.dmall.common.ServerResponse;
import com.dmall.pojo.Product;
import com.dmall.vo.ProductDetailVo;
import com.github.pagehelper.PageInfo;

/**
 * Created by liuhuan on 2017/9/16.
 */
public interface IProductService {
    public ServerResponse saveOrUpdateProduct(Product product);
    public ServerResponse setSaleStatus(Integer prodoctId, Integer status);
    public ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
    public ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);
    public ServerResponse<PageInfo> searchProduct(String productName, Integer productId, int pageNum, int pageSize);
    public ServerResponse<ProductDetailVo> getProductDetail(Integer productId);
    public ServerResponse<PageInfo> getProductByKeywordCategory(String keyword, Integer categoryId, int pageNum, int pageSize, String orderBy);
}
