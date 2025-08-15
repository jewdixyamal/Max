package defpackage;

/* renamed from: tj4  reason: default package */
public final /* synthetic */ class tj4 implements moc {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj4 b;

    public /* synthetic */ tj4(uj4 uj4, int i) {
        this.a = i;
        this.b = uj4;
    }

    public void a(hoc hoc, roc roc) {
        int i = this.a;
        d6f d6f = (d6f) hoc;
        f6f f6f = (f6f) roc;
        uj4 uj4 = this.b;
        uj4.getClass();
        switch (i) {
            case 0:
                if (!f6f.a.isEmpty()) {
                    uj4.a.log("DisplayLayouts", "Resend next time after response with errors");
                    uj4.e = true;
                    return;
                }
                return;
            default:
                uj4.a.log("DisplayLayouts", "Stop stream on participant removed response: " + f6f);
                return;
        }
    }

    public void b(hoc hoc, Throwable th) {
        d6f d6f = (d6f) hoc;
        switch (this.a) {
            case 1:
                uj4 uj4 = this.b;
                uj4.a.log("DisplayLayouts", "Resend next time after error");
                uj4.e = true;
                return;
            default:
                uj4 uj42 = this.b;
                uj42.getClass();
                uj42.a.log("DisplayLayouts", "Stop stream on participant removed error: " + th.getMessage());
                return;
        }
    }
}
