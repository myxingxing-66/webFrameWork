package cn.myxingxing.web.helper;

import cn.myxingxing.web.annotation.Inject;
import cn.myxingxing.web.util.ArrayUtil;
import cn.myxingxing.web.util.CollectionUtil;
import cn.myxingxing.web.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @Author: LiXing
 * @Description: 依赖注入助手类
 * @Date: Created in 16:21 18/1/27
 * @Modified By:
 */
public final class IoCHelper {

    static {
        //获取所有的Bean类与Bean实例之间的映射关系(简称Bean Map)
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            //遍历Bean Map
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                //从BeanMap中获取Bean类与Bean实例
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                //获取Bean类定义的所有成员变量(简称Bean Field)
                Field[] beanFields = beanClass.getDeclaredFields();
                if (ArrayUtil.isNotEmpty(beanFields)) {
                    //遍历Bean Field
                    for (Field field : beanFields) {
                        //判断当前Bean field是否带有Inject注解
                        if (field.isAnnotationPresent(Inject.class)) {
                            //在Bean Map中获取Bean Field对应的实例
                            Class<?> beanFieldClass = field.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if (beanFieldInstance != null) {
                                //通过反射初始化BeanField的值
                                ReflectionUtil.setField(beanInstance, field, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }

}
