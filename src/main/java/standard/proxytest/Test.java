package standard.proxytest;

import standard.proxytest.dynamicproxy.ProxyFactory;

/* *******代理模式**********
 * 未代理之前，A要做一件事情由A自己去做，由B去代理以后，A要做事，由A的代理类B去做。
 * 作用：1.拦截对真实对象的访问 2.代理对象必须和目标对象有相同的方法
 * 可分为 静态代理 和 动态代理。
 * (1) 静态代理:程序运行前就已经存在代理类的字节码文件，代理类和原始类的关系在运行前就已经确定。
 * 特点：
 * 1. 目标对象必须要实现接口
 * 2. 代理对象，要实现与目标对象一样的接口，并在类中维护一个代理对象。
 * 3. 通过构造器塞入目标对象，赋值给代理对象，进而执行代理对象实现的接口方法，并实现前拦截，后拦截等所需的业务功能。
 * 静态代理虽然保证了业务类只需关注逻辑本身，代理对象的一个接口只服务于一种类型的对象。如果要代理的方法很多，势必要为每一种方法都进行
 * 代理。再者，如果增加一个方法，除了实现类需要实现这个方法外，所有的代理类也要实现此方法，增加了代码的维护成本。
 * (2) 动态代理：动态代理类的源码是在程序运行期间，通过JVM反射等机制动态生成，代理类和委托类的关系是运行时才确定的。
 *
 * *******AOP******
 * 1.AOP 是基于动态代理模式。
 * 2.AOP 是方法级别的。
 * 3.AOP 可以分离业务代码和关注点代码（重复代码），在执行业务代码时，动态的注入关注点代码，切面就是关注点代码形成的类。
 * 使用JDK生成的动态代理的前提是目标类必须有实现的接口。
 * 但这里又引入一个问题，如果某个类没有实现接口，就不能使用 JDK 动态代理。
 * cglib代理就是解决这个问题的。
 * cglib使用的前提是目标类不能为 final 修饰。因为 final 修饰的类不能被继承。
 * 面向切面编程，核心原理是使用动态代理模式在方法执行前后或出现异常时加入相关逻辑。
 * 如果有接口,则使用jdk代理，反之使用cglib。
 * 如果目标类没有实现接口,且class为final修饰的，则不能进行SpringAOP编程！
 */

/**
 * @author:xwh
 * @date 2019/3/13 8:29
 */
public class Test {
    public static void main(String[] args) {
        //静态代理
//        IUserDao staticProxy = new UserDaoProxy();
//        staticProxy.find();
        //动态代理
        IUserDao target= new UserDao();
        System.out.println("目标对象"+target.getClass());
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("代理对象"+proxy.getClass());
        proxy.save();
        //
    }
}
