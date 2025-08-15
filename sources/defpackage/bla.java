package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: bla  reason: default package */
public final class bla extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ cla o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bla(cla cla, int i, boolean z) {
        super(9, (Object) null);
        this.c = i;
        this.o = cla;
    }

    public final void L1(Object obj, Object obj2) {
        OneMeButton oneMeButton;
        int i;
        int i2;
        int intValue;
        int intValue2;
        switch (this.c) {
            case 0:
                fka fka = (fka) obj2;
                if (!tpa.f((fka) obj, fka)) {
                    cla cla = this.o;
                    if (fka == null) {
                        fka = qp4.u0.j(cla);
                    }
                    cla.onThemeChanged(fka);
                    return;
                }
                return;
            case 1:
                if (((uka) obj) != ((uka) obj2)) {
                    cla cla2 = this.o;
                    cla2.l();
                    cla2.k();
                    if (!cla2.g()) {
                        cla2.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ska ska = (ska) obj2;
                if (!tpa.f((ska) obj, ska)) {
                    cla cla3 = this.o;
                    cla.d(cla3, ska);
                    cla3.k();
                    if (!cla3.g()) {
                        cla3.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                qka qka = (qka) obj2;
                qka qka2 = (qka) obj;
                cla cla4 = this.o;
                if ((cla4.getForm() == uka.a || cla4.getForm() == uka.c) && !tpa.f(qka2, qka)) {
                    cla4.removeView(cla4.A0);
                    Context context = cla4.getContext();
                    fka customTheme = cla4.getCustomTheme();
                    OneMeButton oneMeButton2 = null;
                    if (qka instanceof kka) {
                        oneMeButton = new OneMeButton(context, (AttributeSet) null);
                        oneMeButton.setCustomTheme(customTheme);
                        oneMeButton.d(Integer.valueOf(woc.d0), true);
                        tu0.K(oneMeButton, 300, new owe(qka, 0));
                    } else if (qka instanceof lka) {
                        oneMeButton = new OneMeButton(context, (AttributeSet) null);
                        oneMeButton.setCustomTheme(customTheme);
                        oneMeButton.d(Integer.valueOf(woc.p0), true);
                        tu0.K(oneMeButton, 300, new owe(qka, 1));
                    } else if (qka instanceof oka) {
                        yka yka = ((oka) qka).a;
                        if (yka instanceof vka) {
                            OneMeButton oneMeButton3 = new OneMeButton(context, (AttributeSet) null);
                            oneMeButton3.setCustomTheme(customTheme);
                            oneMeButton3.d(Integer.valueOf(((vka) yka).a), true);
                            tu0.K(oneMeButton3, 300, new owe(qka, 2));
                            oneMeButton = oneMeButton3;
                        } else if ((yka instanceof xka) || (yka instanceof wka)) {
                            throw new Error("Left action should not support search icon");
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (qka instanceof nka) {
                        oneMeButton = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (oneMeButton != null) {
                        oneMeButton.setId(xoc.O);
                        oneMeButton2 = oneMeButton;
                    }
                    cla4.A0 = oneMeButton2;
                    if (oneMeButton2 != null) {
                        cla4.addView(oneMeButton2);
                        f46.C(oneMeButton2, tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density));
                    }
                    cla4.k();
                    if (!cla4.g()) {
                        cla4.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                kpa kpa = (kpa) obj2;
                kpa kpa2 = (kpa) obj;
                cla cla5 = this.o;
                int ordinal = cla5.getForm().ordinal();
                if (ordinal == 0) {
                    intValue = kpa != null ? ((Number) kpa.a).intValue() : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                    intValue2 = kpa != null ? ((Number) kpa.b).intValue() : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                } else if (ordinal == 1) {
                    intValue = kpa != null ? ((Number) kpa.a).intValue() : tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                    intValue2 = kpa != null ? ((Number) kpa.b).intValue() : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                } else if (ordinal == 2) {
                    i2 = kpa != null ? ((Number) kpa.a).intValue() : tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
                    i = kpa != null ? ((Number) kpa.b).intValue() : tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
                    cla5.setPadding(i2, 0, i, 0);
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = intValue;
                i = intValue2;
                cla5.setPadding(i2, 0, i, 0);
                return;
            default:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                cla cla6 = this.o;
                if (booleanValue2 != booleanValue) {
                    cla6.k();
                }
                if (cla6.v0.a()) {
                    ((fmd) cla6.v0.getValue()).a(booleanValue);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bla(defpackage.cla r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 2: goto L_0x0023;
                case 3: goto L_0x0019;
                case 4: goto L_0x0005;
                case 5: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            uka r2 = defpackage.uka.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x0019:
            nka r2 = defpackage.nka.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x0023:
            nka r2 = defpackage.nka.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bla.<init>(cla, int):void");
    }
}
