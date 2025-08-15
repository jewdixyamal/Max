package defpackage;

import java.io.Closeable;

/* renamed from: dsc  reason: default package */
public final class dsc implements ug7, Closeable {
    public final String a;
    public final csc b;
    public boolean c;

    public dsc(String str, csc csc) {
        this.a = str;
        this.b = csc;
    }

    public final void a(mm mmVar, gh7 gh7) {
        if (!this.c) {
            this.c = true;
            gh7.a(this);
            mmVar.f(this.a, this.b.e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public final void close() {
    }

    public final void m(eh7 eh7, eg7 eg7) {
        if (eg7 == eg7.ON_DESTROY) {
            this.c = false;
            eh7.Q().f(this);
        }
    }
}
