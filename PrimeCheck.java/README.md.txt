Prime Number Checker (Java)

This is a simple Java program that checks whether a given number is prime or not prime.
The program takes an integer as input and verifies primality using an efficient method that only checks divisors up to the square root of the number.

How It Works

A number is considered prime if it is greater than 1 and has no divisors other than 1 and itself.

This program:

1. Reads a number from the user

2. Checks if the number is less than or equal to 1

3. Loops from 2 to √n

4. Stops early if a divisor is found

5. Prints whether the number is prime or not

This method is faster than checking all numbers up to n/2 or n.


Why Check Only Up to √n?

If a number has any factor greater than √n,
its pair must be smaller than √n.
So checking only up to the square root covers all possible factor pairs.

This makes the program more efficient.

How to run:
1. save the file as PrimeCheck.java
2. compile
3.Run.


Purpose

This file is part of my commitment to upload at least one Java program daily as I progress through my Java learning journey.