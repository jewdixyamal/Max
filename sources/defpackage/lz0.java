package defpackage;

/* renamed from: lz0  reason: default package */
public final /* synthetic */ class lz0 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz0 b;

    public /* synthetic */ lz0(yz0 yz0, int i) {
        this.a = i;
        this.b = yz0;
    }

    public final Object invoke(Object obj) {
        int i = this.a;
        yz0 yz0 = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, "CallAdminSettingsController", wg0.i("Low hands for all failed due to: ", th.getMessage()), (Throwable) null);
                }
                yz0.C0.g(new bb(false));
                return e5f.a;
            case 1:
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    ir62.d(us7.X, "CallAdminSettingsController", wg0.i("Disable cameras for all once failed due to: ", th.getMessage()), (Throwable) null);
                }
                yz0.C0.g(new ya(false));
                return e5f.a;
            default:
                ir6 ir63 = hm9.m;
                if (ir63 != null && ir63.c()) {
                    ir63.d(us7.X, "CallAdminSettingsController", wg0.i("Disable microphone for all once failed due to: ", th.getMessage()), (Throwable) null);
                }
                yz0.C0.g(new ab(false));
                return e5f.a;
        }
    }
}
