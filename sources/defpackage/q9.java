package defpackage;

/* renamed from: q9  reason: default package */
public final class q9 extends rg4 {
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9(fi0 fi0, int i) {
        super(fi0);
        this.c = i;
    }

    public final void h(int i, Object obj) {
        switch (this.c) {
            case 0:
                g05 g05 = (g05) obj;
                fi0 fi0 = this.b;
                if (g05 == null) {
                    fi0.g(i, (Object) null);
                    return;
                }
                if (!g05.U(g05)) {
                    g05.n0();
                }
                fi0.g(i, g05);
                return;
            case 1:
                o43 o43 = (o43) obj;
                if (!fi0.b(i)) {
                    this.b.g(i, o43);
                    return;
                }
                return;
            case 2:
                g05 g052 = (g05) obj;
                o43 o432 = null;
                try {
                    if (g05.m0(g052) && g052 != null) {
                        o432 = o43.o(g052.a);
                    }
                    this.b.g(i, o432);
                    return;
                } finally {
                    o43.S(o432);
                }
            default:
                if (fi0.a(i)) {
                    this.b.g(i, (Object) null);
                    return;
                }
                return;
        }
    }
}
