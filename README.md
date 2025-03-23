The Tower of Hanoi is a classic puzzle that involves moving a set of disks from one peg to another, following specific rules. It was first introduced by Édouard Lucas in 1883.

Here are the basics:
There are three pegs and a number of disks, each of a different size.
The disks start stacked in descending order of size on one peg.
The goal is to move the entire stack to another peg, following these rules:
 Only one disk can be moved at a time.
 A disk can only be placed on top of a larger disk or an empty peg.

Steps to Solve Tower of Hanoi:

Base Case:
If there's only 1 disk, simply move it from the starting peg to the target peg. Done!

Recursive Case: For n disks, follow these three steps:
Step 1: Move the top 
𝑛−1 disks from the starting peg to the auxiliary peg (temporary peg), using the target peg as a helper.
Step 2: Move the largest disk (the bottom disk) directly to the target peg.
Step 3: Move the 𝑛−1 disks from the auxiliary peg to the target peg, using the starting peg as a helper.
