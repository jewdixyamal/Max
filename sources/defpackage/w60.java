package defpackage;

/* renamed from: w60  reason: default package */
public final /* synthetic */ class w60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz7 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ w60(qz7 qz7, Exception exc, int i) {
        this.a = i;
        this.b = qz7;
        this.c = exc;
    }

    public final void run() {
        Exception exc = this.c;
        qz7 qz7 = this.b;
        int i = this.a;
        qz7.getClass();
        switch (i) {
            case 0:
                int i2 = oaf.a;
                i74 i74 = ((o75) qz7.c).a.D0;
                fd F = i74.F();
                i74.I(F, 1029, new v64((Object) F, 18, (Object) exc));
                return;
            default:
                int i3 = oaf.a;
                i74 i742 = ((o75) qz7.c).a.D0;
                fd F2 = i742.F();
                i742.I(F2, 1014, new v64((Object) F2, 22, (Object) exc));
                return;
        }
    }
}
