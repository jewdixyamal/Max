package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: am0  reason: default package */
public final class am0 extends ViewGroup implements k34, qpe, l7c, jw8, aoa {
    public final r6c a;
    public final dw8 b;
    public final boa c;
    public final dy8 o;
    public final j34 s0;
    public final int t0 = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);

    /* JADX WARNING: type inference failed for: r2v0, types: [boa, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public am0(Context context) {
        super(context);
        r6c r6c = new r6c();
        dw8 dw8 = new dw8();
        ? obj = new Object();
        this.a = r6c;
        this.b = dw8;
        this.c = obj;
        dy8 dy8 = new dy8(context);
        dy8.setId(mda.N);
        this.o = dy8;
        j34 j34 = new j34(context);
        j34.setBackgroundEnabled$message_list_release(true);
        this.s0 = j34;
        r6c.b = this;
        dw8.b = this;
        dy8.setSingleClickAction(new b(16, (Object) this));
        dy8.setOnLongClickListener(new zl0(0, this));
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(dy8, new ViewGroup.LayoutParams(-2, -2));
        addView(j34, new ViewGroup.LayoutParams(-2, -2));
    }

    public final void c(is0 is0) {
        this.b.c(is0);
    }

    public final void f(ix8 ix8, boolean z) {
        this.a.f(ix8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        this.s0.c(charSequence, z);
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public final CharSequence getText() {
        return this.o.getText();
    }

    public final void k(is0 is0, boolean z) {
        this.a.k(is0, z);
    }

    public final void l() {
        this.b.l();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth;
        dw8 dw8 = this.b;
        boolean H = br7.H((je7) dw8.c);
        int i6 = this.t0;
        if (H) {
            dw8.T(i6, i6);
            i5 = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, dw8.K(), i6);
        } else {
            i5 = i6;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ys8 ys8 = layoutParams instanceof ys8 ? (ys8) layoutParams : null;
        int i7 = 0;
        boolean z2 = ys8 != null && !ys8.a;
        dy8 dy8 = this.o;
        je7 je7 = (je7) dw8.c;
        ote.E(dy8, (!z2 || br7.H(je7)) ? i6 : (getMeasuredWidth() - dy8.getMeasuredWidth()) - i6, i5, 0, 12);
        int measuredHeight = dy8.getMeasuredHeight() + (getBackground() == null ? tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density) : 0) + i5;
        boolean H2 = br7.H(je7);
        j34 j34 = this.s0;
        if (H2 || z2) {
            measuredWidth = getMeasuredWidth() - j34.getMeasuredWidth();
        } else {
            measuredWidth = dy8.getMeasuredWidth();
            i6 = j34.getMeasuredWidth();
        }
        ote.E(j34, measuredWidth - i6, measuredHeight, 0, 12);
        int c2 = measuredHeight + (getBackground() != null ? rh4.c((float) 4, fk4.d().getDisplayMetrics().density, j34.getMeasuredHeight()) : j34.getMeasuredHeight());
        r6c r6c = this.a;
        if (br7.H((je7) r6c.c)) {
            if (r6c.Z) {
                i7 = getMeasuredWidth() - r6c.L();
            }
            r6c.T(i7, tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density) + c2);
        }
    }

    public final void onMeasure(int i, int i2) {
        float f = (float) 10;
        int m = wg0.m(f, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        dy8 dy8 = this.o;
        dy8.h();
        int measuredWidth = getDependOnOutsideView() ? m : dy8.getMeasuredWidth();
        int measuredHeight = dy8.getMeasuredHeight() + (getBackground() == null ? tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density) : 0);
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
        j34 j34 = this.s0;
        j34.measure(i, i2);
        setMeasuredDimension((tu0.G(f * fk4.d().getDisplayMetrics().density) * 2) + Math.max(measuredWidth, j34.getMeasuredWidth()), (tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density) * 2) + j34.getMeasuredHeight() + measuredHeight);
    }

    public final void q(boolean z) {
        this.a.q(z);
    }

    public void setChipObserver(w5c w5c) {
        this.a.setChipObserver(w5c);
    }

    public void setDateBackgroundColor(int i) {
        this.s0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.s0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(zof zof) {
        this.s0.setStatus$message_list_release(zof);
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

    public void setOnClickListener(m56 m56) {
        this.a.X = m56;
    }

    public void setReplyClickListener(a66 a66) {
        this.b.o = a66;
    }

    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }

    public void setTextMessageColors(is0 is0) {
        this.o.setTextColors(is0);
    }

    public void setTextMessageLayout(by8 by8) {
        this.o.setLayout(by8);
    }

    public /* bridge */ /* synthetic */ void setTextMessageLinkClickListener(hk7 hk7) {
    }
}
