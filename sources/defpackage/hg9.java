package defpackage;

import java.util.List;

/* renamed from: hg9  reason: default package */
public final /* synthetic */ class hg9 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg9 b;

    public /* synthetic */ hg9(jg9 jg9, int i) {
        this.a = i;
        this.b = jg9;
    }

    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                num.getClass();
                dg9 dg9 = this.b.c;
                List D0 = x53.D0(((xf9) dg9.d.getValue()).b);
                if (D0.isEmpty()) {
                    dg9.a();
                } else {
                    dg9.c.invoke(D0, num);
                }
                return e5f.a;
            default:
                int intValue = num.intValue();
                jg9 jg9 = this.b;
                a3g a3g = jg9.b;
                return Boolean.valueOf((a3g.j() < intValue || intValue < 0) ? false : ((xf9) jg9.c.e.a.getValue()).b.contains(Long.valueOf(((z2e) ((ol7) a3g.C(intValue))).a)));
        }
    }
}
