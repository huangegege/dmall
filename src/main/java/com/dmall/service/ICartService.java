package com.dmall.service;

import com.dmall.common.ServerResponse;
import com.dmall.vo.CartVo;

/**
 * Created by liuhuan on 2017/9/18.
 */
public interface ICartService {
    public ServerResponse<CartVo> list(Integer userId);
    public ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);
    public ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);
    public ServerResponse<CartVo> deleteProduct(Integer userId, String productIds);
    public ServerResponse<CartVo> selectOrUnSelect(Integer userId, Integer productId, Integer checked);
    public ServerResponse<Integer> getCartProductCount(Integer userId);
}
