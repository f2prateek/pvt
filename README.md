# Pvt

`Pvt` contains a single `@Private` annotation.

Use `@Private` to indicate that the given field or method has package visibility solely to prevent
the creation of a synthetic method.

In practice, you should treat this field/method as if it were private.

When a private method is called from an inner class, the Java compiler generates a simple package
private shim method that the class generated from the inner class can call. This results in
unnecessary bloat and runtime method call overhead. It also gets us closer to the dex method count
limit.

If you'd like to see warnings for these synthetic methods in IntelliJ, turn on the inspections
"Private method only used from inner class" and "Private member access between outer and inner
classes".

Hat tip to Jake Wharton for pointing me to this in [Launcher3](https://android.googlesource.com/platform/packages/apps/Launcher3/+/master/src/com/android/launcher3/util/Thunk.java).

Usage
-----

```java
// Use it on fields.
@Private Foo foo;

// Use it on methods.
@Private void bar() {
  ...
}
```

See examples in [Tape](https://github.com/square/tape/pull/94) and [analytics-android](https://github.com/segmentio/analytics-android/pull/464).

Lint
----

In progress.

Download
--------

__Currently only available as a snapshot__

```groovy
compile 'com.f2prateek.pvt:pvt:0.1.0-SNAPSHOT'
```

Snapshots of the development version are available in [Sonatype's `snapshots` repository](https://oss.sonatype.org/content/repositories/snapshots/).


License
-------

    Copyright 2016 Prateek Srivastava

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
