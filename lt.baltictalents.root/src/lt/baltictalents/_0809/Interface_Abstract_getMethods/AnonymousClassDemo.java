package lt.baltictalents._0809.Interface_Abstract_getMethods;

class AnonymousClassDemo {
    public static void main(String[] args) {
        InterfaceForAnonymous i = new InterfaceForAnonymous() {
            @Override
            public void helloInterface() {
                System.out.println("Anonymous from interface");
            }
        };
        i.helloInterface();

        AbstractClassForAnonymous a = new AbstractClassForAnonymous() {
            @Override
            void helloAbstract() {
                System.out.println("Anonymous from abstract");
            }
        };
        a.helloAbstract();
    }
}
