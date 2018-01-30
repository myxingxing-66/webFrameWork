package cn.myxingxing.web.annotation;

import java.lang.annotation.*;

/**
 * @Author: LiXing
 * @Description: 切面注解
 * @Date: Created in 16:43 18/1/29
 * @Modified By:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    /**
     * 注解
     *
     * @return
     */
    Class<? extends Annotation> value();

}
