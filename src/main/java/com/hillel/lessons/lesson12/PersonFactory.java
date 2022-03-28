package com.hillel.lessons.lesson12;

import java.util.ArrayList;

public class PersonFactory {
    private String[] dataArray = {
            "Салман Радуев",
            "Шамиль Басаев",
            "Руслан Гилаев",
            "Забег Дебилов",
            "Парад Уродов",
            "Ушат Помоев",
            "Улов Налимов",
            "Рекорд Надоев",
            "Отряд Ковбоев",
            "Подрыв Устоев",
            "Погром Евреев",
            "Поджог Сараев",
            "Захват Покоев",
            "Исход Изгоев",
            "Побег Злодеев",
            "Обвал Забоев",
            "Угон Харлеев",
            "Удел Плебеев",
            "Камаз Отходов",
            "Развод Супругов",
            "Вагон Гондонов",
            "Отряд Кретинов",
            "Улов Кальмаров",
            "Рулон Обоев",
            "Черёд Застоев",
            "Квартет Гобоев",
            "Подсуд Злодеев",
            "Учёт Расходов",
            "Налог Сдоходов",
            "Разбор Полётов",
            "Мешок Лимонов",
            "Обед Лемуров",
            "Карман Пистонов",
            "Разгул Гормонов",
            "Прыжок Гиббонов",
            "Рожок Патронов",
            "Разрез Батонов",
            "Полёт Фазанов",
            "Удар Морозов",
            "Заплыв Матросов",
            "Порвал Баянов",
            "Расстрел Арабов",
            "Запой Гусаров",
            "Сачок Моллюсков",
            "Поход Гераклов",
            "Барак Монголов",
            "Загон Баранов",
            "Пропой Погонов",
            "Отряд Маньяков",
            "Тридня Запоев",
            "Облом Пиндосов",
            "Курган Отбросов",
            "Полно Засосов",
            "Говно Вопросов",
            "Букет Пионов",
            "Отряд Дебилов",
            "Загул Старлеев",
            "Друган Братанов",
            "Отжер Мамонов",
            "Косяк Пингвинов",
            "Майор Сдопросов",
            "Пробрал Поносов",
            "Формат Поддосов",
            "Атлон Безсбоев",
            "Украл Снарядов",
            "Убой Мулатов",
            "Бугор Нароев",
            "Мешок Калымов",
            "Дояр Муфлонов",
            "Замор Медведев",
            "Косарь Безруков",
            "Бегун Безногов",
            "Моргун Безглазов",
            "Разбор Завалов",
            "Атас Бандитов",
            "Притулок Геев",
            "Загон Шакалов",
            "Творец Кошмаров",
            "Поддел Продуктов",
            "Учет Пигмеев",
            "Созыв Баронов",
            "Запрет Законов",
            "Застрой Районов",
            "Расстрел Шпионов",
            "Залив Гудзонов",
            "Отлов Драконов",
            "Отстрел Патронов",
            "Сэйшн Раввинов",
            "Могила Фараонов",
            "Магазин Гобеленов",
            "Кольцо Соломонов",
            "Дискач Солдафонов",
            "Кидок Компаньонов",
            "Звон Бокалов",
            "Отряд Непрофессионалов",
            "Слой Мезозоев",
            "Учет Побоев",
            "Гений Менделеев",
            "Захват Трофеев",
            "Слуга Кощеев"
    };

    public ArrayList generatePersons() {
        ArrayList<Object> people = new ArrayList<>();

        for (int i = 0; i < dataArray.length; i++) {
            String[] words = dataArray[i].split(" ");

            String name = words[0]; //первая часть строки - имя
            String surname = words[1]; //вторая - фамилия
            int age = (16 + (int) (Math.random() * ((80 - 16) + 1))); //случайное число от 16 до 80
            int weight = (55 + (int) (Math.random() * ((110 - 55) + 1))); //случайное число от 55 до 110
            int height = (165 + (int) (Math.random() * ((205 - 165) + 1))); //случайное число от 165 до 205

            Person person = new Person(name, surname, age, weight, height);
            people.add(person);
        }

        return people;
    }

}
