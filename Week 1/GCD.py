def lcm(a, b):
    
    res = 0

    if (a>b):
        res = a%b
        if res == 0:
            return b    
    else:
        res = b%a
        if res == 0:
            return a
    
    if (a > b and res != 0):

        while (res != 0):

            a = b
            b = res
            res = a % b
            if (res == 0):
                return b


    elif (b > a and res != 0):

        while (res != 0):

            b = a
            a = res
            res = b % a
            if (res == 0):
                return a
                

if __name__ == '__main__':
    a, b = map(int, input().split())
    print(lcm(a, b))

