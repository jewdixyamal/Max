package defpackage;

import android.view.Choreographer;

/* renamed from: jhb  reason: default package */
public abstract class jhb {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new eg(1, runnable));
    }
}
