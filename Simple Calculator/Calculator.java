public class Calculator
{
    public int	add(int a, int b)
    {
        return (a + b);
    }

    public int	sub(int a, int b)
    {
        return (a - b);
    }

    public int	mul(int a, int b)
    {
        return (a * b);
    }

    public int	div(int a, int b) throws Exception
    {
        if (b == 0)
            throw new Exception();
        return (a / b);
    }

    public int	mod(int a, int b) throws Exception
    {
        if (b == 0)
            throw new Exception();
        return (a % b);
    }
}
