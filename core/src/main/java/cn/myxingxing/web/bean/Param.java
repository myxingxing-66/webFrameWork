package cn.myxingxing.web.bean;

import cn.myxingxing.web.util.CastUtil;

import java.util.Map;

/**
 * @Author: LiXing
 * @Description: 请求参数对象
 * @Date: Created in 18:09 18/1/27
 * @Modified By:
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 根据参数名获取long型参数值
     * @param name
     * @return
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取所有字段信息
     * @return
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }
}
