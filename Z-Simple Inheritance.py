class Animal(object):
    def __init__(self, name: str) -> None:
        self.name = name
    def eat(self, food: str) -> None:
        print(self.name + " " + "is eating " + food)

class Cat(Animal):
    # constructor of parent is called (lookup heirarchy)
    def purr(self) -> None:
        print(self.name + " cat purrs")

class Dog(Animal):
    # constructor of parent is called (lookup heirarchy)
    def bark(self) -> None:
        print(self.name + " dog barks")
