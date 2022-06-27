n=int(input())
sum=0
temp=n
a=0
while n>0:
    a=a+1
    n//=10
while n>0:
    b=n%10
    sum=sum+b**a
    n//10
    if sum == temp:
        print("armstrong no:")
    else:
        print("not armstrong no:")