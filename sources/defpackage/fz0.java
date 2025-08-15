package defpackage;

/* renamed from: fz0  reason: default package */
public final /* synthetic */ class fz0 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz0 b;
    public final /* synthetic */ gg1 c;

    public /* synthetic */ fz0(yz0 yz0, gg1 gg1, int i) {
        this.a = i;
        this.b = yz0;
        this.c = gg1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                yz0 yz0 = this.b;
                gg1 gg1 = this.c;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    us7 us7 = us7.X;
                    ir6.d(us7, "CallAdminSettingsController", "Disable screen sharing for " + gg1 + " was success", (Throwable) null);
                }
                yz0.C0.g(new ib(gg1));
                return e5f.a;
            case 1:
                yz0 yz02 = this.b;
                gg1 gg12 = this.c;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    us7 us72 = us7.X;
                    ir62.d(us72, "CallAdminSettingsController", "Disable microphone for " + gg12 + " was success", (Throwable) null);
                }
                yz02.C0.g(new fb(gg12, true));
                return e5f.a;
            default:
                yz0 yz03 = this.b;
                gg1 gg13 = this.c;
                ir6 ir63 = hm9.m;
                if (ir63 != null && ir63.c()) {
                    us7 us73 = us7.X;
                    ir63.d(us73, "CallAdminSettingsController", "Disable camera for " + gg13 + " was success", (Throwable) null);
                }
                yz03.C0.g(new eb(gg13, true));
                return e5f.a;
        }
    }
}
