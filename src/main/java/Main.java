public class Main {
	public static void main(String[] args){
	int[] nums = new int[]{1, 1, 1, 1};
	int target = 2;

	System.out.println("Example one. Answer should be 1: " + solution(nums, target));

	}

	public static int solution(int[] nums, int target){

		// edge case - what if nums length is zero
		// return 0
		if(nums.length == 0){
			return 0;
		}

		// for loop - iterate through nums
		for(int i=0; i<nums.length; i++){

			// if - index is greater than or equal to target
			// return index
			if(nums[i] >= target){
				return i;
			}
		}

		// if you make it this far, all the elements are less than target
		// return nums.length to indicate this value should be added to the very end after all elements
		return nums.length;

	}
}
