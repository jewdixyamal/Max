package defpackage;

import java.util.Map;

/* renamed from: b9f  reason: default package */
public final /* synthetic */ class b9f implements bb3, d38 {
    public final /* synthetic */ c9f a;
    public final /* synthetic */ d7f b;

    public /* synthetic */ b9f(c9f c9f, d7f d7f) {
        this.a = c9f;
        this.b = d7f;
    }

    public void b(ra3 ra3) {
        ((Map) this.a.b).remove(this.b);
        ra3.b();
    }

    public void d(j28 j28) {
        v6f v6f = (v6f) ((Map) this.a.b).get(this.b);
        if (v6f != null) {
            if (!j28.h()) {
                j28.a(v6f);
            }
        } else if (!j28.h()) {
            j28.b();
        }
    }
}
