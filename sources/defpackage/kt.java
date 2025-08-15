package defpackage;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

/* renamed from: kt  reason: default package */
public final class kt implements Comparator {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public kt(sl2 sl2, sl2 sl22) {
        this.b = sl2;
        this.c = sl22;
    }

    public static float a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public RectF b(Rational rational) {
        float floatValue = rational.floatValue();
        Rational rational2 = (Rational) this.c;
        return floatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, (float) rational2.getNumerator(), (float) rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, (float) rational2.getNumerator(), (((float) rational.getDenominator()) * ((float) rational2.getNumerator())) / ((float) rational.getNumerator())) : new RectF(0.0f, 0.0f, (((float) rational.getNumerator()) * ((float) rational2.getDenominator())) / ((float) rational.getDenominator()), (float) rational2.getDenominator());
    }

    public final int compare(Object obj, Object obj2) {
        Long l;
        Long l2;
        switch (this.a) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                boolean z = false;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF b2 = b(rational);
                RectF b3 = b(rational2);
                RectF rectF = (RectF) this.b;
                boolean z2 = b2.width() >= rectF.width() && b2.height() >= rectF.height();
                if (b3.width() >= rectF.width() && b3.height() >= rectF.height()) {
                    z = true;
                }
                if (z2 && z) {
                    return (int) Math.signum((b2.height() * b2.width()) - (b3.height() * b3.width()));
                } else if (z2) {
                    return -1;
                } else {
                    if (z) {
                        return 1;
                    }
                    return -((int) Math.signum(a(b2, rectF) - a(b3, rectF)));
                }
            default:
                long longValue = ((Number) obj2).longValue();
                sl2 sl2 = (sl2) this.b;
                ql2 ql2 = (ql2) sl2.a.get(Long.valueOf(longValue));
                sl2 sl22 = (sl2) this.c;
                ql2 ql22 = (ql2) sl22.a.get(Long.valueOf(longValue));
                long j = 0;
                if ((ql2 != null ? ql2.l : 0) >= (ql22 != null ? ql22.l : 0)) {
                    l = Long.valueOf(ql2 != null ? ql2.l : 0);
                } else {
                    l = Long.valueOf(ql22 != null ? ql22.l : 0);
                }
                long longValue2 = ((Number) obj).longValue();
                ql2 ql23 = (ql2) sl2.a.get(Long.valueOf(longValue2));
                ql2 ql24 = (ql2) sl22.a.get(Long.valueOf(longValue2));
                if ((ql23 != null ? ql23.l : 0) >= (ql24 != null ? ql24.l : 0)) {
                    if (ql23 != null) {
                        j = ql23.l;
                    }
                    l2 = Long.valueOf(j);
                } else {
                    if (ql24 != null) {
                        j = ql24.l;
                    }
                    l2 = Long.valueOf(j);
                }
                return xfg.f(l, l2);
        }
    }

    public kt(Rational rational, Rational rational2) {
        this.c = rational2 == null ? new Rational(4, 3) : rational2;
        this.b = b(rational);
    }
}
