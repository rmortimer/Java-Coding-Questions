package afterCall;

public class Kadanes {

	public static int maxContSubArray (int [] numbers){
		int max_so_far = 0;
        int max_ending_here = 0;
        for (int i = 0; i < numbers.length-1;i++){
             max_ending_here = max_ending_here +numbers[i];
             if (max_ending_here < 0)
                 max_ending_here = 0;
             if (max_so_far < max_ending_here)
                  max_so_far = max_ending_here;
        }
		return max_so_far;
	}
}
