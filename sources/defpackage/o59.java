package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: o59  reason: default package */
public final /* synthetic */ class o59 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ o59(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    public final Object invoke(Object obj) {
        vx3 vx3 = vx3.b;
        e5f e5f = e5f.a;
        MessagesListWidget messagesListWidget = this.b;
        switch (this.a) {
            case 0:
                cxc cxc = (cxc) obj;
                bc7[] bc7Arr = MessagesListWidget.X0;
                l89 B = messagesListWidget.x0().B();
                B.getClass();
                B.f(j47.S(B.c, B.b, vx3, new e89(B, (Continuation) null)));
                return e5f;
            case 1:
                FrameLayout frameLayout = (FrameLayout) obj;
                bc7[] bc7Arr2 = MessagesListWidget.X0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(mda.Q);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.setLayoutManager(messagesListWidget.r0());
                m29 m29 = messagesListWidget.A0;
                endlessRecyclerView2.setAdapter(m29);
                endlessRecyclerView2.setHasFixedSize(true);
                endlessRecyclerView2.setItemAnimator((mdc) null);
                endlessRecyclerView2.setThreshold(20);
                endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
                endlessRecyclerView2.setPager(new gd1(15, messagesListWidget));
                endlessRecyclerView2.m(messagesListWidget.M0);
                endlessRecyclerView2.m(messagesListWidget.N0);
                endlessRecyclerView2.m(messagesListWidget.O0);
                endlessRecyclerView2.k(new yc7(1, messagesListWidget));
                f34 f34 = new f34(new o59(messagesListWidget, 5));
                messagesListWidget.G0 = f34;
                h8e h8e = new h8e(endlessRecyclerView2, m29, f34);
                endlessRecyclerView2.j(h8e);
                messagesListWidget.H0 = h8e;
                r5f r5f = new r5f(m29, endlessRecyclerView2);
                endlessRecyclerView2.j(r5f);
                messagesListWidget.F0 = r5f;
                vge vge = new vge(o19.a.getAccessor().d(go0.class), new WeakReference(endlessRecyclerView2), messagesListWidget.requireActivity(), new p59(messagesListWidget, 9), new o59(messagesListWidget, 6));
                messagesListWidget.y0 = vge;
                t69 t69 = new t69(messagesListWidget, vge);
                messagesListWidget.z0 = t69;
                t69.i(endlessRecyclerView2);
                v3c.y(new xh0((Object) messagesListWidget, (Continuation) null, 21), endlessRecyclerView2);
                frameLayout.addView(endlessRecyclerView2);
                frameLayout.addView(messagesListWidget.q0());
                bc7 bc7 = MessagesListWidget.X0[13];
                frameLayout.addView((h6c) messagesListWidget.U0.getValue());
                rwc rwc = new rwc(frameLayout.getContext());
                rwc.setId(mda.R);
                rwc.setOnClickListener(new o59(messagesListWidget, 2));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 8388693;
                frameLayout.addView(rwc, layoutParams);
                return e5f;
            case 2:
                bc7[] bc7Arr3 = MessagesListWidget.X0;
                int ordinal = ((lwc) obj).ordinal();
                if (ordinal == 0) {
                    MessageModel L = messagesListWidget.A0.L(messagesListWidget.u0().getLinearLayoutManager().Y0());
                    if (L != null) {
                        l89 B2 = messagesListWidget.x0().B();
                        B2.getClass();
                        B2.f(j47.S(B2.c, B2.b, vx3, new i89(B2, L, (Continuation) null)));
                    }
                } else if (ordinal == 1) {
                    l89 B3 = messagesListWidget.x0().B();
                    B3.getClass();
                    B3.f(j47.S(B3.c, B3.b, vx3, new b89(B3, (Continuation) null)));
                } else if (ordinal == 2) {
                    l89 B4 = messagesListWidget.x0().B();
                    B4.getClass();
                    B4.f(j47.S(B4.c, B4.b, vx3, new d89(B4, (Continuation) null)));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return e5f;
            case 3:
                long longValue = ((Long) obj).longValue();
                bc7[] bc7Arr4 = MessagesListWidget.X0;
                messagesListWidget.x0().G(longValue);
                return e5f;
            case 4:
                edf edf = (edf) obj;
                bc7[] bc7Arr5 = MessagesListWidget.X0;
                if (edf instanceof cdf) {
                    n59 x0 = messagesListWidget.x0();
                    cdf cdf = (cdf) edf;
                    x0.getClass();
                    x0.n1.o1(x0, n59.D1[5], pnf.n(x0, (lx3) null, vx3, new d59(x0, cdf, (Continuation) null), 1));
                    messagesListWidget.x0().H(cdf.c, cdf.a, (String) null);
                } else if (edf instanceof ddf) {
                    n59 x02 = messagesListWidget.x0();
                    ddf ddf = (ddf) edf;
                    k19 k19 = new k19(ddf.a, ddf.b);
                    x02.getClass();
                    x02.k1.o1(x02, n59.D1[2], j47.S(x02.a, x02.B0, vx3, new d49(x02, k19, (Continuation) null)));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return e5f;
            case 5:
                MessageModel L2 = messagesListWidget.A0.L(((Integer) obj).intValue());
                CharSequence charSequence = L2 != null ? L2.Y : null;
                if (charSequence == null || charSequence.length() == 0) {
                    return null;
                }
                return charSequence;
            default:
                int intValue = ((Integer) obj).intValue();
                bc7[] bc7Arr6 = MessagesListWidget.X0;
                messagesListWidget.y0();
                MessageModel L3 = messagesListWidget.A0.L(intValue);
                if (L3 != null) {
                    g39 v0 = messagesListWidget.v0();
                    v0.getClass();
                    pnf.o(v0.t0, new e39(L3.a));
                }
                return e5f;
        }
    }
}
