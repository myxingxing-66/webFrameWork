package cn.myxingxing.web.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: LiXing
 * @Description: 返回视图对象
 * @Date: Created in 18:14 18/1/27
 * @Modified By:
 */
public class View {

    /**
     * 视图路径
     */
    private String path;

    /**
     * 模型数据
     */
    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        model = new HashMap<String, Object>();
    }

    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
