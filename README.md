# Quick-Ktx

![JCenter](https://api.bintray.com/packages/xch168/quick-android/quick-ktx/images/download.svg)

## Features

- ImageViewExt
- NumberExt
- ViewExt

## Getting started

In your `build.gradle`:

```groovy
dependencies {
    implementation 'com.github.android.quick:quick-ktx:0.0.1'
}
```

## Usage

convert dp to px:

```kotlin
val px = 8.dp
// or
val px = 10.5f.dp
```

load remote image:

```kotlin
val imageView: ImageView = ...
// use url extended property
imageView.url = imageUrl
// or use load extended method
imageView.load(url)
// with placeholder
imageView.load(url, placeholderResId)
```

To prevent continuous clicking

```kotlin
val view = ...
view.setOnSafeClickListener {
    // your onClick code
}
// or with time threshold
view.setOnSafeClickListener(1000L) {
    // your onClick code
}
```

