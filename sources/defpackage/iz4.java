package defpackage;

/* renamed from: iz4  reason: default package */
public enum iz4 implements tqb {
    ;

    public static void a(f2a f2a) {
        f2a.c(a);
        f2a.b();
    }

    public static void b(Throwable th, f2a f2a) {
        f2a.c(a);
        f2a.onError(th);
    }

    public static void c(Throwable th, erd erd) {
        erd.c(a);
        erd.onError(th);
    }

    public final void clear() {
    }

    public final void g() {
    }

    public final boolean h() {
        return this == a;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final int n(int i) {
        return 2;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final Object poll() {
        return null;
    }
}
