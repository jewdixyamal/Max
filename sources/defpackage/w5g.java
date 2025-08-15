package defpackage;

/* renamed from: w5g  reason: default package */
public final class w5g {
    public final qi9 a = new qi9(1);
    public final qi9 b = new qi9(1);

    public final pnf a(Class cls) {
        String i = wg0.i("one.me.sdk.arch.ViewModelStore:key:", cls.getCanonicalName());
        qi9 qi9 = this.a;
        pnf pnf = (pnf) qi9.f(i);
        if (cls.isInstance(pnf)) {
            Object cast = cls.cast(pnf);
            if (cast != null) {
                return (pnf) cast;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        qi9 qi92 = this.b;
        onf onf = (onf) qi92.f(i);
        Object f = qi92.f(i);
        if (f != null) {
            pnf a2 = ((onf) f).a(cls);
            qi9.k(i, a2);
            return a2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
