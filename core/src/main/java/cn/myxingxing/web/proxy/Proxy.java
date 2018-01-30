package cn.myxingxing.web.proxy;

/**
 * @Author: LiXing
 * @Description:
 * @Date: Created in 16:43 18/1/29
 * @Modified By:
 */
public interface Proxy {

    /**
     * 执行链式代理
     *
     * @param proxyChain
     * @return
     * @throws Throwable
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;

}
