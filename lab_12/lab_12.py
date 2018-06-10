import re
countFile = 0

with open('Lab_12.txt') as text:
    for line in text:
        if re.search(
                '((07:40:0[6-9])|(07:[4-5][0-9]:[1-5][0-9])|(0[8-9]:[0-5][0-9]:[0-5][0-9])'
                '|(1[0-2]:[0-5][0-9]:[0-5][0-9])|(13:[0-3][0-9]:[0-5][0-9])'
                '|(13:4[0-2]:[0-5][0-9])|(13:43:[0-2][0-9]))'
                '.*((GET))\s.+.*((.png)|(.jpg)|(.jpeg)|(.gif))\s.+.*'
                ,str(line)):
            countFile += 1
            print(line)

    print(countFile )
