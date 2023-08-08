/*
1. EXECUTION PROCESS :
   * Compiler = Converts the entire source code into machine code or an intermediate representation (e.g., bytecode)
                before execution. The generated output is a standalone executable file.
   * Interpreter =  Executes the source code line by line, translating and executing each statement on-the-fly. No
                    separate compilation step is involved, and the interpreter needs to be present to run the code.

2. SPEED OF EXECUTION :
   * Compiler = Generally produces faster execution as the entire code is pre-compiled before running.
                Optimizations can be applied during compilation to improve performance.
   * Interpreter = Tends to have slower execution since it translates and executes code line by line. There is often less
                   opportunity for global optimizations.

3. DEBUGGING AND ERROR HANDLING :
   * Compiler = Errors are typically reported after the entire code is compiled, which may make it harder to pinpoint
                issues in the source code. Debugging might involve recompilation.
   * Interpreter = Errors are reported immediately after encountering a problematic line of code, allowing for quicker
                   identification and debugging of issues.

4. PORTABILITY :
   * Compiler = Produces platform-specific machine code, requiring separate compilation for each target platform. The
                same source code might need to be recompiled for different systems.
   * Interpreter = Generally more portable, as long as the interpreter itself is available for the target platform. The
                   source code can often be run without modification across different platforms.

5. MEMORY USAGE :
   * Compiler = Generally produces standalone executables, which can lead to potentially larger memory usage as the
                entire program's machine code is loaded into memory.
   * Interpreter = Requires the interpreter to be present during execution, which might result in lower memory
                   consumption compared to a compiled executable.
 */