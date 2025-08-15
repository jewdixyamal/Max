package defpackage;

import android.os.Bundle;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: rg1  reason: default package */
public final class rg1 {
    public final l5g a;
    public final khe b = new khe(new k11(22));
    public final je7 c = fua.a.b();
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public kyd h;
    public boolean i;
    public boolean j;
    public boolean k;
    public k56 l;
    public final khe m;
    public final khe n;

    public rg1(khe khe, l5g l5g) {
        this.a = l5g;
        ws1 ws1 = ws1.a;
        this.d = ws1.getAccessor().d(gh3.class);
        this.e = ws1.getAccessor().d(bt1.class);
        this.f = ws1.getAccessor().d(qe5.class);
        this.g = khe;
        this.m = new khe(new qg1(this, 0));
        this.n = new khe(new qg1(this, 1));
    }

    public final void a(kyd kyd, k56 k56) {
        boolean f2 = ((gh3) this.d.getValue()).f();
        if (k56 == null) {
            c();
            return;
        }
        znc znc = null;
        je7 je7 = this.g;
        if (f2 || kyd == null || ((wr1) d()).f(kyd)) {
            l5g l5g = this.a;
            if (!f2) {
                l5g.b();
            } else if (kyd == null) {
                ((wr1) d()).v();
                f(k56);
            } else if ((kyd instanceof hyd) && !this.k && ((wr1) d()).f(kyd)) {
                sg1.c.P1().b(":call-join-preview?link=".concat(((hyd) kyd).a), (Bundle) null);
            } else if (((wr1) d()).k().j instanceof d95) {
                f(k56);
            } else if (!((wr1) d()).f(kyd)) {
                if (((wr1) d()).k().g) {
                    ((wr1) d()).e();
                }
                if (!ps1.a((znc) je7.getValue())) {
                    sg1.c.P1().b(":call-active", (Bundle) null);
                }
                c();
            } else {
                this.l = k56;
                boolean z = this.i;
                l5g.getClass();
                int i2 = z ? v7a.d : v7a.c;
                bc7[] bc7Arr = BottomSheetWidget.x0;
                lg3 e2 = wg0.e(v7a.f, 4, (Bundle) null);
                e2.f(new eqe(v7a.e));
                e2.d(u7a.b, new eqe(i2));
                e2.c(u7a.a, new eqe(v7a.b));
                ConfirmationBottomSheet e3 = e2.e();
                Widget widget = l5g.b;
                e3.setTargetController(widget);
                uu3 uu3 = widget;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                e3.z0(widget);
                if (znc != null) {
                    coc coc = new coc(e3, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                }
            }
        } else {
            if (!ps1.a((znc) je7.getValue())) {
                sg1.c.P1().b(":call-active", (Bundle) null);
            }
            c();
        }
    }

    public final boolean b(int i2, String[] strArr, int[] iArr) {
        if (i2 != 178) {
            return false;
        }
        boolean b2 = e().b(strArr);
        l5g l5g = this.a;
        if (!b2) {
            int length = iArr.length;
            int i3 = 0;
            while (i3 < length) {
                if (iArr[i3] == -1) {
                    c();
                    l5g.g(e0c.permission_detail_dialog_title, e0c.permission_detail_dialog_subtitile);
                } else {
                    i3++;
                }
            }
            c();
            return false;
        } else if (this.j) {
            k56 k56 = this.l;
            boolean f2 = ((gh3) this.d.getValue()).f();
            if (k56 == null) {
                c();
            } else if (!f2) {
                l5g.b();
            } else {
                k56.invoke();
            }
        } else {
            a(this.h, this.l);
        }
        return true;
    }

    public final void c() {
        this.l = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.k = false;
    }

    public final kr1 d() {
        return (kr1) this.b.getValue();
    }

    public final eua e() {
        return (eua) this.c.getValue();
    }

    public final void f(k56 k56) {
        if (!ps1.a((znc) this.g.getValue()) && k56 != null) {
            k56.invoke();
        }
        c();
    }

    public final boolean g(int i2) {
        if (i2 == qvb.call_permission_dialog_check_continue) {
            ((wr1) n31.a.d()).v();
            f(this.l);
            return true;
        } else if (i2 != qvb.call_permission_dialog_check_cancel) {
            return false;
        } else {
            c();
            return true;
        }
    }

    public final void h(boolean z) {
        String str = ((wr1) d()).k().c;
        boolean z2 = ((wr1) d()).k().h;
        je7 je7 = this.e;
        if (z && !e().b(eua.l)) {
            bt1 bt1 = (bt1) je7.getValue();
            bt1.getClass();
            bt1.c(bt1, "REQUEST_PERMISSION_CAM", str, "OUT_OF_CALL", (Long) null, (String) null, (String) null, z2, 56);
        }
        if (!e().b(eua.h)) {
            bt1 bt12 = (bt1) je7.getValue();
            bt12.getClass();
            bt1.c(bt12, "REQUEST_PERMISSION_MIC", str, "AFTER_INITIATION", (Long) null, (String) null, (String) null, z2, 56);
        }
    }

    public final void i(long j2, boolean z, k56 k56) {
        c();
        boolean booleanValue = ((Boolean) this.m.getValue()).booleanValue();
        l5g l5g = this.a;
        if (!booleanValue) {
            l5g.a();
            return;
        }
        gyd gyd = new gyd(new xm1(j2, z));
        if (e().a(z, l5g)) {
            a(gyd, k56);
            return;
        }
        h(z);
        this.h = gyd;
        this.l = k56;
        this.i = z;
    }

    public final void j(String str, boolean z, boolean z2, boolean z3, k56 k56) {
        c();
        this.k = z3;
        boolean booleanValue = ((Boolean) this.n.getValue()).booleanValue();
        l5g l5g = this.a;
        if (!booleanValue || w9e.C0(str)) {
            l5g.a();
            return;
        }
        hyd hyd = new hyd(str, z);
        if (e().a(z2, l5g)) {
            a(hyd, k56);
            return;
        }
        h(z2);
        this.h = hyd;
        this.l = k56;
        this.i = z2;
    }

    public final void l(long j2, boolean z, k56 k56) {
        c();
        iyd iyd = new iyd(new zm1(j2, z));
        if (e().a(z, this.a)) {
            a(iyd, k56);
            return;
        }
        h(z);
        this.h = iyd;
        this.l = k56;
        this.i = z;
    }
}
