package cn.myxingxing.web.controller;

import cn.myxingxing.web.annotation.Action;
import cn.myxingxing.web.annotation.Controller;
import cn.myxingxing.web.bean.Data;
import cn.myxingxing.web.bean.Param;

import java.util.Map;

/**
 * @Author: LiXing
 * @Description:
 * @Date: Created in 16:02 18/1/30
 * @Modified By:
 */
@Controller
public class CustomerController {

    @Action("post:/customer_create")
    public Data createSubmit(Param param){

        return null;
    }
}
