package Day_011_String_Methods;
// String methods in Java

/*
 * String methods operate on Java Strings. They can be used to find the length
 * of a string, convert to lowercase , etc.
 * Some of the commonly used string methods are :
 * String name = "Vishwas"
 * 1. name.length() = returns the length of the string (7 in this case)
 * 2. name.toLowerCase() = converts all the alphabets in the string to lower
 * case
 * 3. name.toUpperCase() = converts all the alphabets in the string to upper
 * case
 * 4. name.trim() = removes any spaces from the beginning and end of the string
 * 5. name.substring(int start) = returns a substring from start to the end
 * 6. name.substring(int start, int end) = returns a substring from start
 * index(included) to end index(excluded)
 * 7. name.replace('a','r') = returns a new string after replacing a with r.
 * Vishwrs is the output
 * 8. name.startsWith("Vi") = returns true if name starts with string "Vi" (true
 * in this case)
 * 9. name.endsWith("io") = returns true if name ends with string "io" (false in
 * this case)
 * 10. name.charAt(2) = returns character at the given index position (s in this
 * case)
 * 11. name.indexOf("s") = returns the index of the given string (returns 2
 * which is the first instance)(-1 otherwise)
 * 12. name.indexOf("s",3) = returns the index of the given string starting from
 * the index 3
 * 13. name.lastIndexOf("s") = returns the index of the last occurance of the
 * given string
 * 14. name.lastIndexOf("s",2) = returns the last index of the given string
 * before index 2
 * 15. name.equals("Vishwas") = returns true if given string is equal to Vishwas
 * (case sensitive)
 * 16. name.equalsIgnoreCase("vishwas") = returns true if give string is equal
 * to vishwas (not case sensitive)
 */

// Escape Sequence Characters :
/*
 * escape sequence characters consists of more than one characters but
 * represents one character when used withing the string
 * some of the escape sequence charactres are :
 * 1. \n -> newline
 * 2. \t -> tab
 * 3. \' -> single quotes
 * 4. \\ -> backlash
 * etc.
 */