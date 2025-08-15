package defpackage;

/* renamed from: ru1  reason: default package */
public final class ru1 extends iv1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq1 b;

    public ru1() {
        this.a = 1;
        this.b = null;
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                this.b.d(new Exception("Capture request is cancelled because camera is closed", (Throwable) null));
                return;
            case 1:
                lq1 lq1 = this.b;
                if (lq1 != null) {
                    lq1.d(new Exception("Camera is closed"));
                    return;
                }
                return;
            default:
                lq1 lq12 = this.b;
                if (lq12 != null) {
                    lq12.d(new Exception("Camera is closed"));
                    return;
                }
                return;
        }
    }

    public final void b(int i, pv1 pv1) {
        switch (this.a) {
            case 0:
                this.b.b((Object) null);
                return;
            case 1:
                lq1 lq1 = this.b;
                if (lq1 != null) {
                    lq1.b(pv1);
                    return;
                }
                return;
            default:
                lq1 lq12 = this.b;
                if (lq12 != null) {
                    lq12.b((Object) null);
                    return;
                }
                return;
        }
    }

    public final void c(int i, dp3 dp3) {
        switch (this.a) {
            case 0:
                this.b.d(new Exception("Capture request failed with reason ".concat("ERROR"), (Throwable) null));
                return;
            case 1:
                lq1 lq1 = this.b;
                if (lq1 != null) {
                    lq1.d(new Exception());
                    return;
                }
                return;
            default:
                lq1 lq12 = this.b;
                if (lq12 != null) {
                    lq12.d(new Exception());
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ru1(lq1 lq1, int i) {
        this.a = i;
        this.b = lq1;
    }
}
