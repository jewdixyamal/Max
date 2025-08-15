package defpackage;

/* renamed from: gz0  reason: default package */
public final /* synthetic */ class gz0 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gz0(yz0 yz0, boolean z, int i) {
        this.a = i;
        this.b = yz0;
        this.c = z;
    }

    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        switch (this.a) {
            case 0:
                yz0 yz0 = this.b;
                boolean z = this.c;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    us7 us7 = us7.X;
                    ir6.d(us7, "CallAdminSettingsController", "Microphone in call was changed on " + z + " success", (Throwable) null);
                }
                q0e q0e = yz0.E0;
                do {
                    value = q0e.getValue();
                } while (!q0e.c(value, aa.a((aa) value, false, false, z, false, false, false, 123)));
                yz0.C0.g(new za(true, z));
                return e5f.a;
            case 1:
                yz0 yz02 = this.b;
                boolean z2 = this.c;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    us7 us72 = us7.X;
                    ir62.d(us72, "CallAdminSettingsController", "Cameras in call was changed on " + z2 + " success", (Throwable) null);
                }
                q0e q0e2 = yz02.E0;
                do {
                    value2 = q0e2.getValue();
                } while (!q0e2.c(value2, aa.a((aa) value2, false, z2, false, false, false, false, 125)));
                yz02.C0.g(new xa(true, z2));
                return e5f.a;
            default:
                yz0 yz03 = this.b;
                boolean z3 = this.c;
                ir6 ir63 = hm9.m;
                if (ir63 != null && ir63.c()) {
                    us7 us73 = us7.X;
                    ir63.d(us73, "CallAdminSettingsController", "Screen sharing in call was changed on " + z3 + " success", (Throwable) null);
                }
                q0e q0e3 = yz03.E0;
                do {
                    value3 = q0e3.getValue();
                } while (!q0e3.c(value3, aa.a((aa) value3, false, false, false, z3, false, false, 119)));
                yz03.C0.g(new db(true, z3));
                return e5f.a;
        }
    }
}
