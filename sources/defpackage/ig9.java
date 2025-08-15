package defpackage;

import one.me.messages.list.loader.MessageModel;

/* renamed from: ig9  reason: default package */
public final /* synthetic */ class ig9 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg9 b;

    public /* synthetic */ ig9(kg9 kg9, int i) {
        this.a = i;
        this.b = kg9;
    }

    public final Object invoke(Object obj) {
        MessageModel L;
        ijf d;
        int i;
        int i2 = this.a;
        int intValue = ((Integer) obj).intValue();
        switch (i2) {
            case 0:
                kg9 kg9 = this.b;
                m29 m29 = kg9.b;
                boolean z = false;
                if (m29.j() > intValue && intValue >= 0 && (L = m29.L(intValue)) != null) {
                    z = ((yf9) kg9.c.g.a.getValue()).a.contains(Long.valueOf(L.a));
                }
                return Boolean.valueOf(z);
            case 1:
                MessageModel L2 = this.b.b.L(intValue);
                boolean z2 = false;
                if (L2 != null) {
                    o00 o00 = L2.u0.d;
                    wgf wgf = o00 instanceof wgf ? (wgf) o00 : null;
                    boolean z3 = (wgf == null || (d = wgf.d()) == null || d.a != wgf.a || (i = d.X) == 1 || i == 5) ? false : true;
                    if ((L2.D0 || z3) && L2.y0 == null && L2.z0 == null) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                MessageModel L3 = this.b.b.L(intValue);
                boolean z4 = false;
                if (L3 != null && !ry8.a(L3.I0, 0) && !ry8.a(L3.I0, 131072)) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
        }
    }
}
