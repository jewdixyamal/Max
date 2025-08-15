package defpackage;

import java.io.File;

/* renamed from: cq7  reason: default package */
public final class cq7 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public cq7(je7 je7, je7 je72, je7 je73) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, dq7, l00] */
    public final dq7 a(qq7 qq7, up7 up7) {
        boolean z = up7 instanceof j00;
        je7 je7 = this.b;
        je7 je72 = this.a;
        if (!z) {
            return new dq7(qq7, (p4d) je72.getValue(), (hle) je7.getValue(), up7);
        }
        p4d p4d = (p4d) je72.getValue();
        j00 j00 = (j00) up7;
        oz ozVar = (oz) this.c.getValue();
        ? dq7 = new dq7(qq7, p4d, (hle) je7.getValue(), j00);
        String str = j00.u0.s;
        if (str == null || str.length() == 0) {
            hm9.m("l00", "Start download attach", new Object[0]);
            qq7.C(true);
            die a2 = ozVar.a(j00.u0);
            a2.T(new f9(dq7, 1, j00), new ync(4, dq7));
            dq7.Y = a2;
            return dq7;
        }
        p4d.o(j00, new File(j00.u0.s));
        qq7.C(false);
        return dq7;
    }
}
