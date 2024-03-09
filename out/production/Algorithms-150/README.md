# Algorithms

Repo consists of various java programs that covers essential algorithms' concepts

### Arrays & Hashing
* Problem - think - description
* [Contains Duplicate](./ContainsDuplicate.java)
* [Valid Anagram](./ValidAnagram.java) - zero in scale - to check equality of counts, increment for one and decrement for other.
* [Two Sum](./TwoSum.java) - two pointers - sort and move pointers conditionally such that next iteration should be near to the result.
* [Group Anagrams](./GroupAnagrams.java) - generate identifier for each string to compare in O(n) - create map of key as identifier and value as possible anagrams; add key if doesn't exist and append if exists already.
* [K Frequent Elements](./KFrequentElements.java) - map -> priority queue -> poll k elements
* [Product Array Except Self](./ProductArrayExceptSelf.java)
* *[Valid Sudoku](./ValidSudoku.java) - O(n^2) - Frequency for all rows, columns, and 3x3 squares