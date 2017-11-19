package com.dmall.controller.portal;

import com.dmall.common.ServerResponse;
import com.dmall.service.IProductService;
import com.dmall.vo.ProductDetailVo;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuhuan on 2017/9/17.
 */

@Controller
@RequestMapping("/product")
public class ProductController {

    private Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private IProductService iProductService;

    @RequestMapping("detail.do")
    @ResponseBody
    public ServerResponse<ProductDetailVo> detail(Integer productId){
        return iProductService.getProductDetail(productId);
    }

    @RequestMapping("list.do")
    @ResponseBody
    public ServerResponse<PageInfo> list(@RequestParam(value = "keyword",required = false)String keyword,
                                         @RequestParam(value = "categoryId",required = false)Integer categoryId,
                                         @RequestParam(value = "property",required = false)Integer property,
                                         @RequestParam(value = "type",required = false)String type,
                                         @RequestParam(value = "discountLevel",required = false)Integer discountLevel,
                                         @RequestParam(value = "pageNum",defaultValue = "1")int pageNum,
                                         @RequestParam(value = "pageSize",defaultValue = "10")int pageSize,
                                         @RequestParam(value = "orderBy",defaultValue = "")String orderBy) {
        logger.info("property = " + property + " type = " + type);
        return iProductService.getProductByFields(keyword, categoryId, property, type, discountLevel, pageNum, pageSize, orderBy);
    }
}
