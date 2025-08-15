package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import one.me.chats.tab.ChatsTabWidget;
import one.me.rlottie.RLottieDrawable;
import one.me.sdk.arch.Widget;

/* renamed from: ck  reason: default package */
public final class ck implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ck() {
        this.a = 11;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    /* JADX WARNING: type inference failed for: r7v23, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r7v29, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewAttachedToWindow(android.view.View r7) {
        /*
            r6 = this;
            r0 = 5
            r1 = 1
            r2 = 0
            int r3 = r6.a
            switch(r3) {
                case 0: goto L_0x0182;
                case 1: goto L_0x0181;
                case 2: goto L_0x010e;
                case 3: goto L_0x0104;
                case 4: goto L_0x00dc;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00bc;
                case 7: goto L_0x0086;
                case 8: goto L_0x0070;
                case 9: goto L_0x006f;
                case 10: goto L_0x0061;
                case 11: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r3 = r6.b
            vxd r3 = (defpackage.vxd) r3
            if (r3 == 0) goto L_0x0016
            boolean r3 = r3.isActive()
            if (r3 != r1) goto L_0x0016
            goto L_0x0060
        L_0x0016:
            boolean r1 = r7 instanceof android.widget.TextView
            if (r1 == 0) goto L_0x001e
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x001f
        L_0x001e:
            r1 = r2
        L_0x001f:
            if (r1 != 0) goto L_0x0022
            goto L_0x0060
        L_0x0022:
            pq9 r3 = defpackage.qp4.u0
            android.content.Context r4 = r1.getContext()
            qp4 r3 = r3.b(r4)
            java.lang.Object r3 = r3.t0
            w7c r3 = (defpackage.w7c) r3
            bpf r4 = new bpf
            r4.<init>(r1, r2)
            zn5 r5 = new zn5
            r5.<init>(r3, r4)
            cpf r3 = new cpf
            r3.<init>(r1, r2)
            zn5 r1 = new zn5
            r1.<init>(r5, r3, r0)
            vy1 r0 = defpackage.od2.h(r1)
            er2 r1 = new er2
            r3 = 3
            r4 = 4
            r1.<init>(r3, r2, r4)
            ac r2 = new ac
            r3 = 18
            r2.<init>(r0, r3, r1)
            rg7 r7 = defpackage.lnf.b(r7)
            vxd r7 = defpackage.od2.L(r2, r7)
            r6.b = r7
        L_0x0060:
            return
        L_0x0061:
            java.util.WeakHashMap r0 = defpackage.zmf.a
            defpackage.mmf.c(r7)
            ri9 r7 = defpackage.y27.a
            java.lang.Object r6 = r6.b
            g1e r6 = (defpackage.g1e) r6
            r7.a(r6)
        L_0x006f:
            return
        L_0x0070:
            java.lang.Object r6 = r6.b
            ujc r6 = (defpackage.ujc) r6
            boolean r7 = r6.f
            if (r7 != 0) goto L_0x0085
            java.lang.ref.WeakReference r7 = r6.d
            java.lang.Object r7 = r7.get()
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L_0x0085
            r6.a(r7)
        L_0x0085:
            return
        L_0x0086:
            java.lang.Object r6 = r6.b
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            android.graphics.drawable.Drawable r7 = r6.getDrawable()
            boolean r0 = r7 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L_0x0095
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            goto L_0x0096
        L_0x0095:
            r7 = r2
        L_0x0096:
            if (r7 == 0) goto L_0x009b
            r7.start()
        L_0x009b:
            android.graphics.drawable.Drawable r7 = r6.getDrawable()
            boolean r0 = r7 instanceof defpackage.zj
            if (r0 == 0) goto L_0x00a6
            r2 = r7
            zj r2 = (defpackage.zj) r2
        L_0x00a6:
            if (r2 == 0) goto L_0x00bc
            android.graphics.drawable.Drawable r7 = r2.b()
            one.me.rlottie.RLottieDrawable r0 = r2.x0
            if (r7 != r0) goto L_0x00bc
            if (r0 == 0) goto L_0x00b5
            r0.setMasterParent(r6)
        L_0x00b5:
            one.me.rlottie.RLottieDrawable r6 = r2.x0
            if (r6 == 0) goto L_0x00bc
            r6.setAllowDecodeSingleFrame(r1)
        L_0x00bc:
            return
        L_0x00bd:
            java.lang.Object r6 = r6.b
            m15 r6 = (defpackage.m15) r6
            q64 r7 = r6.I0
            if (r7 == 0) goto L_0x00db
            android.view.accessibility.AccessibilityManager r7 = r6.H0
            if (r7 == 0) goto L_0x00db
            java.util.WeakHashMap r0 = defpackage.zmf.a
            boolean r0 = r6.isAttachedToWindow()
            if (r0 == 0) goto L_0x00db
            q64 r6 = r6.I0
            b4 r0 = new b4
            r0.<init>(r6)
            r7.addTouchExplorationStateChangeListener(r0)
        L_0x00db:
            return
        L_0x00dc:
            java.lang.Object r6 = r6.b
            mw4 r6 = (defpackage.mw4) r6
            android.view.View r7 = r6.a
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.graphics.drawable.Drawable r7 = r7.getDrawable()
            boolean r0 = r7 instanceof defpackage.zj
            if (r0 == 0) goto L_0x00ef
            r2 = r7
            zj r2 = (defpackage.zj) r2
        L_0x00ef:
            if (r2 == 0) goto L_0x0103
            android.graphics.drawable.Drawable r7 = r2.b()
            one.me.rlottie.RLottieDrawable r0 = r2.x0
            if (r7 != r0) goto L_0x0100
            if (r0 == 0) goto L_0x0100
            gi r6 = r6.G0
            r0.addParentView(r6)
        L_0x0100:
            r2.start()
        L_0x0103:
            return
        L_0x0104:
            java.lang.Object r6 = r6.b
            e53 r6 = (defpackage.e53) r6
            ar0 r6 = r6.e
            r6.p()
            return
        L_0x010e:
            java.lang.Object r7 = r6.b
            one.me.chats.tab.ChatsTabWidget r7 = (one.me.chats.tab.ChatsTabWidget) r7
            java.lang.String r1 = r7.b
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x0119
            goto L_0x0132
        L_0x0119:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0132
            us7 r4 = defpackage.us7.X
            pg7 r7 = r7.getLifecycleScope()
            boolean r7 = defpackage.j1e.z(r7)
            java.lang.String r5 = "ONEME-6453|chats_list_lf | tabs view attached to window. Scope isActive: "
            java.lang.String r7 = defpackage.ey8.j(r5, r7)
            r3.d(r4, r1, r7, r2)
        L_0x0132:
            java.lang.Object r7 = r6.b
            one.me.chats.tab.ChatsTabWidget r7 = (one.me.chats.tab.ChatsTabWidget) r7
            jx5 r1 = r7.p0()
            w7c r1 = r1.w0
            tz2 r3 = new tz2
            java.lang.Object r4 = r6.b
            one.me.chats.tab.ChatsTabWidget r4 = (one.me.chats.tab.ChatsTabWidget) r4
            r3.<init>(r2, r4)
            zn5 r2 = new zn5
            r2.<init>(r1, r3, r0)
            java.lang.Object r0 = r6.b
            one.me.chats.tab.ChatsTabWidget r0 = (one.me.chats.tab.ChatsTabWidget) r0
            pg7 r0 = r0.getViewLifecycleScope()
            vxd r0 = defpackage.od2.L(r2, r0)
            r7.B0 = r0
            java.lang.Object r6 = r6.b
            one.me.chats.tab.ChatsTabWidget r6 = (one.me.chats.tab.ChatsTabWidget) r6
            jx5 r7 = r6.p0()
            w7c r7 = r7.v0
            j0e r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r1 = r7.intValue()
            androidx.viewpager2.widget.ViewPager2 r7 = r6.n0()
            r0 = 0
            r7.e(r1, r0)
            wja r0 = r6.m0()
            r2 = 0
            r5 = 1
            r3 = 1
            r4 = 1
            r0.q(r1, r2, r3, r4, r5)
        L_0x0181:
            return
        L_0x0182:
            java.lang.Object r6 = r6.b
            dk r6 = (defpackage.dk) r6
            java.lang.Object r7 = r6.Z
            hj r7 = (defpackage.hj) r7
            if (r7 != 0) goto L_0x019e
            boolean r7 = r6.c
            if (r7 == 0) goto L_0x019e
            hj r7 = new hj
            java.lang.Object r0 = r6.o
            android.view.View r0 = (android.view.View) r0
            r7.<init>(r0)
            r6.Z = r7
            r7.a()
        L_0x019e:
            java.lang.Object r7 = r6.Z
            hj r7 = (defpackage.hj) r7
            if (r7 == 0) goto L_0x01b1
            boolean r7 = r7.c
            if (r7 != r1) goto L_0x01b1
            java.lang.Object r6 = r6.Z
            hj r6 = (defpackage.hj) r6
            if (r6 == 0) goto L_0x01b1
            r6.a()
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck.onViewAttachedToWindow(android.view.View):void");
    }

    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        RLottieDrawable rLottieDrawable;
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                dk dkVar = (dk) this.b;
                hj hjVar = (hj) dkVar.Z;
                if (hjVar != null) {
                    hjVar.c = true;
                    hj.o.removeCallbacks(hjVar);
                }
                dkVar.Z = null;
                return;
            case 1:
                zz1 zz1 = (zz1) this.b;
                ViewTreeObserver viewTreeObserver = zz1.J0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        zz1.J0 = view.getViewTreeObserver();
                    }
                    zz1.J0.removeGlobalOnLayoutListener(zz1.u0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                String str = chatsTabWidget.b;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, str, ey8.j("ONEME-6453|chats_list_lf | tabs view detached from window. Scope isActive: ", j1e.z(chatsTabWidget.getLifecycleScope())), (Throwable) null);
                }
                x77 x77 = ((ChatsTabWidget) this.b).B0;
                if (x77 != null) {
                    x77.cancel((CancellationException) null);
                }
                ((ChatsTabWidget) this.b).B0 = null;
                return;
            case 3:
                ((e53) this.b).e.r();
                return;
            case 4:
                ((mw4) this.b).E(false);
                return;
            case 5:
                m15 m15 = (m15) this.b;
                q64 q64 = m15.I0;
                if (q64 != null && (accessibilityManager = m15.H0) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new b4(q64));
                    return;
                }
                return;
            case 6:
                Handler handler = cia.a;
                cia.b((zha) ((i50) this.b).s0, yha.o);
                return;
            case 7:
                ImageView imageView = (ImageView) this.b;
                Drawable drawable = imageView.getDrawable();
                Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
                if (animatable != null) {
                    animatable.stop();
                }
                Drawable drawable2 = imageView.getDrawable();
                zj zjVar = drawable2 instanceof zj ? (zj) drawable2 : null;
                if (zjVar != null && zjVar.b() == (rLottieDrawable = zjVar.x0)) {
                    if (rLottieDrawable != null) {
                        rLottieDrawable.setMasterParent((View) null);
                    }
                    RLottieDrawable rLottieDrawable2 = zjVar.x0;
                    if (rLottieDrawable2 != null) {
                        rLottieDrawable2.setAllowDecodeSingleFrame(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ujc ujc = (ujc) this.b;
                if (!ujc.f && (recyclerView = (RecyclerView) ujc.d.get()) != null) {
                    ujc.b(recyclerView);
                    return;
                }
                return;
            case 9:
                yxd yxd = (yxd) this.b;
                ViewTreeObserver viewTreeObserver2 = yxd.A0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        yxd.A0 = view.getViewTreeObserver();
                    }
                    yxd.A0.removeGlobalOnLayoutListener(yxd.u0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 10:
                y27.a.f((g1e) this.b);
                return;
            case 11:
                vxd vxd = (vxd) this.b;
                if (vxd != null) {
                    vxd.cancel((CancellationException) null);
                }
                this.b = null;
                return;
            default:
                Widget widget = (Widget) this.b;
                hm9.m(v3c.w(widget), "lifecycle: preAttach invoke onViewDetachedFromWindow", new Object[0]);
                view.removeOnAttachStateChangeListener(this);
                widget.finalizeCleanActions(widget);
                return;
        }
    }

    public /* synthetic */ ck(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
