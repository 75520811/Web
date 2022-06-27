class sample:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def printname(self):
        print(self.name,self.age)
class child1(sample):
            def __init__(self,name,age):
                self.name=name
                self.age=age
            def printname1(self):
                print(self.name,self.age)
                '''creating obect for an child class'''
obj1=child1(55,12)
obj1=sample("aaru",4)
obj1.printname()





