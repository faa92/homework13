# homework13
Oleg, [16.02.2023 0:12]
🏠 ДЗ 13

У массивов есть свойство, которое иногда делает их использование неудобным. Их длина не может быть изменена. Если нам нужно добавить или удалить элемент, нужно создавать новый массив с новой длиной и переносить элементы из старого.

Мы немного погрузимся в тему структур данных. Базовые структуры данных реализованы в стандартной библиотеке коллекций (collections). Это java.util.Collection, java.util.List, java.util.Set, java.util.Queue, java.util.Deque, java.util.Map и т.д. Их мы будем разбирать на следующих лекциях.

В ДЗ я предлагаю вам самим реализовать структуру данных список (list). По своей логике это тот же массив, но с возможностью добавлять и удалять элементы. То есть список может изменять свою длину в процессе существования.

На практике будет, конечно, использоваться готовая библиотека коллекций. Но наша задача понять, как всё работает внутри, чтобы это не казалось магией. Поэтому сейчас мы “пишем свои велосипеды” для образовательных целей.

Мы будем создавать класс списка, элементы которого – int’ы.

Oleg, [16.02.2023 0:13]
🟢 Создай проект в IDEA с базовым Hello world кодом.

🟢 Создай gitignore файл.

🟢 Сделай коммит в main (master) с сообщением “Initial commit“.

🟢 Создай ветку feature-int-list. Выполняй задачи внутри этой feature ветки, можешь делать любые коммиты.

🟢 Создай класс IntList в подходящем package

🟢 Объекты класса должны хранить массив чисел. Объяви поле с типом int[]

🟢 Объяви конструктор без параметров. При его вызове изначальный список должен быть пустым.

🟢 Объяви конструктор с параметром int[]. Изначальный список должен содержать значения из параметра.

🟢 Объяви метод String toString(). Он возвращает строковое представление списка в квадратных скобках через запятую (Например, “[1, 2, 4, 2]”)

🟢 Объяви метод int get(int index). Он принимает индекс в списке. Возвращает
элемент, который хранится по этому индексу.

🟢 Объяви метод int set(int index, int element). Он присваивает новое значение элементу списка на заданном индексе. Возвращает предыдущее значение, которое хранилось по этому индексу.

🟢 Объяви метод int size(). Он возвращает текущую длину списка.

🟡 Объяви метод void add(int element). Он добавляет элемент в конец списка. Длина списка становится на 1 больше.

🟡 Объяви метод int remove(int index). Он удаляет элемент с заданным индексом. Длина списка становится на 1 меньше. Возвращает элемент, который был удалён из списка.

🟢 Объяви метод IntList subList(int startIndexInclusive, int endIndexExclusive). Он возвращает новый объект IntList, который является подсписком исходного от заданного индекса (включительно) до заданного индекса (исключительно).

🟢 Объяви метод IntList subList(int startIndexInclusive). Он возвращает новый объект IntList, который является подсписком исходного от заданного индекса (включительно) до конца списка.

🟢 Объяви метод int lastIndexOf(int element). Он ищет последнее вхождение заданного элемента в списке. Возвращает индекс найденного элемента или -1, если элемент не найден.

🟠 Объяви метод void sort(). Он сортирует элементы в списке по возрастанию с помощью алгоритма bubble sort – сортировка пузырьком – https://ru.wikipedia.org/wiki/Сортировка_пузырьком. Реализуй алгоритм сам. Не используй Arrays.sort(…).

🟢 Напиши код демонстрации работы методов класса в отдельном файле. Можешь создать один объект IntList и предлагать пользователю демонстрации методов для этого объекта. Пользователь вводит аргументы для методов из консоли.

🟢 Сделай Pull Request feature-int-list ветки в main (master) на GitHub

🛟 Подсказка: В реализации методов тебе могут понадобится глобальные статические функции Arrays.toString(…), System.arraycopy(…), Arrays.copyOf(…), Arrays.copyOfRange(…).

‼️ Нельзя использовать java.util.List и его наследников, как java.util.ArrayList. Суть в том, чтобы разработать структуру данных список самому.

💬Напиши мне в личные сообщения: “Привет. Сделал ДЗ №13” и дай ссылку на Pull Request (‼️) в GitHub репозитории
ℹ️ Разбор ДЗ №13 на лекции в ср 22.02
⏰ Проверю твоё ДЗ №13 к разбору, если сдашь до вс 19.02 14:00
⚠️ Проверю твоё ДЗ №13 в неопределённые сроки, если сдашь позже
