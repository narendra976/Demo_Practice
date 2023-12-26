from itertools import combinations_with_replacement
s, c=input().split()
s=sorted(s)
a=list(combinations_with_replacement(s, int(c)))
#print(a)
for word in a:
    print(''.join(word))