package defpackage;

/* renamed from: vye  reason: default package */
public final class vye extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wye b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vye(wye wye, int i) {
        super(0);
        this.a = i;
        this.b = wye;
    }

    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                wye wye = this.b;
                String str2 = wye.a;
                yye a2 = wye.a();
                if (a2 == null || (str = a2.versionName()) == null) {
                    str = "NA";
                }
                yye a3 = wye.a();
                String str3 = null;
                String buildUuid = a3 != null ? a3.buildUuid() : null;
                yye a4 = wye.a();
                if (a4 != null) {
                    str3 = a4.environment();
                }
                return new sye(str2, str, buildUuid, str3);
            default:
                wye wye2 = this.b;
                try {
                    return nd7.P(wye2.a);
                } catch (Exception unused) {
                    String str4 = wye2.a;
                    return null;
                }
        }
    }
}
