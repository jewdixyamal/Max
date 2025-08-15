package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: ed2  reason: default package */
public final /* synthetic */ class ed2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld2 b;

    public /* synthetic */ ed2(ld2 ld2, int i) {
        this.a = i;
        this.b = ld2;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = woc.y1;
                Context context = this.b.a;
                Drawable n = s36.n(context, i);
                if (n != null) {
                    ngg.G(n, k7d.h(qp4.u0, context).c);
                    return n;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 1:
                int i2 = woc.k2;
                Context context2 = this.b.a;
                Drawable n2 = s36.n(context2, i2);
                if (n2 != null) {
                    ngg.G(n2, k7d.h(qp4.u0, context2).c);
                    return n2;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 2:
                int i3 = woc.I1;
                Context context3 = this.b.a;
                Drawable n3 = s36.n(context3, i3);
                if (n3 != null) {
                    ngg.G(n3, k7d.h(qp4.u0, context3).b);
                    return n3;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 3:
                int i4 = woc.Y1;
                Context context4 = this.b.a;
                Drawable n4 = s36.n(context4, i4);
                if (n4 != null) {
                    ngg.G(n4, k7d.h(qp4.u0, context4).j);
                    return n4;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 4:
                return new yl5((Drawable) new e4f(qp4.u0.b(this.b.a).i(), new we1(14)), sl5.a, 4);
            case 5:
                int i5 = woc.p;
                Context context5 = this.b.a;
                Drawable n5 = s36.n(context5, i5);
                if (n5 != null) {
                    ngg.G(n5, k7d.h(qp4.u0, context5).j);
                    return n5;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 6:
                int i6 = woc.y;
                Context context6 = this.b.a;
                Drawable n6 = s36.n(context6, i6);
                if (n6 != null) {
                    ngg.G(n6, k7d.h(qp4.u0, context6).j);
                    return n6;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 7:
                int i7 = woc.o1;
                Context context7 = this.b.a;
                Drawable n7 = s36.n(context7, i7);
                if (n7 != null) {
                    ngg.G(n7, k7d.h(qp4.u0, context7).j);
                    return n7;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 8:
                int i8 = woc.P;
                Context context8 = this.b.a;
                Drawable n8 = s36.n(context8, i8);
                if (n8 != null) {
                    ngg.G(n8, k7d.h(qp4.u0, context8).j);
                    return n8;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 9:
                int i9 = woc.z1;
                Context context9 = this.b.a;
                Drawable n9 = s36.n(context9, i9);
                if (n9 != null) {
                    ngg.G(n9, k7d.h(qp4.u0, context9).j);
                    return n9;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                int i10 = woc.m2;
                Context context10 = this.b.a;
                Drawable n10 = s36.n(context10, i10);
                if (n10 != null) {
                    ngg.G(n10, k7d.h(qp4.u0, context10).j);
                    return n10;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
