package defpackage;

import android.text.SpannableString;
import android.text.style.URLSpan;
import java.util.Set;
import java.util.function.UnaryOperator;

/* renamed from: c52  reason: default package */
public final /* synthetic */ class c52 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ e52 b;

    public /* synthetic */ c52(e52 e52, int i) {
        this.a = i;
        this.b = e52;
    }

    public final Object apply(Object obj) {
        e52 e52 = this.b;
        switch (this.a) {
            case 0:
                mpa mpa = (mpa) obj;
                es8 es8 = e52.X;
                gvd gvd = null;
                if (es8 == null) {
                    return null;
                }
                cu8 cu8 = es8.a;
                if (mpa != null && ((Long) mpa.a).longValue() == cu8.b) {
                    return mpa;
                }
                ld2 ld2 = (ld2) es8.s0;
                ld2.getClass();
                es8 es82 = e52.X;
                SpannableString f = es82 == null ? null : ld2.e(e52, es82, 1, false);
                if (oag.u(f)) {
                    int i = gvd.a;
                    f = crd.l(f, true);
                    for (Object obj2 : f.getSpans(0, f.length(), Object.class)) {
                        if ((obj2 instanceof URLSpan) || (obj2 instanceof yz7)) {
                            f.removeSpan(obj2);
                        }
                    }
                }
                Long valueOf = Long.valueOf(cu8.b);
                if (!oag.t(f)) {
                    int i2 = gvd.a;
                    gvd = crd.l(f, true);
                }
                return new mpa(valueOf, gvd);
            default:
                Set set = (Set) obj;
                set.add(e52);
                return set;
        }
    }
}
