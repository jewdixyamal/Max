package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: j7a  reason: default package */
public final class j7a extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ k7a o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j7a(k7a k7a, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                h7a h7a = h7a.a;
                this.o = k7a;
                super(9, (Object) h7a);
                return;
            case 2:
                g7a g7a = g7a.a;
                this.o = k7a;
                super(9, (Object) g7a);
                return;
            default:
                this.o = k7a;
                return;
        }
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                fka fka = (fka) obj2;
                if (!tpa.f((fka) obj, fka)) {
                    k7a k7a = this.o;
                    if (fka == null) {
                        fka = qp4.u0.j(k7a);
                    }
                    k7a.onThemeChanged(fka);
                    return;
                }
                return;
            case 1:
                h7a h7a = (h7a) obj2;
                if (((h7a) obj) != h7a) {
                    int i = i7a.$EnumSwitchMapping$0[h7a.ordinal()];
                    k7a k7a2 = this.o;
                    if (i != 1) {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        } else if (k7a2.getTextView().getParent() == null) {
                            k7a2.addView(k7a2.getTextView());
                            return;
                        } else {
                            return;
                        }
                    } else if (k7a2.getTextView().getParent() != null) {
                        k7a2.removeView(k7a2.getTextView());
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                g7a g7a = (g7a) obj2;
                if (((g7a) obj) != g7a) {
                    k7a k7a3 = this.o;
                    k7a3.c(k7a3, g7a);
                    return;
                }
                return;
        }
    }
}
