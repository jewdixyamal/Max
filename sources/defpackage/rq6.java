package defpackage;

import java.io.Closeable;

/* renamed from: rq6  reason: default package */
public final class rq6 implements Closeable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Closeable o;

    public /* synthetic */ rq6(int i, Object obj, Closeable closeable, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.o = closeable;
    }

    private final void m() {
    }

    public final void close() {
        switch (this.a) {
            case 0:
                return;
            default:
                k36 k36 = (k36) this.o;
                if (k36 != null) {
                    k36.close();
                    return;
                }
                return;
        }
    }
}
