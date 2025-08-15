package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: hmb  reason: default package */
public final /* synthetic */ class hmb implements m56 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pnf o;

    public /* synthetic */ hmb(long j, b8e b8e, boolean z) {
        this.b = j;
        this.o = b8e;
        this.c = z;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int ordinal = ((yha) obj).ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                    cnb cnb = (cnb) this.o;
                    j47.T(cnb.a, (lx3) null, (vx3) null, new xmb(cnb, this.b, this.c, (Continuation) null), 3);
                } else if (ordinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return e5f.a;
            default:
                d2e d2e = (d2e) obj;
                String str = d2e.s0;
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    str = d2e.o;
                }
                String str2 = str;
                String str3 = ((se5) ((qe5) ((b8e) this.o).s0.getValue())).w() ? d2e.z0 : null;
                long j = this.b;
                boolean z = this.c;
                long j2 = d2e.a;
                return new z2e(d2e.a, j, d2e.v0, str2, d2e.w0, str3, 0, 0, false, false, z ? Math.abs(j) - j2 : j2, 4032);
        }
    }

    public /* synthetic */ hmb(cnb cnb, long j, boolean z) {
        this.o = cnb;
        this.b = j;
        this.c = z;
    }
}
