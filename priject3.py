b=int(input("输入一个不大于255的整数"))
print("{:0>8b}".format(b))
print("{:0>8o}".format(b))
print("{:0>8x}".format(b))
print(format(b,'07b'))
print(format(b,'08o'))
print(format(b,'08x'))