package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: l12  reason: default package */
public final class l12 extends Property {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l12(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                o12 o12 = (o12) obj;
                return null;
            case 1:
                o12 o122 = (o12) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return Float.valueOf(((a23) obj).t0);
            case 6:
                return Float.valueOf(((a23) obj).u0);
            case 7:
                return Float.valueOf(((jq4) obj).b());
            case 8:
                return Float.valueOf(((oh7) obj).t0);
            case 9:
                return Float.valueOf(((qh7) obj).u0);
            case 10:
                return Float.valueOf(((SwitchCompat) obj).N0);
            case 11:
                return Float.valueOf(((View) obj).getTransitionAlpha());
            default:
                return ((View) obj).getClipBounds();
        }
    }

    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                o12 o12 = (o12) obj;
                PointF pointF = (PointF) obj2;
                o12.getClass();
                o12.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                o12.b = round;
                int i = o12.f + 1;
                o12.f = i;
                if (i == o12.g) {
                    int i2 = o12.a;
                    int i3 = o12.c;
                    int i4 = o12.d;
                    l12 l12 = ppf.a;
                    o12.e.setLeftTopRightBottom(i2, round, i3, i4);
                    o12.f = 0;
                    o12.g = 0;
                    return;
                }
                return;
            case 1:
                o12 o122 = (o12) obj;
                PointF pointF2 = (PointF) obj2;
                o122.getClass();
                o122.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                o122.d = round2;
                int i5 = o122.g + 1;
                o122.g = i5;
                if (o122.f == i5) {
                    int i6 = o122.a;
                    int i7 = o122.b;
                    int i8 = o122.c;
                    l12 l122 = ppf.a;
                    o122.e.setLeftTopRightBottom(i6, i7, i8, round2);
                    o122.f = 0;
                    o122.g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int left = view.getLeft();
                int top = view.getTop();
                int round3 = Math.round(pointF3.x);
                int round4 = Math.round(pointF3.y);
                l12 l123 = ppf.a;
                view.setLeftTopRightBottom(left, top, round3, round4);
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                int round5 = Math.round(pointF4.x);
                int round6 = Math.round(pointF4.y);
                int right = view2.getRight();
                int bottom = view2.getBottom();
                l12 l124 = ppf.a;
                view2.setLeftTopRightBottom(round5, round6, right, bottom);
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round7 = Math.round(pointF5.x);
                int round8 = Math.round(pointF5.y);
                l12 l125 = ppf.a;
                view3.setLeftTopRightBottom(round7, round8, view3.getWidth() + round7, view3.getHeight() + round8);
                return;
            case 5:
                a23 a23 = (a23) obj;
                float floatValue = ((Float) obj2).floatValue();
                a23.t0 = floatValue;
                int i9 = (int) (floatValue * 5400.0f);
                ArrayList arrayList = (ArrayList) a23.c;
                vq4 vq4 = (vq4) arrayList.get(0);
                float f = a23.t0 * 1520.0f;
                vq4.a = -20.0f + f;
                vq4.b = f;
                int i10 = 0;
                while (true) {
                    wb5 wb5 = a23.Y;
                    if (i10 < 4) {
                        vq4.b = (wb5.getInterpolation(dle.J(i9, a23.w0[i10], 667)) * 250.0f) + vq4.b;
                        vq4.a = (wb5.getInterpolation(dle.J(i9, a23.x0[i10], 667)) * 250.0f) + vq4.a;
                        i10++;
                    } else {
                        float f2 = vq4.a;
                        float f3 = vq4.b;
                        vq4.a = (((f3 - f2) * a23.u0) + f2) / 360.0f;
                        vq4.b = f3 / 360.0f;
                        int i11 = 0;
                        while (true) {
                            if (i11 < 4) {
                                float J = dle.J(i9, a23.y0[i11], 333);
                                if (J < 0.0f || J > 1.0f) {
                                    i11++;
                                } else {
                                    int i12 = i11 + a23.s0;
                                    int[] iArr = a23.Z.c;
                                    int length = i12 % iArr.length;
                                    int i13 = iArr[length];
                                    int i14 = iArr[(1 + length) % iArr.length];
                                    float interpolation = wb5.getInterpolation(J);
                                    Integer valueOf = Integer.valueOf(i13);
                                    Integer valueOf2 = Integer.valueOf(i14);
                                    int intValue = valueOf.intValue();
                                    float f4 = ((float) ((intValue >> 24) & 255)) / 255.0f;
                                    int intValue2 = valueOf2.intValue();
                                    float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
                                    float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
                                    float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
                                    float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
                                    float f5 = z7b.f(((float) ((intValue2 >> 24) & 255)) / 255.0f, f4, interpolation, f4);
                                    float f6 = z7b.f(pow4, pow, interpolation, pow);
                                    float f7 = z7b.f((float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d), pow2, interpolation, pow2);
                                    ((vq4) arrayList.get(0)).c = Integer.valueOf(Math.round(((float) Math.pow((double) z7b.f((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d), pow3, interpolation, pow3), 0.45454545454545453d)) * 255.0f) | (Math.round(((float) Math.pow((double) f6, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f5 * 255.0f) << 24) | (Math.round(((float) Math.pow((double) f7, 0.45454545454545453d)) * 255.0f) << 8)).intValue();
                                }
                            }
                        }
                        ((tz6) a23.b).invalidateSelf();
                        return;
                    }
                }
                break;
            case 6:
                ((a23) obj).u0 = ((Float) obj2).floatValue();
                return;
            case 7:
                jq4 jq4 = (jq4) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                if (jq4.s0 != floatValue2) {
                    jq4.s0 = floatValue2;
                    jq4.invalidateSelf();
                    return;
                }
                return;
            case 8:
                oh7 oh7 = (oh7) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                oh7.t0 = floatValue3;
                ArrayList arrayList2 = (ArrayList) oh7.c;
                ((vq4) arrayList2.get(0)).a = 0.0f;
                float J2 = dle.J((int) (floatValue3 * 333.0f), 0, 667);
                wb5 wb52 = oh7.X;
                float interpolation2 = wb52.getInterpolation(J2);
                ((vq4) arrayList2.get(1)).a = interpolation2;
                ((vq4) arrayList2.get(0)).b = interpolation2;
                float interpolation3 = wb52.getInterpolation(J2 + 0.49925038f);
                ((vq4) arrayList2.get(2)).a = interpolation3;
                ((vq4) arrayList2.get(1)).b = interpolation3;
                ((vq4) arrayList2.get(2)).b = 1.0f;
                if (oh7.s0 && ((vq4) arrayList2.get(1)).b < 1.0f) {
                    ((vq4) arrayList2.get(2)).c = ((vq4) arrayList2.get(1)).c;
                    ((vq4) arrayList2.get(1)).c = ((vq4) arrayList2.get(0)).c;
                    ((vq4) arrayList2.get(0)).c = oh7.Y.c[oh7.Z];
                    oh7.s0 = false;
                }
                ((tz6) oh7.b).invalidateSelf();
                return;
            case 9:
                qh7 qh7 = (qh7) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                qh7.u0 = floatValue4;
                int i15 = (int) (floatValue4 * 1800.0f);
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = (ArrayList) qh7.c;
                    if (i16 < arrayList3.size()) {
                        vq4 vq42 = (vq4) arrayList3.get(i16);
                        int[] iArr2 = qh7.x0;
                        int i17 = i16 * 2;
                        int i18 = iArr2[i17];
                        int[] iArr3 = qh7.w0;
                        float J3 = dle.J(i15, i18, iArr3[i17]);
                        Interpolator[] interpolatorArr = qh7.Y;
                        vq42.a = z04.o(interpolatorArr[i17].getInterpolation(J3), 0.0f, 1.0f);
                        int i19 = i17 + 1;
                        vq42.b = z04.o(interpolatorArr[i19].getInterpolation(dle.J(i15, iArr2[i19], iArr3[i19])), 0.0f, 1.0f);
                        i16++;
                    } else {
                        if (qh7.t0) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                ((vq4) it.next()).c = qh7.Z.c[qh7.s0];
                            }
                            qh7.t0 = false;
                        }
                        ((tz6) qh7.b).invalidateSelf();
                        return;
                    }
                }
            case 10:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
            case 11:
                ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
