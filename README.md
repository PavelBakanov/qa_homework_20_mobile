# Тесты приложения Wikipedia на эмуляторе Android устройства и ферме мобильных устройств [browserstack.com](https://www.browserstack.com/) в качестве дипломной работы для qa.guru
## Содержание

* <a href="#tests">Что делают тесты?</a>
* <a href="#tools">Технологии</a>
* <a href="#launch">Запуск</a>
* <a href="#allure">Отчет в Allure</a>
* <a href="#telegramBot">Бот в Telegram</a>
* <a href="#video">Видео прохождения тестов</a>

---
<a id="tests"></a>
## <a name="Что делают тесты?">**Что делают тесты?**</a>

Три теста, тестирующие функционал приложения.

---
<a id="tools"></a>
## <a name="Технологии:">**Технологии:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50" alt="Allure"/></a>  
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://appium.io/"><img src="images/logo/Appium.svg" width="50" height="50"  alt="Appium"/></a>  
<a href="https://rest-assured.io/"><img src="images/logo/RestAssured.svg" width="50" height="50"  alt="RestAssured"/></a>  
</p>

---

<a id="launch"></a>
## <a name="Запуск">**Запуск**</a>

Для запуска локально нужно:
 - Установить [android studio](https://developer.android.com/studio)
 - Прописать настройки:
Параметры Path:
Windows:
%ANDROID_HOME%\tools
%ANDROID_HOME%\tools\bin
%ANDROID_HOME%\platform-tools
Mac:
export ANDROID_HOME=/Users/stanislav/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools
source ~/.bash_profile
- В Android Studio -> SDK Manager скачать 11 андроид (если не скачан по умолчанию)
- В AVD Manager скачать образ Pixel 4 для 11 андроида (если не скачан по умолчанию)
- Запустить эмулятор телефона (Pixel 4, android 11)
- Установить [node.js](https://nodejs.org/en/download)
- Установить [Appium Server](https://github.com/appium/appium)
- Открыть консоль и прописать там:
npm install -g appium@next для установки Appium Server и appium driver install uiautomator2 для установки uiautomator2
- Установить [Appium Ispector](https://github.com/appium/appium-inspector)
- Открыть его, и в качестве конфига прописать там:
- {
  "platformName": "Android",
  "appium:deviceName": "Pixel 4 API 30",
  "appium:automationName": "UiAutomator2"
  }
- Запустить Appium Server командой из консоли appium server --base-path /wd/hub
- В терминале IDE запустить проект командой ./gradlew clean wikipedia_test -DdeviceHost=emulation 

Так же тесты можно запустить через [Jenkins](https://jenkins.autotests.cloud/job/qa_diplom_mobile/). Они запустятся на ферме BrowserStack
<img src="images/Jenkins.png" width="900">

---

<a id="allure"></a>
## <a name="Отчет в Allure">**Отчет в Allure**</a>

После выполнения тестов можно посмотреть отчет в [Allure](https://jenkins.autotests.cloud/job/qa_diplom_mobile/allure/)
### На скриншоте один из результатов выполнения тестов:

<img src="images/AllureReport.png" width="900">

---

<a id="telegramBot"></a>
## <a name="Бот в Telegram">**Бот в Telegram**</a>

После выполнения отчета результат так же предоставит бот в Telegram:
<p align="center">
    <img src="images/TelegramBot.png">
</p>

---

<a id="video"></a>
<h1 align="center">Видео прохождения тестов</h1>

<p align="center">
<img title="testResultsVideo1" src="images/videos/testResultsVideo1.gif" width="400" height="700"  alt="video">   
</p>
<p align="center">
<img title="testResultsVideo2" src="images/videos/testResultsVideo2.gif" width="400" height="700"  alt="video">   
</p>
<p align="center">
<img title="testResultsVideo3" src="images/videos/testResultsVideo3.gif" width="400" height="700"  alt="video">   
</p>
