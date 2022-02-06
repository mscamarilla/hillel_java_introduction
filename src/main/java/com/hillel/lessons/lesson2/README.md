1.Задать переменные следующих целочисленных типов (byte, short, int , long).
Вывести для каждой переменной максимальное и минимальное допустимое значение.
Вывод должен быть примерно следующего вида System.out.println("Minimum for "+ type + " + typeMin);(где вместо type должно быть название типа, а вместо typeMin - минимальное значение)
И для максимума аналогично.
И это будет повторяться для всех вышеперечисленных типов.
Данные о граничных значениях можно взять из слайдов к лекции ИЛИ можно (но не обязательно) взять из классов оберток для каждого типа, как пример, для типа int один из параметров хранится в константе MAX_VALUE класса Integer (Integer.MAX_VALUE), другие границы и для других типов можно получить аналогично. Достаточно по аналогии попробовать написать имя типа данных в стилистике(UpperCamelCase) класса (только у Integer оно отличается от int), у других типов(кроме char) название класса идентично с примитивами.

2.Вывести в консоль в методе main пару примеров явного и неявного преобразования типа.
Вывод оформить как удобно, но что бы было понятно что здесь явное преобразование, а здесь - неявное.

3.Далее,для типа byte и short, int, задать значения больше максимальной и минимальной границы.
Вывести в консоль(Так как значение больше , то потребуется приведение типов).
Посмотреть что происходит при присваивании значения больше чем способен принять тип.