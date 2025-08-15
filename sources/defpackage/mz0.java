package defpackage;

/* renamed from: mz0  reason: default package */
public final /* synthetic */ class mz0 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz0 b;
    public final /* synthetic */ gg1 c;

    public /* synthetic */ mz0(yz0 yz0, gg1 gg1, int i) {
        this.a = i;
        this.b = yz0;
        this.c = gg1;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                yz0 yz0 = this.b;
                gg1 gg1 = this.c;
                Throwable th = (Throwable) obj;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    us7 us7 = us7.X;
                    String message = th.getMessage();
                    ir6.d(us7, "CallAdminSettingsController", "Disable screen sharing for " + gg1 + " failed due to: " + message, (Throwable) null);
                }
                yz0.C0.g(new ib(gg1));
                return e5f.a;
            case 1:
                yz0 yz02 = this.b;
                gg1 gg12 = this.c;
                Throwable th2 = (Throwable) obj;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    us7 us72 = us7.X;
                    String message2 = th2.getMessage();
                    ir62.d(us72, "CallAdminSettingsController", "Disable microphone for " + gg12 + " failed due to: " + message2, (Throwable) null);
                }
                yz02.C0.g(new fb(gg12, false));
                return e5f.a;
            default:
                yz0 yz03 = this.b;
                gg1 gg13 = this.c;
                Throwable th3 = (Throwable) obj;
                ir6 ir63 = hm9.m;
                if (ir63 != null && ir63.c()) {
                    us7 us73 = us7.X;
                    String message3 = th3.getMessage();
                    ir63.d(us73, "CallAdminSettingsController", "Disable camera for " + gg13 + " failed due to: " + message3, (Throwable) null);
                }
                yz03.C0.g(new eb(gg13, false));
                return e5f.a;
        }
    }
}
