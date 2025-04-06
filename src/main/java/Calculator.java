public class Calculator
{
    public int add(int FirstNum, int SecondNum)
    {
        long result = (long) FirstNum + SecondNum;
        if (result > Integer.MAX_VALUE)
        {
            throw new IllegalArgumentException("Input is too large");
        }
        return (int) result;
    }
}
