
n = int(input())

def hanoi(n, fr, to, temp):
    if n==1:
        print(fr,to)
    else:
        hanoi(n-1, fr, temp, to)
        print(fr,to)
        hanoi(n-1, temp, to, fr)

print(2**n-1)
hanoi(n, 1, 3, 2)