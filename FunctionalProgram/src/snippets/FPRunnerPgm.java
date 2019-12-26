package snippets;

import java.util.List;

public class FPRunnerPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(10, 12, 3, 45, 490, 50);
		nums.stream().forEach(element -> System.out.println(element));

		System.out.println("Sum is");
		int sum = sumOfIntFP(nums);
		System.out.println(sum);
		//normalSum(nums);
	}

	private static int sumOfIntFP(List<Integer> nums) {
		return nums.stream().reduce(0, (number1, number2) ->
		{
			System.out.println(number1 +  " " + number2);
			return number1 + number2;
		}
				);
	}

	private static void normalSum(List<Integer> nums) {
		int sum = 0;
		for (Integer num : nums) {
			sum = sum + num;
		}
		System.out.println(sum);
	}

}
