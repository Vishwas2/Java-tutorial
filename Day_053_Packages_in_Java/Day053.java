/*
In Java, a package is a way to organize and group related classes and interfaces together. It helps in managing
and structuring your codebase, making it easier to maintain, reuse, and collaborate on projects. Packages provide
a hierarchical structure for organizing classes, similar to directories and subdirectories in a file system.

Key points about packages in Java :
1. Organization : Packages provide a way to logically organize classes and prevent naming conflicts. A package name is
                  typically written in lowercase letters to differentiate it from class names.
2. Naming Convention: Package names are written in reverse domain name notation, also known as the dot notation. For example,
                      if your domain is "example.com," your package names might start with "com.example."
3. Import Statement: To use classes from a different package in your code, you need to import them using the import statement.
                     This tells the Java compiler where to find the classes you want to use.
4. Access Control: Java uses access modifiers like public, protected, and private to control the visibility and access
                   of classes and members within a package.
5. Default Package: If you don't explicitly specify a package for your classes, they belong to the default package.
                    However, it's a good practice to always use packages to organize your code.
6. JAR Files: Java packages are often bundled together into JAR (Java Archive) files, which allow you to distribute and
              share your code more easily.

Here's an example of how packages work in Java:

Suppose you have two classes, Student and Teacher, which are part of an educational system.
You might organize them into packages like this:
com.example.school
    ├── Student.java
    └── Teacher.java

In your Student.java and Teacher.java files, you would include the package declaration at the beginning:
package com.example.school;
public class Student {
    // class implementation
}

package com.example.school;

public class Teacher {
    // class implementation
}

And when you want to use these classes in another file, you'd import them like this:
import com.example.school.Student;
import com.example.school.Teacher;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        // rest of the code
    }
}
 */

// By using packages, you can maintain a well-organized codebase, avoid naming conflicts, and make your code more modular
// and manageable.