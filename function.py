'''def my_sum():#fuction declaration

    a=10;
    b=20;
    c=a*b;
    return c;
print(my_sum())'''

'''def My_Sum(i,j):   #with paramters
    a=i;
    b=j;
    c=a*b;
    return c;
print(My_Sum(10,30))'''

'''def my_name(Bike):
    print(Bike);
my_name("Leeminhoo")'''

'''def my_name(Bike=40):
    print(Bike);
my_name()'''

def my_name(*name):
    print(name);
my_name("geetha","Lee")
my_name("minhoo")
def find(n,m):
    print(m,n)
find(10,20);

def func(**kwargs):
    print(kwargs)
func(a=3,b=5);
func(c=8)
