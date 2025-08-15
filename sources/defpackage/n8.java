package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: n8  reason: default package */
public final class n8 implements m56 {
    public static final n8 a = new Object();

    public final Object invoke(Object obj) {
        return String.valueOf(((WeakReference) obj).get());
    }
}
