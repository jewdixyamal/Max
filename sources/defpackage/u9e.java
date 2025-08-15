package defpackage;

/* renamed from: u9e  reason: default package */
public abstract class u9e extends dl {
    public final Object b;

    public u9e(String str, String str2) {
        super(str);
        this.b = str2;
    }

    public final void d(kb7 kb7) {
        Object obj = this.b;
        if (obj == null || ((CharSequence) obj).length() == 0) {
            kb7.getClass();
            return;
        }
        kb7.g0(this.a);
        ((t1) kb7).i((String) obj);
    }

    public final String toString() {
        return this.a + " = " + this.b;
    }
}
