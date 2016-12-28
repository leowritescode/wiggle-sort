WiggleSort is a problem that was presented to me by LaunchCode. I had a limited amount of time but was unable to complete it.
Now, free of distractions and the pressure of time limits, I present the solution to the problem.

WiggleSort merely takes an array of integers and sorts it so that the largest integer appears at the beginning followed by the
smallest integer. It continues with the next largest integer followed by the next smallest integer.

The key is to check whether or not the current index being inspected is even or odd. An even numbered index will always be one
that contains a larger number whereas the odd numbered index contains a smaller number.
