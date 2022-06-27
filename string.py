'''str="Hello"

print(str[0])
print(str[-1])
print(str[-2])
a=[48751,"geetha","Jr-Executive",18000] #list
del a[2] #to delete
a.append("job") #to append
print(a)
print(a[2])'''

'''b=(1,"Lee",[2,4],4.2,(3,4,5))  #tupples
print(b[3])'''

'''c=set([10,10.2,4,2]) #set
c.add(33)
c.discard(36) #dont show error evn if its not there
c.remove(36) # throws error if not present
print(c)'''

'''dict={"stdname":"Sid","stdid":11,"stdmarks":88,"stdadd":"Delhi"} #dictionary tupple
for i in dict:
    print(dict[i])
print(dict)
print(dict.get("stdname"))'''

dict={"stdname":"sonu","stdid":10,"stdmarks":100,"stdaddress":"bengaluru"}
for i in dict:
    print(dict[i])