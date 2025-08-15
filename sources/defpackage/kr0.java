package defpackage;

import one.me.sdk.bottomsheet.BottomSheetWidget;

/* renamed from: kr0  reason: default package */
public final class kr0 implements yu3 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public kr0(uu3 uu3, k56 k56) {
        this.b = uu3.getInstanceId();
        this.c = k56;
    }

    private final void c(uu3 uu3, uu3 uu32, boolean z) {
    }

    public final void a(uu3 uu3, uu3 uu32, boolean z) {
        switch (this.a) {
            case 0:
                if (uu32 != null) {
                    ((znc) this.b).K(this);
                    ((BottomSheetWidget) this.c).s0(true);
                    return;
                }
                return;
            default:
                if (tpa.f(uu32 != null ? uu32.getInstanceId() : null, (String) this.b) && !z) {
                    ((k56) this.c).invoke();
                    return;
                }
                return;
        }
    }

    public final void b(uu3 uu3, uu3 uu32, boolean z) {
        switch (this.a) {
            case 0:
                return;
            default:
                if (tpa.f(uu32 != null ? uu32.getInstanceId() : null, (String) this.b) && !z) {
                    uu32.getRouter().K(this);
                    return;
                }
                return;
        }
    }

    public kr0(znc znc, BottomSheetWidget bottomSheetWidget) {
        this.b = znc;
        this.c = bottomSheetWidget;
    }
}
