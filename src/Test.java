public class Test {
    public static void main(String[] args){
        Proxy proxy = new ProxyImpl();

        //继承代理
//        ProxyExtends proxyExtends = new ProxyExtends(proxy);
//        proxyExtends.method();

        //接口实现代理
        ProxyImpl1 proxyImpl1 = new ProxyImpl1(proxy);
        proxyImpl1.method();

    }
}
