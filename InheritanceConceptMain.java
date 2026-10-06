// Q17: Multiple and Hybrid Inheritance — Concept Only
/*
 * EXPLANATION OF MULTIPLE AND HYBRID INHERITANCE IN JAVA:
 * 
 * 1. MULTIPLE INHERITANCE OF CLASSES:
 *    Multiple inheritance is a feature where a child class can inherit directly from more than one super class.
 *    Java DOES NOT support multiple inheritance with classes to avoid ambiguity (the "Diamond Problem").
 *    For example, if Class A and Class B both have a method show(), and Class C extends both,
 *    Class C wouldn't know which show() method to execute.
 * 
 *    // INVALID CODE IN JAVA (Concept Only):
 *    // class C extends A, B { }
 * 
 * 2. HYBRID INHERITANCE:
 *    Hybrid inheritance is a combination of two or more types of inheritance (e.g., Multilevel + Multiple).
 *    Because Java does not allow multiple inheritance with classes, hybrid inheritance using classes alone is also unsupported.
 * 
 * 3. RELEVANCE OF INTERFACES:
 *    When multiple/hybrid inheritance of behavior is required, Java uses INTERFACES.
 *    A class can implement multiple interfaces without ambiguity because interfaces declare methods without concrete implementation state conflicts.
 */

public class InheritanceConceptMain {
    public static void main(String[] args) {
        System.out.println("Multiple and Hybrid Inheritance concepts in Java explained via code comments.");
    }
}
