# DroidDialog
This is an Android Library for showing Material Dialog with little customization with icons, colors, divider line.
<br>
Example is available in app module.

<p>
<img src="https://github.com/droidbyme/DroidDialog/blob/master/app/src/main/assets/device-2017-04-12-193622.png" alt="screenshot" width="270">

<img src="https://github.com/droidbyme/DroidDialog/blob/master/app/src/main/assets/device-2017-04-12-193442.png" alt="screenshot" width="270">

<img src="https://github.com/droidbyme/DroidDialog/blob/master/app/src/main/assets/device-2017-04-12-195446.png" alt="screenshot" width="270">

</p>

## Download

### Gradle dependency:
- Add the following to your project level build.gradle:
~~~
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
~~~
- Add this to your app build.gradle:
~~~
dependencies {
	compile 'com.github.vatsaldesai92:MyDynamicCalendarLibrary:1.0.1'
}
~~~

<!-- <p>
<a href="https://play.google.com/store/apps/details?id=com.desai.vatsal.myamazingcalendar&hl=en">
<img src="https://github.com/vatsaldesai92/MyDynamicCalendarLibrary/blob/master/app/src/main/assets/google_play_icon.png" alt="screenshot" width="270">
</a>
</p> -->

### Usage

- Create Builder Pattern for default Dialog.<br>Default Dialog has "Title" as dialog title, "Content Description" as content, "Yes" & "No" buttons.
~~~
    new DroidDialog.Builder(context)
                    .show();
~~~


- Add Icon<br>`.icon(int icon)`
~~~ 
    new DroidDialog.Builder(context)
                    .icon(R.drawable.ic_action_tick)
                    .show();
~~~

- Add Title<br>`.title(String title)`
~~~
    new DroidDialog.Builder(context)
                   .icon(R.drawable.ic_action_tick)
                   .title("All Well!")
                   .show();
~~~

- Add Content<br>`.content(String content)`
~~~
    new DroidDialog.Builder(context)
                    .icon(R.drawable.ic_action_tick)
                    .title("All Well!")
                    .content(getString(R.string.short_text))
                    .show();
~~~

- Cancelable and CancelableTouchOutside<br>`.cancelable(boolean isCancelable, boolean isCancelableTouchOutside)`

default : `.cancelable(true, false)`

~~~
    new DroidDialog.Builder(context)
                    .icon(R.drawable.ic_action_tick)
                    .title("All Well!")
                    .content(getString(R.string.short_text))
                    .cancelable(true, false)
                    .show();
~~~

