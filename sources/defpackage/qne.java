package defpackage;

/* renamed from: qne  reason: default package */
public final class qne {
    public final ukg a = new ukg();

    public final void a(Exception exc) {
        this.a.m(exc);
    }

    public final void b(Object obj) {
        this.a.n(obj);
    }

    public final void c(Exception exc) {
        ukg ukg = this.a;
        ukg.getClass();
        fp3.o(exc, "Exception must not be null");
        synchronized (ukg.a) {
            try {
                if (!ukg.c) {
                    ukg.c = true;
                    ukg.f = exc;
                    ukg.b.z(ukg);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void d(Object obj) {
        ukg ukg = this.a;
        synchronized (ukg.a) {
            try {
                if (!ukg.c) {
                    ukg.c = true;
                    ukg.e = obj;
                    ukg.b.z(ukg);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
