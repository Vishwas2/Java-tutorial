package Day_079_Hashing_in_Java;
// Hashing is a technique to convert key-value pairs into indices
// For example : we want to add the elements 72, 39, 11, 18 in array, so we can divide them by 10. We the elements are divided
// by 10 the remainders are : 2, 9, 1 and 8 respectively now we can store 72 at index 2, 39 at index 9 and so on. This makes searching very fast.
// But you might be wondering that what if we also want to add 21 in the array. Dividing 21 by 10 gives 1 as remainder so should
// we add 11 or 21 to the index 1. This problem is known as hash collision. You can create a LinkedList or chaining to solve this issue.

// Load Factor - how full the hash table is allowed to get before its capacity is automatically increased.
/*
Some of the important classes for hashing are :
1. HashSet
2. HashMap
3. LinkedHashMap
4. HashTable
 */