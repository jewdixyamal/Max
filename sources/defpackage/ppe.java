package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: ppe  reason: default package */
public class ppe extends ViewGroup implements x5d, k34, qpe, nk6, ot8, l7c, jw8, aoa, u5d, ck7 {
    public final r6c a;
    public final dw8 b;
    public final boa c;
    public final s5d o;
    public final y5d s0 = new y5d(this);
    public final dy8 t0;
    public final j34 u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public final int y0;
    public i33 z0;

    /* JADX WARNING: type inference failed for: r2v0, types: [boa, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ppe(Context context) {
        super(context);
        r6c r6c = new r6c();
        dw8 dw8 = new dw8();
        ? obj = new Object();
        s5d s5d = new s5d();
        this.a = r6c;
        this.b = dw8;
        this.c = obj;
        this.o = s5d;
        dy8 dy8 = new dy8(context);
        dy8.setId(mda.N);
        this.t0 = dy8;
        j34 j34 = new j34(context);
        this.u0 = j34;
        this.v0 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        this.w0 = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        float f = (float) 4;
        this.x0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.y0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        r6c.b = this;
        dw8.b = this;
        s5d.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(dy8, new ViewGroup.LayoutParams(-2, -2));
        addView(j34, new ViewGroup.LayoutParams(-2, -2));
        qx7 qx7 = vs8.y;
        fka j = qp4.u0.j(this);
        qx7.getClass();
        setBackground(qx7.e(j));
        setWillNotDraw(false);
        dy8.setSingleClickAction(new ope(this, 0));
        dy8.setTryToSingleClickAction(new ope(this, 1));
        dy8.setOnLongClickListener(new zl0(10, this));
        dy8.setLinkLongClickListener(new bqc(27, this));
    }

    public final void c(is0 is0) {
        this.b.c(is0);
    }

    public final void e(List list, a66 a66) {
        CharSequence text = getText();
        if (text != null) {
            dy8 dy8 = this.t0;
            if (list == null || list.isEmpty() || a66 == null) {
                dy8.f(dy8);
            } else {
                dy8.g((List) a66.invoke(text.toString(), list));
            }
        }
    }

    public final void f(ix8 ix8, boolean z) {
        this.a.f(ix8, z);
    }

    public void g(CharSequence charSequence, boolean z) {
        this.u0.c(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.o.h0();
    }

    public final int getContentHorizontalPadding$message_list_release() {
        return this.w0;
    }

    public final int getContentTopPadding$message_list_release() {
        return this.v0;
    }

    public final j34 getDate$message_list_release() {
        return this.u0;
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public final dw8 getMessageLinkDelegate() {
        return this.b;
    }

    public final dy8 getMessageTextView$message_list_release() {
        return this.t0;
    }

    public i33 getOnLinkLongClickListener() {
        return this.z0;
    }

    public final r6c getReactionsDelegate() {
        return this.a;
    }

    public final s5d getSenderAliasDelegate() {
        return this.o;
    }

    public final int getSenderBottomMargin$message_list_release() {
        return this.x0;
    }

    public final y5d getSenderNameViewStub$message_list_release() {
        return this.s0;
    }

    public final int getStatusBottomMargin$message_list_release() {
        return this.y0;
    }

    public final CharSequence getText() {
        return this.t0.getText();
    }

    public boolean h(MotionEvent motionEvent) {
        return false;
    }

    public final void k(is0 is0, boolean z) {
        this.a.k(is0, z);
    }

    public final void l() {
        this.b.l();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        y5d y5d = this.s0;
        boolean H = br7.H(y5d.b);
        int i6 = this.w0;
        int i7 = this.v0;
        if (H) {
            y5d.c(i6, i7);
            i5 = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, y5d.a(), i7);
        } else {
            i5 = i7;
        }
        s5d s5d = this.o;
        if (br7.H((je7) s5d.c) && br7.H(y5d.b)) {
            s5d.T((getMeasuredWidth() - i6) - s5d.L(), ((y5d.a() / 2) - (s5d.K() / 2)) + i7);
        }
        dw8 dw8 = this.b;
        if (br7.H((je7) dw8.c)) {
            dw8.T(i6, i5);
            i5 = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, dw8.K(), i5);
        }
        dy8 dy8 = this.t0;
        ote.E(dy8, i6, i5, 0, 12);
        int measuredHeight = dy8.getMeasuredHeight() + i5;
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            r6c.T(i6, tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density) + measuredHeight);
            r6c.K();
        }
        int measuredWidth = getMeasuredWidth();
        j34 j34 = this.u0;
        ote.E(j34, (measuredWidth - j34.getMeasuredWidth()) - i6, rh4.q((float) 4, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - j34.getMeasuredHeight()), 0, 12);
    }

    public void onMeasure(int i, int i2) {
        float f = (float) 10;
        int m = wg0.m(f, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        dy8 dy8 = this.t0;
        dy8.h();
        int measuredWidth = getDependOnOutsideView() ? m : dy8.getMeasuredWidth();
        int measuredHeight = dy8.getMeasuredHeight();
        s5d s5d = this.o;
        boolean H = br7.H((je7) s5d.c);
        y5d y5d = this.s0;
        if (H && br7.H(y5d.b)) {
            s5d.U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, s5d.L());
        }
        if (br7.H(y5d.b)) {
            y5d.d(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, y5d.b() + s5d.h0());
            measuredHeight = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, y5d.a(), measuredHeight);
        }
        dw8 dw8 = this.b;
        if (br7.H((je7) dw8.c)) {
            dw8.U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, dw8.L());
            measuredHeight = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, dw8.K(), measuredHeight);
        }
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            r6c.U(View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, r6c.L());
            measuredHeight = wg0.d(f, fk4.d().getDisplayMetrics().density, r6c.K(), measuredHeight);
        }
        j34 j34 = this.u0;
        j34.measure(i, i2);
        int c2 = rh4.c(f, fk4.d().getDisplayMetrics().density, j34.getMeasuredWidth() + rh4.c((float) 6, fk4.d().getDisplayMetrics().density, br7.H((je7) r6c.c) ? r6c.L() : dy8.e(m)));
        if (c2 < m) {
            measuredWidth = Math.max(measuredWidth, c2);
        } else {
            measuredHeight = rh4.c((float) 12, fk4.d().getDisplayMetrics().density, measuredHeight);
        }
        setMeasuredDimension((tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + measuredWidth, wg0.d(f, fk4.d().getDisplayMetrics().density, tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density), measuredHeight));
    }

    public final void q(boolean z) {
        this.a.q(z);
    }

    public void setAlias(Layout layout) {
        this.o.setAlias(layout);
    }

    public void setAliasColor(int i) {
        this.o.setAliasColor(i);
    }

    public void setChipObserver(w5c w5c) {
        this.a.setChipObserver(w5c);
    }

    public void setDateBackgroundColor(int i) {
        this.u0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.u0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(zof zof) {
        this.u0.setStatus$message_list_release(zof);
    }

    public void setDependOnOutsideView(boolean z) {
        this.c.a = z;
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

    public final void setMaxHeightForClip(int i) {
        this.t0.setMaxHeightForClip(i);
    }

    public void setOnClickListener(m56 m56) {
        this.a.X = m56;
    }

    public void setOnLinkLongClickListener(i33 i33) {
        this.z0 = i33;
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

    public void setTextMessageColors(is0 is0) {
        this.t0.setTextColors(is0);
    }

    public void setTextMessageLayout(by8 by8) {
        this.t0.setLayout(by8);
    }

    public void setTextMessageLinkClickListener(hk7 hk7) {
        this.t0.setLinkListener(hk7);
    }
}
