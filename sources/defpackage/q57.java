package defpackage;

import android.view.View;
import java.util.logging.Level;

/* renamed from: q57  reason: default package */
public final class q57 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q57(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
        mne c;
        long j;
        while (true) {
            synchronized (((foe) this.b)) {
                c = ((foe) this.b).c();
            }
            if (c != null) {
                coe coe = c.a;
                boolean isLoggable = foe.i.isLoggable(Level.FINE);
                if (isLoggable) {
                    coe.e.g.getClass();
                    j = System.nanoTime();
                    wmd.c(c, coe, "starting");
                } else {
                    j = -1;
                }
                try {
                    foe.a((foe) this.b, c);
                    if (isLoggable) {
                        coe.e.g.getClass();
                        wmd.c(c, coe, "finished run in ".concat(wmd.p(System.nanoTime() - j)));
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        coe.e.g.getClass();
                        wmd.c(c, coe, "failed a run in ".concat(wmd.p(System.nanoTime() - j)));
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r10.b     // Catch:{ all -> 0x0055 }
            q6d r2 = (defpackage.q6d) r2     // Catch:{ all -> 0x0055 }
            java.util.ArrayDeque r2 = r2.a     // Catch:{ all -> 0x0055 }
            monitor-enter(r2)     // Catch:{ all -> 0x0055 }
            r3 = 1
            if (r0 != 0) goto L_0x002c
            java.lang.Object r0 = r10.b     // Catch:{ all -> 0x0020 }
            q6d r0 = (defpackage.q6d) r0     // Catch:{ all -> 0x0020 }
            int r4 = r0.o     // Catch:{ all -> 0x0020 }
            r5 = 4
            if (r4 != r5) goto L_0x0022
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001f
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L_0x001f:
            return
        L_0x0020:
            r10 = move-exception
            goto L_0x005b
        L_0x0022:
            long r6 = r0.X     // Catch:{ all -> 0x0020 }
            r8 = 1
            long r6 = r6 + r8
            r0.X = r6     // Catch:{ all -> 0x0020 }
            r0.o = r5     // Catch:{ all -> 0x0020 }
            r0 = r3
        L_0x002c:
            java.lang.Object r4 = r10.b     // Catch:{ all -> 0x0020 }
            q6d r4 = (defpackage.q6d) r4     // Catch:{ all -> 0x0020 }
            java.util.ArrayDeque r4 = r4.a     // Catch:{ all -> 0x0020 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ all -> 0x0020 }
            if (r4 != 0) goto L_0x004b
            java.lang.Object r10 = r10.b     // Catch:{ all -> 0x0020 }
            q6d r10 = (defpackage.q6d) r10     // Catch:{ all -> 0x0020 }
            r10.o = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x004a
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L_0x004a:
            return
        L_0x004b:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0055 }
            r1 = r1 | r2
            r4.run()     // Catch:{ RuntimeException -> 0x0057 }
            goto L_0x0002
        L_0x0055:
            r10 = move-exception
            goto L_0x005d
        L_0x0057:
            r4.toString()     // Catch:{ all -> 0x0055 }
            goto L_0x0002
        L_0x005b:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r10     // Catch:{ all -> 0x0055 }
        L_0x005d:
            if (r1 == 0) goto L_0x0066
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0066:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q57.c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0273, code lost:
        if (r11 < 0) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0296, code lost:
        if (r11 > 0) goto L_0x029a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3 = 1
            int r4 = r15.a
            switch(r4) {
                case 0: goto L_0x033d;
                case 1: goto L_0x0220;
                case 2: goto L_0x01fc;
                case 3: goto L_0x01f3;
                case 4: goto L_0x01d2;
                case 5: goto L_0x01ca;
                case 6: goto L_0x01c2;
                case 7: goto L_0x01ba;
                case 8: goto L_0x01a1;
                case 9: goto L_0x0186;
                case 10: goto L_0x016e;
                case 11: goto L_0x0166;
                case 12: goto L_0x014f;
                case 13: goto L_0x011d;
                case 14: goto L_0x0107;
                case 15: goto L_0x00fd;
                case 16: goto L_0x00f3;
                case 17: goto L_0x00e7;
                case 18: goto L_0x009a;
                case 19: goto L_0x0092;
                case 20: goto L_0x008a;
                case 21: goto L_0x0080;
                case 22: goto L_0x0066;
                case 23: goto L_0x004f;
                case 24: goto L_0x002e;
                case 25: goto L_0x0026;
                case 26: goto L_0x0025;
                case 27: goto L_0x001c;
                case 28: goto L_0x0018;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r15 = r15.b
            com.google.android.material.textfield.TextInputLayout r15 = (com.google.android.material.textfield.TextInputLayout) r15
            m15 r15 = r15.c
            com.google.android.material.internal.CheckableImageButton r15 = r15.u0
            r15.performClick()
            r15.jumpDrawablesToCurrentState()
            return
        L_0x0018:
            r15.b()
            return
        L_0x001c:
            java.lang.Object r15 = r15.b
            rne r15 = (defpackage.rne) r15
            bolts.Task r15 = r15.a
            r15.trySetResult(r2)
        L_0x0025:
            return
        L_0x0026:
            java.lang.Object r15 = r15.b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r15 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r15
            r15.M0()
            return
        L_0x002e:
            java.lang.Object r15 = r15.b
            mtd r15 = (defpackage.mtd) r15
            boolean r0 = r15.t0
            if (r0 != 0) goto L_0x0037
            goto L_0x004e
        L_0x0037:
            float r0 = r15.u0
            r1 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r0 + r1
            r15.u0 = r0
            r15.invalidateSelf()
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 3
            long r0 = r0 + r2
            q57 r2 = r15.s0
            r15.scheduleSelf(r2, r0)
        L_0x004e:
            return
        L_0x004f:
            r15.c()     // Catch:{ Error -> 0x0053 }
            return
        L_0x0053:
            r0 = move-exception
            java.lang.Object r1 = r15.b
            q6d r1 = (defpackage.q6d) r1
            java.util.ArrayDeque r2 = r1.a
            monitor-enter(r2)
            java.lang.Object r15 = r15.b     // Catch:{ all -> 0x0063 }
            q6d r15 = (defpackage.q6d) r15     // Catch:{ all -> 0x0063 }
            r15.o = r3     // Catch:{ all -> 0x0063 }
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            throw r0
        L_0x0063:
            r15 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            throw r15
        L_0x0066:
            java.lang.Object r15 = r15.b
            androidx.appcompat.widget.SearchView$SearchAutoComplete r15 = (androidx.appcompat.widget.SearchView$SearchAutoComplete) r15
            boolean r0 = r15.u0
            if (r0 == 0) goto L_0x007f
            android.content.Context r0 = r15.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.showSoftInput(r15, r1)
            r15.u0 = r1
        L_0x007f:
            return
        L_0x0080:
            java.lang.Object r15 = r15.b
            znc r15 = (defpackage.znc) r15
            r15.g = r3
            r15.A()
            return
        L_0x008a:
            java.lang.Object r15 = r15.b
            xu3 r15 = (defpackage.xu3) r15
            r15.u()
            return
        L_0x0092:
            java.lang.Object r15 = r15.b
            y6c r15 = (defpackage.y6c) r15
            r15.g(r3)
            return
        L_0x009a:
            java.lang.Object r0 = r15.b
            r6b r0 = (defpackage.r6b) r0
            monitor-enter(r0)
            java.lang.Object r3 = r15.b     // Catch:{ all -> 0x00e4 }
            r6b r3 = (defpackage.r6b) r3     // Catch:{ all -> 0x00e4 }
            o43 r4 = r3.g     // Catch:{ all -> 0x00e4 }
            int r5 = r3.h     // Catch:{ all -> 0x00e4 }
            r3.g = r2     // Catch:{ all -> 0x00e4 }
            r3.i = r1     // Catch:{ all -> 0x00e4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e4 }
            boolean r0 = defpackage.o43.n0(r4)
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r0 = r15.b     // Catch:{ all -> 0x00bd }
            r6b r0 = (defpackage.r6b) r0     // Catch:{ all -> 0x00bd }
            defpackage.r6b.m(r0, r4, r5)     // Catch:{ all -> 0x00bd }
            defpackage.o43.S(r4)
            goto L_0x00c2
        L_0x00bd:
            r15 = move-exception
            defpackage.o43.S(r4)
            throw r15
        L_0x00c2:
            java.lang.Object r15 = r15.b
            r6b r15 = (defpackage.r6b) r15
            monitor-enter(r15)
            r15.j = r1     // Catch:{ all -> 0x00e1 }
            boolean r0 = r15.q()     // Catch:{ all -> 0x00e1 }
            monitor-exit(r15)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00e0
            un9 r0 = r15.k
            java.lang.Object r0 = r0.d
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            q57 r1 = new q57
            r2 = 18
            r1.<init>(r2, r15)
            r0.execute(r1)
        L_0x00e0:
            return
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00e1 }
            throw r0
        L_0x00e4:
            r15 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e4 }
            throw r15
        L_0x00e7:
            java.lang.Object r15 = r15.b
            androidx.appcompat.widget.AppCompatEditText r15 = (androidx.appcompat.widget.AppCompatEditText) r15
            int r0 = r15.length()
            r15.setSelection(r0)
            return
        L_0x00f3:
            bc7[] r0 = one.me.sdk.uikit.common.button.OneMeButton.B0
            java.lang.Object r15 = r15.b
            one.me.sdk.uikit.common.button.OneMeButton r15 = (one.me.sdk.uikit.common.button.OneMeButton) r15
            r15.i()
            return
        L_0x00fd:
            java.lang.Object r15 = r15.b
            e2a r15 = (defpackage.e2a) r15
            zl4 r15 = r15.c
            r15.g()
            return
        L_0x0107:
            java.lang.Object r15 = r15.b
            jz9 r15 = (defpackage.jz9) r15
            f2a r0 = r15.a     // Catch:{ all -> 0x0116 }
            r0.b()     // Catch:{ all -> 0x0116 }
            xtc r15 = r15.o
            r15.g()
            return
        L_0x0116:
            r0 = move-exception
            xtc r15 = r15.o
            r15.g()
            throw r0
        L_0x011d:
            java.lang.Object r15 = r15.b
            v29 r15 = (defpackage.v29) r15
            k56 r0 = r15.b
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x014e
            o19 r0 = defpackage.o19.a
            v4 r0 = r0.getAccessor()
            java.lang.Class<ax7> r1 = defpackage.ax7.class
            java.lang.Object r0 = r0.c(r1)
            ax7 r0 = (defpackage.ax7) r0
            dta r1 = new dta
            r1.<init>(r3)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.a(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r15.a
            r0.q0(r15)
        L_0x014e:
            return
        L_0x014f:
            bc7[] r0 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.Z0
            java.lang.Object r15 = r15.b
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r15 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r15
            android.view.ViewGroup r0 = r15.B0()
            android.view.ViewGroup r15 = r15.B0()
            int r15 = r15.getHeight()
            float r15 = (float) r15
            r0.setTranslationY(r15)
            return
        L_0x0166:
            java.lang.Object r15 = r15.b
            ah8 r15 = (defpackage.ah8) r15
            r15.j()
            return
        L_0x016e:
            java.lang.Object r15 = r15.b
            vr0 r15 = (defpackage.vr0) r15
            java.lang.Object r15 = r15.c
            androidx.mediarouter.app.d r15 = (androidx.mediarouter.app.d) r15
            dh8 r0 = r15.W0
            if (r0 == 0) goto L_0x0185
            r15.W0 = r2
            boolean r0 = r15.m1
            if (r0 == 0) goto L_0x0185
            boolean r0 = r15.n1
            r15.q(r0)
        L_0x0185:
            return
        L_0x0186:
            java.lang.Object r15 = r15.b
            androidx.mediarouter.app.d r15 = (androidx.mediarouter.app.d) r15
            r15.j(r3)
            androidx.mediarouter.app.OverlayListView r1 = r15.O0
            r1.requestLayout()
            androidx.mediarouter.app.OverlayListView r1 = r15.O0
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            sn r2 = new sn
            r2.<init>(r0, r15)
            r1.addOnGlobalLayoutListener(r2)
            return
        L_0x01a1:
            java.lang.Object r15 = r15.b
            s68 r15 = (defpackage.s68) r15
            cj8 r0 = r15.g
            us r0 = r0.X
            b78 r15 = r15.e
            r15.getClass()
            c78 r15 = (defpackage.c78) r15
            android.os.Messenger r15 = r15.a
            android.os.IBinder r15 = r15.getBinder()
            r0.remove(r15)
            return
        L_0x01ba:
            java.lang.Object r15 = r15.b
            w38 r15 = (defpackage.w38) r15
            r15.requestLayout()
            return
        L_0x01c2:
            java.lang.Object r15 = r15.b
            io7 r15 = (defpackage.io7) r15
            r15.b()
            return
        L_0x01ca:
            java.lang.Object r15 = r15.b
            ho7 r15 = (defpackage.ho7) r15
            r15.b()
            return
        L_0x01d2:
            java.lang.Object r0 = r15.b
            xm7 r0 = (defpackage.xm7) r0
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            java.lang.Object r1 = r15.b     // Catch:{ all -> 0x01f0 }
            xm7 r1 = (defpackage.xm7) r1     // Catch:{ all -> 0x01f0 }
            java.lang.Object r1 = r1.f     // Catch:{ all -> 0x01f0 }
            java.lang.Object r2 = r15.b     // Catch:{ all -> 0x01f0 }
            xm7 r2 = (defpackage.xm7) r2     // Catch:{ all -> 0x01f0 }
            java.lang.Object r3 = defpackage.xm7.k     // Catch:{ all -> 0x01f0 }
            r2.f = r3     // Catch:{ all -> 0x01f0 }
            monitor-exit(r0)     // Catch:{ all -> 0x01f0 }
            java.lang.Object r15 = r15.b
            xm7 r15 = (defpackage.xm7) r15
            r15.k(r1)
            return
        L_0x01f0:
            r15 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01f0 }
            throw r15
        L_0x01f3:
            java.lang.Object r15 = r15.b
            nl7 r15 = (defpackage.nl7) r15
            r15.b = r2
            r15.a = r2
            return
        L_0x01fc:
            int r0 = defpackage.xoc.B0
            java.lang.Object r15 = r15.b
            ed7 r15 = (defpackage.ed7) r15
            android.view.View r0 = r15.findViewById(r0)
            android.graphics.drawable.GradientDrawable r1 = r15.getIndicatorDrawable()
            int r0 = r0.getMeasuredWidth()
            int r2 = r15.getMeasuredHeight()
            int r3 = r15.getPaddingTop()
            int r2 = r2 - r3
            int r15 = r15.getPaddingBottom()
            int r2 = r2 - r15
            r1.setSize(r0, r2)
            return
        L_0x0220:
            java.lang.Object r0 = r15.b
            f77 r0 = (defpackage.f77) r0
            dec r2 = r0.c
            if (r2 == 0) goto L_0x033c
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r0.M0
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0237
            r4 = 0
            goto L_0x0239
        L_0x0237:
            long r4 = r2 - r4
        L_0x0239:
            androidx.recyclerview.widget.RecyclerView r8 = r0.C0
            androidx.recyclerview.widget.a r8 = r8.getLayoutManager()
            android.graphics.Rect r9 = r0.L0
            if (r9 != 0) goto L_0x024a
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.L0 = r9
        L_0x024a:
            dec r9 = r0.c
            android.view.View r9 = r9.a
            android.graphics.Rect r10 = r0.L0
            r8.d(r10, r9)
            boolean r9 = r8.e()
            r10 = 0
            if (r9 == 0) goto L_0x0299
            float r9 = r0.u0
            float r11 = r0.s0
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.L0
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.C0
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.s0
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0276
            if (r11 >= 0) goto L_0x0276
            goto L_0x029a
        L_0x0276:
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0299
            dec r11 = r0.c
            android.view.View r11 = r11.a
            int r11 = r11.getWidth()
            int r11 = r11 + r9
            android.graphics.Rect r9 = r0.L0
            int r9 = r9.right
            int r11 = r11 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.C0
            int r9 = r9.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.C0
            int r12 = r12.getPaddingRight()
            int r9 = r9 - r12
            int r11 = r11 - r9
            if (r11 <= 0) goto L_0x0299
            goto L_0x029a
        L_0x0299:
            r11 = r1
        L_0x029a:
            boolean r8 = r8.f()
            if (r8 == 0) goto L_0x02e0
            float r8 = r0.v0
            float r9 = r0.t0
            float r8 = r8 + r9
            int r8 = (int) r8
            android.graphics.Rect r9 = r0.L0
            int r9 = r9.top
            int r9 = r8 - r9
            androidx.recyclerview.widget.RecyclerView r12 = r0.C0
            int r12 = r12.getPaddingTop()
            int r9 = r9 - r12
            float r12 = r0.t0
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x02bd
            if (r9 >= 0) goto L_0x02bd
        L_0x02bb:
            r1 = r9
            goto L_0x02e0
        L_0x02bd:
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x02e0
            dec r9 = r0.c
            android.view.View r9 = r9.a
            int r9 = r9.getHeight()
            int r9 = r9 + r8
            android.graphics.Rect r8 = r0.L0
            int r8 = r8.bottom
            int r9 = r9 + r8
            androidx.recyclerview.widget.RecyclerView r8 = r0.C0
            int r8 = r8.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.C0
            int r10 = r10.getPaddingBottom()
            int r8 = r8 - r10
            int r9 = r9 - r8
            if (r9 <= 0) goto L_0x02e0
            goto L_0x02bb
        L_0x02e0:
            if (r11 == 0) goto L_0x02f8
            androidx.recyclerview.widget.RecyclerView r9 = r0.C0
            dec r8 = r0.c
            android.view.View r8 = r8.a
            int r10 = r8.getWidth()
            androidx.recyclerview.widget.RecyclerView r8 = r0.C0
            r8.getWidth()
            e77 r8 = r0.x0
            r12 = r4
            int r11 = r8.f(r9, r10, r11, r12)
        L_0x02f8:
            r14 = r11
            if (r1 == 0) goto L_0x0312
            androidx.recyclerview.widget.RecyclerView r9 = r0.C0
            dec r8 = r0.c
            android.view.View r8 = r8.a
            int r10 = r8.getHeight()
            androidx.recyclerview.widget.RecyclerView r8 = r0.C0
            r8.getHeight()
            e77 r8 = r0.x0
            r11 = r1
            r12 = r4
            int r1 = r8.f(r9, r10, r11, r12)
        L_0x0312:
            if (r14 != 0) goto L_0x031a
            if (r1 == 0) goto L_0x0317
            goto L_0x031a
        L_0x0317:
            r0.M0 = r6
            goto L_0x033c
        L_0x031a:
            long r4 = r0.M0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0322
            r0.M0 = r2
        L_0x0322:
            androidx.recyclerview.widget.RecyclerView r2 = r0.C0
            r2.scrollBy(r14, r1)
            dec r1 = r0.c
            if (r1 == 0) goto L_0x032e
            r0.q(r1)
        L_0x032e:
            androidx.recyclerview.widget.RecyclerView r1 = r0.C0
            q57 r2 = r0.D0
            r1.removeCallbacks(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r0.C0
            java.util.WeakHashMap r1 = defpackage.zmf.a
            r0.postOnAnimation(r15)
        L_0x033c:
            return
        L_0x033d:
            java.lang.Object r15 = r15.b
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen r15 = (one.me.inviteactions.invitebyphone.InviteByPhoneScreen) r15
            android.view.View r1 = r15.getView()
            if (r1 == 0) goto L_0x035a
            bc7[] r1 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.B0
            lea r15 = r15.o0()
            android.widget.EditText r1 = r15.w0
            r1.requestFocus()
            do9 r2 = new do9
            r2.<init>(r15, r0, r1)
            r1.post(r2)
        L_0x035a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q57.run():void");
    }

    public /* synthetic */ q57(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
