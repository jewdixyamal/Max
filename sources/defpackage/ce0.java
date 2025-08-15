package defpackage;

/* renamed from: ce0  reason: default package */
public final class ce0 implements iy1 {
    public final be0[] a;

    public ce0(be0[] be0Arr) {
        this.a = be0Arr;
    }

    public final void a() {
        for (be0 be0 : this.a) {
            cm4 cm4 = be0.c;
            if (cm4 == null) {
                cm4 = null;
            }
            cm4.dispose();
        }
    }

    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
