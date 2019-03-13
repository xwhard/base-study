package standard.proxytest.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author:xwh
 * @date 2019/3/13 10:32
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    // ClassLoader loader    目标对象使用的类加载器
    // Class<?>[] interfaces 目标对象实现的所有接口
    // InvocationHandler h   指明产生的这个代理对象要做什么事情
    public Object getProxyInstance() {
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args)
                            throws Throwable {
                        String methodName = method.getName();
                        Object result = null;
                        if ("save".equals(methodName)) {
                            System.out.println("开启事务");
                            result = method.invoke(target, args);
                            System.out.println("关闭事务");
                        } else if ("find".equals(methodName)) {
                            result = method.invoke(target, args);
                        } else {

                        }
                        return result;
                    }
                }
        );
        return proxy;
    }
}


