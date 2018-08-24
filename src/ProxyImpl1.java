public class ProxyImpl1 implements Proxy{
    Proxy proxy;

    public ProxyImpl1(Proxy proxy) {
        this.proxy = proxy;
    }

    @Override
    public void method() {
        long start = System.currentTimeMillis();
        System.out.println("接口实现代理开始");
        proxy.method();
        System.out.println("接口实现代理结束");
        long end = System.currentTimeMillis();
        System.out.println("接口实现代理程序执行时间："+(end-start));
    }
}
