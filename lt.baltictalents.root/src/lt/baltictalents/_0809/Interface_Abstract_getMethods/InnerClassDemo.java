package lt.baltictalents._0809.Interface_Abstract_getMethods;

public class InnerClassDemo {
    public static void main(String[] args){
        //pasiekiami vidiniu klasiu metodai
        //1
        ContainerClass container = new ContainerClass();
        ContainerClass.InnerClass inner = container.new InnerClass();
        inner.hello();

        //2
        ContainerClass.InnerClass inner2 = new ContainerClass().new InnerClass();
        inner2.hello();
    }
}
