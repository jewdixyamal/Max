package defpackage;

import android.content.Context;
import java.util.Locale;
import kotlin.coroutines.Continuation;

/* renamed from: tc8  reason: default package */
public final class tc8 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ yc8 Y;
    public final /* synthetic */ es8 Z;
    public final /* synthetic */ Long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tc8(Object obj, Continuation continuation, yc8 yc8, es8 es8, Long l) {
        super(2, continuation);
        this.X = obj;
        this.Y = yc8;
        this.Z = es8;
        this.s0 = l;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tc8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tc8(this.X, continuation, this.Y, this.Z, this.s0);
    }

    public final Object o(Object obj) {
        String str;
        Context context;
        l20 l20;
        hm9 hm9;
        Object obj2;
        uf5 uf5;
        Context context2;
        long j;
        jqe jqe;
        od2.a0(obj);
        l20 l202 = (l20) this.X;
        if ((l202 != null ? l202.j : null) == null) {
            return null;
        }
        long hashCode = (long) l202.r.hashCode();
        yc8 yc8 = this.Y;
        Context context3 = yc8.a;
        Locale v = ((hyc) yc8.b).v();
        es8 es8 = this.Z;
        String s = ay7.s(context3, v, es8.a.o, true);
        s10 s10 = l202.j;
        l20 l203 = s10.d;
        int i = (l203 == null || !l203.i()) ? (l203 == null || !l203.f() || l203.b.X) ? 3 : 1 : 2;
        d20 d20 = l202.o;
        int i2 = d20 == null ? -1 : qc8.$EnumSwitchMapping$1[d20.ordinal()];
        Context context4 = yc8.a;
        cu8 cu8 = es8.a;
        l20 l204 = l202;
        long j2 = s10.b;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            l20 = l204;
            context = context4;
            str = s;
            hm9 = new tm8(new iqe(are.w(j2, false, context)));
        } else {
            Long l = this.s0;
            if (i2 == 4) {
                l20 = l204;
                context = context4;
                str = s;
                iqe iqe = new iqe(are.w(j2, false, context));
                long j3 = cu8.b;
                if (l != null) {
                    int i3 = (j3 > l.longValue() ? 1 : (j3 == l.longValue() ? 0 : -1));
                }
                hm9 = new rm8(iqe);
            } else if (i2 != 5) {
                iqe iqe2 = new iqe(are.w(j2, false, context4));
                long j4 = cu8.b;
                if (l != null) {
                    int i4 = (j4 > l.longValue() ? 1 : (j4 == l.longValue() ? 0 : -1));
                }
                context = context4;
                hm9 = new rm8(iqe2);
                str = s;
                l20 = l204;
            } else {
                int i5 = (s10.a > 0 ? 1 : (s10.a == 0 ? 0 : -1));
                l20 = l204;
                float f = l20.q;
                if (i5 == 0) {
                    context2 = context4;
                    j = (long) (((float) j2) * (f / 100.0f));
                } else {
                    context2 = context4;
                    j = l20.v;
                }
                str = s;
                long j5 = l20.u;
                if (j5 > 0) {
                    context = context2;
                    jqe = new iqe(rh4.j(are.w(j, false, context), "/", are.v(j5, are.m(j5), true, context)));
                } else {
                    context = context2;
                    jqe = new eqe(oda.t);
                }
                hm9 = new sm8(jqe, f);
            }
        }
        long j6 = cu8.b;
        String F = l203 != null ? fp3.F(l203) : null;
        String w = are.w(j2, false, context);
        String F2 = s5c.F(s10);
        v25 v25 = sf5.c;
        v25.getClass();
        u1 u1Var = new u1(0, v25);
        while (true) {
            if (!u1Var.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = u1Var.next();
            if (eae.k0(((sf5) obj2).name(), F2, true)) {
                break;
            }
        }
        uf5 uf52 = (sf5) obj2;
        if (uf52 != null) {
            uf5 = uf52;
        } else {
            tf5 tf5 = tf5.c;
            uf5 = ema.w(F2);
        }
        return new um8(hashCode, j6, s10.a, F, s10.c, str, w, l20.r, l20.s, i, hm9, uf5);
    }
}
