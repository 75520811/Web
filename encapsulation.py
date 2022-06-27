class Bird:
    def __init__(self):
        self.__a=2
    def display(self):
        print(self.__a)
    def s(self,b):
        self.__a=b
p1=Bird()
p1.display()
p1.__a=5
p1.display()
p1.s(10)
p1.display()


