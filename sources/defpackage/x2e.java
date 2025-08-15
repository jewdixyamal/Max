package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: x2e  reason: default package */
public final class x2e extends ViewGroup implements k34, t2e, l7c, jw8 {
    public final t2e a;
    public final r6c b;
    public final dw8 c;
    public final FrameLayout o;
    public final int s0 = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
    public final j34 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x2e(Context context, t2e t2e) {
        super(context);
        r6c r6c = new r6c();
        dw8 dw8 = new dw8();
        this.a = t2e;
        this.b = r6c;
        this.c = dw8;
        FrameLayout frameLayout = new FrameLayout(context);
        this.o = frameLayout;
        j34 j34 = new j34(context);
        j34.setBackgroundEnabled$message_list_release(true);
        this.t0 = j34;
        r6c.b = this;
        dw8.b = this;
        t2e.setParent(frameLayout);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(frameLayout, new ViewGroup.LayoutParams(-2, -2));
        addView(j34, new ViewGroup.LayoutParams(-2, -2));
    }

    public final void a(z2e z2e) {
        this.a.a(z2e);
    }

    public final void b(gw7 gw7) {
        this.a.b(gw7);
    }

    public final void c(is0 is0) {
        this.c.c(is0);
    }

    public final void f(ix8 ix8, boolean z) {
        this.b.f(ix8, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        bc7[] bc7Arr = j34.D0;
        this.t0.c(charSequence, false);
    }

    public final void k(is0 is0, boolean z) {
        this.b.k(is0, z);
    }

    public final void l() {
        this.c.l();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        dw8 dw8 = this.c;
        boolean H = br7.H((je7) dw8.c);
        int i5 = this.s0;
        int G = H ? tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density) : i5;
        float f = (float) 10;
        int G2 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        je7 je7 = (je7) dw8.c;
        if (br7.H(je7)) {
            dw8.T(G2, G);
            G = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, dw8.K(), G);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ys8 ys8 = layoutParams instanceof ys8 ? (ys8) layoutParams : null;
        int i6 = 0;
        boolean z2 = ys8 != null && !ys8.a;
        FrameLayout frameLayout = this.o;
        if (z2 && !br7.H(je7)) {
            G2 = (getMeasuredWidth() - frameLayout.getMeasuredWidth()) - i5;
        }
        ote.E(frameLayout, G2, G, 0, 12);
        int d = wg0.d((float) 2, fk4.d().getDisplayMetrics().density, frameLayout.getMeasuredHeight(), G);
        boolean H2 = br7.H(je7);
        j34 j34 = this.t0;
        if (H2 || z2) {
            measuredWidth = getMeasuredWidth() - j34.getMeasuredWidth();
        } else {
            measuredWidth = frameLayout.getMeasuredWidth();
            i5 = j34.getMeasuredWidth();
        }
        ote.E(j34, measuredWidth - i5, d, 0, 12);
        int c2 = d + (getBackground() != null ? rh4.c((float) 4, fk4.d().getDisplayMetrics().density, j34.getMeasuredHeight()) : j34.getMeasuredHeight());
        r6c r6c = this.b;
        if (br7.H((je7) r6c.c)) {
            if (r6c.Z) {
                i6 = getMeasuredWidth() - r6c.L();
            }
            r6c.T(i6, tu0.G(f * fk4.d().getDisplayMetrics().density) + c2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.s0;
        int i4 = size - (i3 * 2);
        int G = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        FrameLayout frameLayout = this.o;
        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
        int max = Math.max(0, frameLayout.getMeasuredWidth());
        int measuredHeight = frameLayout.getMeasuredHeight() + G;
        dw8 dw8 = this.c;
        if (br7.H((je7) dw8.c)) {
            dw8.U(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), i2);
            max = Math.max(max, (tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density) * 2) + dw8.L());
            measuredHeight += (tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density) * 2) + dw8.K();
        }
        j34 j34 = this.t0;
        j34.measure(i, i2);
        int d = wg0.d((float) 4, fk4.d().getDisplayMetrics().density, j34.getMeasuredHeight() + tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density), measuredHeight);
        int i5 = (i3 * 2) + max;
        r6c r6c = this.b;
        if (br7.H((je7) r6c.c)) {
            r6c.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            i5 = Math.max(i5, r6c.L());
            d = wg0.d((float) 10, fk4.d().getDisplayMetrics().density, r6c.K(), d);
        }
        setMeasuredDimension(i5, d);
    }

    public final void q(boolean z) {
        this.b.q(z);
    }

    public void setChipObserver(w5c w5c) {
        this.b.setChipObserver(w5c);
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

    public void setForwardClickListener(m56 m56) {
        this.c.X = m56;
    }

    public void setIsIncoming(boolean z) {
        this.b.o = z;
    }

    public void setLink(cw8 cw8) {
        this.c.setLink(cw8);
    }

    public void setOnClickListener(m56 m56) {
        this.b.X = m56;
    }

    public void setParent(ViewGroup viewGroup) {
        this.a.setParent(viewGroup);
    }

    public void setReplyClickListener(a66 a66) {
        this.c.o = a66;
    }

    public void setStackFromEnd(boolean z) {
        this.b.Z = z;
    }
}
