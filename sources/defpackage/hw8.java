package defpackage;

import android.graphics.Paint;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: hw8  reason: default package */
public final class hw8 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ iw8 o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hw8(defpackage.iw8 r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            fw8 r2 = defpackage.fw8.a
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
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw8.<init>(iw8, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        float f;
        float f2;
        switch (this.c) {
            case 0:
                fw8 fw8 = (fw8) obj2;
                fw8 fw82 = (fw8) obj;
                iw8 iw8 = this.o;
                iw8.o = null;
                iw8.s0 = null;
                iw8.t0 = null;
                iw8.u0 = null;
                je7 je7 = iw8.v0;
                if (je7.a()) {
                    ((s5a) je7.getValue()).setVisibility(8);
                }
                iw8.z0 = null;
                je7 je72 = iw8.C0;
                if (je72.a()) {
                    ((OneMeDraweeView) je72.getValue()).setVisibility(8);
                }
                iw8.x0 = null;
                iw8.w0 = null;
                iw8.requestLayout();
                iw8.invalidate();
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    iw8 iw82 = this.o;
                    Paint paint = iw82.G0;
                    if (booleanValue) {
                        f = fk4.d().getDisplayMetrics().density;
                        f2 = 4.0f;
                    } else {
                        f = fk4.d().getDisplayMetrics().density;
                        f2 = 2.0f;
                    }
                    paint.setStrokeWidth(f * f2);
                    iw82.requestLayout();
                    iw82.invalidate();
                    return;
                }
                return;
        }
    }
}
