package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: li1  reason: default package */
public final class li1 extends ConstraintLayout implements bk1, zj1 {
    public final /* synthetic */ CallScreen G0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public li1(CallScreen callScreen, Context context) {
        super(context);
        CallScreen callScreen2 = callScreen;
        this.G0 = callScreen2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(qp4.u0.p(this).c.b().k);
        setId(rvb.call_screen_container_id);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(rvb.call_bottom_control_container);
        frameLayout.setLayoutParams(new ti3(-2, -2));
        frameLayout.setPadding(0, 0, 0, tu0.G(fk4.c() * ((float) 24)));
        br7.d(frameLayout, new x27(0, new yq0(5, 1, false), 1), (m56) null);
        i1b i1b = callScreen2.z0;
        h1b h1b = h1b.b;
        i1b.a(frameLayout, h1b);
        boolean isLaidOut = frameLayout.isLaidOut();
        i1b i1b2 = callScreen2.z0;
        if (!isLaidOut || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new ii1(callScreen2, 1));
        } else {
            i1b2.c();
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(rvb.call_top_control_container);
        br7.d(frameLayout2, new x27(5, (yq0) null, 2), (m56) null);
        i1b2.a(frameLayout2, h1b.a);
        if (!frameLayout2.isLaidOut() || frameLayout2.isLayoutRequested()) {
            frameLayout2.addOnLayoutChangeListener(new ii1(callScreen2, 2));
        } else {
            i1b2.c();
        }
        uv3 z0 = callScreen.z0();
        frameLayout2.addOnLayoutChangeListener((View.OnLayoutChangeListener) z0.e.getValue());
        z0.c = frameLayout2;
        frameLayout.addOnLayoutChangeListener((View.OnLayoutChangeListener) z0.f.getValue());
        z0.d = frameLayout;
        FrameLayout frameLayout3 = new FrameLayout(getContext());
        frameLayout3.setId(rvb.call_events_view);
        frameLayout3.setLayoutParams(new ti3(-1, -2));
        frameLayout3.setPadding(frameLayout3.getPaddingLeft(), frameLayout3.getPaddingTop(), frameLayout3.getPaddingRight(), tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density));
        i1b2.a(frameLayout3, h1b);
        FrameLayout frameLayout4 = new FrameLayout(getContext());
        frameLayout4.setId(y7a.W1);
        frameLayout4.setLayoutParams(new ti3(-1, -2));
        float f = (float) 12;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        frameLayout4.setPadding(G, G, G, G);
        FrameLayout frameLayout5 = new FrameLayout(getContext());
        frameLayout5.setId(rvb.call_screen_vpn_container_id);
        frameLayout5.setLayoutParams(new ti3(-1, -2));
        addView(callScreen.E0());
        addView(callScreen.C0());
        addView(callScreen.B0());
        addView(frameLayout);
        addView(frameLayout2, 0, -2);
        addView(frameLayout3);
        addView(frameLayout4);
        addView(callScreen.A0());
        addView(frameLayout5);
        dj3 q = fp3.q(this);
        int id = callScreen.E0().getId();
        q.d(id, 6, 0, 6);
        q.d(id, 3, 0, 3);
        q.d(id, 7, 0, 7);
        q.d(id, 4, 0, 4);
        int id2 = frameLayout2.getId();
        q.d(id2, 3, 0, 3);
        q.d(id2, 6, 0, 6);
        q.d(id2, 7, 0, 7);
        int id3 = callScreen.C0().getId();
        q.d(id3, 3, frameLayout2.getId(), 4);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id3, 4));
        q.d(id3, 6, 0, 6);
        q.d(id3, 7, 0, 7);
        int id4 = callScreen.B0().getId();
        q.d(id4, 3, 0, 3);
        q.d(id4, 6, 0, 6);
        q.d(id4, 7, 0, 7);
        int id5 = frameLayout.getId();
        q.d(id5, 4, 0, 4);
        q.d(id5, 6, 0, 6);
        q.d(id5, 7, 0, 7);
        int id6 = callScreen.A0().getId();
        q.d(id6, 3, 0, 3);
        q.d(id6, 4, 0, 4);
        q.d(id6, 6, 0, 6);
        q.d(id6, 7, 0, 7);
        int id7 = frameLayout3.getId();
        q.d(id7, 4, frameLayout.getId(), 3);
        q.d(id7, 6, 0, 6);
        q.d(id7, 7, 0, 7);
        int id8 = frameLayout4.getId();
        q.d(id8, 3, frameLayout2.getId(), 4);
        q.d(id8, 6, 0, 6);
        q.d(id8, 7, 0, 7);
        int id9 = frameLayout5.getId();
        q.d(id9, 4, frameLayout.getId(), 3);
        q.d(id9, 6, 0, 6);
        q.d(id9, 7, 0, 7);
        q.a(this);
    }

    public final void a(boolean z) {
        if (z) {
            CallScreen callScreen = this.G0;
            mm1 o0 = CallScreen.o0(callScreen);
            if (o0 != null) {
                o0.a(true);
            }
            callScreen.p0(true);
        }
    }

    public final void b(boolean z) {
        if (!z) {
            yxc yxc = CallScreen.R0;
            this.G0.p0(false);
        }
    }

    public final void d(RectF rectF, boolean z) {
        mm1 o0 = CallScreen.o0(this.G0);
        if (o0 != null) {
            o0.d(rectF, z);
        }
    }

    public final void e(boolean z) {
        yxc yxc = CallScreen.R0;
        CallScreen callScreen = this.G0;
        callScreen.p0(false);
        mm1 o0 = CallScreen.o0(callScreen);
        if (o0 != null) {
            o0.e(z);
        }
    }

    public final void f(kl7 kl7, boolean z, long j) {
        CallScreen callScreen = this.G0;
        mm1 o0 = CallScreen.o0(callScreen);
        if (o0 != null) {
            o0.f(kl7, z, j);
        }
        if (br7.G(callScreen.C0())) {
            callScreen.v0().f(kl7, z, j);
        }
    }

    public boolean getShouldScaleMainOpponent() {
        mm1 o0 = CallScreen.o0(this.G0);
        if (o0 != null) {
            return o0.getShouldScaleMainOpponent();
        }
        return false;
    }

    public final void h(kl7 kl7, boolean z, long j) {
        mm1 o0 = CallScreen.o0(this.G0);
        if (o0 != null) {
            o0.h(kl7, z, j);
        }
    }

    public final void o(boolean z) {
        if (z) {
            yxc yxc = CallScreen.R0;
            CallScreen callScreen = this.G0;
            if (br7.G(callScreen.C0())) {
                dm1 v0 = callScreen.v0();
                v0.getClass();
                v0.setAlpha(1.0f);
            }
            callScreen.p0(true);
            mm1 o0 = CallScreen.o0(callScreen);
            if (o0 != null) {
                o0.o(true);
            }
        }
    }
}
