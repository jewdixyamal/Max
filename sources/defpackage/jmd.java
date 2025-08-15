package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: jmd  reason: default package */
public final class jmd extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ kmd o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jmd(Object obj, kmd kmd, int i) {
        super(9, obj);
        this.c = i;
        this.o = kmd;
    }

    public final void L1(Object obj, Object obj2) {
        kmd kmd = this.o;
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    hmd hmd = (hmd) obj2;
                    hmd hmd2 = (hmd) obj;
                    kmd.a(qp4.u0.b(kmd.a).i());
                    kmd.invalidateSelf();
                    return;
                }
                return;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    float[] fArr = (float[]) obj2;
                    float[] fArr2 = (float[]) obj;
                    kmd.Z.setFloatValues(Arrays.copyOf(fArr, fArr.length));
                    return;
                }
                return;
            case 2:
                if (!tpa.f(obj, obj2)) {
                    imd imd = (imd) obj;
                    int ordinal = ((imd) obj2).ordinal();
                    if (ordinal == 0) {
                        kmd.Z.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(kmd.X, new float[]{0.0f, 359.0f})});
                        return;
                    } else if (ordinal == 1) {
                        kmd.Z.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(kmd.X, new float[]{359.0f, 0.0f})});
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            case 3:
                if (!tpa.f(obj, obj2)) {
                    long longValue = ((Number) obj2).longValue();
                    ((Number) obj).longValue();
                    kmd.Z.setDuration(longValue);
                    return;
                }
                return;
            case 4:
                if (!tpa.f(obj, obj2)) {
                    float[] fArr3 = (float[]) obj2;
                    float[] fArr4 = (float[]) obj;
                    kmd.Y.setFloatValues(Arrays.copyOf(fArr3, fArr3.length));
                    return;
                }
                return;
            case 5:
                if (!tpa.f(obj, obj2)) {
                    long longValue2 = ((Number) obj2).longValue();
                    ((Number) obj).longValue();
                    kmd.Y.setDuration(longValue2);
                    return;
                }
                return;
            case 6:
                if (!tpa.f(obj, obj2)) {
                    Integer num = (Integer) obj2;
                    Integer num2 = (Integer) obj;
                    kmd.invalidateSelf();
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (booleanValue) {
                        kmd.d();
                    } else {
                        ObjectAnimator objectAnimator = kmd.Y;
                        if (objectAnimator.isRunning()) {
                            objectAnimator.cancel();
                        }
                    }
                    kmd.invalidateSelf();
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jmd(defpackage.kmd r3, int r4) {
        /*
            r2 = this;
            r2.c = r4
            switch(r4) {
                case 2: goto L_0x003e;
                case 3: goto L_0x0030;
                case 4: goto L_0x0005;
                case 5: goto L_0x0022;
                case 6: goto L_0x0019;
                case 7: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            hmd r4 = defpackage.hmd.a
            r2.o = r3
            r3 = 9
            r2.<init>((int) r3, (java.lang.Object) r4)
            return
        L_0x000f:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r2.o = r3
            r3 = 9
            r2.<init>((int) r3, (java.lang.Object) r4)
            return
        L_0x0019:
            r2.o = r3
            r3 = 0
            r4 = 9
            r2.<init>((int) r4, (java.lang.Object) r3)
            return
        L_0x0022:
            r0 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r2.o = r3
            r3 = 9
            r2.<init>((int) r3, (java.lang.Object) r4)
            return
        L_0x0030:
            r0 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r2.o = r3
            r3 = 9
            r2.<init>((int) r3, (java.lang.Object) r4)
            return
        L_0x003e:
            imd r4 = defpackage.imd.a
            r2.o = r3
            r3 = 9
            r2.<init>((int) r3, (java.lang.Object) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmd.<init>(kmd, int):void");
    }
}
