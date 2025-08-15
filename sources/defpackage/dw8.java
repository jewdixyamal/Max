package defpackage;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: dw8  reason: default package */
public final class dw8 extends dle implements jw8 {
    public m56 X;
    public cw8 Y;
    public a66 o;

    public dw8() {
        super((m56) new g27(19));
    }

    public final void Y(View view) {
        tu0.K((iw8) view, 300, new xx5(17, this));
    }

    public final void c(is0 is0) {
        je7 je7 = (je7) this.c;
        if (je7.a()) {
            ((iw8) je7.getValue()).a(is0);
        }
    }

    public final void l() {
        this.Y = null;
        je7 je7 = (je7) this.c;
        if (je7.a()) {
            ((iw8) je7.getValue()).setVisibility(8);
        }
    }

    public final void setForwardClickListener(m56 m56) {
        this.X = m56;
    }

    public final void setLink(cw8 cw8) {
        this.Y = cw8;
        ViewGroup viewGroup = (ViewGroup) this.b;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        boolean z = false;
        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
            viewGroup.addOnLayoutChangeListener(new qq0(5, this));
        } else {
            ViewGroup viewGroup3 = (ViewGroup) this.b;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            int q = rh4.q((float) 10, fk4.d().getDisplayMetrics().density, viewGroup3.getMeasuredWidth()) - L();
            if (q < 0) {
                q = 0;
            }
            ViewGroup viewGroup4 = (ViewGroup) this.b;
            if (viewGroup4 != null) {
                viewGroup2 = viewGroup4;
            }
            f46.D(q, Q(), viewGroup2);
        }
        ((iw8) Q()).setIsFloating(cw8.f);
        zv8 zv8 = cw8.d;
        boolean z2 = zv8 != null;
        vv8 vv8 = cw8.e;
        if (vv8 != null) {
            z = true;
        }
        if (!z || z2) {
            Layout layout = cw8.c;
            if (z && (zv8 instanceof yv8)) {
                iw8 iw8 = (iw8) Q();
                if (layout != null) {
                    iw8.l(layout, ((yv8) zv8).a, vv8);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (zv8 instanceof yv8) {
                iw8 iw82 = (iw8) Q();
                if (layout != null) {
                    iw82.m(layout, ((yv8) zv8).a);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (z && (zv8 instanceof xv8)) {
                iw8 iw83 = (iw8) Q();
                if (layout != null) {
                    iw83.j(layout, (xv8) zv8, vv8);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (zv8 instanceof xv8) {
                iw8 iw84 = (iw8) Q();
                if (layout != null) {
                    iw84.k(layout, (xv8) zv8);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (zv8 instanceof wv8) {
                iw8 iw85 = (iw8) Q();
                if (layout != null) {
                    iw85.i(layout, (wv8) zv8);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        } else {
            ((iw8) Q()).setSingleForward(vv8);
        }
        t();
    }

    public final void setReplyClickListener(a66 a66) {
        this.o = a66;
    }
}
