package com.bilgeadam.lesson028.recursive;

public class BinarySearch
{

	public static void main(String[] args)
	{
		int[] numbers = {10, 15, 24, 33, 37, 41, 44, 67, 96, 100};
		int leftIndex = 0;
		int rightIndex = 9;
		
		System.out.println(binarySearch(numbers, 33, leftIndex, rightIndex));

	}

	private static int binarySearch(int[] data, int searchedValue, int leftIndex, int rightIndex)
	{
		if (leftIndex > rightIndex)
		{
			return -1;
		}
		else
		{
			int mid = (leftIndex + rightIndex) / 2;
			
			if (searchedValue == data[mid])
			{
				return mid;
			}
			else if (searchedValue < data[mid])
			{
				return binarySearch(data, searchedValue, leftIndex, mid - 1);
			}
			else
			{
				return binarySearch(data, searchedValue, mid + 1, rightIndex);
			}
		}
	}

}
