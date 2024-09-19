# Diamond Lookup Problem
class A(object):
    def do_this(self) -> None:
        print("Calling from A")

class B(A):
    pass

class C(A):
    def do_this(self) -> None:
        print("Calling from C")

class D(B, C):
    pass

d = D()
d.do_this()
print(D.mro())
