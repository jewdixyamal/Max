package one.me.stickerssettings.stickersscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/stickerssettings/stickersscreen/StickersScreen;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "La5e;", "mode", "", "setId", "(La5e;J)V", "stickers-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class StickersScreen extends Widget implements xt3, ng3 {
    public static final /* synthetic */ bc7[] v0;
    public final q7c X;
    public final qm0 Y;
    public final qm0 Z;
    public final a5e a;
    public final fs b;
    public final je7 c;
    public final q7c o;
    public final je7 s0;
    public final gw7 t0;
    public final a3g u0;

    static {
        Class<StickersScreen> cls = StickersScreen.class;
        hob hob = new hob(cls, "stickersSetId", "getStickersSetId()J", 0);
        oec oec = nec.a;
        v0 = new bc7[]{hob, zr6.e(oec, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, oec)};
    }

    public StickersScreen(a5e a5e, long j) {
        this(dy7.g(new kpa("mode", a5e.a), new kpa("set_id", Long.valueOf(j))));
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final void h(int i, Bundle bundle) {
        a8e o0 = o0();
        o0.getClass();
        int i2 = gja.e;
        vx3 vx3 = vx3.b;
        w4d w4d = o0.u0;
        ContextScope contextScope = o0.a;
        kke kke = o0.X;
        if (i == i2) {
            w4d.o1(o0, a8e.C0[0], j47.S(contextScope, ((w9a) kke).b(), vx3, new o7e(o0, (Continuation) null)));
        } else if (i == gja.d) {
            w4d.o1(o0, a8e.C0[0], j47.S(contextScope, ((w9a) kke).b(), vx3, new n7e(o0, (Continuation) null)));
        } else {
            int i3 = gja.c;
            bc7[] bc7Arr = a8e.C0;
            if (i == i3) {
                vxd S = j47.S(contextScope, ((w9a) kke).b(), vx3, new q7e(o0, ((xf9) o0.r().e.a.getValue()).b, (Continuation) null));
                o0.v0.o1(o0, bc7Arr[1], S);
                o0.r().a();
            } else if (i == gja.b) {
                vxd S2 = j47.S(contextScope, ((w9a) kke).b(), vx3, new p7e(o0, o0.c, (Continuation) null));
                o0.w0.o1(o0, bc7Arr[2], S2);
            }
        }
    }

    public final RecyclerView m0() {
        return (RecyclerView) this.X.T0(this, v0[2]);
    }

    public final cla n0() {
        return (cla) this.o.T0(this, v0[1]);
    }

    public final a8e o0() {
        return (a8e) this.c.getValue();
    }

    public final void onActivityPaused(Activity activity) {
        ((hw7) this.s0.getValue()).a(this.t0);
    }

    public final void onActivityResumed(Activity activity) {
        ((hw7) this.s0.getValue()).b(this.t0);
    }

    public final void onChangeStarted(zu3 zu3, av3 av3) {
        super.onChangeStarted(zu3, av3);
        av3 av32 = av3.POP_ENTER;
        je7 je7 = this.s0;
        gw7 gw7 = this.t0;
        if (av3 == av32 || av3 == av3.PUSH_ENTER) {
            ((hw7) je7.getValue()).b(gw7);
        } else if (av3 == av3.PUSH_EXIT) {
            ((hw7) je7.getValue()).a(gw7);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(gja.f);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
        float f = (float) 12;
        recyclerView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.u0);
        int A = z7.A(recyclerView.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(A));
        recyclerView.j(new ry0(A, tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), 8));
        recyclerView.k(new yc7(3, this));
        frameLayout.addView(recyclerView);
        cla cla = new cla(frameLayout.getContext(), 6);
        cla.setId(gja.x);
        cla.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new rpc(9, this)));
        v3c.y(new ieb(3, (Continuation) null, 1), cla);
        frameLayout.addView(cla);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        this.t0.b();
        m0().setAdapter((hdc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        cla n0 = n0();
        pla.a(n0, new i76((Object) n0, 21, (Object) this));
        w7c w7c = o0().y0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new b5e((Continuation) null, this, view), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t03(o0().z0, 11), getViewLifecycleOwner().Q(), fg7), new c5e((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(o0().A0, getViewLifecycleOwner().Q(), fg7), new d5e((Continuation) null, this), 5), getViewLifecycleScope());
        RecyclerView m0 = m0();
        dg9 r = o0().r();
        jg9 jg9 = new jg9(m0, this.u0, r, n0());
        od2.L(new zn5(r.e, new lq0(2, jg9, jg9.class, "handleNewSelectedMessages", "handleNewSelectedMessages(Lone/me/stickerssettings/stickersscreen/multiselection/MultiSelectionLogic$Data;)V", 4, 24), 5), getViewLifecycleScope());
    }

    public final void y(int i, Bundle bundle) {
        a8e o0 = o0();
        o0.getClass();
        ued ued = null;
        if (i == gja.u) {
            o0.r().d.m((Object) null, new xf9(true, 6));
            return;
        }
        int i2 = gja.w;
        s35 s35 = o0.A0;
        if (i == i2) {
            pnf.o(s35, new sed(new eqe(hja.B), new eqe(hja.A), y53.M(new mg3(gja.e, new eqe(hja.D), 1, false), new mg3(gja.a, new eqe(hja.i), 2, false))));
        } else if (i == gja.t) {
            pnf.o(s35, new sed(new eqe(hja.w), new eqe(hja.v), y53.M(new mg3(gja.d, new eqe(hja.D), 1, false), new mg3(gja.a, new eqe(hja.i), 2, false))));
        } else if (i == gja.i) {
            m7e m7e = (m7e) o0.z0.a.getValue();
            String str = m7e != null ? m7e.c : null;
            if (str != null && str.length() != 0) {
                tpa.o(o0.o, str);
                if (tpa.s()) {
                    ued = new ued(woc.t, new eqe(hja.g));
                }
                if (ued != null) {
                    pnf.o(s35, ued);
                }
            }
        } else if (i == gja.j) {
            pnf.o(s35, new sed(new eqe(hja.k), new eqe(hja.j), y53.M(new mg3(gja.b, new eqe(hja.h), 1, false), new mg3(gja.a, new eqe(hja.i), 2, false))));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: a5e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: a5e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: a5e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: a5e} */
    /* JADX WARNING: type inference failed for: r0v12, types: [gw7, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StickersScreen(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            r5.<init>(r6, r0, r1, r2)
            dp3 r0 = defpackage.a5e.b
            java.lang.String r1 = "mode"
            java.lang.String r6 = r6.getString(r1)
            java.lang.String r1 = "Required value was null."
            if (r6 == 0) goto L_0x00c6
            r0.getClass()
            v25 r0 = defpackage.a5e.Z
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            r3 = r0
            u1 r3 = (defpackage.u1) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0034
            java.lang.Object r3 = r3.next()
            r4 = r3
            a5e r4 = (defpackage.a5e) r4
            java.lang.String r4 = r4.a
            boolean r4 = defpackage.tpa.f(r4, r6)
            if (r4 == 0) goto L_0x001b
            r2 = r3
        L_0x0034:
            if (r2 == 0) goto L_0x00bc
            a5e r2 = (defpackage.a5e) r2
            r5.a = r2
            r0 = -1
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            fs r0 = new fs
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.String r2 = "set_id"
            r0.<init>(r1, r6, r2)
            r5.b = r0
            z4e r6 = new z4e
            r0 = 0
            r6.<init>(r5, r0)
            nhd r0 = new nhd
            r1 = 8
            r0.<init>(r1, r6)
            java.lang.Class<a8e> r6 = defpackage.a8e.class
            je7 r6 = r5.createViewModelLazy(r6, r0)
            r5.c = r6
            int r6 = defpackage.gja.x
            q7c r6 = r5.viewBinding(r6)
            r5.o = r6
            int r6 = defpackage.gja.f
            q7c r6 = r5.viewBinding(r6)
            r5.X = r6
            z4e r6 = new z4e
            r0 = 1
            r6.<init>(r5, r0)
            qm0 r6 = r5.binding(r6)
            r5.Y = r6
            z4e r6 = new z4e
            r0 = 2
            r6.<init>(r5, r0)
            qm0 r6 = r5.binding(r6)
            r5.Z = r6
            k6e r6 = defpackage.k6e.a
            v4 r0 = r6.getAccessor()
            java.lang.Class<hw7> r1 = defpackage.hw7.class
            khe r0 = r0.d(r1)
            r5.s0 = r0
            gw7 r0 = new gw7
            r0.<init>()
            r5.t0 = r0
            a3g r0 = new a3g
            v4 r6 = r6.getAccessor()
            java.lang.Class<iba> r1 = defpackage.iba.class
            java.lang.Object r6 = r6.c(r1)
            iba r6 = (defpackage.iba) r6
            java.util.concurrent.ExecutorService r6 = r6.a()
            bkg r1 = new bkg
            r2 = 26
            r1.<init>(r2, r5)
            r0.<init>(r6, r1)
            r5.u0 = r0
            return
        L_0x00bc:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L_0x00c6:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stickerssettings.stickersscreen.StickersScreen.<init>(android.os.Bundle):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickersScreen(a5e a5e, long j, int i, z84 z84) {
        this(a5e, (i & 2) != 0 ? -1 : j);
    }
}
