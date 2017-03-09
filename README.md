Demonstrates confusing behavior with `onErrorReturn`.

```
./gradlew run
```

Expected:

```
emitted b
emitted b
emitted err
emitted err
emitted a
complete
```

Actual:

```
emitted b
emitted b
emitted err
complete
```
