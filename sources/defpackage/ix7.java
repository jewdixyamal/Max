package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import one.me.main.MainScreen;

/* renamed from: ix7  reason: default package */
public final class ix7 extends FrameLayout {
    public final /* synthetic */ MainScreen a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ix7(MainScreen mainScreen, Context context) {
        super(context);
        this.a = mainScreen;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r7) {
        /*
            r6 = this;
            r0 = 0
            x6g r1 = defpackage.x6g.f(r0, r7)
            v6g r2 = r1.a
            r3 = 7
            v27 r2 = r2.f(r3)
            r4 = 0
            android.view.View r4 = r6.getChildAt(r4)
            boolean r5 = r4 instanceof android.widget.FrameLayout
            if (r5 == 0) goto L_0x0018
            r0 = r4
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
        L_0x0018:
            if (r0 != 0) goto L_0x001f
            android.view.WindowInsets r6 = super.dispatchApplyWindowInsets(r7)
            return r6
        L_0x001f:
            huc r4 = one.me.main.MainScreen.Z
            one.me.main.MainScreen r4 = r6.a
            u6a r4 = r4.o0()
            r4.dispatchApplyWindowInsets(r7)
            qx7 r4 = defpackage.u6a.b
            r4.getClass()
            int r6 = defpackage.qx7.a(r6)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L_0x003f
            n6g r4 = new n6g
            r4.<init>(r1)
            goto L_0x0044
        L_0x003f:
            m6g r4 = new m6g
            r4.<init>(r1)
        L_0x0044:
            int r1 = r2.d
            int r1 = r1 + r6
            int r6 = r2.b
            int r5 = r2.c
            int r2 = r2.a
            v27 r6 = defpackage.v27.b(r2, r6, r5, r1)
            r4.c(r3, r6)
            x6g r6 = r4.b()
            android.view.WindowInsets r6 = r6.e()
            r0.dispatchApplyWindowInsets(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix7.dispatchApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }
}
