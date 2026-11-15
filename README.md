# L23 7even – Android starter project

This is the first Android Studio project wrapper for the existing L23 7even offline bookkeeping prototype.

## Included
- Android launcher activity and app manifest
- Existing L23 7even interface bundled at `app/src/main/assets/index.html`
- JavaScript and DOM storage enabled so the prototype's local browser storage can persist on the device
- No network permission; the bundled app interface runs offline
- App id: `com.l237even.bookkeeping`

## Open and build
1. Install Android Studio on a computer.
2. Extract this ZIP.
3. In Android Studio choose **Open** and select the extracted `L23_7even_Android` folder.
4. Allow Gradle sync and install the Android SDK platform 35 if prompted.
5. Connect an Android phone with USB debugging enabled, or create an emulator.
6. Press **Run** to install the app. To make an APK use **Build > Build APK(s)**.

## Important first-version notes
- This is an Android app shell around the offline HTML prototype, not yet a fully native Kotlin UI.
- The prototype saves records in WebView local storage on that device. Use its **Download Backup** feature regularly.
- Clearing app data or uninstalling may erase local records. Export a backup first.
- The existing prototype uses weighted-average cost for new purchases and captures cost at the time of sale for profit reporting.
- Before using it for real store accounts, test sample purchases, sales, expenses, debt payments and backup/restore carefully.

## Next development stage
Move the data layer from WebView local storage into a native SQLite/Room database, then add native backup/restore and receipt printing/sharing.
