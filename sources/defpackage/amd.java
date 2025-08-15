package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: amd  reason: default package */
public final class amd extends FrameLayout implements kre {
    public static final /* synthetic */ bc7[] t0;
    public final FrameLayout a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final cmd o;
    public final yj s0 = new yj(this);

    static {
        oi9 oi9 = new oi9(amd.class, "shimmerBackground", "getShimmerBackground()Lone/me/sdk/uikit/common/shimmers/ShimmerContactCell$Companion$Background;");
        nec.a.getClass();
        t0 = new bc7[]{oi9};
    }

    public amd(Context context) {
        super(context, (AttributeSet) null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(xoc.H);
        float f = (float) 40;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        this.a = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(xoc.L);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(((float) 169) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density)));
        this.b = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(xoc.K);
        float f2 = (float) 12;
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(((float) 90) * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f2)));
        this.c = frameLayout3;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(xoc.J);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cmd cmd = new cmd(context);
        cmd.setId(xoc.I);
        cmd.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.o = cmd;
        setId(xoc.G);
        setLayoutParams(new FrameLayout.LayoutParams(-1, tu0.G(((float) 62) * fk4.d().getDisplayMetrics().density)));
        constraintLayout.addView(frameLayout);
        constraintLayout.addView(frameLayout2);
        constraintLayout.addView(frameLayout3);
        cmd.addView(constraintLayout);
        addView(cmd);
        onThemeChanged(qp4.u0.j(this));
        dj3 q = fp3.q(constraintLayout);
        int id = frameLayout.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 4, 0, 4);
        q.d(id, 6, 0, 6);
        new l2a(q, 6, id, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id2 = frameLayout2.getId();
        q.d(id2, 3, frameLayout.getId(), 3);
        q.d(id2, 6, frameLayout.getId(), 7);
        new l2a(q, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id3 = frameLayout3.getId();
        q.d(id3, 4, frameLayout.getId(), 4);
        q.d(id3, 6, frameLayout.getId(), 7);
        new l2a(q, 6, id3, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        q.a(constraintLayout);
    }

    public final void a(fka fka) {
        int ordinal = getShimmerBackground().ordinal();
        if (ordinal == 0) {
            fka.b();
            setBackgroundColor(0);
        } else if (ordinal == 1) {
            setBackgroundColor(fka.b().k);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final zld getShimmerBackground() {
        bc7 bc7 = t0[0];
        return (zld) this.s0.b;
    }

    public final void onThemeChanged(fka fka) {
        a(fka);
        this.a.setBackground(hm9.S(Integer.valueOf(fka.d().a.a.d), (Integer) null, (Integer) null));
        float f = (float) 4;
        this.b.setBackground(hm9.b0(Integer.valueOf(fka.d().a.a.d), (Integer) null, (Integer) null, tu0.G(fk4.d().getDisplayMetrics().density * f)));
        this.c.setBackground(hm9.b0(Integer.valueOf(fka.d().a.a.d), (Integer) null, (Integer) null, tu0.G(f * fk4.d().getDisplayMetrics().density)));
        bkg bkg = new bkg(25);
        yld yld = (yld) bkg.b;
        yld.k = false;
        yld.i = 0.0f;
        bkg.w(1200);
        bkg.v(fka.d().a.a.d);
        yld.d = fka.b().k;
        bkg.u();
        this.o.a(bkg.m());
    }

    public final void setShimmerBackground(zld zld) {
        this.s0.o1(this, t0[0], zld);
    }
}
