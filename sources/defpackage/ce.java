package defpackage;

/* renamed from: ce  reason: default package */
public abstract class ce {
    public static final ztc a;

    static {
        try {
            ztc ztc = (ztc) new ae(0).call();
            if (ztc != null) {
                a = ztc;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw q45.f(th);
        }
    }

    public static ztc a() {
        ztc ztc = a;
        if (ztc != null) {
            return ztc;
        }
        throw new NullPointerException("scheduler == null");
    }
}
