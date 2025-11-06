[![Actions Status](https://github.com/nesquikpro/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/nesquikpro/java-project-61/actions)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=nesquikpro_java-project-61&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=nesquikpro_java-project-61)


# 🎮 Brain Games / Мозговые Игры

## Описание проекта

**Brain Games** — это консольное приложение с набором логико-математических мини-игр.  
Каждая игра задаёт пользователю несколько вопросов — нужно ответить на все правильно, чтобы победить.

Проект создан в рамках учебной программы [Hexlet](https://hexlet.io) на языке **Java**.

---

## 🧩 Игры

1. **Чётное или нечётное** — определите, является ли число чётным  
   [![asciicast](https://asciinema.org/a/4h2F4rXqpxK69x8TiNt82cBuv.svg)](https://asciinema.org/a/4h2F4rXqpxK69x8TiNt82cBuv)

2. **Калькулятор** — вычислите результат выражения  
   [![asciicast](https://asciinema.org/a/wj9hd6SziJBEPnQkgG6zLQ8bb.svg)](https://asciinema.org/a/wj9hd6SziJBEPnQkgG6zLQ8bb)

3. **НОД** — найдите наибольший общий делитель  
   [![asciicast](https://asciinema.org/a/brtJWjxLvu4TB0AbupWqgjjiq.svg)](https://asciinema.org/a/brtJWjxLvu4TB0AbupWqgjjiq)

4. **Арифметическая прогрессия** — угадайте пропущенное число  
   [![asciicast](https://asciinema.org/a/PpByYoBjcxLZ19bYUint1GX4a.svg)](https://asciinema.org/a/PpByYoBjcxLZ19bYUint1GX4a)

5. **Простое число** — определите, является ли число простым  
   [![asciicast](https://asciinema.org/a/zzhsMgSj0QOC4JFVxZDA2VEWg.svg)](https://asciinema.org/a/zzhsMgSj0QOC4JFVxZDA2VEWg)

---

## ⚙️ Установка и запуск

### Требования
- **Java 17+**
- **Gradle**
- **Make** (для удобного запуска)

### 🪟 Windows
```bash
git clone https://github.com/nesquikpro/java-project-61.git
cd app
./gradlew build
./gradlew run
```

> 💡 Если установлен `make` (через WSL или Git Bash), можно использовать:
> ```bash
> make build
> make run
> ```

### 🐧 Linux / macOS
```bash
git clone https://github.com/nesquikpro/java-project-61.git
cd app
make build
make run
```

### Команды Makefile
```bash
make clean      # очистка сборки
make build      # сборка проекта
make run        # запуск через Gradle
make run-app    # запуск напрямую через Java
```

После запуска выберите нужную игру и следуйте инструкциям в консоли 🎮

---
