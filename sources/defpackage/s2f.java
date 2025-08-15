package defpackage;

/* renamed from: s2f  reason: default package */
public final class s2f extends u2f {
    public boolean b;
    public final /* synthetic */ jj5 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s2f(jj5 jj5, Object obj) {
        super(obj);
        this.c = jj5;
        c6d c6d = jj5.X;
    }

    public final Object a() {
        boolean z = this.b;
        jj5 jj5 = this.c;
        Object obj = this.a;
        if (z) {
            m56 m56 = ((v2f) jj5.X).e;
            if (m56 == null) {
                return null;
            }
            m56.invoke(obj);
            return null;
        }
        this.b = true;
        m56 m562 = ((v2f) jj5.X).d;
        if (m562 != null) {
            Boolean bool = (Boolean) m562.invoke(obj);
        }
        return obj;
    }
}
