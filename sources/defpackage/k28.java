package defpackage;

/* renamed from: k28  reason: default package */
public final class k28 extends f28 {
    public final d38 a;

    public k28(d38 d38) {
        this.a = d38;
    }

    public final void g(b38 b38) {
        j28 j28 = new j28(0, b38);
        b38.c(j28);
        try {
            this.a.d(j28);
        } catch (Throwable th) {
            c37.B(th);
            j28.onError(th);
        }
    }
}
