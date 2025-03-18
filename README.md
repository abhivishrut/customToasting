# Custom Toasting

> Step 1. Add the JitPack repository to your build file.

Add it in your settings.gradle.kts at the end of repositories:

```gradle
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url = uri("https://jitpack.io") }
		}
	}
```
> Step 2. Add the dependency.

```gradle
dependencies {
	        implementation("com.github.abhivishrut:customToasting:1.0.3")
	}
```

> Step 3. Add the Code.
# For JAVA
(MainActivity.java)
```
	Toaster.doneToast(this, "Success Button");

	Toaster.alertToast(this, "Error Button");

	Toaster.warningToast(this, "Warning Button");

	Toaster.loadingToast(this, "Loading Button");

	Toaster.infoToast(this, "Info Button");

	Toaster.shortToast(this, "Short Toast");

	Toaster.longToast(this, "Long Toast");




View rootView = getWindow().getDecorView().findViewById(android.R.id.content);	// Must Add this line for Snackbar

	Toaster.doneSnackbar(rootView, "Success Snackbar");

	Toaster.alertSnackbar(rootView, "Error Snackbar");

	Toaster.infoSnackbar(rootView, "Info Snackbar");

	Toaster.warningSnackbar(rootView, "Warning Snackbar");
```

# For KOTLIN
(MainActivity.kt)
```
	Toaster.shortToast(this, "Short Toast")

        Toaster.longToast(this, "Long Toast")

        Toaster.doneToast(this, "Success Button")

        Toaster.alertToast(this, "Error Button")

        Toaster.warningToast(this, "Warning Button")

        Toaster.loadingToast(this, "Loading Button")

        Toaster.infoToast(this, "Info Button")



        val rootView: View = window.decorView.findViewById(android.R.id.content)	// Must Add this line for Snackbar

        Toaster.doneSnackbar(rootView, "Success Snackbar")

        Toaster.alertSnackbar(rootView, "Error Snackbar")

        Toaster.warningSnackbar(rootView, "Warning Snackbar")

        Toaster.infoSnackbar(rootView, "Info Snackbar")
```

# Preview
https://github.com/user-attachments/assets/aa159422-9ab4-4fde-8785-a66b8a9995d3
