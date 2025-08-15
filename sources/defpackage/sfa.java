package defpackage;

/* renamed from: sfa  reason: default package */
public final /* synthetic */ class sfa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tfa b;

    public /* synthetic */ sfa(tfa tfa, int i) {
        this.a = i;
        this.b = tfa;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                tfa tfa = this.b;
                if (!tfa.c.get()) {
                    tfa.b.execute(new u60((Object) tfa, true, 10));
                    return;
                }
                return;
            default:
                tfa tfa2 = this.b;
                if (!tfa2.c.get()) {
                    tfa2.b.execute(new u60((Object) tfa2, false, 10));
                    return;
                }
                return;
        }
    }
}
