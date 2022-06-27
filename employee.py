class employee:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def display(self):
        print(self.name,self.age)
emp1=employee("ghee",21)
emp2=employee("deeps",23)
emp1.display()
emp2.display()



