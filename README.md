# CastarSDK-Android Demo

This is an example project demonstrating how to integrate and use CastarSDK。

## Function characteristics

- Demonstrate the basic initialization process of CastarSDK
- Display the usage method of core functions
- Provide complete Kotlin example code

## System requirements 

- ARMv7 and ARMv8 architectures
- Android system 4.3+


## Installation instructions

1. Clone this repository:
   ```bash
   git clone https://github.com/Castar-SDK/android-demo
   ```

2. download the `CastarSdk.aar` from official website

3. Add the CastarSdk.aar file to your project,put it into `App` module's `libs` directory.

4. open `build.gradle` and run the project

## Use method

1. Implementation sdk in your app module's build.gradle file
   ```kotlin
   implementation(files("libs/CastarSdk.aar"))

   ```
2. Add internet permission in your app module's AndroidManifest.xml file
   ```kotlin
   <uses-permission android:name="android.permission.INTERNET" />
   ```

3. start sdk in your main activity or application:
   ```kotlin
   GlobalScope.launch(Dispatchers.IO) {
                    CastarSdk.Start(this@MyApplication, "CSK****FHQlUQZ")
   }
   ```
4. stop
   ```kotlin
   CastarSdk.Stop()
   ```
   
## Attention

- Before use, it is necessary to register on the official website and obtain a developer key (DevKey)
- Before use, it is necessary to register on the official website and obtain a developer key (DevKey)
- Castar.aar not included in this repository, needs to be downloaded separately

## Permission

MIT License - check [LICENSE](LICENSE) to know detail

## Link

- [Castar website](https://www.castarsdk.com/)
- [SDK Document](https://docs.castarsdk.com/)
