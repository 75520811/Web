class A:
    def test1(self):
        print("from test1")
class B:
    def test2(self):
        print("from test2")
class C(A,B):
    def test3(self):
        print("from test3")

c1=C()
c1.test1()
c1.test2()
c1.test3()
print(issubclass(C,B))
print(issubclass(A,B))
print(issubclass(C,A))
print(isinstance(c1,C))
#method overriding
class father:
    def transport(self):
        print("bike")
class son(father):
    def transport(self):
        print("car")
class p1:
    def __init__(self,name):
        self.name=name
    def display(self):
        print("viggle")
class p2(p1):
    def __init__(self,age):
        super().__init__("ok")
    def display(self):
        print("yes")
class C(p2):
    def __init__(self,id):
        super().__init__("done")
    def display(self):
        print("perfect")
obj=p2(34)
obj1=C(72)
obj.display()
obj1.display()




