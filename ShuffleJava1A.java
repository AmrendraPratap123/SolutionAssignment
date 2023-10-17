import java.util.*;
public class ShuffleJava1A
{
    private static void shuffleArray(int[] array)
    {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
}
	public static void main(String[] args) {
	
	int[] arr={4,34,5,6,2,4,5};
	shuffleArray(arr);
	for(int i=0;i<arr.length;i++){
	    System.out.print(arr[i]+" ");
	}
	}
}


