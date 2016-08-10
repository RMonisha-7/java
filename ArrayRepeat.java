package Num;

public class ArrayRepeat {

	public static void main(String[] args) {
		int max=0;
		int[] numArray = new int[] { 1,2,8,9,8 };

        for (int i = 0; i < numArray.length; i++)
        {
            for (int j = i+1 ; j < numArray.length; j++)
            {
                if (numArray[i] == numArray[j])
                {
                    max=numArray[i];
                }
            }
           
			System.out.println(max);

	}

	}
}
