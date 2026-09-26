# Matrix Inverse in Java

A simple Java program to find the inverse of a square matrix using the Gauss-Jordan elimination method.

## Features

- Accepts the order of the matrix
- Accepts matrix elements from the user
- Calculates the inverse of a square matrix
- Checks whether the inverse exists
- Displays the inverse matrix

## Method Used

The program uses the **Gauss-Jordan elimination method**.

The matrix is first converted into an augmented matrix:

[A | I]

Through row operations, it is transformed into:

[I | A⁻¹]

where A⁻¹ is the inverse of matrix A.

## Example

### Input

Matrix:

1  2  
3  4

### Output

Inverse:

-2.00   1.00  
 1.50  -0.50

## Technologies Used

- Java
- 2D Arrays
- Scanner
- Loops
- Gauss-Jordan Elimination

## How to Run

1. Download or clone this repository.
2. Open `MatrixInverse.java` in a Java IDE.
3. Compile and run the program.
4. Enter the order and elements of the matrix.
5. The inverse matrix will be displayed.

## Note

The inverse exists only when the matrix is **non-singular**, meaning its determinant is not zero.

## Author

Manikanta Gude
