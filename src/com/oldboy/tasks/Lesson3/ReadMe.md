Домашнее задание по Уроку 3 ( Курс 'Интенсив по Java' ):
- [Transliterator](https://github.com/PaulJavaYoung/YLabHomeWork/tree/Lesson3/src/com/oldboy/tasks/Lesson3/Transliterator): Решена двумя способами (одновременный тест в метода main):

    - [TransliteratorImpl](https://github.com/PaulJavaYoung/YLabHomeWork/blob/Lesson3/src/com/oldboy/tasks/Lesson3/Transliterator/InterfaceAndClasses/TransliteratorImpl.java) - решение согласно т.з.
    - [TranslitWithFileRead](https://github.com/PaulJavaYoung/YLabHomeWork/blob/Lesson3/src/com/oldboy/tasks/Lesson3/Transliterator/InterfaceAndClasses/TranslitWithFileRead.java) - решение с использованием словарей.
    - [InterfaceAndClasses](https://github.com/PaulJavaYoung/YLabHomeWork/tree/Lesson3/src/com/oldboy/tasks/Lesson3/Transliterator/InterfaceAndClasses) - папка содержит рабочие классы и интерфейсы приложения.
    - [Dictionary](https://github.com/PaulJavaYoung/YLabHomeWork/tree/Lesson3/src/com/oldboy/tasks/Lesson3/Transliterator/Dictionary) - папка содержит два вида словарей транслита (старый и новый).

- [DatedMap](https://github.com/PaulJavaYoung/YLabHomeWork/tree/Lesson3/src/com/oldboy/tasks/Lesson3/DatedMap):
     
    - [DatedMapDemoApp](https://github.com/PaulJavaYoung/YLabHomeWork/blob/Lesson3/src/com/oldboy/tasks/Lesson3/DatedMap/DatedMapDemoApp.java) - тестовый класс содержит main метод, демонстрирует работу.
    - [InterfaceAndClasses](https://github.com/PaulJavaYoung/YLabHomeWork/tree/Lesson3/src/com/oldboy/tasks/Lesson3/DatedMap/InterfaceAndClasses) - папка содержит рабочие классы и интерфейсы приложения.

- [OrgStructure](https://github.com/PaulJavaYoung/YLabHomeWork/tree/Lesson3/src/com/oldboy/tasks/Lesson3/OrgStructure):
  
  - [OrgStructureDemoApp](https://github.com/PaulJavaYoung/YLabHomeWork/blob/Lesson3/src/com/oldboy/tasks/Lesson3/OrgStructure/OrgStructureDemoApp.java) - тестовый класс содержит main метод.
  - [InterfaceAndClasses](https://github.com/PaulJavaYoung/YLabHomeWork/tree/Lesson3/src/com/oldboy/tasks/Lesson3/OrgStructure/InterfaceAndClasses) - папка содержит рабочие классы и интерфейсы приложения.
  - [Files](https://github.com/PaulJavaYoung/YLabHomeWork/tree/Lesson3/src/com/oldboy/tasks/Lesson3/OrgStructure/Files) - папка с BaseOrgStructure.csv - списком сотрудников.

- [PasswordValidator](https://github.com/PaulJavaYoung/YLabHomeWork/tree/Lesson3/src/com/oldboy/tasks/Lesson3/PasswordValidator):

  - [PassValidator](https://github.com/PaulJavaYoung/YLabHomeWork/blob/Lesson3/src/com/oldboy/tasks/Lesson3/PasswordValidator/PassValidator.java) - тестовый класс содержит main метод, быстрая демонстрация работы метода.
  - [MyException](https://github.com/PaulJavaYoung/YLabHomeWork/tree/Lesson3/src/com/oldboy/tasks/Lesson3/PasswordValidator/MyException) - папка с пользовательскими исключениями.

- [OuterMergeSort](https://github.com/PaulJavaYoung/YLabHomeWork/tree/Lesson3/src/com/oldboy/tasks/Lesson3/OuterMergeSort): Реализация метода использующего алгоритм внешней сортировки слиянием.

  - [OuterMergeSortTestApp](https://github.com/PaulJavaYoung/YLabHomeWork/blob/Lesson3/src/com/oldboy/tasks/Lesson3/OuterMergeSort/OuterMergeSortTestApp.java) - тестовый класс содержит main метод, демонстрирует работу сортировщика.
  - [WorkClasses](https://github.com/PaulJavaYoung/YLabHomeWork/tree/Lesson3/src/com/oldboy/tasks/Lesson3/OuterMergeSort/WorkClasses) - папка содержит 'генератор шума' и валидатор сортировки.
  - [TemporaryFileBuffer](https://github.com/PaulJavaYoung/YLabHomeWork/blob/Lesson3/src/com/oldboy/tasks/Lesson3/OuterMergeSort/MyClasses/TemporaryFileBuffer.java) - класс фиксирует состояние временного(ных) файла(ов).
  - [Sorter](https://github.com/PaulJavaYoung/YLabHomeWork/blob/Lesson3/src/com/oldboy/tasks/Lesson3/OuterMergeSort/MyClasses/Sorter.java) - класс сортировщик.
  - Папки FileForSorted и SortedFile - содержат файл для сортировки и отсортированный файл.

PasswordValidator при изменении регулярного выражения позволяем пропускать без предупреждения пустые строки логина и пароля (нулевой длинны).

    Автор: Павел Ермолаев
    E-mail: paultrader@mail.ru

     
