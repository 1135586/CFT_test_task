# CFT_TEST

ОПИСАНИЕ:
Входной файл содержит данные одного из двух видов: целые числа или строки. Данные записаны
в столбик (каждая строка файла – новый элемент). Строки могут содержать любые не пробельные
символы.

Результатом работы программы должен являться новый файл с содержимым входного файла,
отсортированным по возрастанию или убыванию. Для сортировки строк использовать
лексикографический порядок (по кодам символов).


ИСПОЛЬЗОВАНИЕ:
собрать проект из ./ проекта

maven package

в ./target/ будет находится файл dmi-1.0-SNAPSHOT.jar

java -jar dmi-1.0-SNAPSHOT.jar <inputFile> <outputFile> <dataType> <sortOrder>
inputFile - имя входного файла
outputFile -  имя выходного файла
dataType (тип данных):
    -i - целые числа
    -s - строки
sortOrder (порядок сортировки):
    -a -  по возрастанию
    -d - по убыванию

например так:

java -jar dmi-1.0-SNAPSHOT.jar in.txt out.txt -i -a


in.txt	out.txt
323	9
4678	12
9	15
234	234
12	323
15	4678
