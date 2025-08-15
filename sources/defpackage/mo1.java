package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: mo1  reason: default package */
public final class mo1 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ no1 o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mo1(defpackage.no1 r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            jo1 r2 = defpackage.jo1.b
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            ko1 r2 = defpackage.ko1.o
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo1.<init>(no1, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        lmd background;
        lmd background2;
        lmd background3;
        lmd background4;
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    jo1 jo1 = (jo1) obj;
                    int ordinal = ((jo1) obj2).ordinal();
                    fnc fnc = fnc.b;
                    no1 no1 = this.o;
                    if (ordinal == 0) {
                        no1.getNegativeButtonView().setMode(fnc.c);
                        no1.getPositiveButtonView().setMode(fnc);
                        return;
                    } else if (ordinal == 1) {
                        no1.getNegativeButtonView().setMode(fnc.a);
                        no1.getPositiveButtonView().setMode(fnc);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            default:
                if (!tpa.f(obj, obj2)) {
                    ko1 ko1 = (ko1) obj2;
                    ko1 ko12 = (ko1) obj;
                    int ordinal2 = ko1.ordinal();
                    pq9 pq9 = qp4.u0;
                    no1 no12 = this.o;
                    if (ordinal2 == 0 || ordinal2 == 1) {
                        if (no12.getBackground() == null) {
                            no12.setBackground(no12.getAnimatedBackground());
                        }
                        ko1 ko13 = ko1.b;
                        ko1 ko14 = ko1.a;
                        if (ko12 == ko13 && ko1 == ko14 && (background2 = no12.getBackground()) != null) {
                            background2.setAlpha(128);
                        }
                        lmd background5 = no12.getBackground();
                        if (background5 != null) {
                            background5.b.b(ko1 == ko14 ? hmd.c : hmd.b);
                        }
                        if (no12.isAttachedToWindow() && (background = no12.getBackground()) != null && !background.isRunning()) {
                            lmd background6 = no12.getBackground();
                            if (background6 != null) {
                                background6.onThemeChanged(pq9.p(no12).c);
                            }
                            lmd background7 = no12.getBackground();
                            if (background7 != null) {
                                background7.start();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ordinal2 == 2) {
                        if (no12.getBackground() == null) {
                            no12.setBackground(no12.getAnimatedBackground());
                        }
                        lmd background8 = no12.getBackground();
                        if (background8 != null) {
                            background8.b.b(hmd.o);
                        }
                        if (no12.isAttachedToWindow() && (background3 = no12.getBackground()) != null && !background3.isRunning()) {
                            lmd background9 = no12.getBackground();
                            if (background9 != null) {
                                background9.onThemeChanged(pq9.p(no12).c);
                            }
                            lmd background10 = no12.getBackground();
                            if (background10 != null) {
                                background10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ordinal2 == 3) {
                        if (no12.isAttachedToWindow() && (background4 = no12.getBackground()) != null) {
                            background4.stop();
                        }
                        no12.setBackground((Drawable) null);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
        }
    }
}
