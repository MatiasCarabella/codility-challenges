## Task description

Given an array of integers, write a function:

public boolean solution(int[] arr);

that returns true if there are two consecutive integers in the array. The two integers don’t need to be next to each other in the array, but they must be consecutive in value (i.e., one is the predecessor or successor of the other). If there are no such integers, the function should return false.

For example, given the array [1, 7, 9, 4, 5], the function should return true, because there are two consecutive integers in the array: 4 and 5. Given the array [1, 3, 5, 7], the function should return false, because there are no two consecutive integers in the array.

Write an efficient algorithm for the following assumptions:

The length of the array is within the range [1..100,000].
Each element of the array is an integer within the range [1,000,000]