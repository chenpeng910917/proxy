public class ProxyExtends extends ProxyImpl {

    Proxy proxy;
    public ProxyExtends(Proxy p) {
        super();
        this.proxy = p;
    }

    @Override
    public void method() {
        long start = System.currentTimeMillis();
        System.out.println("继承代理开始");
        proxy.method();
        System.out.println("继承代理结束");
        long end = System.currentTimeMillis();
        System.out.println("继承代理程序执行时间："+(end-start));
    }
}
