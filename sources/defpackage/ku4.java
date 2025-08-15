package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* renamed from: ku4  reason: default package */
public final class ku4 implements iu4 {
    public static final o9g a = new o9g(14, new Object());
    public static final Set b = Collections.singleton(eu4.d);

    public final Set a() {
        return b;
    }

    public final DynamicRangeProfiles b() {
        return null;
    }

    public final Set c(eu4 eu4) {
        boolean equals = eu4.d.equals(eu4);
        c54.j("DynamicRange is not supported: " + eu4, equals);
        return b;
    }
}
