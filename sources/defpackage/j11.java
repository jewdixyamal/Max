package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: j11  reason: default package */
public final class j11 extends ConstraintLayout {
    public static final /* synthetic */ int S0 = 0;
    public final je7 G0 = tu0.r(3, new m(27));
    public final je7 H0 = tu0.r(3, new m(28));
    public final knc I0;
    public final knc J0;
    public final knc K0;
    public final knc L0;
    public o11 M0;
    public m38 N0;
    public m38 O0;
    public a51 P0;
    public ywe Q0;
    public final je7 R0 = tu0.r(3, new h11(this, 0));

    public j11(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new ti3(0, -2));
        View view = new View(context);
        view.setId(rvb.call_bottom_panel_background);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#5F2D2D31"));
        view.setBackground(shapeDrawable);
        addView(view, -1, tu0.G(((float) 76) * fk4.d().getDisplayMetrics().density));
        knc knc = new knc(context, (AttributeSet) null);
        knc.setId(rvb.call_dinamic);
        knc.setListener(new f9(this, 6, knc));
        float f = (float) 50;
        knc.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        knc.setButtonPadding(tu0.G(((float) 3) * fk4.d().getDisplayMetrics().density));
        this.I0 = knc;
        addView(knc);
        knc knc2 = new knc(context, (AttributeSet) null);
        knc2.setId(rvb.call_microphone);
        knc.B(knc2, woc.E0);
        knc2.setListener(new i11(this, 0));
        knc2.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        float f2 = (float) 4;
        knc2.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        this.J0 = knc2;
        addView(knc2);
        knc knc3 = new knc(context, (AttributeSet) null);
        knc3.setId(rvb.call_video);
        knc.B(knc3, woc.S0);
        knc3.setListener(new i11(this, 1));
        knc3.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        knc3.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        this.K0 = knc3;
        addView(knc3);
        knc knc4 = new knc(context, (AttributeSet) null);
        knc4.setId(rvb.call_more);
        knc.B(knc4, woc.s0);
        knc4.setAccessibility(Integer.valueOf(f0c.call_more_accessibility));
        knc4.setListener(new i11(this, 2));
        knc4.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        knc4.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        this.L0 = knc4;
        addView(knc4);
        knc knc5 = new knc(context, (AttributeSet) null);
        knc5.setId(rvb.call_cancel);
        knc.B(knc5, woc.K0);
        knc5.setAccessibility(Integer.valueOf(f0c.call_cancel_accessibility));
        knc5.setListener(new i11(this, 3));
        knc5.setMode(fnc.c);
        knc5.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        knc5.setButtonPadding(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        addView(knc5);
        dj3 q = fp3.q(this);
        int id = knc.getId();
        q.d(id, 4, knc3.getId(), 4);
        q.d(id, 7, knc2.getId(), 6);
        q.d(id, 6, 0, 6);
        q.d(id, 3, knc3.getId(), 3);
        int id2 = knc2.getId();
        q.d(id2, 4, knc3.getId(), 4);
        q.d(id2, 7, knc3.getId(), 6);
        q.d(id2, 6, knc.getId(), 7);
        q.d(id2, 3, knc3.getId(), 3);
        int id3 = knc3.getId();
        q.d(id3, 4, 0, 4);
        q.d(id3, 3, 0, 3);
        q.d(id3, 7, knc4.getId(), 6);
        q.d(id3, 6, knc2.getId(), 7);
        int id4 = knc4.getId();
        q.d(id4, 4, knc3.getId(), 4);
        q.d(id4, 7, knc5.getId(), 6);
        q.d(id4, 6, knc3.getId(), 7);
        q.d(id4, 3, knc3.getId(), 3);
        int id5 = knc5.getId();
        q.d(id5, 4, knc3.getId(), 4);
        q.d(id5, 7, 0, 7);
        q.d(id5, 6, knc4.getId(), 7);
        q.d(id5, 3, knc3.getId(), 3);
        int id6 = view.getId();
        q.d(id6, 4, knc3.getId(), 4);
        q.d(id6, 7, 0, 7);
        q.d(id6, 6, 0, 6);
        q.d(id6, 3, knc3.getId(), 3);
        q.a(this);
    }

    public static void A(knc knc, int i, jqe jqe) {
        knc.y(i, qp4.u0.p(knc).c.getIcon().g);
        knc.setMode(fnc.o);
        knc.setAccessibility(jqe);
    }

