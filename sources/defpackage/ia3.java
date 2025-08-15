package defpackage;

import android.view.View;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.filedownloadwarning.FileDownloadWarningBottomSheet;

/* renamed from: ia3  reason: default package */
public final class ia3 extends su3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ia3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void u(uu3 uu3) {
    }

    public void d(uu3 uu3) {
        switch (this.a) {
            case 2:
                ((gv3) this.b).a.d(eg7.ON_CREATE);
                return;
            default:
                return;
        }
    }

    public void g(uu3 uu3) {
        switch (this.a) {
            case 1:
                ((bx1) this.b).b.d(eg7.ON_RESUME);
                return;
            case 2:
                ((gv3) this.b).a.d(eg7.ON_RESUME);
                return;
            case 4:
                xx6 xx6 = (xx6) bx7.a.getAccessor().e();
                if (xx6 != null) {
                    xx6.e(Integer.valueOf(((wuc) this.b).a));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void h(uu3 uu3) {
        switch (this.a) {
            case 1:
                ((bx1) this.b).b.d(eg7.ON_CREATE);
                return;
            default:
                return;
        }
    }

    public void j(uu3 uu3, View view) {
        switch (this.a) {
            case 1:
                ((bx1) this.b).b.d(eg7.ON_START);
                return;
            case 2:
                gv3 gv3 = (gv3) this.b;
                s5c.Z(view, gv3);
                if (!nd7.B(uu3)) {
                    gv3.a.d(eg7.ON_CREATE);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void k(uu3 uu3) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ComplaintBottomSheet.X;
                ((ComplaintBottomSheet) obj).getClass();
                na3.c.P1().d();
                return;
            case 3:
                int i = FileDownloadWarningBottomSheet.b;
                ((FileDownloadWarningBottomSheet) obj).getClass();
                hh5.c.P1().d();
                return;
            case 5:
                ((znc) obj).d.remove(uu3);
                return;
            default:
                return;
        }
    }

    public void l(uu3 uu3) {
        switch (this.a) {
            case 2:
                gv3 gv3 = (gv3) this.b;
                if (gv3.a.d.a(fg7.c)) {
                    gv3.a.d(eg7.ON_DESTROY);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void n(uu3 uu3, View view) {
        switch (this.a) {
            case 2:
                ((gv3) this.b).a.d(eg7.ON_START);
                return;
            default:
                return;
        }
    }

    public void p(uu3 uu3) {
        int i = this.a;
    }

    public void q(uu3 uu3) {
        switch (this.a) {
            case 2:
                gv3 gv3 = (gv3) this.b;
                if (gv3.a.d == fg7.a) {
                    gv3.a = new gh7(gv3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void r(uu3 uu3) {
        switch (this.a) {
            case 1:
                gh7 gh7 = ((bx1) this.b).b;
                if (gh7.d != fg7.b) {
                    gh7.d(eg7.ON_DESTROY);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void s(uu3 uu3, View view) {
        switch (this.a) {
            case 1:
                ((bx1) this.b).b.d(eg7.ON_STOP);
                return;
            case 2:
                ((gv3) this.b).a.d(eg7.ON_STOP);
                return;
            default:
                return;
        }
    }

    public void t(uu3 uu3) {
        switch (this.a) {
            case 1:
                ((bx1) this.b).b.d(eg7.ON_PAUSE);
                return;
            case 2:
                ((gv3) this.b).a.d(eg7.ON_PAUSE);
                return;
            default:
                return;
        }
    }
}
