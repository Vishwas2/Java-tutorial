/*
There are two types of packages :
1. Built-in packages
2. User defined packages
 */
// Whenever we want to use scanner we import java.util.Scanner but if we want to import everything from java.util then
// we can import java.util.*
// we can also directly use Scanner by typing java.util.Scanner sc = new java.util.Scanner(System.in); (no need of importing)

/*
Creating a package :
javac vishwas.java -> creates vishwas.class
javac -d.vishwas.java -> creates a package folder ( we can keep adding classes to a package like this)
 */
// Packages make it very useful to organise files
// We can also create inner packages by adding "package.inner" as package name
// These packages once created can be used by other classes.