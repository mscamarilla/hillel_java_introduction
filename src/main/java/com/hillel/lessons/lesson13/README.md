1) Есть игра в которой клетчастое поле (например размером 10x10 клеток) и юниты, в одной клетке один юнит.

Есть 4 типа юнитов: башня, забор, содат и танк.

Забор ничего не делает и может быть разрушен Башня ничего не делает и не может быть разрушен Солдат стреляет и двигается
- у него можно вызвать методы move() и fire()
Танк умеет то же что и солдат, плюс еще у него есть метод reload()

Создать классы которые соотвествует каждому юниту и использовать extends если это целесообразно. Может быть больше
классов чем перечилено в задаче если нужно.

Создать список в котором есть юниты всех типов.

2*) Задана строка из английских слов через пробел. Написать метод который возвращает те же слова в обратном порядке. При
этом слова изменены так что в каждом слове первая буква большая а остальные маленькие.