package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: bd8  reason: default package */
public abstract class bd8 extends ViewGroup implements k34, x5d, l7c, jw8, aoa, u5d, mc8 {
    public static final /* synthetic */ bc7[] v0;
    public final r6c a;
    public final dw8 b;
    public final s5d c;
    public final boa o;
    public final y5d s0 = new y5d(this);
    public final j34 t0;
    public final yj u0;

    static {
        oi9 oi9 = new oi9(bd8.class, "model", "getModel()Lone/me/messages/list/loader/model/MediaAttachInfo;");
        nec.a.getClass();
        v0 = new bc7[]{oi9};
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [boa, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bd8(Context context) {
        super(context);
        r6c r6c = new r6c();
        dw8 dw8 = new dw8();
        ? obj = new Object();
        s5d s5d = new s5d();
        this.a = r6c;
        this.b = dw8;
        this.c = s5d;
        this.o = obj;
        j34 j34 = new j34(context);
        j34.setBackgroundEnabled$message_list_release(true);
        this.t0 = j34;
        this.u0 = new yj(11, this);
        dw8.b = this;
        r6c.b = this;
        s5d.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(j34, new ViewGroup.LayoutParams(-2, -2));
        qx7 qx7 = vs8.y;
        fka j = qp4.u0.j(this);
        qx7.getClass();
        setBackground(qx7.e(j));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public void a(f53 f53) {
        setModel(f53);
    }

    public final void c(is0 is0) {
        this.b.c(is0);
    }

    public final void f(ix8 ix8, boolean z) {
        this.a.f(ix8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        this.t0.c(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.h0();
    }

    public final j34 getDate() {
        return this.t0;
    }

    public boolean getDependOnOutsideView() {
        return this.o.a;
    }

    public x38 getModel() {
        bc7 bc7 = v0[0];
        return (x38) this.u0.b;
    }

    public void i(bsd bsd) {
        setModel(bsd);
    }

    public final void k(is0 is0, boolean z) {
        this.a.k(is0, z);
    }

    public final void l() {
        this.b.l();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int G = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        y5d y5d = this.s0;
        int i6 = 0;
        if (br7.H(y5d.b)) {
            int G2 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
            y5d.c(G, G2);
            i5 = y5d.a() + G2;
        } else {
            i5 = 0;
        }
        s5d s5d = this.c;
        if (br7.H((je7) s5d.c) && br7.H(y5d.b)) {
            s5d.T((getMeasuredWidth() - G) - s5d.L(), rh4.c((float) 8, fk4.d().getDisplayMetrics().density, (y5d.a() / 2) - (s5d.K() / 2)));
        }
        dw8 dw8 = this.b;
        if (br7.H((je7) dw8.c)) {
            int G3 = i5 + tu0.G((i5 == 0 ? (float) 8 : (float) 4) * fk4.d().getDisplayMetrics().density);
            dw8.T(G, G3);
            i5 = G3 + dw8.K();
        }
        float f = (float) 1;
        int G4 = tu0.G(fk4.d().getDisplayMetrics().density * f) + (i5 == 0 ? 0 : tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density)) + i5;
        int b2 = b(tu0.G(f * fk4.d().getDisplayMetrics().density), G4) + G4;
        int measuredWidth = getMeasuredWidth();
        j34 j34 = this.t0;
        float f2 = (float) 4;
        ote.E(j34, rh4.q(f2, fk4.d().getDisplayMetrics().density, measuredWidth - j34.getMeasuredWidth()), rh4.q(f2, fk4.d().getDisplayMetrics().density, b2 - j34.getMeasuredHeight()), 0, 12);
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            int c2 = rh4.c(f2, fk4.d().getDisplayMetrics().density, b2);
            if (r6c.Z) {
                i6 = getMeasuredWidth() - r6c.L();
            }
            r6c.T(i6, c2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        float f = (float) 10;
        int m = wg0.m(f, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int i4 = 0;
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : 0;
        s5d s5d = this.c;
        boolean H = br7.H((je7) s5d.c);
        y5d y5d = this.s0;
        if (H && br7.H(y5d.b)) {
            s5d.U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            size = Math.max(size, s5d.L());
        }
        if (br7.H(y5d.b)) {
            y5d.d(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            size = Math.max(size, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + y5d.b() + s5d.h0());
            i3 = y5d.a() + tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        } else {
            i3 = 0;
        }
        dw8 dw8 = this.b;
        if (br7.H((je7) dw8.c)) {
            dw8.U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            size = Math.max(size, (tu0.G(f * fk4.d().getDisplayMetrics().density) * 2) + dw8.L());
            i3 += dw8.K() + tu0.G((i3 == 0 ? (float) 8 : (float) 4) * fk4.d().getDisplayMetrics().density);
        }
        if (i3 != 0) {
            i4 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        }
        int i5 = i3 + i4;
        this.t0.measure(i, i2);
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            r6c.U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            size = Math.max(size, r6c.L());
            int c2 = rh4.c((float) 8, fk4.d().getDisplayMetrics().density, r6c.K() + tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
            i5 += c2;
            ((vs8) getBackground()).w = (float) c2;
        } else {
            ((vs8) getBackground()).w = 0.0f;
        }
        float f2 = (float) 1;
        long t = t(wg0.m(f2, fk4.d().getDisplayMetrics().density, 2, size), wg0.m(f2, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i)), i, i2);
        setMeasuredDimension(Math.max(size, (tu0.G(fk4.d().getDisplayMetrics().density * f2) * 2) + ((int) (t >> 32))), (tu0.G(f2 * fk4.d().getDisplayMetrics().density) * 2) + ((int) (t & 4294967295L)) + i5);
    }

    public void p(vqd vqd) {
        setModel(vqd);
    }

    public final void q(boolean z) {
        this.a.q(z);
    }

    public void setAlias(Layout layout) {
        this.c.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.c.setAliasColor(i);
    }

    public void setChipObserver(w5c w5c) {
        this.a.setChipObserver(w5c);
    }

    public void setDateBackgroundColor(int i) {
        this.t0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.t0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(zof zof) {
        this.t0.setStatus$message_list_release(zof);
    }

    public void setDependOnOutsideView(boolean z) {
        this.o.a = z;
    }

    public void setForwardClickListener(m56 m56) {
        this.b.X = m56;
    }

    public void setIsIncoming(boolean z) {
        this.a.o = z;
    }

    public void setLink(cw8 cw8) {
        this.b.setLink(cw8);
    }

    public void setModel(x38 x38) {
        this.u0.o1(this, v0[0], x38);
    }

    public void setOnClickListener(m56 m56) {
        this.a.X = m56;
    }

    public void setReplyClickListener(a66 a66) {
        this.b.o = a66;
    }

    public void setSenderName(Layout layout) {
        this.s0.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.s0.f(i);
    }

    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }
}
