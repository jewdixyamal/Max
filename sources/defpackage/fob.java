package defpackage;

/* renamed from: fob  reason: default package */
public abstract class fob extends iob implements zb7 {
    public mb7 computeReflected() {
        nec.a.getClass();
        return this;
    }

    public Object getDelegate() {
        return ((zb7) getReflected()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    public yb7 getGetter() {
        ((zb7) getReflected()).getGetter();
        return null;
    }
}
