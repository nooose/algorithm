S = input()

number = 0
string = []
for i in S:
    if ord(i) >= ord('0') and ord(i) <= ord('9'):
        number += int(i)
    else: # if i.isalpha()
        string.append(i)

string.sort()

if number != 0:
    string += str(number)

print(''.join(string))