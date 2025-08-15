package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wha  reason: default package */
public final class wha {
    public final WeakReference a;
    public uia b;
    public final i50 c;
    public final int d;
    public final int e;

    public wha(FrameLayout frameLayout) {
        WeakReference weakReference = new WeakReference(frameLayout);
        this.a = weakReference;
        this.b = uia.Z;
        if (frameLayout != null) {
            this.c = new i50(weakReference);
        }
    }

    public final void a(jqe jqe) {
        ViewGroup viewGroup;
        Context context;
        uia uia = this.b;
        CharSequence charSequence = null;
        if (!(jqe == null || (viewGroup = (ViewGroup) this.a.get()) == null || (context = viewGroup.getContext()) == null)) {
            charSequence = jqe.b(context);
        }
        this.b = uia.a(uia, (oia) null, (CharSequence) null, charSequence, (tia) null, (eia) null, (iia) null, 59);
    }

    public final void b(CharSequence charSequence) {
        this.b = uia.a(this.b, (oia) null, (CharSequence) null, charSequence, (tia) null, (eia) null, (iia) null, 59);
    }

    public final void c(eia eia) {
        this.b = uia.a(this.b, (oia) null, (CharSequence) null, (CharSequence) null, (tia) null, eia, (iia) null, 47);
    }

    public final void d(xha xha) {
        i50 i50 = this.c;
        if (i50 != null) {
            i50.Y = xha;
        }
    }

    public final void e(oia oia) {
        uia uia = this.b;
        this.b = uia.a(uia, oia, (CharSequence) null, (CharSequence) null, (tia) null, (eia) null, oia instanceof nia ? hia.b : uia.Y, 30);
    }

    public final void f(tia tia) {
        this.b = uia.a(this.b, (oia) null, (CharSequence) null, (CharSequence) null, tia, (eia) null, (iia) null, 55);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = r1.getContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.jqe r9) {
        /*
            r8 = this;
            uia r0 = r8.b
            java.lang.ref.WeakReference r1 = r8.a
            java.lang.Object r1 = r1.get()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x0017
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L_0x0017
            java.lang.CharSequence r9 = r9.b(r1)
            goto L_0x0018
        L_0x0017:
            r9 = 0
        L_0x0018:
            if (r9 != 0) goto L_0x001c
            java.lang.String r9 = ""
        L_0x001c:
            r2 = r9
            r5 = 0
            r6 = 0
            r1 = 0
            r3 = 0
            r4 = 0
            r7 = 61
            uia r9 = defpackage.uia.a(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.b = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wha.g(jqe):void");
    }

    public final void h(CharSequence charSequence) {
        this.b = uia.a(this.b, (oia) null, charSequence, (CharSequence) null, (tia) null, (eia) null, (iia) null, 61);
    }

    public final vha i() {
        i50 i50;
        iia iia = null;
        if (this.a.get() == null || (i50 = this.c) == null) {
            return null;
        }
        uia uia = this.b;
        eia eia = uia.X;
        uia a2 = uia.a(uia, (oia) null, (CharSequence) null, (CharSequence) null, (tia) null, eia.a(eia, 0, eia.b + this.e, eia.c + this.d, 1), (iia) null, 47);
        i50.o = a2;
        AtomicBoolean atomicBoolean = cia.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            bia bia = cia.b;
            zha zha = (zha) i50.s0;
            if (bia != null ? tpa.f(bia.b.get(), zha) : false) {
                bia bia2 = cia.b;
                if (bia2 != null) {
                    iia = bia2.a;
                }
                if (tpa.f(iia, fia.b)) {
                    atomicBoolean.set(false);
                }
            }
            bia bia3 = cia.b;
            if (bia3 != null ? tpa.f(bia3.b.get(), zha) : false) {
                cia.a.removeCallbacksAndMessages(cia.b);
                cia.c(cia.b);
            } else {
                cia.c = new bia(zha, a2.Y);
                if (cia.b == null) {
                    cia.d();
                }
            }
            atomicBoolean.set(false);
        }
        return new vha(i50);
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wha(one.me.sdk.arch.Widget r9) {
        /*
            r8 = this;
            r0 = r9
        L_0x0001:
            uu3 r1 = r0.getParentController()
            if (r1 == 0) goto L_0x000c
            uu3 r0 = r0.getParentController()
            goto L_0x0001
        L_0x000c:
            android.view.View r0 = r0.getView()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L_0x0020
            android.view.View r0 = (android.view.View) r0
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            boolean r2 = r0 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L_0x0028
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            r8.<init>((android.widget.FrameLayout) r0)
            q0e r0 = defpackage.vc7.f
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L_0x0044
            android.content.Context r0 = r9.getContext()
            int r0 = defpackage.vc7.a(r0)
            goto L_0x0045
        L_0x0044:
            r0 = r2
        L_0x0045:
            x27 r3 = r9.getInsetsConfig()
            int r3 = r3.a
            if (r3 != 0) goto L_0x004e
            r3 = r2
        L_0x004e:
            r4 = -1
            if (r3 != 0) goto L_0x0053
            r3 = r4
            goto L_0x005b
        L_0x0053:
            int[] r5 = defpackage.uha.$EnumSwitchMapping$0
            int r3 = defpackage.au1.s(r3)
            r3 = r5[r3]
        L_0x005b:
            r5 = 2
            r6 = 1
            if (r3 == r6) goto L_0x007a
            if (r3 == r5) goto L_0x0063
        L_0x0061:
            r3 = r2
            goto L_0x0084
        L_0x0063:
            android.view.View r3 = r9.getView()
            if (r3 == 0) goto L_0x0061
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r7 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x0074
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x0075
        L_0x0074:
            r3 = r1
        L_0x0075:
            if (r3 == 0) goto L_0x0061
            int r3 = r3.topMargin
            goto L_0x0084
        L_0x007a:
            android.view.View r3 = r9.getView()
            if (r3 == 0) goto L_0x0061
            int r3 = r3.getPaddingTop()
        L_0x0084:
            r8.e = r3
            x27 r3 = r9.getInsetsConfig()
            yq0 r3 = r3.b
            if (r3 == 0) goto L_0x0091
            int r3 = r3.a
            goto L_0x0092
        L_0x0091:
            r3 = r2
        L_0x0092:
            if (r3 != 0) goto L_0x0095
            goto L_0x009d
        L_0x0095:
            int[] r4 = defpackage.uha.$EnumSwitchMapping$0
            int r3 = defpackage.au1.s(r3)
            r4 = r4[r3]
        L_0x009d:
            if (r4 == r6) goto L_0x00b9
            if (r4 == r5) goto L_0x00a2
            goto L_0x00c3
        L_0x00a2:
            android.view.View r9 = r9.getView()
            if (r9 == 0) goto L_0x00c3
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            boolean r0 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00b3
            r1 = r9
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x00b3:
            if (r1 == 0) goto L_0x00b7
            int r2 = r1.bottomMargin
        L_0x00b7:
            r0 = r2
            goto L_0x00c3
        L_0x00b9:
            android.view.View r9 = r9.getView()
            if (r9 == 0) goto L_0x00c3
            int r0 = r9.getPaddingBottom()
        L_0x00c3:
            r8.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wha.<init>(one.me.sdk.arch.Widget):void");
    }
}
