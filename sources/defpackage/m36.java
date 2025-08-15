package defpackage;

/* renamed from: m36  reason: default package */
public final class m36 extends RuntimeException {
    public final int a;
    public final Throwable b;

    public m36(Throwable th, int i) {
        super(th);
        this.a = i;
        this.b = th;
    }

    public final Throwable getCause() {
        return this.b;
    }
}
