package defpackage;

import java.util.List;

/* renamed from: fe4  reason: default package */
public final /* synthetic */ class fe4 implements ue4, mq1, rj8, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fe4(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public void accept(Object obj) {
        ((x4b) obj).m0((h30) this.c, this.b);
    }

    public ffc i(int i, qze qze, int[] iArr) {
        ww6 i2 = zw6.i();
        for (int i3 = 0; i3 < qze.a; i3++) {
            int i4 = i;
            qze qze2 = qze;
            int i5 = i3;
            i2.a(new he4(i4, qze2, i5, (ne4) this.c, iArr[i3], this.b));
        }
        return i2.j();
    }

    public Object k(ii8 ii8, oh8 oh8, int i) {
        switch (this.a) {
            case 2:
                ffc n = zw6.n((tb8) this.c);
                boolean z = this.b;
                return ii8.q(oh8, n, z ? -1 : ii8.s.p0(), z ? -9223372036854775807L : ii8.s.k());
            default:
                boolean z2 = this.b;
                return ii8.q(oh8, (ffc) ((List) this.c), z2 ? -1 : ii8.s.p0(), z2 ? -9223372036854775807L : ii8.s.k());
        }
    }

    public String q(lq1 lq1) {
        switch (this.a) {
            case 1:
                xs5 xs5 = (xs5) this.c;
                xs5.getClass();
                xs5.b.execute(new av2((Object) xs5, this.b, (Object) lq1, 1));
                return "enableExternalFlashAeMode";
            default:
                bye bye = (bye) this.c;
                bye.getClass();
                boolean z = this.b;
                bye.d.execute(new av2((Object) bye, (Object) lq1, z, 5));
                return "enableTorch: " + z;
        }
    }
}
