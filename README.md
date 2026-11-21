# Caller Voice — Android starter project

Native Android app (Kotlin) that announces incoming callers while the phone is in use or the screen is locked. It looks up the caller in contacts and reads the name; if no contact match is found, it reads the incoming number when Android/carrier permissions make that number available.

## Included
- Arabic + English bilingual announcement, Arabic-only, and English-only modes
- One or two announcement cycles
- Announcement volume setting
- Test-voice button
- Incoming-call receiver and local contact lookup
- No internet permission; no contact or call data is uploaded

## Build requirements
- Android Studio Ladybug or newer
- JDK 17
- Android SDK Platform 35
- Android Gradle Plugin 8.7.3 / Gradle 8.9

Open this project folder in Android Studio, allow Gradle sync, then select **Build > Build Bundle(s) / APK(s) > Build APK(s)**. The debug APK should appear at `app/build/outputs/apk/debug/app-debug.apk`.

## First-run setup
1. Install the debug APK and open Caller Voice.
2. Grant Phone, Contacts, and Call Log permissions. Call Log permission is requested because Android versions/carriers may otherwise hide the incoming number from the phone-state broadcast. If denied, caller-name/number detection may be incomplete.
3. In Android Text-to-speech settings, install Arabic and English voice data. Voice availability depends on the device and selected TTS engine.
4. Ensure the phone is not in Silent or Vibrate mode for announcements; the app currently respects the ringer mode.
5. Test with a real incoming call, both while using another app and with the screen locked.

## Important limitations
- This is source code, not a compiled or device-tested APK. It must be built and tested on a real Android device.
- Android/OEM background-execution and call-broadcast behavior varies. OPPO/ColorOS may require allowing Caller Voice to run in the background and disabling battery optimization for the app.
- Android and carrier restrictions can hide the incoming number. In that case, the app may announce an unknown caller.
- `READ_CALL_LOG` is a sensitive Android permission and may be restricted by Google Play policy. This starter is intended for personal sideload/testing; do not publish it on Google Play without checking the current policy and eligible use case.
- Bluetooth routing is controlled by Android's Text-to-speech/audio routing. It should be verified on the target headset/device.
