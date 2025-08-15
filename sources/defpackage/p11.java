package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: p11  reason: default package */
public final class p11 extends ConstraintLayout {
    public static final /* synthetic */ int Y0 = 0;
    public final je7 G0 = tu0.r(3, new k11(0));
    public final je7 H0;
    public final je7 I0;
    public final knc J0;
    public final knc K0;
    public final knc L0;
    public final knc M0;
    public final knc N0;
    public final knc O0;
    public o11 P0;
    public m38 Q0;
    public m38 R0;
    public m38 S0;
    public m38 T0;
    public ywe U0;
    public ywe V0;
    public a51 W0;
    public int X0;

    public p11(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int G = tu0.G(fk4.c() * ((float) 48));
        this.H0 = tu0.r(3, new l11(this, 2));
        this.I0 = tu0.r(3, new a5(context, 6));
        knc knc = new knc(context, (AttributeSet) null);
        knc.setId(rvb.call_dinamic);
        knc.setLayoutParams(new ti3(-2, -2));
        knc.setListener(new n11(this, 0));
        knc.setImageSize(new gnc(G, G));
        knc.setButtonPadding(tu0.F(((double) fk4.c()) * 3.5d));
        this.J0 = knc;
        knc knc2 = new knc(context, (AttributeSet) null);
        knc2.setId(rvb.call_microphone);
        knc2.setLayoutParams(new ti3(-2, -2));
        knc2.setListener(new n11(this, 1));
        knc2.setImageSize(new gnc(G, G));
        knc2.setButtonPadding(tu0.F(((double) fk4.c()) * 3.5d));
        this.K0 = knc2;
        knc knc3 = new knc(context, (AttributeSet) null);
        knc3.setId(rvb.call_video);
        knc3.setLayoutParams(new ti3(-2, -2));
        knc.B(knc3, woc.S0);
        knc3.setListener(new n11(this, 2));
        knc3.setImageSize(new gnc(G, G));
        knc3.setButtonPadding(tu0.F(((double) fk4.c()) * 3.5d));
        this.L0 = knc3;
        knc knc4 = new knc(context, (AttributeSet) null);
        knc4.setId(y7a.p);
        knc4.setLayoutParams(new ti3(-2, -2));
        knc.B(knc4, x7a.W);
        knc4.setListener(new n11(this, 3));
        knc4.setImageSize(new gnc(G, G));
        knc4.setButtonPadding(tu0.F(((double) fk4.c()) * 3.5d));
        this.M0 = knc4;
        knc knc5 = new knc(context, (AttributeSet) null);
        knc5.setId(y7a.s0);
        knc5.setLayoutParams(new ti3(-2, -2));
        knc.B(knc5, x7a.K);
        knc5.setListener(new n11(this, 4));
        knc5.setImageSize(new gnc(G, G));
        knc5.setButtonPadding(tu0.F(((double) fk4.c()) * 3.5d));
        this.N0 = knc5;
        knc knc6 = new knc(context, (AttributeSet) null);
        knc6.setId(rvb.call_cancel);
        knc6.setLayoutParams(new ti3(-2, -2));
        knc.B(knc6, x7a.d0);
        knc6.setAccessibility(Integer.valueOf(f0c.call_cancel_accessibility));
        knc6.setListener(new n11(this, 5));
        knc6.setMode(fnc.c);
        knc6.setImageSize(new gnc(G, G));
        knc6.setButtonPadding(tu0.F(((double) fk4.c()) * 3.5d));
        this.O0 = knc6;
        ti3 ti3 = new ti3(0, -2);
        float f = (float) 8;
        ti3.setMarginStart(tu0.G(fk4.c() * f));
        ti3.setMarginEnd(tu0.G(fk4.c() * f));
        setLayoutParams(ti3);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#5F2D2D31"));
        setBackground(shapeDrawable);
        setPadding(tu0.G(fk4.c() * f), tu0.G(fk4.c() * f), tu0.G(fk4.c() * f), tu0.G(fk4.c() * ((float) 12)));
        addView(knc);
        addView(knc2);
        addView(knc3);
        addView(knc4);
        addView(knc5);
        addView(knc6);
        dj3 q = fp3.q(this);
        int id = knc.getId();
        q.d(id, 4, knc3.getId(), 4);
        q.d(id, 7, knc2.getId(), 6);
        q.d(id, 6, 0, 6);
        q.d(id, 3, knc3.getId(), 3);
        q.g(id).d.V = 1;
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
        q.d(id4, 4, 0, 4);
        q.d(id4, 6, knc3.getId(), 7);
        q.d(id4, 7, knc5.getId(), 6);
        q.d(id4, 3, 0, 3);
        int id5 = knc5.getId();
        q.d(id5, 4, knc3.getId(), 4);
        q.d(id5, 6, knc4.getId(), 7);
        q.d(id5, 7, knc6.getId(), 6);
        q.d(id5, 3, knc3.getId(), 3);
        int id6 = knc6.getId();
        q.d(id6, 4, knc3.getId(), 4);
        q.d(id6, 7, 0, 7);
        q.d(id6, 6, knc5.getId(), 7);
        q.d(id6, 3, knc3.getId(), 3);
        q.a(this);
    }