- Add buttons and click event<br>`.positiveButton(String positiveText, onPositiveListener onPositiveListener)`<br>`.negativeButton(String negativeText, onNegativeListener onNegativeListener)`<br>`.neutralButton(String neutralText, onNeutralListener onNeutralListener)`
~~~
    new DroidDialog.Builder(context)
                    .icon(R.drawable.ic_action_tick)
                    .title("All Well!")
                    .content(getString(R.string.short_text))
                    .cancelable(true, true)
                    .positiveButton("OK", new DroidDialog.onPositiveListener() {
                        @Override
                        public void onPositive(Dialog droidDialog) {
                            Toast.makeText(context, "YES", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .negativeButton("NO", new DroidDialog.onNegativeListener() {
                        @Override
                        public void onNegative(Dialog droidDialog) {
                            Toast.makeText(context, "NO", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .neutralButton("DISMISS", new DroidDialog.onNeutralListener() {
                        @Override
                        public void onNeutral(Dialog droidDialog) {
                            Toast.makeText(context, "DISMISS", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .show();
~~~

- Add custom font from .ttf. Put your .ttf file at assets\fonts. Font will apply everywhere title, content, buttons <br>`.typeface(String typeface)`
~~~
    new DroidDialog.Builder(context)
                    .icon(R.drawable.ic_action_tick)
                    .title("All Well!")
                    .content(getString(R.string.short_text))
                    .cancelable(true, true)
                    .positiveButton("OK", new DroidDialog.onPositiveListener() {
                        @Override
                        public void onPositive(Dialog droidDialog) {
                            Toast.makeText(context, "YES", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .negativeButton("No", new DroidDialog.onNegativeListener() {
                        @Override
                        public void onNegative(Dialog droidDialog) {
    
                        }
                    })
                    .neutralButton("Neutral", new DroidDialog.onNeutralListener() {
                        @Override
                        public void onNeutral(Dialog droidDialog) {
    
                        }
                    })
                    .typeface("Roboto.ttf")
                    .show();
~~~

- Add animation while appear and disappearing dialog. 8 Types of animation is defined in `AnimationUtils` class.<br>`.animation(int animType)`
~~~
    new DroidDialog.Builder(context)
                    .icon(R.drawable.ic_action_tick)
                    .title("All Well!")
                    .content(getString(R.string.short_text))
                    .cancelable(true, true)
                    .positiveButton("OK", new DroidDialog.onPositiveListener() {
                        @Override
                        public void onPositive(Dialog droidDialog) {
                            Toast.makeText(context, "YES", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .negativeButton("No", new DroidDialog.onNegativeListener() {
                        @Override
                        public void onNegative(Dialog droidDialog) {
    
                        }
                    })
                    .neutralButton("Neutral", new DroidDialog.onNeutralListener() {
                        @Override
                        public void onNeutral(Dialog droidDialog) {
    
                        }
                    })
                    .typeface("regular.ttf")
                    .animation(AnimUtils.AnimFadeInOut)
                    .show();
~~~

- Customized Color<br>`.color(int titleBgColor, int iconTintColor, int buttonTextColor)`

default : `.color(ContextCompat.getColor(context, R.color.indigo), ContextCompat.getColor(context, R.color.white), ContextCompat.getColor(context, R.color.dark_indigo))`
~~~
    new DroidDialog.Builder(context)
                    .icon(R.drawable.ic_action_tick)
                    .title("All Well!")
                    .content(getString(R.string.short_text))
                    .cancelable(true, true)
                    .positiveButton("OK", new DroidDialog.onPositiveListener() {
                        @Override
                        public void onPositive(Dialog droidDialog) {
                            Toast.makeText(context, "YES", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .negativeButton("No", new DroidDialog.onNegativeListener() {
                        @Override
                        public void onNegative(Dialog droidDialog) {
    
                        }
                    })
                    .neutralButton("Neutral", new DroidDialog.onNeutralListener() {
                        @Override
                        public void onNeutral(Dialog droidDialog) {
    
                        }
                    })
                    .typeface("regular.ttf")
                    .animation(AnimUtils.AnimFadeInOut)
                    .color(ContextCompat.getColor(context, R.color.indigo), ContextCompat.getColor(context, R.color.white),
                                            ContextCompat.getColor(context, R.color.dark_indigo))
                    .show();
~~~

- Divider between topbar and title. If isDivider true then dividerColor is as params, if false then its negligible<br> `.divider(boolean isDivider, int dividerColor)`

default : `.divider(false, ContextCompat.getColor(context, R.color.orange))`
~~~
    new DroidDialog.Builder(context)
                    .icon(R.drawable.ic_action_tick)
                    .title("All Well!")
                    .content(getString(R.string.short_text))
                    .cancelable(true, true)
                    .positiveButton("OK", new DroidDialog.onPositiveListener() {
                        @Override
                        public void onPositive(Dialog droidDialog) {
                            Toast.makeText(context, "YES", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .negativeButton("No", new DroidDialog.onNegativeListener() {
                        @Override
                        public void onNegative(Dialog droidDialog) {
    
                        }
                    })
                    .neutralButton("Neutral", new DroidDialog.onNeutralListener() {
                        @Override
                        public void onNeutral(Dialog droidDialog) {
    
                        }
                    })
                    .typeface("regular.ttf")
                    .animation(AnimUtils.AnimFadeInOut)
                    .color(ContextCompat.getColor(context, R.color.indigo), ContextCompat.getColor(context, R.color.white),
                            ContextCompat.getColor(context, R.color.dark_indigo))
                    .divider(true, ContextCompat.getColor(context, R.color.orange))
                    .show();
~~~


### License
~~~
    Apache Version 2.0

    Copyright 2016.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
~~~
