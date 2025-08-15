package defpackage;

/* renamed from: k43  reason: default package */
public final class k43 implements AutoCloseable, sx3 {
    public final lx3 a;

    public k43(lx3 lx3) {
        this.a = lx3;
    }

    public final void close() {
        pag.d(this.a);
    }

    public final lx3 getCoroutineContext() {
        return this.a;
    }
}
