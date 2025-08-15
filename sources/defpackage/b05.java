package defpackage;

/* renamed from: b05  reason: default package */
public enum b05 implements vqb {
    ;

    public static void a(vae vae) {
        vae.f(a);
        vae.b();
    }

    public static void b(Throwable th, vae vae) {
        vae.f(a);
        vae.onError(th);
    }

    public final void cancel() {
    }

    public final void clear() {
    }

    public final boolean isEmpty() {
        return true;
    }

    public final void j(long j) {
        zae.d(j);
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

    public final String toString() {
        return "EmptySubscription";
    }
}