    public static void F(knc knc, int i, int i2, m38 m38, jqe jqe, jqe jqe2) {
        knc.setVisibility(m38 != m38.o ? 0 : 8);
        int ordinal = m38.ordinal();
        if (ordinal == 0) {
            A(knc, i2, jqe2);
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                if (ordinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            knc.y(i2, qp4.u0.p(knc).c.getIcon().c);
            knc.setMode(fnc.s0);
            knc.setAccessibility(jqe2);
        } else {
            x(knc, i, jqe);
        }
    }

    private final float[] getBgRadius() {
        return (float[]) this.G0.getValue();
    }

    private final u31 getCallContextMenuDelegate() {
        return (u31) this.H0.getValue();
    }

    private final View getContainer() {
        return (View) this.R0.getValue();
    }

    private final int getContextHeight() {
        int measuredHeight = getContainer().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return rh4.c((float) 6, fk4.d().getDisplayMetrics().density, measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
    }

    public static void w(j11 j11) {
        o11 o11 = j11.M0;
        if (o11 != null) {
            j11.getContainer();
            bc7[] bc7Arr = CallBottomPanelWidget.s0;
            CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((sy4) o11).b;
            if (!((el1) callBottomPanelWidget.c.getValue()).u()) {
                r11 m0 = callBottomPanelWidget.m0();
                el1 el1 = callBottomPanelWidget.n0().c;
                la1 la1 = (la1) el1.C0.a.getValue();
                boolean z = true;
                boolean z2 = !la1.g;
                m31 m31 = la1.f;
                if ((m31 != null ? m31.a : null) == null) {
                    z = false;
                }
                boolean a = la1.i.a();
                boolean u = el1.u();
                kl7 l = j1e.l();
                if (z2) {
                    l.add(new o6());
                }
                if (z) {
                    l.add(new r6());
                }
                if (u) {
                    if (a) {
                        l.add(new q6());
                    } else {
                        l.add(new p6());
                    }
                }
                m0.g(j1e.d(l));
            }
        }
    }

    public static void x(knc knc, int i, jqe jqe) {
        qp4.u0.p(knc).c.getIcon();
        knc.y(i, -1);
        knc.setMode(fnc.s0);
        knc.setAccessibility(jqe);
    }

    public final void B(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            u31 callContextMenuDelegate = getCallContextMenuDelegate();
            Context context = getContext();
            ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    a51 a51 = (a51) next;
                    arrayList2.add(new l04(a51.getIcon(), i, a51.getTitle()));
                    i = i2;
                } else {
                    y53.R();
                    throw null;
                }
            }
            cu3 a = callContextMenuDelegate.a(context, arrayList2, new u00((Object) callContextMenuDelegate, (Object) this, (Object) arrayList, 1));
            int G = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
            int contextHeight = getContextHeight();
            knc knc = this.I0;
            a.showAtLocation(knc, 8388691, G, contextHeight);
            a.setOnDismissListener(new g11(this, 1));
            a51 a512 = this.P0;
            if (a512 == null) {
                return;
            }
            if (a512 instanceof w41) {
                w41 w41 = (w41) a512;
                x(knc, w41.c, w41.f);
                return;
            }
            A(knc, a512.a(), a512.getContentDescription());
        }
    }

    public final void C() {
        eqe eqe = new eqe(b8a.W1);
        int i = x7a.X;
        int[] iArr = new int[2];
        knc knc = this.J0;
        knc.getLocationOnScreen(iArr);
        Point point = new Point(rh4.q((float) 8, fk4.d().getDisplayMetrics().density, Integer.valueOf(iArr[0]).intValue() - (knc.getWidth() / 2)), getContextHeight());
        ywe ywe = this.Q0;
        if (ywe == null || !ywe.isShowing()) {
            ywe ywe2 = this.Q0;
            if (ywe2 != null) {
                ywe2.dismiss();
            }
            ywe ywe3 = new ywe(getContext(), (View) knc, (k56) new h11(this, 1), (k56) new m(29), 0, 0, 96);
            ywe3.d(eqe);
            ywe3.c(Integer.valueOf(i));
            ywe3.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
            ywe3.setOnDismissListener(new g11(this, 0));
            this.Q0 = ywe3;
            return;
        }
        ywe ywe4 = this.Q0;
        if (ywe4 != null) {
            ywe4.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        }
    }

    public final void E(kl7 kl7) {
        if (!kl7.isEmpty()) {
            u31 callContextMenuDelegate = getCallContextMenuDelegate();
            cu3 a = callContextMenuDelegate.a(getContext(), kl7, new f9(callContextMenuDelegate, 5, this));
            int contextHeight = getContextHeight();
            knc knc = this.L0;
            a.showAtLocation(knc, 81, 0, contextHeight);
            a.setOnDismissListener(new g11(this, 2));
            A(knc, woc.s0, new eqe(f0c.call_more_accessibility));
        }
    }

    public final void setAudioInfo(a51 a51) {
        if (!tpa.f(this.P0, a51)) {
            this.P0 = a51;
            int a = a51.a();
            jqe contentDescription = a51.getContentDescription();
            F(this.I0, a, a, a51 instanceof w41 ? m38.b : m38.a, contentDescription, contentDescription);
        }
    }

    public final void setClickListener(o11 o11) {
        this.M0 = o11;
    }

    public final void setMicrophoneEnabled(m38 m38) {
        if (this.N0 != m38) {
            this.N0 = m38;
            F(this.J0, woc.F0, woc.E0, m38, new eqe(f0c.call_microphone_enabled_accessibility), new eqe(f0c.call_microphone_disabled_accessibility));
        }
    }

    public final void setVideoEnabled(m38 m38) {
        if (this.O0 != m38) {
            this.O0 = m38;
            F(this.K0, woc.T0, woc.S0, m38, new eqe(f0c.call_video_enabled_accessibility), new eqe(f0c.call_video_disabled_accessibility));
        }
    }

    public final void y() {
        u31 callContextMenuDelegate = getCallContextMenuDelegate();
        cu3 cu3 = callContextMenuDelegate.a;
        if (cu3 != null) {
            cu3.dismiss();
        }
        callContextMenuDelegate.a = null;
        ywe ywe = this.Q0;
        if (ywe != null) {
            ywe.dismiss();
        }
    }
}
