package cn.myxingxing.web;

import cn.myxingxing.web.annotation.Controller;
import cn.myxingxing.web.helper.*;
import cn.myxingxing.web.util.ClassUtil;

/**
 * @Author: LiXing
 * @Description: 加载相应的Helper类
 * @Date: Created in 17:16 18/1/27
 * @Modified By:
 */
public final class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IoCHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
