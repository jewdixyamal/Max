package defpackage;

import android.util.Log;
import android.view.View;

/* renamed from: lnf  reason: default package */
public abstract class lnf {
    public static final knf a = new Object();
    public static final boolean b = Log.isLoggable("shared.ViewLifecycle", 3);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: bh7} */
    /* JADX WARNING: type inference failed for: r0v9, types: [bh7, eh7, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r1.a(defpackage.fg7.c) == true) goto L_0x0066;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.eh7 a(android.view.View r4) {
        /*
            n71 r0 = defpackage.n71.A0
            if (r4 != 0) goto L_0x0007
            vz4 r0 = defpackage.vz4.a
            goto L_0x0014
        L_0x0007:
            km4 r1 = new km4
            ie r2 = new ie
            r3 = 6
            r2.<init>((int) r3, (java.lang.Object) r4)
            r3 = 1
            r1.<init>(r2, r3, r0)
            r0 = r1
        L_0x0014:
            n71 r1 = defpackage.n71.B0
            qk5 r0 = defpackage.l6d.e0(r0, r1)
            java.lang.Object r0 = defpackage.l6d.c0(r0)
            eh7 r0 = (defpackage.eh7) r0
            if (r0 != 0) goto L_0x0066
            int r0 = defpackage.dyb.view_custom_attach_lifecycle_owner
            java.lang.Object r0 = r4.getTag(r0)
            boolean r1 = r0 instanceof defpackage.bh7
            if (r1 == 0) goto L_0x002f
            bh7 r0 = (defpackage.bh7) r0
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0044
            gh7 r1 = r0.a
            if (r1 == 0) goto L_0x0044
            fg7 r1 = r1.d
            if (r1 == 0) goto L_0x0044
            fg7 r2 = defpackage.fg7.c
            boolean r1 = r1.a(r2)
            r2 = 1
            if (r1 != r2) goto L_0x0044
            goto L_0x0066
        L_0x0044:
            bh7 r0 = new bh7
            r0.<init>()
            gh7 r1 = new gh7
            r1.<init>(r0)
            r0.a = r1
            eg7 r2 = defpackage.eg7.ON_CREATE
            r1.d(r2)
            r4.addOnAttachStateChangeListener(r0)
            boolean r1 = r4.isAttachedToWindow()
            if (r1 == 0) goto L_0x0061
            r0.onViewAttachedToWindow(r4)
        L_0x0061:
            int r1 = defpackage.dyb.view_custom_attach_lifecycle_owner
            r4.setTag(r1, r0)
        L_0x0066:
            boolean r4 = b
            if (r4 == 0) goto L_0x007a
            gh7 r4 = r0.Q()
            knf r1 = a
            r4.f(r1)
            gh7 r4 = r0.Q()
            r4.a(r1)
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnf.a(android.view.View):eh7");
    }

    public static final rg7 b(View view) {
        return f46.J(a(view));
    }
}
