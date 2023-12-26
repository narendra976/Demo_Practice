thickness = int(input())
for i in range(1, thickness*2, 2):
    print(('H' * i).center(thickness * 2, '.'))
for i in range(1, thickness + 2):
    print(('H'*thickness).center(thickness*2, '.'), end='')
    print(('H'*thickness).rjust(thickness*2 + thickness //2, '.'))
for i in range(3):
    print(('H'*(thickness*4)).rjust(thickness*4 + thickness // 2, '.'))
for i in range(1, thickness + 2):
    print(('H'*thickness).center(thickness*2, '.'), end='')
    print(('H'*thickness).rjust(thickness*2 + thickness //2, '.'))
for i in range(thickness*2 - 1 , 0, -2):
    print((('H' * i).center(thickness*2 + thickness //2, '*')).rjust(thickness * 5 + thickness // 4, '.'))  