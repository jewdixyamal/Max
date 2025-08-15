package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: q91  reason: default package */
public final class q91 extends ffe implements e66 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ pnf t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q91(pnf pnf, Continuation continuation, int i) {
        super(4, continuation);
        this.X = i;
        this.t0 = pnf;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.X) {
            case 0:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                q91 q91 = new q91((s91) this.t0, (Continuation) obj4, 0);
                q91.Z = (y21) obj;
                q91.s0 = (d04) obj2;
                q91.Y = booleanValue;
                e5f e5f = e5f.a;
                q91.o(e5f);
                return e5f;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                q91 q912 = new q91((sn1) this.t0, (Continuation) obj4, 1);
                q912.Y = booleanValue2;
                q912.Z = (wvc) obj2;
                q912.s0 = (pqa) obj3;
                return q912.o(e5f.a);
        }
    }

    public final Object o(Object obj) {
        Object value;
        n91 n91;
        SpannableString spannableString;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                y21 y21 = (y21) this.Z;
                d04 d04 = (d04) this.s0;
                boolean z = this.Y;
                s91 s91 = (s91) this.t0;
                q0e q0e = s91.X;
                do {
                    value = q0e.getValue();
                    m91 m91 = (m91) value;
                    j1e j1e = d04.a;
                    boolean z2 = j1e != null && j1e.A();
                    i95 i95 = d04.j;
                    boolean z3 = d04.f;
                    if (!z3 || !(i95 instanceof g95)) {
                        n91 = m91.b;
                        n91 n912 = n91.b;
                        if (n91 != n912) {
                            n91 = !z3 ? n91.a : n912;
                        }
                    } else {
                        n91 = n91.c;
                    }
                    CharSequence charSequence = y21.c;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    boolean z4 = z && (i95 instanceof f95);
                    boolean z5 = i95 instanceof g95;
                    bn1 bn1 = s91.o;
                    bn1.getClass();
                    boolean z6 = i95 instanceof h95;
                    Context context = bn1.a;
                    if (z6) {
                        charSequence = context.getString(b8a.f0);
                    } else if (z5 && z3) {
                        charSequence = au1.g(context.getString(f0c.call_screen_connection_restoring), "...");
                    }
                    spannableString = null;
                    if (!w9e.C0(charSequence)) {
                        boolean z7 = d04.g;
                        int i = (z3 || !z7 || !z2) ? (z3 || !z7) ? z2 ? x7a.D0 : (z5 || !z4) ? x7a.z : ztb.ic_connection_fill_16 : x7a.Q : x7a.R;
                        sba o = qp4.u0.o(context);
                        Drawable E = dy7.E(i, z4 ? o.c.getIcon().c : o.c.getIcon().f, context);
                        float f = (float) 16;
                        E.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        SpannableString spannableString2 = new SpannableString("   " + charSequence + " ");
                        spannableString2.setSpan(new yl5(E, (sl5) null, 6), 0, 1, 17);
                        spannableString = spannableString2;
                    }
                    m91.getClass();
                } while (!q0e.c(value, new m91(spannableString, n91)));
                return e5f.a;
            default:
                od2.a0(obj);
                boolean z8 = this.Y;
                wvc wvc = (wvc) this.Z;
                pqa pqa = (pqa) this.s0;
                if (!z8) {
                    return null;
                }
                int ordinal = wvc.a.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                } else if (wvc.c) {
                    return null;
                } else {
                    fqa d = ((sn1) this.t0).c.d();
                    kvc kvc = wvc.b;
                    if (tpa.f(kvc != null ? kvc.c : null, d.a.getId())) {
                        return null;
                    }
                    fqa fqa = (fqa) pqa.c.get(kvc != null ? kvc.c : null);
                    String name = fqa != null ? fqa.b.getName() : null;
                    if (name == null || w9e.C0(name)) {
                        return null;
                    }
                    return new vwe(new gqe(b8a.M1, ys.m0(new Object[]{name})), new eqe(d.a.m() ? b8a.K1 : b8a.L1));
                }
        }
    }
}
