package cn.myxingxing.test;

/**
 * @Author: LiXing
 * @Description:
 * @Date: Created in 16:44 18/1/28
 * @Modified By:
 */
public class HelloImpl implements Hello {
    @Override
    public void say(String name) {
        System.out.println("Hello! " + name);
    }
}
