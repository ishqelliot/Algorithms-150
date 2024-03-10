# Algorithms

Repo consists of various java programs that covers essential algorithms' concepts

* Problem - think - description
### Arrays & Hashing
* [Contains Duplicate](./ContainsDuplicate.java)
* [Valid Anagram](./ValidAnagram.java) - zero in scale - to check equality of counts, increment for one and decrement for other.
* [Two Sum](./TwoSum.java) - two pointers - sort and move pointers conditionally such that next iteration should be near to the result.
* [Group Anagrams](./GroupAnagrams.java) - generate identifier for each string to compare in O(n) - create map of key as identifier and value as possible anagrams; add key if doesn't exist and append if exists already.
* [K Frequent Elements](./KFrequentElements.java) - map -> priority queue -> poll k elements
* [Product Array Except Self](./ProductArrayExceptSelf.java)
* [Valid Sudoku](./ValidSudoku.java) - O(n^2) - Frequency for all rows, columns, and 3x3 squares
* [Longest Consecutive](./LongestConsecutive.java) - to make O(n) -> hash set - copy all numbers to hashset, iterate over hashset, check if previous number of current does not exist to make sure starting point of sequence then iterate over inner loop to get max sequence length.

Notes -
* Why Strings are immutable in Java?
  * Caching - String are stored in string pool and follow interning. JVM optimizes memory allocation for by storing only distinct copies of string such that different string variables refer to same object in string pool.
  * Security - By being immutable we are sure when strings are passed around, the sources won't have access to reference.
  * Synchronization - By being immutable strings inherently are thread safe
### Two Pointers
* [Valid Palindrome](./ValidPalindrome.java) - - iterate simultaneously from start and end of string and compare each character.
* [Two Sum II](./TwoSumII.java) - simpler variant of actual two sum.

### Stacks
* [Valid Parentheses](./ValidParentheses.java) - use single stack to insert one of the type of parentheses and pop whenever pair is found while iterating over string
* [Min Stack](./MinStack.java) - every node will contain minimum until current node - while add compare if same global min is to be used or should update local node min and global min, while pop if required update global min with the latest current min on top.