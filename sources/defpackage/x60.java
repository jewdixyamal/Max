package defpackage;

/* renamed from: x60  reason: default package */
public final /* synthetic */ class x60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph4 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ x60(ph4 ph4, Exception exc, int i) {
        this.a = i;
        this.b = ph4;
        this.c = exc;
    }

    public final void run() {
        Exception exc = this.c;
        ph4 ph4 = this.b;
        int i = this.a;
        ph4.getClass();
        switch (i) {
            case 0:
                int i2 = maf.a;
                h74 h74 = ((n75) ph4.b).a.C0;
                ed P = h74.P();
                h74.Q(P, 1029, new b74(P, exc, 26));
                return;
            default:
                int i3 = maf.a;
                h74 h742 = ((n75) ph4.b).a.C0;
                ed P2 = h742.P();
                h742.Q(P2, 1014, new v64((Object) P2, 21, (Object) exc));
                return;
        }
    }
}
