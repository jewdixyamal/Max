package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: d7a  reason: default package */
public final class d7a extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ OneMeButton o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d7a(one.me.sdk.uikit.common.button.OneMeButton r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x002c;
                case 2: goto L_0x0022;
                case 3: goto L_0x0019;
                case 4: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            c7a r2 = defpackage.c7a.b
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
            r0.o = r1
            r1 = 0
            r2 = 9
            r0.<init>((int) r2, (java.lang.Object) r1)
            return
        L_0x0022:
            z6a r2 = defpackage.z6a.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x002c:
            b7a r2 = defpackage.b7a.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d7a.<init>(one.me.sdk.uikit.common.button.OneMeButton, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        OneMeButton oneMeButton = this.o;
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    c7a c7a = (c7a) obj2;
                    c7a c7a2 = (c7a) obj;
                    bc7[] bc7Arr = OneMeButton.B0;
                    oneMeButton.j();
                    return;
                }
                return;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    b7a b7a = (b7a) obj2;
                    b7a b7a2 = (b7a) obj;
                    bc7[] bc7Arr2 = OneMeButton.B0;
                    oneMeButton.e();
                    return;
                }
                return;
            case 2:
                if (!tpa.f(obj, obj2)) {
                    z6a z6a = (z6a) obj2;
                    z6a z6a2 = (z6a) obj;
                    bc7[] bc7Arr3 = OneMeButton.B0;
                    oneMeButton.e();
                    return;
                }
                return;
            case 3:
                if (!tpa.f(obj, obj2)) {
                    fka fka = (fka) obj2;
                    fka fka2 = (fka) obj;
                    if (fka == null) {
                        fka = qp4.u0.j(oneMeButton);
                    }
                    oneMeButton.onThemeChanged(fka);
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (booleanValue) {
                        ((View) oneMeButton.t0.getValue()).setVisibility(0);
                        OneMeButton.a(oneMeButton, xoc.h, false);
                    } else {
                        je7 je7 = oneMeButton.t0;
                        if (je7.a()) {
                            ((nfa) je7.getValue()).setVisibility(8);
                            OneMeButton.a(oneMeButton, xoc.h, true);
                        }
                    }
                    bc7[] bc7Arr4 = OneMeButton.B0;
                    oneMeButton.j();
                    return;
                }
                return;
        }
    }
}
