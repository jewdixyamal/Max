package one.me.profile.screens.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profile/screens/media/ChatMediaListWidget;", "Lone/me/sdk/arch/Widget;", "Lmf2;", "Lxt3;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lih2;", "type", "(JLih2;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatMediaListWidget extends Widget implements mf2, xt3, ng3 {
    public static final /* synthetic */ bc7[] s0;
    public final je7 X;
    public final q7c Y;
    public final qm0 Z;
    public xm8 a;
    public final w4d b;
    public final fs c;
    public final je7 o;

    static {
        Class<ChatMediaListWidget> cls = ChatMediaListWidget.class;
        s0 = new bc7[]{new oi9(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), z7b.g(nec.a, cls, "mediaType", "getMediaType()Lone/me/profile/screens/media/model/ChatMediaType;", 0), new hob(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new hob(cls, "emptyView", "getEmptyView()Lone/me/profile/screens/media/view/ChatMediaEmptyView;", 0)};
    }

    public ChatMediaListWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.b = mqd.D();
        this.c = new fs(ih2.class, "media_type");
        this.o = createViewModelLazy(gi2.class, new s(28, new x2(bundle, (Widget) this, 21)));
        this.X = xcb.a.getAccessor().d(z3b.class);
        this.Y = viewBinding(wea.k0);
        gi2 n0 = n0();
        e52 v = n0.v();
        es8 es8 = v != null ? v.c : null;
        Long valueOf = es8 != null ? Long.valueOf(es8.k()) : null;
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            tf2 x = n0.x();
            if (x != null) {
                hm9.m(x.a, "load: time = %d, loadOperation = %s", Long.valueOf(longValue), x.s0);
                if (longValue != 0) {
                    synchronized (x.s0) {
                        try {
                            synchronized (x.s0) {
                            }
                            if (x.s0.b == longValue) {
                                hm9.k0(x.a, (Exception) null, "load: duplicate invocation", Arrays.copyOf(new Object[0], 0));
                            } else {
                                x.u0.a();
                                x.t0.a();
                                x.s0.a();
                                x.s0.b = longValue;
                                ev evVar = x.s0;
                                qa3 qa3 = new qa3(new sa3(0, new cv(new zu(x, longValue, 1))).k(x.c).h(x.o), 1, new av(x, 2));
                                iq1 iq1 = new iq1(new av(x, 3), 0, new bv(x, 1));
                                qa3.i(iq1);
                                evVar.o = iq1;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                }
            }
        }
        this.Z = binding(new md1(10, this));
    }

    public static final EndlessRecyclerView2 m0(ChatMediaListWidget chatMediaListWidget) {
        chatMediaListWidget.getClass();
        return (EndlessRecyclerView2) chatMediaListWidget.Y.T0(chatMediaListWidget, s0[2]);
    }

    public final void h(int i, Bundle bundle) {
        Object obj;
        if (bundle != null) {
            long j = bundle.getLong("selected_message_id");
            long j2 = bundle.getLong("selected_attach_id");
            gi2 n0 = n0();
            Iterator it = ((lh2) n0.O0.getValue()).a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                xm8 xm8 = (xm8) obj;
                if (xm8.j() == j && xm8.i() == j2) {
                    break;
                }
            }
            xm8 xm82 = (xm8) obj;
            if (xm82 != null) {
                n0.C(i, xm82);
            }
        }
    }

    public final gi2 n0() {
        return (gi2) this.o.getValue();
    }

    public final ih2 o0() {
        bc7 bc7 = s0[1];
        return (ih2) this.c.a(this);
    }

    public final void onAttach(View view) {
        if (o0() == ih2.b) {
            t50 t50 = ((z3b) this.X.getValue()).b;
            t50.Y = true;
            t50.d();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(layoutInflater.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(wea.k0);
        endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        endlessRecyclerView2.setPager(n0().N0);
        endlessRecyclerView2.setThreshold(20);
        endlessRecyclerView2.setAdapter(new nf2(((iba) xcb.a.getAccessor().c(iba.class)).a(), this));
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        yb4 yb4 = new yb4();
        yb4.g = false;
        endlessRecyclerView2.setItemAnimator(yb4);
        endlessRecyclerView2.setOverScrollMode(2);
        bc7[] bc7Arr = s0;
        bc7 bc7 = bc7Arr[3];
        qm0 qm0 = this.Z;
        endlessRecyclerView2.setEmptyView((af2) qm0.getValue());
        endlessRecyclerView2.setHasFixedSize(true);
        if (pf2.$EnumSwitchMapping$0[o0().ordinal()] == 1) {
            endlessRecyclerView2.getContext();
            endlessRecyclerView2.setLayoutManager(new GridLayoutManager(3));
            endlessRecyclerView2.j(new sc1(3, tu0.G(((float) 3) * fk4.d().getDisplayMetrics().density), 4));
        } else {
            endlessRecyclerView2.getContext();
            endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        frameLayout.addView(endlessRecyclerView2);
        bc7 bc72 = bc7Arr[3];
        frameLayout.addView((af2) qm0.getValue());
        return frameLayout;
    }

    public final void onDetach(View view) {
        if (o0() == ih2.b) {
            t50 t50 = ((z3b) this.X.getValue()).b;
            t50.Y = false;
            if (t50.X) {
                t50.X = false;
                jpb jpb = t50.b;
                jpb.b();
                jpb.h.remove(t50.Z);
            }
        }
    }

    public final void onDismiss() {
        x77 x77 = (x77) this.b.T0(this, s0[0]);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        this.a = null;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        w7c w7c = n0().P0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new qf2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().K0, getViewLifecycleOwner().Q(), fg7), new rf2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p0(xm8 xm8) {
        gi2 n0 = n0();
        vxd S = j47.S(n0.a, ((w9a) n0.w()).b(), vx3.b, new wh2(n0, xm8, (Continuation) null));
        n0.D0.o1(n0, gi2.R0[0], S);
    }

    public final void q0(xm8 xm8, View view) {
        pag.F(view, ni6.LONG_PRESS);
        if (this.a == null) {
            bc7[] bc7Arr = s0;
            bc7 bc7 = bc7Arr[0];
            w4d w4d = this.b;
            x77 x77 = (x77) w4d.T0(this, bc7);
            if (x77 == null || !x77.isActive()) {
                w4d.o1(this, bc7Arr[0], j47.T(getViewLifecycleScope(), (lx3) null, vx3.b, new sf2(this, xm8, view, (Continuation) null), 1));
            }
        }
    }

    public final void y(int i, Bundle bundle) {
        xm8 xm8 = this.a;
        if (xm8 != null) {
            this.a = null;
            n0().C(i, xm8);
        }
    }

    public ChatMediaListWidget(long j, ih2 ih2) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j)), new kpa("media_type", ih2)));
    }
}
