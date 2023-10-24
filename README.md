# My Sorting Algorithm

The working principle of this algorithm is based on how many numbers in the array are greater or smaller than each element if sorting is to be performed within the array. This value is calculated for each element, and in each iteration, the index where an element should be placed is determined.

* We start with a while loop. This loop will continue until the entire array is sorted.
* Within the loop, we define two variables: "bigger" and "temp". bigger will hold the count of elements greater than the current element, and temp will be a temporary variable used for swapping elements.
* We print the array to the screen so that we can see how it changes with each step.
* Next, we calculate the number of elements smaller than the current element by comparing it with all other elements in the array and assign it to the bigger variable.
  ```java
      for (int number : numbers) {
                if (numbers[index] > number) bigger++;
            }
            if (index != bigger) {
                temp = numbers[bigger];
                numbers[bigger] = numbers[index];
                numbers[index] = temp;
            } else index++;
  ```

* If the index value is different from the bigger value, we have determined the actual index where the element should be placed.
*If the index and bigger values are equal, it means that the current element is already in the correct position, and we can proceed to the next element.
* The loop continues in this manner, and as all elements in the array are moved to their correct positions, the sorting process is completed.
----
In conclusion, this algorithm sorts the numbers within the array from small to large. Selection sort may become inefficient as the size of the dataset increases, and other more efficient sorting algorithms may be preferred. However, understanding and writing this algorithm is a valuable starting point.

![image](https://github.com/yusuf-sea/MySortingAlgorithm/assets/101550162/17a3f58e-cdc3-4566-8e87-a48ceaf81788)

