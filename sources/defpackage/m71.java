package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.List;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;

/* renamed from: m71  reason: default package */
public final class m71 extends ConstraintLayout {
    public final CallGridLayoutManager G0;
    public final RecyclerView H0;
    public final af1 I0;
    public l71 J0;
    public final je7 K0;
    public sma L0 = sma.o;
    public k56 M0;
    public final GestureDetector N0;

    public m71(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K0 = tu0.r(3, new a5(context, 8));
        setLayoutParams(new ti3(-1, -1));
        this.N0 = new GestureDetector(context, new q00(2, this));
        af1 af1 = new af1(nnf.c, new rxd(5, this), new i71(this, 0), (hm1) null, new i71(this, 1), 18);
        this.I0 = af1;
        float f = (float) 2;
        CallGridLayoutManager callGridLayoutManager = new CallGridLayoutManager(context, tu0.G(fk4.d().getDisplayMetrics().density * f), new sh0((getScreenInfo().f || getScreenInfo().e) ? 2 : 3, 2, (Object) this));
        callGridLayoutManager.K = new j71(this);
        this.G0 = callGridLayoutManager;
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(rvb.call_grid_opponents_view);
        recyclerView.setAdapter(af1);
        recyclerView.setLayoutManager(callGridLayoutManager);
        recyclerView.j(new d71(tu0.G(f * fk4.d().getDisplayMetrics().density), 0));
        recyclerView.l(new k71(0, this));
        this.H0 = recyclerView;
        addView(recyclerView, -1, -1);
        dj3 q = fp3.q(this);
        int id = recyclerView.getId();
        q.d(id, 4, 0, 4);
        q.d(id, 6, 0, 6);
        q.d(id, 7, 0, 7);
        q.d(id, 3, 0, 3);
        q.a(this);
    }

    private final ivc getScreenInfo() {
        return (ivc) this.K0.getValue();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.N0.onTouchEvent(motionEvent);
    }

    public final void setListener(l71 l71) {
        this.J0 = l71;
    }

    public final void setOpponents(sma sma) {
        RecyclerView recyclerView = this.H0;
        List list = sma.c;
        int i = sma.a;
        if (i == 0 && list.size() > 2 && getHeight() != -2) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                recyclerView.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else if (i == 0 && list.size() <= 2 && getHeight() != -1) {
            ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
                recyclerView.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else if (i > 0 && getHeight() != -1) {
            ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.height = -1;
                recyclerView.setLayoutParams(layoutParams3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.L0 = sma;
        this.I0.E(list);
    }

    public final void setOpponentsViewPool(b bVar) {
        this.H0.setRecycledViewPool(bVar);
    }

    public final void setParentSizeProvider(e71 e71) {
        this.G0.P = e71;
    }

    public final void setVideoLayoutUpdatesControllerProvider(k56 k56) {
        this.M0 = k56;
    }
}
