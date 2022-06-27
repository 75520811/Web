'''class firstprgm:      #class declaration

    a=1;
    b=2;
    c=3;
    def display(self):       #funtion
        print(self.a,self.c,self.b)
x=firstprgm()
x.display()'''

'''class first:
    def print(a,b):
        i = a;
        j = b;
        print(i,j)

    def getme():
            print("Hello")
y=first
y.print(3,5)
y.getme()'''


class my:
    def func(self):
        print(" iasm");
    def func1(i,j):
        a =i;
        b =j;
        print(i,j);
m = my()
m.func()
c=my.func1(12,67)
my.func1(2,4)

#practice
'''x=5;
y=6;
z=x+y;
print(z);
x=10.267;
y=-11.24555;
z=x+y;
print(z);
print(id(x));
print(id(y));
#a=b=c=10;#
a=10;
b=10.4;
c=10+2j;
print(a,"is of type",type(a));
print(b,"is of type",type(b));
print(c,"is of type",type(c));'''

a=10;
b=0;
print(a+b);
assert a+b!=0;


