package defpackage;

/* renamed from: q25  reason: default package */
public abstract class q25 extends v2 {
    public abstract void A(q36 q36, Object obj);

    public final int B(Object obj) {
        q36 f = f();
        try {
            A(f, obj);
            return f.n();
        } finally {
            t(f);
        }
    }

    public final void C(Iterable iterable) {
        q36 f = f();
        try {
            for (Object A : iterable) {
                A(f, A);
                f.n();
            }
        } finally {
            t(f);
        }
    }
}
