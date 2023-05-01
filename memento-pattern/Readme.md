# Memento Design Pattern

The Memento pattern is a behavioral design pattern that provides a way to save and restore the state of an object without violating encapsulation.

The Memento pattern solves the problem of needing to save and restore the state of an object in a way that is flexible, efficient, and doesn't expose the object's internal structure. It's often used in situations where it's necessary to undo changes to an object's state or to provide a way to checkpoint the state of an object during a long-running operation.

The Memento pattern works by defining three key components: the Originator, the Memento, and the Caretaker.

**The Originator** is the object whose state needs to be saved and restored. It creates a Memento object that contains a snapshot of its current state.

**The Memento** is an object that stores the state of the Originator at a particular point in time. It should be designed in a way that only the Originator can read and modify its state.

**The Caretaker** is responsible for managing the Memento objects. It can request a Memento from the Originator to save its state and later use it to restore the Originator's state.

## How not using of memento pattern breaks the Encapsulation Principal?

If we don't use the Memento pattern, and instead try to save and restore an object's state directly, we can break the encapsulation principle by exposing the internal details of the object's state to the outside world.

For example, imagine we have an object with several private fields that are used to determine its behavior. If we want to save and restore the state of this object, we might be tempted to make these private fields public so that they can be accessed and modified from outside the object.

However, this violates the principle of encapsulation because it exposes the internal details of the object's state and allows external code to modify its state directly. This can lead to unintended consequences, such as the object being put into an invalid state or having its behavior changed in unexpected ways.

Using the Memento pattern solves this problem by providing a way to save and restore an object's state without exposing its internal details. **The Memento object encapsulates the object's state and can only be accessed by the Originator object**, which ensures that the object's state remains encapsulated and protected from external modification.

## Problems that Memento Pattern Solves:

1. Memento pattern is primarily used to solve the problem of breaking encapsulation when saving and restoring an object's state.

2. By using the Memento pattern, we can separate the responsibility of managing an object's state from the object itself, which can make the code easier to understand and maintain.

3. Memento pattern can make the code more flexible. Because the Memento object encapsulates the object's state, we can save and restore the state in different ways, such as to a file, a database, or over a network. This flexibility can be useful in situations where we need to save and restore an object's state in different contexts or environments.

## Memento Pattern Use Cases:

1. **Undo/redo functionality:** The Memento pattern can be used to implement undo/redo functionality in an application. When the user makes a change to the state of an object, we can create a Memento object to save the object's previous state. If the user wants to undo the change, we can restore the object's state from the Memento object.

2. **Checkpointing:** The Memento pattern can be used to provide checkpoints during long-running operations. For example, if a user is performing a complex calculation, we can create a Memento object at regular intervals to save the state of the calculation. If the calculation fails or needs to be restarted, we can restore the state from the last saved Memento object.

3. **Collaborative editing:** The Memento pattern can be used in collaborative editing applications to allow multiple users to work on the same document. Each user can have their own copy of the document, and changes can be synchronized between the copies using Memento objects.