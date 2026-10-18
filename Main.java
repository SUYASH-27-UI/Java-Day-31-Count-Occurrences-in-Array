public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 10, 30, 10, 40};
        int search = 10;
        int count = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == search)
            {
                count++;
            }
        }

        System.out.println("Number: " + search);
        System.out.println("Occurrences: " + count);
    }
}