    public static void A(knc knc, int i) {
        ViewGroup.LayoutParams layoutParams = knc.getLayoutParams();
        int i2 = 0;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0) == i) {
            ViewGroup.LayoutParams layoutParams2 = knc.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                i2 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
            }
            if (i2 == i) {
                return;
            }
        }
        if (knc.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams3 = knc.getLayoutParams();
            if (layoutParams3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.setMarginEnd(i);
                knc.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static void B(knc knc, Drawable drawable, Drawable drawable2, m38 m38, jqe jqe, jqe jqe2) {
        knc.setVisibility(m38 != m38.o ? 0 : 8);
        int ordinal = m38.ordinal();
        pq9 pq9 = qp4.u0;
        if (ordinal != 0) {
            fnc fnc = fnc.s0;
            if (ordinal == 1) {
                pq9.p(knc).c.getIcon();
                knc.A(drawable, -1);
                knc.setMode(fnc);
                knc.setAccessibility(jqe);
            } else if (ordinal == 2) {
                knc.A(drawable2, pq9.p(knc).c.getIcon().g);
                knc.setMode(fnc.Y);
                knc.setAccessibility(jqe);
            } else if (ordinal == 3) {
            } else {
                if (ordinal == 4) {
                    knc.A(drawable2, pq9.p(knc).c.getIcon().c);
                    knc.setMode(fnc);
                    knc.setAccessibility(jqe2);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            knc.A(drawable2, pq9.p(knc).c.getIcon().g);
            knc.setMode(fnc.o);
            knc.setAccessibility(jqe2);
        }
    }

    private final int getActualButtonsMargin() {
        knc knc = this.O0;
        int visibility = knc.getVisibility();
        knc knc2 = this.J0;
        knc knc3 = this.K0;
        knc knc4 = this.L0;
        knc knc5 = this.N0;
        if (visibility == 0 && knc5.getVisibility() == 0 && this.M0.getVisibility() == 0 && knc4.getVisibility() == 0 && knc3.getVisibility() == 0 && knc2.getVisibility() == 0) {
            return 0;
        }
        if (knc.getVisibility() == 0 && knc5.getVisibility() == 0 && knc4.getVisibility() == 0 && knc3.getVisibility() == 0 && knc2.getVisibility() == 0) {
            return tu0.G(fk4.c() * ((float) 2));
        }
        return tu0.G(fk4.c() * ((float) 4));
    }

    private final float[] getBgRadius() {
        return (float[]) this.G0.getValue();
    }

    private final View getContainer() {
        return (View) this.H0.getValue();
    }

    private final int getContextHeight() {
        int measuredHeight = getContainer().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return tu0.G(fk4.c() * ((float) 6)) + measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
    }

    private final ca9 getMicrophoneOnDrawable() {
        return (ca9) this.I0.getValue();
    }

    public static void w(p11 p11) {
        o11 o11;
        if (p11.W0 != null && (o11 = p11.P0) != null) {
            ((sy4) o11).G(p11.getContainer());
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I0.a() && this.Q0 == m38.b) {
            getMicrophoneOnDrawable().start();
        }
    }

    public final void onDetachedFromWindow() {
        if (this.I0.a()) {
            getMicrophoneOnDrawable().stop();
        }
        super.onDetachedFromWindow();
    }

    public final void setAudioInfo(a51 a51) {
        if (!tpa.f(this.W0, a51)) {
            this.W0 = a51;
            int a = a51.a();
            jqe contentDescription = a51.getContentDescription();
            Drawable b = kt3.b(getContext(), a);
            B(this.J0, b, b, a51 instanceof x41 ? m38.a : m38.b, contentDescription, contentDescription);
        }
    }

    public final void setChatUnreadMessageCount(int i) {
        if (this.X0 != i) {
            this.X0 = i;
            knc knc = this.M0;
            if (knc.getVisibility() == 0) {
                knc.setCounter(i);
            }
        }
    }

    public final void setClickListener(o11 o11) {
        this.P0 = o11;
    }

    public final void setMicrophoneEnabled(m38 m38) {
        if (this.Q0 != m38) {
            this.Q0 = m38;
            B(this.K0, getMicrophoneOnDrawable(), kt3.b(getContext(), x7a.Z), m38, new eqe(f0c.call_microphone_enabled_accessibility), new eqe(f0c.call_microphone_disabled_accessibility));
            if (m38 == m38.b) {
                getMicrophoneOnDrawable().start();
            } else {
                getMicrophoneOnDrawable().stop();
            }
        }
    }

    public final void setOpenChat(m38 m38) {
        if (this.S0 != m38) {
            this.S0 = m38;
            int i = x7a.W;
            Drawable b = kt3.b(getContext(), i);
            Drawable b2 = kt3.b(getContext(), i);
            int i2 = f0c.call_incoming_open_chat_accessibility;
            B(this.M0, b, b2, m38, new eqe(i2), new eqe(i2));
            this.M0.setCounter(this.X0);
            x();
        }
    }

    public final void setRaiseHand(m38 m38) {
        m38 m382;
        ywe ywe;
        m38 m383 = this.R0;
        if (m383 != m38) {
            if (!(m383 == null || m383 != (m382 = m38.b) || m38 == m382 || (ywe = this.V0) == null)) {
                ywe.a();
            }
            this.R0 = m38;
            int i = x7a.K;
            Drawable b = kt3.b(getContext(), i);
            Drawable b2 = kt3.b(getContext(), i);
            eqe eqe = new eqe(f0c.call_raise_hand_enabled_accessibility);
            eqe eqe2 = new eqe(f0c.call_raise_hand_disabled_accessibility);
            int i2 = m38 != m38.o ? 0 : 8;
            knc knc = this.N0;
            knc.setVisibility(i2);
            int ordinal = m38.ordinal();
            fnc fnc = fnc.s0;
            pq9 pq9 = qp4.u0;
            if (ordinal == 0) {
                pq9.p(knc).c.getIcon();
                knc.A(b2, -1);
                knc.setMode(fnc);
                knc.setAccessibility((jqe) eqe2);
            } else if (ordinal == 1) {
                pq9.p(knc).c.getIcon();
                knc.A(b, -1);
                knc.setMode(fnc.Z);
                knc.setAccessibility((jqe) eqe);
            } else if (ordinal == 2) {
                knc.A(b2, pq9.p(knc).c.getIcon().g);
                knc.setMode(fnc.Y);
                knc.setAccessibility((jqe) eqe);
            } else if (ordinal != 3) {
                if (ordinal == 4) {
                    knc.A(b2, pq9.p(knc).c.getIcon().c);
                    knc.setMode(fnc);
                    knc.setAccessibility((jqe) eqe2);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            x();
        }
    }

    public final void setVideoEnabled(m38 m38) {
        if (this.T0 != m38) {
            this.T0 = m38;
            B(this.L0, kt3.b(getContext(), x7a.E0), kt3.b(getContext(), x7a.C0), m38, new eqe(f0c.call_video_enabled_accessibility), new eqe(f0c.call_video_disabled_accessibility));
        }
    }

    public final void setVolumeMicrophone(float f) {
        ca9 microphoneOnDrawable = getMicrophoneOnDrawable();
        microphoneOnDrawable.getClass();
        float d = ote.d(f, 0.0f, 1.0f);
        if (microphoneOnDrawable.t0 != d) {
            microphoneOnDrawable.t0 = d;
            bg bgVar = microphoneOnDrawable.Y;
            float[] fArr = {bgVar.a, d};
            ObjectAnimator objectAnimator = microphoneOnDrawable.Z;
            objectAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(bgVar, fArr)});
            objectAnimator.start();
            microphoneOnDrawable.invalidateSelf();
        }
    }

    public final void x() {
        int actualButtonsMargin = getActualButtonsMargin();
        A(this.O0, actualButtonsMargin);
        A(this.N0, actualButtonsMargin);
        A(this.M0, actualButtonsMargin);
        A(this.L0, actualButtonsMargin);
        A(this.K0, actualButtonsMargin);
        A(this.J0, actualButtonsMargin);
    }

    public final ywe y(ywe ywe, View view, eqe eqe, k56 k56, Integer num) {
        ywe ywe2 = ywe;
        int[] iArr = new int[2];
        View view2 = view;
        view.getLocationOnScreen(iArr);
        Point point = new Point((Integer.valueOf(iArr[0]).intValue() - (view.getWidth() / 2)) - tu0.G(fk4.c() * ((float) 12)), getContextHeight());
        if (ywe2 == null || !ywe.isShowing()) {
            if (ywe2 != null) {
                ywe.dismiss();
            }
            ywe ywe3 = new ywe(getContext(), view, (k56) new l11(this, 1), (k56) new k11(1), 0, 0, 96);
            ywe3.d(eqe);
            ywe3.c(num);
            ywe3.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
            ywe3.setOnDismissListener(new m11(0, k56));
            return ywe3;
        }
        ywe.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        return ywe2;
    }
}
