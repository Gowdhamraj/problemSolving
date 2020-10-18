package com.gow.problemsolving.problems;

import java.util.List;

/**
 * Simplified objective: Find the max total by making the array sum(odd)==sum(even)
 * @author gowdhamraj.ramaraj
 *
 */
public class GameOfMaximization {

	/**
	 * Returns the max number of stone that could be retrieved when
	 * odd and even numbered stones are equal.
	 * Expected input: List of integer showing the number of stones in each pile
	 * Expected output: count of maximum possible stone that could be retrieved by
	 * making the odd and even piles equal in number.
	 * 
	 * Example
	 * Input: [2,5,2]
	 * - 2 stones in 1st pile
	 * - 5 stones in 2nd pile
	 * - 2 stones in 3rd pile
	 * Output: 8
	 * Explanation:
	 * - count of stones in odd piles = 4
	 * - count of stones in even piles = 5
	 * - odd < even
	 * - remove 1 stone from even pile = 4
	 * - odd = even = 4
	 * - max count = 4+4 = 8  
	 * 
	 * @param listOfStonePiles
	 * @return int count
	 */
	public static int maximumStones(List<Integer> listOfStonePiles) {
		
		return fetchMaxStoneCount(listOfStonePiles);
	}

	private static int fetchMaxStoneCount(List<Integer> listOfStonePiles)
	{
		int oddCount = 0, evenCount = 0;
		
		for (int index=0; index < listOfStonePiles.size(); index++)
		{
			if (index % 2 == 0)
			{
				evenCount = evenCount + listOfStonePiles.get(index);
			}
			else
			{
				oddCount = oddCount + listOfStonePiles.get(index);
			}
		}

		if (evenCount == oddCount)
		{
			return evenCount + oddCount;
		}
		else if (oddCount < evenCount)
		{
			return oddCount*2;
		}
		else
		{
			return evenCount*2;
		}
	}
}
