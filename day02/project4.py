s1=input("请输入一个字符串");
max=s1[0]
number=1
index=0
while number<len(s1):
        if max<s1[number]:
            max=s1[number]
            index=number
        number+=1
print(max)
print(index)
        
