hour, minutes = map(int, input().split())
takeFor = int(input())

hour += takeFor // 60
minutes += takeFor % 60
hour += minutes // 60
minutes %= 60
hour %= 24

print(hour, minutes)
