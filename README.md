# App lock library for Android
[![](https://jitpack.io/v/balrampandey19/AppLocker.svg)](https://jitpack.io/#balrampandey19/AppLocker)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)


<img align="center" src='https://raw.githubusercontent.com/balrampandey19/AppLocker/master/Screen/icon.png' width='200' height='200'/>

AppLocker is a library to protect apps using a four digit pin

This library allows you to implement a pin lock mechanism in your app easily.

Once enabled a four-digit passcode needs to be entered any time your mobile app is launched. This way your app is safe even if your smartphone or tablet falls into the wrong hands.


<img align="center" src='https://raw.githubusercontent.com/balrampandey19/AppLocker/master/Screen/screen.png' width='300' height='550'/>

# Usage


#### Initilize app loger in App Application class.

```
 AppLocker.getInstance().enableAppLock(this);
```


#### Extend LockActivity in all app activity as base activity.



```
 public class MainActivity extends LockActivity {
 
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
 
 }
```


#### Proguard

```
 -dontwarn com.balram.locker.**
```


### Download

#### Add it to your build.gradle with:
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
and:

```gradle
dependencies {
   compile 'com.github.balrampandey19:AppLocker:1.0.1'
}
```


# License

```
      Copyright 2016 Balram Pandey

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

```




