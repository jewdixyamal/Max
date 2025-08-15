package defpackage;

import java.util.Objects;

/* renamed from: ggg  reason: default package */
public final class ggg extends ClassLoader {
    public final Class loadClass(String str, boolean z) {
        return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? sgg.class : super.loadClass(str, z);
    }
}
