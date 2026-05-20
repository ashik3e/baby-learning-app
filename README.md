# Baby Learning Emoji Game 🎮

একটি শিশু-বান্ধব শিক্ষামূলক অ্যাপ যেখানে শিশুরা বিভিন্ন প্রাণী এবং বস্তু শিখতে পারে।

## ফিচার 🌟

- 🐶 **২০টি ইমোজি**: প্রাণী এবং বস্তু
- 🔊 **অডিও প্রফেশনাল**: প্রতিটি আইটেমের জন্য সাউন্ড
- 🇧🇩 **বাংলা সাপোর্ট**: সম্পূর্ণ বাংলা ইন্টারফেস
- 🎮 **স্কোর ট্র্যাকিং**: খেলার সময় স্কোর বৃদ্ধি
- 📱 **মোবাইল অপটিমাইজড**: সব ডিভাইসে সামঞ্জস্যপূর্ণ

## প্রযুক্তি 🛠️

- **Language**: Kotlin
- **Minimum SDK**: 21
- **Target SDK**: 33
- **Build Tool**: Gradle 7.5
- **CI/CD**: GitHub Actions

## ইনস্টলেশন 📥

### Local এ চালান:
```bash
git clone https://github.com/ashik3e/baby-learning-app.git
cd baby-learning-app
./gradlew assembleDebug
```

### APK ডাউনলোড করুন:
1. [GitHub Actions](https://github.com/ashik3e/baby-learning-app/actions) এ যান
2. সবচেয়ে সাম্প্রতিক সফল "Build APK" রান খুঁজুন
3. Artifacts থেকে `app-debug-apk` ডাউনলোড করুন
4. APK ফাইল আনজিপ করে ইনস্টল করুন

### Emulator এ চালান:
```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

## GitHub Actions 🚀

এই প্রজেক্টে স্বয়ংক্রিয় APK বিল্ডিং সক্ষম:
- ✅ প্রতি Push এ APK তৈরি হয়
- ✅ Artifacts এ ডাউনলোডযোগ্য (৩০ দিনের জন্য)
- ✅ Release Tag দিলে স্বয়ংক্রিয় রিলিজ তৈরি হয়

## ফাইল স্ট্রাকচার 📁

```
baby-learning-app/
├── .github/
│   └── workflows/
│       └── build.yml                # GitHub Actions Workflow
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/ashik3e/babylearning/
│   │   │   │       ├── MainActivity.kt       # Main Activity
│   │   │   │       ├── EmojiItem.kt          # Data Model
│   │   │   │       └── SoundManager.kt       # Audio Manager
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   └── strings.xml
│   │   │   │   └── raw/
│   │   │   │       └── (sound files)
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle
├── gradle/
│   └── wrapper/
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── build.gradle
├── settings.gradle
├── gradle.properties
├── .gitignore
└── README.md
```

## ডেভেলপমেন্ট 💻

### প্রয়োজনীয় টুলস:
- Android Studio 4.0+
- JDK 11+
- Gradle 7.5+

### প্রজেক্ট চালান:
1. Android Studio এ খুলুন
2. Gradle Sync করুন
3. Run 'app' বাটনে ক্লিক করুন

## অবদান রাখুন 🤝

Pull Request সবসময় স্বাগত! বড় পরিবর্তনের জন্য প্রথমে একটি Issue খুলুন।

## লাইসেন্স 📄

এই প্রজেক্ট MIT লাইসেন্সের অধীন।

## যোগাযোগ 📧

- **Developer**: Md. Ashik Mia
- **Email**: ashik3e.duet@gmail.com
- **GitHub**: [@ashik3e](https://github.com/ashik3e)

---

**Made with ❤️ for babies learning** 👶
**Last Updated**: 2026-05-20
