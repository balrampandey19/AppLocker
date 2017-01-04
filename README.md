# App lock library for Android

<img align="center" src='https://raw.githubusercontent.com/balrampandey19/AppLocker/master/Screen/icon.png' width='200' height='200'/>

AppLocker is a library for protect app with four digit pin.

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


# Download

#### The Gradle dependency is available via jCenter. jCenter is the default Maven repository used by Android Studio.


```
dependencies {

compile 'com.redcarpet.locker:1.0.0'

}

```

# License

```
   Copyright 2016 Redcarpet

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




