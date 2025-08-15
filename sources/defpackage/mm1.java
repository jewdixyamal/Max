package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.List;

/* renamed from: mm1  reason: default package */
public final class mm1 extends ConstraintLayout implements pv3, bk1, zj1, g1b {
    public final no1 G0;
    public final je7 H0 = zi1.a.c();
    public final je7 I0 = tu0.r(3, new hm1(this, 4));
    public b J0;
    public final je7 K0;
    public final je7 L0;
    public final je7 M0;
    public final je7 N0;
    public PointF O0;
    public final ViewStub P0;
    public final ViewStub Q0;
    public ugf R0;
    public qv3 S0;
    public final je7 T0;
    public fm1 U0;
    public zx7 V0;
    public qma W0;
    public boolean X0;
    public km1 Y0;
    public j1b Z0;

    public mm1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K0 = tu0.r(3, new jm1(context, this, 0));
        this.L0 = tu0.r(3, new jm1(context, this, 1));
        this.M0 = tu0.r(3, new a5(context, 11));
        this.N0 = tu0.r(3, new a5(context, 12));
        this.T0 = tu0.r(3, new dk1(9));
        setLayoutParams(new ti3(-1, -1));
        no1 no1 = new no1(context, (AttributeSet) null);
        no1.setId(rvb.call_user_full_avatar);
        no1.setVideoLayoutUpdatesControllerProvider(new hm1(this, 5));
        this.G0 = no1;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(rvb.call_speaker_opponents_view);
        this.P0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(y7a.N1);
        this.Q0 = viewStub2;
        addView(no1, -1, -1);
        addView(viewStub2);
        addView(viewStub);
        addView(getBottomSpaceView());
        addView(getTopSpaceView());
        dj3 q = fp3.q(this);
        int id = getTopSpaceView().getId();
        q.d(id, 3, 0, 3);
        q.d(id, 6, 0, 6);
        q.d(id, 7, 0, 7);
        int id2 = viewStub2.getId();
        q.d(id2, 7, 0, 7);
        au1.p((float) 16, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id2, 4));
        q.d(id2, 4, 0, 4);
        int id3 = no1.getId();
        q.d(id3, 3, 0, 3);
        q.d(id3, 4, 0, 4);
        q.d(id3, 6, 0, 6);
        q.d(id3, 7, 0, 7);
        int id4 = viewStub.getId();
        q.d(id4, 4, getBottomSpaceView().getId(), 3);
        au1.p((float) 4, fk4.d().getDisplayMetrics().density, new l2a(q, 4, id4, 4));
        q.d(id4, 6, 0, 6);
        q.d(id4, 7, 0, 7);
        int id5 = getBottomSpaceView().getId();
        q.d(id5, 4, 0, 4);
        q.d(id5, 6, 0, 6);
        q.d(id5, 7, 0, 7);
        q.a(this);
    }

    public static void A(mm1 mm1, List list) {
        mm1.getOpponentsAdapter().E(list);
    }

    public static void B(mm1 mm1) {
        mm1.D(mm1.getMarginTop());
        mm1.u(mm1.getMarginBottom());
    }

    private final Space getBottomSpaceView() {
        return (Space) this.N0.getValue();
    }

    private final xg1 getFakePipView() {
        return (xg1) this.L0.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((defpackage.uv3) r1).k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ov3 getMarginBottom() {
        /*
            r1 = this;
            ov3 r0 = defpackage.ov3.d
            qv3 r1 = r1.S0
            if (r1 == 0) goto L_0x000e
            uv3 r1 = (defpackage.uv3) r1
            ov3 r1 = r1.k
            if (r1 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm1.getMarginBottom():ov3");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((defpackage.uv3) r1).j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ov3 getMarginTop() {
        /*
            r1 = this;
            ov3 r0 = defpackage.ov3.d
            qv3 r1 = r1.S0
            if (r1 == 0) goto L_0x000e
            uv3 r1 = (defpackage.uv3) r1
            ov3 r1 = r1.j
            if (r1 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm1.getMarginTop():ov3");
    }

    private final af1 getOpponentsAdapter() {
        return (af1) this.I0.getValue();
    }

    private final RecyclerView getOpponentsView() {
        return (RecyclerView) this.K0.getValue();
    }

    private final m1b getPipAnimation() {
        return (m1b) this.T0.getValue();
    }

    private final aa1 getPipPositionMediator() {
        return (aa1) this.H0.getValue();
    }

    private final Space getTopSpaceView() {
        return (Space) this.M0.getValue();
    }

    private final void setMainSpeaker(zx7 zx7) {
        ko1 ko1;
        gg1 gg1;
        fm1 fm1;
        zx7 zx72 = this.V0;
        boolean z = true;
        boolean z2 = !tpa.f(zx72 != null ? zx72.h : null, zx7 != null ? zx7.h : null);
        this.V0 = zx7;
        if (zx7 == null) {
            ko1 = ko1.o;
        } else {
            boolean z3 = zx7.e;
            ko1 = !z3 ? ko1.b : (!zx7.f || !z3 || !zx7.g) ? ko1.a : ko1.c;
        }
        no1 no1 = this.G0;
        no1.setBackgroundState(ko1);
        boolean z4 = false;
        if (zx7 == null || !zx7.g || !zx7.e || zx7.f) {
            z = false;
        }
        s5a s5a = no1.G0;
        if (ft.l(s5a)) {
            no1.S(z ? 128 : 255, false);
        }
        no1.setRaiseHand(zx7 != null ? zx7.j : false);
        md0 md0 = zx7 != null ? zx7.a : null;
        s5a.h(s5a, md0 != null ? md0.b : null, md0 != null ? md0.a : null);
        s5a.setCustomOverlay((od0) null);
        if (zx7 != null) {
            z4 = zx7.d;
        }
        no1.O(z4);
        no1.T(zx7 != null ? zx7.h : null);
        no1.P(zx7 != null ? zx7.m : null, zx7 != null ? zx7.l : null);
        if (zx7 == null || (gg1 = zx7.c) == null) {
            gg1 = gg1.c;
        }
        no1.setParticipantId(gg1);
        if (z2 && (fm1 = this.U0) != null) {
            haf haf = zx7 != null ? zx7.h : null;
            gm1 gm1 = (gm1) fm1;
            if (!tpa.f(gm1.b, haf)) {
                gm1.b = haf;
                for (em1 p : gm1.a) {
                    p.p();
                }
            }
        }
        I(this.X0, (m56) null);
    }

    public static void w(mm1 mm1, zx7 zx7) {
        mm1.setMainSpeaker(zx7);
    }

    public static RecyclerView x(Context context, mm1 mm1) {
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(rvb.call_speaker_opponents_view);
        recyclerView.setAdapter(mm1.getOpponentsAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.j(new d71(tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), 1));
        recyclerView.setLayoutParams(new ti3(-1, -2));
        b bVar = mm1.J0;
        if (bVar != null) {
            recyclerView.setRecycledViewPool(bVar);
        }
        return recyclerView;
    }

    public static void y(boolean z, mm1 mm1, List list) {
        if (z) {
            mm1.getOpponentsAdapter().E(list);
        } else {
            mm1.getOpponentsView().post(new c(mm1, 17, list));
        }
    }

    public final void C(xg1 xg1, PointF pointF) {
        PointF y = dy7.y(xg1.getContext());
        if (getMarginBottom().b() == 0) {
            if (pointF == null) {
                pointF = y;
            }
            this.O0 = pointF;
            return;
        }
        this.O0 = null;
        PointF pointF2 = new PointF(y.x, y.y - ((float) getMarginBottom().a));
        if (pointF != null) {
            if (!(pointF.x == 0.0f || pointF.y == 0.0f)) {
                if (pointF.y > pointF2.y) {
                    pointF = new PointF(pointF.x, pointF2.y);
                }
                xg1.setStartPosition(pointF);
            }
        }
        pointF = pointF2;
        xg1.setStartPosition(pointF);
    }

    public final void D(ov3 ov3) {
        dy7.L(getTopSpaceView(), ov3.b());
        this.G0.D(ov3);
    }

    public final void E(j1b j1b) {
        this.Z0 = j1b;
        if (br7.G(this.Q0)) {
            getFakePipView().setBoundariesOffset(j1b);
        }
    }

    public final void F(zx7 zx7, qma qma) {
        boolean z;
        qma qma2 = qma;
        qma qma3 = this.W0;
        if (!(qma3 == null || qma2 == null)) {
            if (!tpa.f(qma3.c, qma2.c)) {
                z = true;
                if (br7.G(this.Q0) || !z) {
                    zx7 zx72 = zx7;
                    setMainSpeaker(zx7);
                    G(qma2);
                }
                G(qma2);
                m1b pipAnimation = getPipAnimation();
                xg1 fakePipView = getFakePipView();
                x2 x2Var = new x2((Object) this, 15, (Object) zx7);
                pipAnimation.getClass();
                no1 no1 = this.G0;
                a81 a81 = new a81(x2Var, pipAnimation, no1, 7);
                RectF rectF = new RectF(no1.getX(), no1.getY(), no1.getX() + ((float) no1.getMeasuredWidth()), no1.getY() + ((float) no1.getMeasuredHeight()));
                RectF rectF2 = new RectF(fakePipView.getX(), fakePipView.getY(), fakePipView.getX() + ((float) fakePipView.getMeasuredWidth()), fakePipView.getY() + ((float) fakePipView.getMeasuredHeight()));
                float width = rectF2.width() / rectF.width();
                float height = rectF2.height() / rectF.height();
                no1.setPivotX(rectF.top);
                no1.setPivotY(rectF.left);
                if (m1b.b()) {
                    no1.setLayerType(2, (Paint) null);
                    fakePipView.setLayerType(2, (Paint) null);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(no1, View.X, new float[]{rectF.left, rectF2.left});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(no1, View.Y, new float[]{rectF.top, rectF2.top});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(no1, View.SCALE_X, new float[]{1.0f, width});
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(no1, View.SCALE_Y, new float[]{1.0f, height});
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{0.0f, fk4.d().getDisplayMetrics().density * 16.0f});
                ofFloat5.addUpdateListener(new zf(no1, 3));
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(fakePipView, View.ALPHA, new float[]{1.0f, 0.0f})});
                animatorSet.setDuration(200);
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new l1b(pipAnimation, no1, fakePipView, rectF, a81));
                animatorSet.start();
                return;
            }
        }
        z = false;
        if (br7.G(this.Q0)) {
        }
        zx7 zx722 = zx7;
        setMainSpeaker(zx7);
        G(qma2);
    }

    public final void G(qma qma) {
        boolean z;
        ViewStub viewStub = this.Q0;
        if ((qma != null || br7.G(viewStub)) && !tpa.f(this.W0, qma)) {
            this.W0 = qma;
            xg1 fakePipView = getFakePipView();
            if (!br7.G(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int indexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = fakePipView.getLayoutParams().height;
                layoutParams.width = fakePipView.getLayoutParams().width;
                fakePipView.setId(viewStub.getId());
                viewGroup.addView(fakePipView, indexOfChild, layoutParams);
                xg1 fakePipView2 = getFakePipView();
                ba1 ba1 = (ba1) getPipPositionMediator();
                ba1.getClass();
                PointF pointF = ba1.b;
                C(fakePipView2, new PointF(pointF.x, pointF.y));
                j1b j1b = this.Z0;
                if (j1b != null) {
                    getFakePipView().setBoundariesOffset(j1b);
                }
                z = true;
            } else {
                z = false;
            }
            if (qma != null) {
                getFakePipView().d(qma);
            }
            ft.g(getFakePipView(), qma != null, z ? 0 : 150, (m56) null, 4);
        }
    }

    public final List H(nv3 nv3, nv3 nv32) {
        kl7 l = j1e.l();
        l.add(z7.u(getTopSpaceView(), nv3, (nv3) null, 2));
        l.add(z7.u(getBottomSpaceView(), (nv3) null, nv32, 1));
        if (br7.G(this.P0)) {
            l.add(z7.o(getOpponentsView(), nv32.a));
        }
        l.addAll(this.G0.H(nv3, nv32));
        return j1e.d(l);
    }

    public final void I(boolean z, m56 m56) {
        ov3 ov3;
        if (br7.G(this.P0)) {
            qv3 qv3 = this.S0;
            if (!(qv3 == null || (ov3 = ((uv3) qv3).k) == null || ov3.c)) {
                z = false;
            }
            ft.g(getOpponentsView(), z, 0, m56, 2);
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.G0.a(z);
        }
    }

    public final void d(RectF rectF, boolean z) {
        if (ft.q(this, z)) {
            float f = rectF.left;
            no1 no1 = this.G0;
            no1.setX(f);
            no1.setY(rectF.top);
            no1.setPivotX(0.0f);
            no1.setPivotY(0.0f);
            no1.setScaleX(rectF.width() / ((float) no1.getWidth()));
            no1.setScaleY(rectF.height() / ((float) no1.getHeight()));
        }
    }

    public final void e(boolean z) {
        if (br7.G(this.Q0)) {
            xg1 fakePipView = getFakePipView();
            if (ft.q(fakePipView, z) && getShouldScaleMainOpponent()) {
                fakePipView.setAlpha(0.0f);
            }
        }
    }

    public final void f(kl7 kl7, boolean z, long j) {
        this.G0.f(kl7, z, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = r0.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getShouldScaleMainOpponent() {
        /*
            r6 = this;
            zx7 r0 = r6.V0
            qma r6 = r6.W0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0012
            haf r3 = r0.h
            if (r3 == 0) goto L_0x0012
            boolean r3 = r3.c
            if (r3 != r2) goto L_0x0012
            r3 = r2
            goto L_0x0013
        L_0x0012:
            r3 = r1
        L_0x0013:
            if (r6 == 0) goto L_0x001f
            haf r4 = r6.g
            if (r4 == 0) goto L_0x001f
            boolean r4 = r4.c
            if (r4 != r2) goto L_0x001f
            r4 = r2
            goto L_0x0020
        L_0x001f:
            r4 = r1
        L_0x0020:
            if (r0 == 0) goto L_0x002a
            boolean r5 = r0.i
            if (r5 != 0) goto L_0x002a
            if (r3 == 0) goto L_0x002a
        L_0x0028:
            r1 = r2
            goto L_0x0040
        L_0x002a:
            if (r6 == 0) goto L_0x0033
            boolean r5 = r6.i
            if (r5 != 0) goto L_0x0033
            if (r4 == 0) goto L_0x0033
            goto L_0x0040
        L_0x0033:
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.i
            if (r0 != r2) goto L_0x003c
            if (r3 == 0) goto L_0x003c
            goto L_0x0028
        L_0x003c:
            if (r6 == 0) goto L_0x0040
            boolean r6 = r6.i
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm1.getShouldScaleMainOpponent():boolean");
    }

    public final void h(kl7 kl7, boolean z, long j) {
        this.G0.h(kl7, z, j);
    }

    public final void o(boolean z) {
        if (z) {
            no1 no1 = this.G0;
            no1.o(z);
            no1.setX(0.0f);
            no1.setY(0.0f);
            no1.setPivotX(0.0f);
            no1.setPivotY(0.0f);
            no1.setScaleX(1.0f);
            no1.setScaleY(1.0f);
            if (br7.G(this.Q0)) {
                getFakePipView().setAlpha(1.0f);
            }
        }
    }

    public final void setCallSpeakerMediator(fm1 fm1) {
        this.U0 = fm1;
    }

    public final void setControlsMediator(qv3 qv3) {
        this.S0 = qv3;
        this.G0.setControlsMediator(qv3);
    }

    public final void setListener(km1 km1) {
        this.Y0 = km1;
        this.G0.setListener(km1);
    }

    public final void setOpponents(List<sma> list) {
        sma sma = (sma) x53.i0(list);
        List list2 = sma != null ? sma.c : null;
        if (list2 == null) {
            list2 = nz4.a;
        }
        boolean isEmpty = list2.isEmpty();
        ViewStub viewStub = this.P0;
        if (!isEmpty || br7.G(viewStub)) {
            br7.F(viewStub, getOpponentsView(), new hm1(this, 0));
            boolean z = true;
            boolean z2 = !list2.isEmpty();
            if (getOpponentsView().getVisibility() != 0) {
                z = false;
            }
            this.X0 = z2;
            I(z2, new im1(z, this, list2));
        }
    }

    public final void setOpponentsViewPool(b bVar) {
        if (br7.G(this.P0)) {
            getOpponentsView().setRecycledViewPool(bVar);
        }
        this.J0 = bVar;
    }

    public final void setStatus(CharSequence charSequence) {
        this.G0.setStatus(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setName(charSequence);
    }

    public final void setVideoLayoutUpdatesController(ugf ugf) {
        this.R0 = ugf;
    }

    public final void u(ov3 ov3) {
        dy7.K(getBottomSpaceView(), ov3.b());
        if (br7.G(this.Q0) && this.O0 != null) {
            C(getFakePipView(), this.O0);
        }
        this.G0.getClass();
    }
}
