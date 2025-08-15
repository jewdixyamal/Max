package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* renamed from: h71  reason: default package */
public final class h71 extends ConstraintLayout implements pv3 {
    public final je7 G0 = tu0.r(3, new f71(this, 0));
    public final je7 H0;
    public final ViewStub I0;
    public final ViewPager2 J0;
    public final rg6 K0;
    public final p71 L0;
    public final je7 M0;
    public b N0;
    public g71 O0;
    public ugf P0;
    public qv3 Q0;
    public final lh0 R0;

    public h71(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H0 = tu0.r(3, new a5(context, 7));
        this.M0 = tu0.r(3, new x2((Object) context, 8, (Object) this));
        this.R0 = new lh0(1, this);
        setLayoutParams(new ti3(-1, -1));
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setId(y7a.P1);
        this.J0 = viewPager2;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(y7a.O1);
        this.I0 = viewStub;
        p71 p71 = new p71(new w4d(4, (Object) this), new qqd(5, (Object) this), new f71(this, 1), new f71(this, 2));
        viewPager2.setAdapter(p71);
        this.L0 = p71;
        rg6 rg6 = new rg6(context);
        rg6.setId(rvb.call_users_speakers_view_tab_layout);
        rg6.setBackgroundColor(0);
        rg6.setVisibility(8);
        this.K0 = rg6;
        addView(viewPager2, getScreenInfo().g ? (getScreenInfo().a * 9) / 16 : 0, getScreenInfo().f ? getScreenInfo().b : 0);
        addView(rg6, tu0.G(((float) 80) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density));
        addView(viewStub, -2, -2);
        dj3 q = fp3.q(this);
        int id = viewPager2.getId();
        q.d(id, 4, rg6.getId(), 3);
        au1.p((float) 6, fk4.d().getDisplayMetrics().density, new l2a(q, 4, id, 4));
        q.d(id, 6, 0, 6);
        q.d(id, 7, 0, 7);
        q.d(id, 3, 0, 3);
        int id2 = rg6.getId();
        q.d(id2, 4, 0, 4);
        au1.p((float) 8, fk4.d().getDisplayMetrics().density, new l2a(q, 4, id2, 4));
        q.d(id2, 6, 0, 6);
        q.d(id2, 7, 0, 7);
        int id3 = viewStub.getId();
        q.d(id3, 6, viewPager2.getId(), 6);
        new l2a(q, 6, id3, 4).e(tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density));
        q.d(id3, 4, rg6.getId(), 4);
        q.d(id3, 3, rg6.getId(), 3);
        q.d(id3, 7, rg6.getId(), 6);
        q.g(id3).d.l0 = true;
        q.g(id3).d.w = 0.0f;
        q.a(this);
    }

    private final ng6 getMediator() {
        return (ng6) this.G0.getValue();
    }

    private final ivc getScreenInfo() {
        return (ivc) this.H0.getValue();
    }

    private final TextView getScrollToStartView() {
        return (TextView) this.M0.getValue();
    }

    public static final void w(h71 h71, int i) {
        h71.getClass();
        boolean z = true;
        if (i <= 1) {
            z = false;
        }
        boolean z2 = z;
        ViewStub viewStub = h71.I0;
        if (br7.G(viewStub) || z2) {
            br7.F(viewStub, h71.getScrollToStartView(), (k56) null);
            ft.g(h71.getScrollToStartView(), z2, 0, (m56) null, 6);
        }
    }

    public final void D(ov3 ov3) {
        dy7.L(this, ov3.b());
    }

    public final List H(nv3 nv3, nv3 nv32) {
        return nz4.a;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ng6 mediator = getMediator();
        if (!mediator.c) {
            mediator.c = true;
            ViewPager2 viewPager2 = mediator.a;
            hdc adapter = viewPager2.getAdapter();
            mediator.d = adapter;
            if (adapter != null) {
                pz4 pz4 = new pz4(3, mediator);
                mediator.f = pz4;
                adapter.z(pz4);
                mg6 mg6 = new mg6(mediator.b);
                mediator.e = mg6;
                viewPager2.b(mg6);
                mediator.a();
            } else {
                throw new IllegalStateException("Attached before view pager has an adapter".toString());
            }
        }
        this.J0.b(this.R0);
    }

    public final void onDetachedFromWindow() {
        hdc hdc;
        super.onDetachedFromWindow();
        ng6 mediator = getMediator();
        if (mediator.c) {
            mediator.c = false;
            pz4 pz4 = mediator.f;
            if (!(pz4 == null || (hdc = mediator.d) == null)) {
                hdc.B(pz4);
            }
            mediator.f = null;
            mediator.d = null;
            mg6 mg6 = mediator.e;
            if (mg6 != null) {
                mediator.a.g(mg6);
            }
            mediator.e = null;
        }
        this.J0.g(this.R0);
    }

    public final void setControlsMediator(qv3 qv3) {
        this.Q0 = qv3;
    }

    public final void setListener(g71 g71) {
        this.O0 = g71;
    }

    public final void setOpponents(List<sma> list) {
        this.L0.E(list);
        int i = 0;
        if (!(list.size() > 1)) {
            i = 8;
        }
        rg6 rg6 = this.K0;
        rg6.setVisibility(i);
        rg6.b(list.size(), Math.min(list.size() - 1, this.J0.getCurrentItem()));
        qv3 qv3 = this.Q0;
        if (qv3 != null) {
            uv3 uv3 = (uv3) qv3;
            D(uv3.j);
            u(uv3.k);
        }
    }

    public final void setOpponentsViewPool(b bVar) {
        this.N0 = bVar;
    }

    public final void setVideoLayoutUpdatesController(ugf ugf) {
        this.P0 = ugf;
    }

    public final void u(ov3 ov3) {
        dy7.K(this, ov3.b());
    }
}
