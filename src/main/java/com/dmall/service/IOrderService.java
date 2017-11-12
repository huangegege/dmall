package com.dmall.service;

import com.dmall.common.ServerResponse;
import com.dmall.vo.OrderVo;
import com.github.pagehelper.PageInfo;

import java.util.Map;

/**
 * Created by liuhuan on 2017/9/20.
 */
public interface IOrderService {
    public ServerResponse createOrder(Integer userId, Integer shippingId);
    public ServerResponse cancel(Integer userId, Long orderNo);
    public ServerResponse getOrderCartProduct(Integer userId);
    public ServerResponse<OrderVo> getOrderDetail(Integer userId, Long orderNo);
    public ServerResponse<PageInfo> getOrderList(Integer userId, int pageNum, int pageSize);
    public ServerResponse pay(Long orderNo, Integer userId, String path);
    public ServerResponse aliCallback(Map<String, String> params);
    public ServerResponse queryOrderPayStatus(Integer userId, Long orderNo);



    //backend
    public ServerResponse<PageInfo> manageList(int pageNum, int pageSize);
    public ServerResponse<OrderVo> manageDetail(Long orderNo);
    public ServerResponse<PageInfo> manageSearch(Long orderNo, int pageNum, int pageSize);
    public ServerResponse<String> manageSendGoods(Long orderNo);
}
