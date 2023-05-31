# Marko Jovanov, 181133

# Control Flow Diagram 
<img width="833" alt="image" src="https://github.com/markojovanov/SI_2023_lab2_181133/assets/86361216/1ccb8e1c-fc3d-430d-a244-5912b2e5f591">


# Цикломатската комплексност

M = E - N + 2P = 32 - 23 + 2 = 11

Каде што варијаблите преставуваат:

M - Цикломатската комплексност

E - Број на ребра во CFG

N - Број на јазли во CFG

P - Број на поврзани компоненти во CFG


# Every Branch - Сите тест случаи

<img width="610" alt="image" src="https://github.com/markojovanov/SI_2023_lab2_181133/assets/86361216/ecaaf536-29a7-4c12-ac6a-449278dddadd">

Кога моделираме тест случаи преку критериумот - "Every Branch", треба да ги поминеме сите ребра на Control Flow Diagram. Јас дизајнирав 5 тест случаи што ќе ги поминат сите ребра во диаграмот.

1 - Поминува низ ребрата во редослед 1-2-23, додека вредностите за влез функцијата би биле =  User("test", null, "test"), Empty list. 

2 - Поминува низ ребрата во редослед 1-3-5-13-14-23, додека вредностите за влез функцијата би биле = User("test", "test", "test), Empty list

3 - Поминува низ ребрата во редослед 1-3-5-6-7-8-9-10-11-12-13-15-16-22-23, додека вредностите за влез функцијата би биле = User("test", "new password", "test@test.com"), List(User("test", "new password", "test@test.com"),User(“test”, “test”, “test”))

4 - Поминува низ ребрата во редослед 1-3-4-5-6-7-9-11-12-13-15-16-17-18-20-21-22-23, додека вредностите за влез функцијата би биле = User(null, "newpassword", "test@test.com"), List(User(“test123”, “new password”, “newtest@test.com”),User(“test456”, “1234567#2”, "newtest123@test.com”))

5 - Поминува низ ребрата во редослед 1-3-4-5-6-7-9-11-12-13-15-16-17-18-19-23, додека вредностите за влез функцијата би биле = User(null, "n#ewpassword", "test@test.com"), List(User(“test123”, “new password”, “newtest@test.com”),User(“test456”, “1234567#2”, "newtest123@test.com”))

# Multiple Condition - Сите тест случаи
<img width="682" alt="image" src="https://github.com/markojovanov/SI_2023_lab2_181133/assets/86361216/9c805d75-5514-471e-8b95-3859c1a9ba58">

Кога моделираме тест случаи преку критериумот - "Multiple Condition", треба да ги поминеме сите моменти на одлука на даден израз. Исто така, во моите тест случаи примитивите кои не се извршени порази lazy евалуација се прикажани со "X".

