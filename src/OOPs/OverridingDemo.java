package OOPs;

class Car
{
    protected String engine()
    {
        return "1000";
    }
}

class Thar extends Car
{
    @Override
    public String engine() {
        return "2150";
    }

    private String model()
    {
        return "3 door model";
    }
}

public class OverridingDemo {
}
