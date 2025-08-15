package defpackage;

import java.io.Closeable;

/* renamed from: xf  reason: default package */
public final class xf implements Closeable {
    public final int a;
    public final o43 b;

    public xf(int i, v84 v84) {
        this.a = i;
        this.b = v84;
    }

    public final void close() {
        this.b.close();
    }
}
