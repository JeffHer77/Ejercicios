def lcm(a, b):
    
    c = a
    d = b
    divi = 0
    
    res = 0

    if (a>b):
        res = a%b
        if res == 0:
            divi = b

    else:
        res = b%a
        if res == 0:
            divi = a
            

    if (a > b and res != 0):

        while (res != 0):

            a = b
            b = res
            res = a % b
            if (res == 0):
                divi = b
                


    elif (b > a and res != 0):

        while (res != 0):

            b = a
            a = res
            res = b % a
            if (res == 0):
                divi = a
    
    res = c*d/divi

    return int(res)
                

if __name__ == '__main__':
    a, b = map(int, input().split())
    print(lcm(a, b))

