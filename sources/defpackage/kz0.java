package defpackage;

/* renamed from: kz0  reason: default package */
public final /* synthetic */ class kz0 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz0 b;

    public /* synthetic */ kz0(yz0 yz0, int i) {
        this.a = i;
        this.b = yz0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                yz0 yz0 = this.b;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, "CallAdminSettingsController", "Low hands for all success.", (Throwable) null);
                }
                yz0.C0.g(new bb(true));
                return e5f.a;
            case 1:
                yz0 yz02 = this.b;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    ir62.d(us7.X, "CallAdminSettingsController", "Disable cameras for all once was success", (Throwable) null);
                }
                yz02.C0.g(new ya(true));
                return e5f.a;
            case 2:
                return new nz0(this.b, 0);
            case 3:
                return new uz0(this.b);
            default:
                yz0 yz03 = this.b;
                ir6 ir63 = hm9.m;
                if (ir63 != null && ir63.c()) {
                    ir63.d(us7.X, "CallAdminSettingsController", "Disable microphone for all once was success", (Throwable) null);
                }
                yz03.C0.g(new ab(true));
                return e5f.a;
        }
    }
}
