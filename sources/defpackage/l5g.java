package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.permissionhost.PermissionBottomSheet;

/* renamed from: l5g  reason: default package */
public final class l5g {
    public final /* synthetic */ int a;
    public final Widget b;
    public final je7 c;

    public l5g(Widget widget, int i) {
        this.a = i;
        switch (i) {
            case 1:
                khe d = sta.a.getAccessor().d(acf.class);
                this.b = widget;
                this.c = d;
                return;
            default:
                this.b = widget;
                this.c = tu0.r(3, new rzd(18, this));
                return;
        }
    }

    private final void d(String[] strArr, int i, int i2, int i3, int i4) {
    }

    public void a() {
        wha wha = new wha(this.b);
        wha.g(new eqe(v7a.a));
        wha.i();
    }

    public void b() {
        sc scVar = new sc(this.b.getContext(), 16974128);
        int i = v7a.g;
        oc ocVar = scVar.a;
        ocVar.f = ocVar.a.getText(i);
        scVar.setPositiveButton(v7a.h, new e10(3));
        scVar.a();
    }

    public final void c(String[] strArr, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                return;
            default:
                bc7[] bc7Arr = BottomSheetWidget.x0;
                PermissionBottomSheet permissionBottomSheet = new PermissionBottomSheet(strArr, i, i2, i3, i4);
                Widget widget = this.b;
                permissionBottomSheet.setTargetController(widget);
                uu3 uu3 = widget;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                znc znc = null;
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                permissionBottomSheet.z0(widget);
                if (znc != null) {
                    coc coc = new coc(permissionBottomSheet, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                    return;
                }
                return;
        }
    }

    public final void e(int i, String[] strArr) {
        Object obj;
        je7 je7 = this.c;
        switch (this.a) {
            case 0:
                ((l5g) je7.getValue()).e(i, strArr);
                return;
            default:
                Widget widget = this.b;
                if (i == 180) {
                    acf acf = (acf) je7.getValue();
                    Context context = widget.getContext();
                    acf.getClass();
                    String str = o37.a;
                    try {
                        context.startActivity(o37.b(context, acf.a));
                        obj = e5f.a;
                    } catch (Throwable th) {
                        obj = new njc(th);
                    }
                    Throwable a2 = pjc.a(obj);
                    if (a2 != null) {
                        String str2 = o37.a;
                        hm9.p(str2, "showFsiSettings getOpenFsiSettingsIntent error " + a2, (Throwable) null);
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        String packageName = context.getPackageName();
                        intent.setData(Uri.parse("package:" + packageName));
                        context.startActivity(intent);
                        return;
                    }
                    return;
                }
                widget.requestPermissions(strArr, i);
                return;
        }
    }

    public final boolean f(String str) {
        switch (this.a) {
            case 0:
                return ((l5g) this.c.getValue()).f(str);
            default:
                String[] strArr = eua.d;
                if (ys.T(eua.o, str)) {
                    return true;
                }
                return this.b.shouldShowRequestPermissionRationale(str);
        }
    }

    public final void g(int i, int i2) {
        switch (this.a) {
            case 0:
                ((l5g) this.c.getValue()).g(i, i2);
                return;
            default:
                bc7[] bc7Arr = BottomSheetWidget.x0;
                PermissionBottomSheet permissionBottomSheet = new PermissionBottomSheet(i, i2);
                Widget widget = this.b;
                permissionBottomSheet.setTargetController(widget);
                uu3 uu3 = widget;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                znc znc = null;
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                permissionBottomSheet.z0(widget);
                if (znc != null) {
                    coc coc = new coc(permissionBottomSheet, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                    return;
                }
                return;
        }
    }
}
