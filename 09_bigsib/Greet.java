/**
Baked Potatoes Emily Ortiz and Apple Juice, Vansh Saboo and Tiffany,
Jacob Ng and Preguac
APCS
HW09 -- What Are BigSibs Good For?
2021-10-02
**/

/**
Discoveries
- You can compile a program without a main() method. 
- You can call a method from another file in the same directory if it has been compiled
which is how the BigSib.greet part works.

Unresolved questions
- Are you calling the method from the other file's .java or .class?
- I feel like this ability is useful but I can't currently see how it would be used.
Can't we just throw all the methods into one .java file?

**/


public class Greet{

    public static void main(String[] args){
	BigSib.greet("Flim");
        BigSib.greet("Flam");
        BigSib.greet("Kazaam");
    }
}
