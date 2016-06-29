package dayThree;

/**
 * Created by student on 29-Jun-16.
 */

interface Callback //like support service, need to call people back. Generic! Perfect example of POLYMORPHISM. one thing does many things.
{
    void callback(int param); // no implementation.
}



class Client implements Callback
{
    public void callback(int param)
    {
        System.out.println("Callback with a Limo!");
    }
}


class AnotherClient implements Callback
{
    public void callback(int param)
    {
        System.out.println("Callback without a Limo!");
    }
}

public class TestInterface {


}
