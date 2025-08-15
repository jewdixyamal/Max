package defpackage;

/* renamed from: s60  reason: default package */
public final /* synthetic */ class s60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz7 b;
    public final /* synthetic */ a70 c;

    public /* synthetic */ s60(qz7 qz7, a70 a70, int i) {
        this.a = i;
        this.b = qz7;
        this.c = a70;
    }

    public final void run() {
        a70 a70 = this.c;
        qz7 qz7 = this.b;
        int i = this.a;
        qz7.getClass();
        switch (i) {
            case 0:
                int i2 = oaf.a;
                i74 i74 = ((o75) qz7.c).a.D0;
                fd F = i74.F();
                i74.I(F, 1032, new y64(F, a70, 1));
                return;
            default:
                int i3 = oaf.a;
                i74 i742 = ((o75) qz7.c).a.D0;
                fd F2 = i742.F();
                i742.I(F2, 1031, new y64(F2, a70, 0));
                return;
        }
    }
}
