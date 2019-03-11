INSTRUCTIONS:
===================================
Put your solution in the package "dip.lab1.student.solution1". And try not
to peek at the instructor solution. If you get stuck or want to check if your
solution is a good one, first review the instructor's solution. Now please
read on...

You have been presented with a description and purpose of the
Dependency Inversion Principle (DIP). You will need to understand this
principle to successfully complete the lab work.

DIP RULES:
    A. HIGH LEVEL MODULES SHOULD NOT DEPEND UPON LOW
       LEVEL MODULES. BOTH SHOULD DEPEND UPON ABSTRACTIONS.

    B. ABSTRACTIONS SHOULD NOT DEPEND UPON DETAILS. DETAILS
       SHOULD DEPEND UPON ABSTRACTIONS.

DIP OBJECTIVES:
    1. Reduce rigidity and fragility.
    2. Improve portability (code reuse, flexibility)

THE CHALLENGE:
--------------
This lab is full of bad programming ideas and poor practices.
In this lab #1 your main goal is to modify the high-level and low-level classes
to follow the DIP. Part of that involves making the high-level class use
delegation, in a polymorphic way (common behaviors), so as to be able to use
any low-level object as a delegate component. The problem is, both the
low-level and high-level classes are poorly designed.

Start with the low-level classes and ask yourself whether they follow the
DIP rules for low-level classes. Then look for, or create common methods
that can be executed polymorphically (with different implementations). Right
now you have some methods (behaviors) that are appropriate for one low-level
class, and other that are appropriate for the other low-level class.

You may need to change the super class to follow the DIP.

The high-level class should now be easy to modify. But beware, your instructor
has added lots of distractions to force you to think about what you are doing.
For example, an enum is declared. There's nothing wrong with enums, and in fact,
they promote type safety (your instructor will explain). However, the enum
has nothing to do with fixing the high-level class ... in fact, it's not needed
at all. So don't expect this to be simple and straight forward unless you
really, really, really understand the DIP. If you don't, you haven't spent
enough time studying. That's a clue for new study habits. If your low-level
classes follow the DIP, all you need to do is delegate to those objects in
a polymorphic way (call common method(s)). But you will need to change or
replace the existing methods to accomplish this.

DON'T ALLOW YOURSELF TO BE PARALYZED BY CONFUSION! ASK FOR HELP EARLY AND OFTEN!