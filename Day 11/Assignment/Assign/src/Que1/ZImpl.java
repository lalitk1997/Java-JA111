package Que1;

public class ZImpl implements Z{
    @Override
    public void funcAbstractX() {
        System.out.println("public void funcAbstractX()... class ZImpl... @Override");
    }

    @Override
    public void funcAbstractY() {
        System.out.println("public void funcAbstractY()... class ZImpl... @Override");
    }

    @Override
    public void funcAbstractZ() {
        System.out.println("public void funcAbstractZ()... class ZImpl... @Override");
    }

    @Override
    public void funcDefaultX() {
        System.out.println("public void funcDefaultX()... @Override");
    }
}
