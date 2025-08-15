package one.me.chats.list;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/chats/list/ChatsListWidget;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Lng3;", "Lwq3;", "Lib5;", "Lb57;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "(Ljava/lang/String;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
public final class ChatsListWidget extends Widget implements xt3, ng3, wq3, ib5, b57 {
    public static final /* synthetic */ bc7[] M0;
    public final ly4 A0;
    public final a3g B0;
    public final a3g C0;
    public final a3g D0;
    public final a3g E0;
    public final y51 F0;
    public final rv5 G0;
    public final nd3 H0;
    public final w4d I0;
    public final je7 J0;
    public final qm0 K0;
    public final ax7 L0;
    public final khe X;
    public final je7 Y;
    public final je7 Z;
    public final String a;
    public final String b;
    public final fs c;
    public final fs o;
    public final je7 s0;
    public final je7 t0;
    public zwe u0;
    public final ExecutorService v0;
    public final q7c w0;
    public final qm0 x0;
    public final khe y0;
    public b z0;

    static {
        Class<ChatsListWidget> cls = ChatsListWidget.class;
        M0 = new bc7[]{new oi9(cls, "selectedChatIdForAction", "getSelectedChatIdForAction()Ljava/lang/Long;"), rh4.g(nec.a, cls, "selectedContactIdForAction", "getSelectedContactIdForAction()Ljava/lang/Long;"), new hob(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new hob(cls, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0), new oi9(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new hob(cls, "chatsListRecyclerViewAnalyticsListener", "getChatsListRecyclerViewAnalyticsListener()Lone/me/chats/list/ChatsListRecyclerViewAnalyticsListener;", 0)};
    }

    public ChatsListWidget(String str) {
        this(dy7.g(new kpa("folder.id.key", str)));
    }

    public static final void m0(ChatsListWidget chatsListWidget, qt3 qt3) {
        chatsListWidget.getClass();
        float f = (float) -6;
        qt3.w(new Rect(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0), 0.0f);
    }

    public final void A(x47 x47) {
        int ordinal = x47.ordinal();
        if (ordinal != 0) {
            je7 je7 = this.Y;
            if (ordinal == 1) {
                ((l67) je7.getValue()).a("click_qr", "main", "invite_friends");
                gy2.c.P1().b(":invite/qr", (Bundle) null);
            } else if (ordinal == 2) {
                ((l67) je7.getValue()).a("click_link", "main", "invite_friends");
                p0().v();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            gy2.c.P1().b(":invite/phone", (Bundle) null);
        }
    }

    public final void h(int i, Bundle bundle) {
        boolean z = false;
        if (i == uvb.oneme_saved_messages_clear_history) {
            nx2 p0 = p0();
            p82 t = p0.t();
            t.getClass();
            e52 e52 = (e52) t.e0((String) null, new b82(t, 2));
            if (e52 != null) {
                ((s8g) p0.E0.getValue()).a(new g8d(e52.a, false));
            }
        } else if (i != hpc.a) {
            Long valueOf = bundle != null ? Long.valueOf(bundle.getLong("selected.chatId.Action")) : null;
            boolean z2 = (valueOf == null || valueOf.longValue() != 0) && valueOf != null;
            Long valueOf2 = bundle != null ? Long.valueOf(bundle.getLong("selected.contactId.Action")) : null;
            if ((valueOf2 == null || valueOf2.longValue() != 0) && valueOf2 != null) {
                z = true;
            }
            if (z2) {
                nx2 p02 = p0();
                if (valueOf != null) {
                    pnf.n(p02, ((w9a) p02.Y).a(), (vx3) null, new mw2(i, p02, valueOf.longValue(), (Continuation) null), 2);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (z) {
                oo3 oo3 = (oo3) this.Z.getValue();
                if (valueOf2 != null) {
                    oo3.q(i, valueOf2.longValue());
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    public final aba n0() {
        bc7 bc7 = M0[3];
        return (aba) this.x0.getValue();
    }

    public final EndlessRecyclerView2 o0() {
        return (EndlessRecyclerView2) this.w0.T0(this, M0[2]);
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        p0().u();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(layoutInflater.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(p8a.k);
        endlessRecyclerView2.setTag(uvb.oneme_folder_tag, this.b);
        endlessRecyclerView2.setHasFixedSize(true);
        frameLayout.addView(endlessRecyclerView2);
        frameLayout.addView(n0(), -1, -1);
        v3c.y(new ro2(3, (Continuation) null, 2), frameLayout);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        String str = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.j("ONEME-6453|chats_list_lf | list view destroy. Scope isActive: ", j1e.z(getLifecycleScope())), (Throwable) null);
        }
        EndlessRecyclerView2 o0 = o0();
        bc7 bc7 = M0[5];
        o0.q0((xu2) this.K0.getValue());
        zwe zwe = this.u0;
        if (zwe != null) {
            zwe.B(o0);
        }
        o0.setDelegate((v15) null);
        o0.setPager((t15) null);
        o0.setAdapter((hdc) null);
    }

    public final void onDismiss() {
        bc7[] bc7Arr = M0;
        bc7 bc7 = bc7Arr[0];
        this.c.b(this, (Object) null);
        bc7 bc72 = bc7Arr[1];
        this.o.b(this, (Object) null);
        x77 x77 = (x77) this.I0.T0(this, bc7Arr[4]);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            l5g l5g = new l5g(this, 1);
            String[] strArr2 = eua.e;
            int i2 = jpc.Q1;
            int i3 = jpc.W1;
            ((eua) this.t0.getValue()).getClass();
            eua.k(l5g, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        String str = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, ey8.j("ONEME-6453|chats_list_lf | list view created. Scope isActive: ", j1e.z(getLifecycleScope())), (Throwable) null);
        }
        EndlessRecyclerView2 o0 = o0();
        nd3 nd3 = this.H0;
        if (tpa.f(this.b, "all.chat.folder")) {
            bc7 bc7 = M0[5];
            o0.k((xu2) this.K0.getValue());
        }
        o0.getContext();
        o0.setLayoutManager(new LinearLayoutManager());
        if (o0.getAdapter() == null || nd3 != o0.getAdapter()) {
            if (tpa.f(Looper.myLooper(), Looper.getMainLooper())) {
                int i = iga.a;
                Object tag = o0.getTag(i);
                ujc ujc = tag instanceof ujc ? (ujc) tag : null;
                o0.setTag(i, (Object) null);
                if (ujc != null) {
                    String str2 = ujc.i;
                    ir6 ir62 = hm9.m;
                    if (ir62 != null && ir62.c()) {
                        ir62.d(us7.X, str2, "clear", (Throwable) null);
                    }
                    RecyclerView recyclerView = (RecyclerView) ujc.d.get();
                    if (recyclerView != null) {
                        recyclerView.removeOnAttachStateChangeListener(ujc.h);
                    }
                    gh7 gh7 = ujc.e;
                    if (gh7 != null) {
                        gh7.f(ujc.g);
                    }
                }
                if (nd3 == null) {
                    b recycledViewPool = o0.getRecycledViewPool();
                    o0.setRecycledViewPool((b) null);
                    o0.setAdapter((hdc) null);
                    o0.setRecycledViewPool(recycledViewPool);
                } else {
                    o0.setTag(i, new ujc(nd3, o0));
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.u0 = z7.m(o0);
        o0.setHasFixedSize(true);
        o0.setPager(new j81(this, 2));
        if (tpa.f(this.b, "all.chat.folder")) {
            o0.setDelegate(this.F0);
        }
        o0.setEmptyView(n0());
        o0.setClipToPadding(false);
        o0.setClipChildren(false);
        o0.setClipToOutline(false);
        o0.setThreshold(10);
        o0.setIgnoreRefreshingFlagsForScrollEvent(true);
        b bVar = this.z0;
        if (bVar != null) {
            o0.setRecycledViewPool(bVar);
        }
        mdc itemAnimator = o0.getItemAnimator();
        yb4 yb4 = itemAnimator instanceof yb4 ? (yb4) itemAnimator : null;
        if (yb4 != null) {
            yb4.g = false;
        }
        o0.j(new kq(3));
        pq9 pq9 = qp4.u0;
        o0.j(new un8(1, pq9.j(o0)));
        o0.j(new bw5(new nw4((Object) this, (Object) getContext().getString(jpc.Q), (Object) o0, 4)));
        o0.j(new jn3(new em2(4, new ga(this, 7, new nn3(0, "", (String) null, (List) null, (CharSequence) null, (CharSequence) null, (Uri) null, false, false, "", false, (pua) null, 0, false, 31744))), pq9.j(o0), (in3) null));
        if (nd3.j() > 0) {
            o0.measure(View.MeasureSpec.makeMeasureSpec(o0.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(o0.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
        }
        o0().setRefreshingNext(((mt2) p0().H0.a.getValue()).b);
        s35 s35 = p0().O0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(s35, getViewLifecycleOwner().Q(), fg7), new tx2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new xk1(p0().P0, 28), getViewLifecycleOwner().Q(), fg7), new ux2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(p0().N0, getViewLifecycleOwner().Q(), fg7), new vx2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((oo3) this.Z.getValue()).C0, getViewLifecycleOwner().Q(), fg7), new wx2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new xk1(((oo3) this.Z.getValue()).D0, 29), getViewLifecycleOwner().Q(), fg7), new xx2((Continuation) null, this), 5), getViewLifecycleScope());
        this.A0.Y = new l(29, this);
        od2.L(new zn5(tu0.g(p0().V0, getViewLifecycleOwner().Q(), fg7), new yx2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final nx2 p0() {
        return (nx2) this.s0.getValue();
    }

    public final void q0(long j, View view) {
        bc7[] bc7Arr = M0;
        bc7 bc7 = bc7Arr[1];
        if (((Long) this.o.a(this)) == null) {
            bc7 bc72 = bc7Arr[4];
            w4d w4d = this.I0;
            x77 x77 = (x77) w4d.T0(this, bc72);
            if (x77 == null || !x77.isActive()) {
                w4d.o1(this, bc7Arr[4], j47.T(getViewLifecycleScope(), (lx3) null, vx3.b, new sx2(this, j, view, (Continuation) null), 1));
            }
        }
    }

    public final void t() {
        ((eua) this.t0.getValue()).f(new l5g(this, 1), eua.e, 156);
    }

    public final void w(int i) {
        if (qx2.$EnumSwitchMapping$0[au1.s(i)] != 1) {
            t();
        } else if (Build.VERSION.SDK_INT >= 33) {
            l5g l5g = new l5g(this, 1);
            je7 je7 = this.t0;
            String[] strArr = eua.k;
            ((eua) je7.getValue()).getClass();
            if (eua.i(l5g, strArr)) {
                ((eua) je7.getValue()).f(l5g, strArr, 177);
            } else {
                startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getContext().getPackageName(), (String) null)));
            }
        }
    }

    public final void y(int i, Bundle bundle) {
        bc7[] bc7Arr = M0;
        bc7 bc7 = bc7Arr[0];
        fs fsVar = this.c;
        Long l = (Long) fsVar.a(this);
        if (l != null) {
            long longValue = l.longValue();
            bc7 bc72 = bc7Arr[0];
            fsVar.b(this, (Object) null);
            nx2 p0 = p0();
            pnf.n(p0, ((w9a) p0.Y).a(), (vx3) null, new mw2(i, p0, longValue, (Continuation) null), 2);
            return;
        }
        bc7 bc73 = bc7Arr[1];
        Long l2 = (Long) this.o.a(this);
        if (l2 != null) {
            ((oo3) this.Z.getValue()).q(i, l2.longValue());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChatsListWidget(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 6
            r3 = 9
            r4 = 7
            r5 = 4
            r7 = 1
            r8 = 5
            r9 = 0
            r10 = 2
            r11 = 0
            r0.<init>(r1, r9, r10, r11)
            java.lang.Class<one.me.chats.list.ChatsListWidget> r12 = one.me.chats.list.ChatsListWidget.class
            java.lang.String r12 = r12.getName()
            r0.a = r12
            java.lang.String r13 = "folder.id.key"
            java.lang.String r1 = r1.getString(r13)
            if (r1 == 0) goto L_0x01d4
            r0.b = r1
            fs r1 = new fs
            java.lang.String r13 = "selected.chatId.Action"
            java.lang.Class<java.lang.Long> r14 = java.lang.Long.class
            r1.<init>(r14, r11, r13)
            r0.c = r1
            fs r1 = new fs
            java.lang.String r13 = "selected.contactId.Action"
            r1.<init>(r14, r11, r13)
            r0.o = r1
            ox2 r1 = new ox2
            r1.<init>(r0, r9)
            khe r13 = new khe
            r13.<init>(r1)
            r0.X = r13
            hr3 r1 = defpackage.hr3.a
            v4 r1 = r1.getAccessor()
            java.lang.Class<l67> r13 = defpackage.l67.class
            khe r1 = r1.d(r13)
            r0.Y = r1
            hn2 r1 = new hn2
            r1.<init>(r3)
            ti2 r13 = new ti2
            r14 = 19
            r13.<init>(r14, r1)
            java.lang.Class<oo3> r1 = defpackage.oo3.class
            je7 r1 = r0.createViewModelLazy(r1, r13)
            r0.Z = r1
            ox2 r1 = new ox2
            r1.<init>(r0, r5)
            ti2 r13 = new ti2
            r14 = 20
            r13.<init>(r14, r1)
            java.lang.Class<nx2> r1 = defpackage.nx2.class
            je7 r1 = r0.createViewModelLazy(r1, r13)
            r0.s0 = r1
            ox2 r1 = new ox2
            r1.<init>(r0, r8)
            ti2 r13 = new ti2
            r14 = 21
            r13.<init>(r14, r1)
            java.lang.Class<bh0> r1 = defpackage.bh0.class
            je7 r1 = r0.createViewModelLazy(r1, r13)
            dh0 r13 = defpackage.dh0.a
            v4 r13 = r13.getAccessor()
            java.lang.Class<eua> r14 = defpackage.eua.class
            khe r13 = r13.d(r14)
            r0.t0 = r13
            ys2 r13 = defpackage.ys2.a
            iba r14 = r13.c()
            java.util.concurrent.ExecutorService r14 = r14.a()
            r0.v0 = r14
            int r15 = defpackage.p8a.k
            q7c r15 = r0.viewBinding(r15)
            r0.w0 = r15
            ox2 r15 = new ox2
            r15.<init>(r0, r2)
            qm0 r15 = r0.binding(r15)
            r0.x0 = r15
            hn2 r15 = new hn2
            r11 = 10
            r15.<init>(r11)
            khe r11 = new khe
            r11.<init>(r15)
            r0.y0 = r11
            ly4 r11 = new ly4
            rx2 r15 = new rx2
            r15.<init>(r0)
            r11.<init>((defpackage.rx2) r15, (java.util.concurrent.ExecutorService) r14)
            r0.A0 = r11
            a3g r15 = new a3g
            r15.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r14, (int) r10)
            r0.B0 = r15
            a3g r3 = new a3g
            r3.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r14, (int) r8)
            r0.C0 = r3
            a3g r2 = new a3g
            r2.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r14, (int) r8)
            r0.D0 = r2
            a3g r8 = new a3g
            r8.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r14, (int) r4)
            r0.E0 = r8
            y51 r5 = new y51
            r5.<init>(r14, r7)
            r0.F0 = r5
            rv5 r6 = new rv5
            v02 r7 = new v02
            r9 = 14
            r7.<init>(r9, r0)
            ox2 r9 = new ox2
            r9.<init>(r0, r4)
            r6.<init>(r14, r7, r9)
            r0.G0 = r6
            nd3 r7 = new nd3
            md3 r9 = new md3
            r14 = 0
            r9.<init>((boolean) r14, (int) r10)
            hdc[] r4 = new defpackage.hdc[r4]
            r4[r14] = r15
            r14 = 1
            r4[r14] = r6
            r4[r10] = r11
            r6 = 3
            r4[r6] = r5
            r5 = 4
            r4[r5] = r3
            r3 = 5
            r4[r3] = r8
            r3 = 6
            r4[r3] = r2
            r7.<init>(r9, r4)
            r0.H0 = r7
            w4d r2 = defpackage.mqd.D()
            r0.I0 = r2
            ox2 r2 = new ox2
            r3 = 8
            r2.<init>(r0, r3)
            je7 r2 = defpackage.tu0.r(r6, r2)
            r0.J0 = r2
            ox2 r2 = new ox2
            r3 = 9
            r2.<init>(r0, r3)
            qm0 r2 = r0.binding(r2)
            r0.K0 = r2
            ax7 r2 = r13.b()
            r0.L0 = r2
            r2.getClass()
            bta r3 = new bta
            cta r4 = defpackage.cta.CHATS_INIT_TO_RENDER
            long r5 = android.os.SystemClock.elapsedRealtime()
            r3.<init>(r4, r5)
            qi9 r2 = r2.e
            r2.k(r4, r3)
            nx2 r2 = r16.p0()
            pu2 r2 = r2.X
            r2.e()
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x0171
            goto L_0x018b
        L_0x0171:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x018b
            us7 r3 = defpackage.us7.X
            pg7 r4 = r16.getLifecycleScope()
            boolean r4 = defpackage.j1e.z(r4)
            java.lang.String r5 = "ONEME-6453|chats_list_lf | list subscribe on new data. Scope isActive: "
            java.lang.String r4 = defpackage.ey8.j(r5, r4)
            r5 = 0
            r2.d(r3, r12, r4, r5)
        L_0x018b:
            nx2 r2 = r16.p0()
            w7c r2 = r2.H0
            java.lang.Object r1 = r1.getValue()
            bh0 r1 = (defpackage.bh0) r1
            w7c r1 = r1.s0
            nx2 r3 = r16.p0()
            w7c r3 = r3.K0
            nx2 r4 = r16.p0()
            w7c r4 = r4.L0
            java.util.List r5 = defpackage.wmd.n()
            qn5 r6 = new qn5
            r7 = 3
            r6.<init>(r7, r5)
            kk1 r5 = new kk1
            r8 = 0
            r9 = 1
            r5.<init>(r0, r8, r9)
            r8 = 5
            mn5[] r8 = new defpackage.mn5[r8]
            r11 = 0
            r8[r11] = r2
            r8[r9] = r1
            r8[r10] = r3
            r8[r7] = r4
            r1 = 4
            r8[r1] = r6
            ac r1 = new ac
            r2 = 22
            r1.<init>(r8, r2, r5)
            pg7 r0 = r16.getLifecycleScope()
            defpackage.od2.L(r1, r0)
            return
        L_0x01d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.list.ChatsListWidget.<init>(android.os.Bundle):void");
    }
}
