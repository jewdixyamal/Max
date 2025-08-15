package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: tk5  reason: default package */
public final class tk5 extends ThreadPoolExecutor {
    public final void finalize() {
        shutdown();
    }
}
