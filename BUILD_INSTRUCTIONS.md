# Setup instructions for building APK in VS Code

## Prerequisites
1. Install Java JDK 11 or higher
2. Install Android SDK
3. Set up environment variables:
   - ANDROID_HOME: Path to Android SDK
   - JAVA_HOME: Path to Java JDK
   - Add gradle/bin and platform-tools to PATH

## Build APK
```bash
# Clean build
./gradlew clean

# Build debug APK
./gradlew assembleDebug

# Build release APK (if signing configured)
./gradlew assembleRelease
```

## APK Location
Debug APK: `app/build/outputs/apk/debug/app-debug.apk`
Release APK: `app/build/outputs/apk/release/app-release.apk`

## Install on Device
```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

## Troubleshooting
- If gradle build fails, check Java version: `java -version`
- Clear gradle cache: `./gradlew clean`
- Update SDK: `sdkmanager --update`
