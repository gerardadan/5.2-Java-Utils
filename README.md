# Level 1: Directory Listing

## Objective
Create a Java class that:

1. Lists alphabetically the contents of a directory provided as a parameter.
2. Recursively lists all subdirectories and files, showing them alphabetically at each level. Display if it is a directory (D) or a file (F) and the last modification date.
3. Outputs the result to a TXT file instead of the console.
4. Uses a configuration file to parameterize the directory path and output file location.

## Requirements
- Execute all exercises from the command line, not only from the editor.
- Use relative paths, not absolute ones.
- Use `File.separator` for compatibility across operating systems.

## Implementation Details

### Functionality
1. **Directory Listing:**
   - Alphabetically list the contents of a given directory.

2. **Recursive Tree Listing:**
   - List all files and directories recursively.
   - Indicate if each entry is a directory (D) or a file (F).
   - Display the last modification date for each item.

3. **Save to TXT File:**
   - Write the output to a specified TXT file instead of printing to the console.

4. **Configuration File:**
   - Used a Java Properties file
   - Parameters to configure:
     - Directory to read.
     - Output TXT file name and location.

## Example Output (saved to the TXT file)
```
ADir - (D) - 2025-03-24 10:47:30
---1file.txt - (F) - 2025-03-24 10:11:22
---2File.txt - (F) - 2025-03-24 10:11:22
---3File.txt - (F) - 2025-03-24 10:11:22
---AADir - (D) - 2025-03-24 10:47:30
------AA1file.txt - (F) - 2025-03-24 10:11:22
```

## Execution Instructions
1. **Compile the Code:**

```bash
javac -cp . src/com/example/DirectoryLister.java -d out
```

2. **Run the Program:**

```bash
java -cp out com.example.DirectoryLister
```

Ensure that the configuration file is in the classpath and correctly specifies the input directory and output TXT file.

