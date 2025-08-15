package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;

/* renamed from: p12  reason: default package */
public final class p12 extends w1f {
    public static final String[] R0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final l12 S0;
    public static final l12 T0;
    public static final l12 U0;
    public static final l12 V0;
    public static final l12 W0;

    static {
        Class<PointF> cls = PointF.class;
        S0 = new l12(cls, "topLeft", 0);
        T0 = new l12(cls, "bottomRight", 1);
        U0 = new l12(cls, "bottomRight", 2);
        V0 = new l12(cls, "topLeft", 3);
        W0 = new l12(cls, "position", 4);
    }

    public static void Q(g2f g2f) {
        View view = g2f.b;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = g2f.a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", g2f.b.getParent());
        }
    }

    public final void e(g2f g2f) {
        Q(g2f);
    }

    public final void h(g2f g2f) {
        Q(g2f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator l(android.view.ViewGroup r19, defpackage.g2f r20, defpackage.g2f r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x000a
            if (r2 != 0) goto L_0x000d
        L_0x000a:
            r0 = 0
            goto L_0x0142
        L_0x000d:
            java.util.HashMap r1 = r1.a
            java.util.HashMap r7 = r2.a
            java.lang.String r8 = "android:changeBounds:parent"
            java.lang.Object r9 = r1.get(r8)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            java.lang.Object r8 = r7.get(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r9 == 0) goto L_0x0023
            if (r8 != 0) goto L_0x0026
        L_0x0023:
            r0 = 0
            goto L_0x0142
        L_0x0026:
            java.lang.String r8 = "android:changeBounds:bounds"
            java.lang.Object r9 = r1.get(r8)
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            java.lang.Object r8 = r7.get(r8)
            android.graphics.Rect r8 = (android.graphics.Rect) r8
            int r10 = r9.left
            int r11 = r8.left
            int r12 = r9.top
            int r13 = r8.top
            int r14 = r9.right
            int r15 = r8.right
            int r9 = r9.bottom
            int r8 = r8.bottom
            int r6 = r14 - r10
            int r4 = r9 - r12
            int r3 = r15 - r11
            int r5 = r8 - r13
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.Object r0 = r7.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r6 == 0) goto L_0x005e
            if (r4 != 0) goto L_0x0062
        L_0x005e:
            if (r3 == 0) goto L_0x0073
            if (r5 == 0) goto L_0x0073
        L_0x0062:
            if (r10 != r11) goto L_0x0069
            if (r12 == r13) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r7 = 0
            goto L_0x006a
        L_0x0069:
            r7 = 1
        L_0x006a:
            if (r14 != r15) goto L_0x006e
            if (r9 == r8) goto L_0x0074
        L_0x006e:
            r16 = 1
            int r7 = r7 + 1
            goto L_0x0074
        L_0x0073:
            r7 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x007f
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r0 = 1
            goto L_0x0084
        L_0x007f:
            if (r1 != 0) goto L_0x0085
            if (r0 == 0) goto L_0x0085
            goto L_0x007d
        L_0x0084:
            int r7 = r7 + r0
        L_0x0085:
            if (r7 <= 0) goto L_0x0141
            l12 r0 = defpackage.ppf.a
            android.view.View r0 = r2.b
            r0.setLeftTopRightBottom(r10, r12, r14, r9)
            r1 = 2
            if (r7 != r1) goto L_0x00f4
            if (r6 != r3) goto L_0x00ac
            if (r4 != r5) goto L_0x00ac
            r1 = r18
            vu4 r2 = r1.K0
            float r3 = (float) r10
            float r4 = (float) r12
            float r5 = (float) r11
            float r6 = (float) r13
            r2.getClass()
            android.graphics.Path r2 = defpackage.vu4.q(r3, r4, r5, r6)
            l12 r3 = W0
            android.animation.ObjectAnimator r2 = defpackage.ly9.a(r0, r3, r2)
            goto L_0x0122
        L_0x00ac:
            r1 = r18
            o12 r2 = new o12
            r2.<init>(r0)
            vu4 r3 = r1.K0
            float r4 = (float) r10
            float r5 = (float) r12
            float r6 = (float) r11
            float r7 = (float) r13
            r3.getClass()
            android.graphics.Path r3 = defpackage.vu4.q(r4, r5, r6, r7)
            l12 r4 = S0
            android.animation.ObjectAnimator r3 = defpackage.ly9.a(r2, r4, r3)
            vu4 r4 = r1.K0
            float r5 = (float) r14
            float r6 = (float) r9
            float r7 = (float) r15
            float r8 = (float) r8
            r4.getClass()
            android.graphics.Path r4 = defpackage.vu4.q(r5, r6, r7, r8)
            l12 r5 = T0
            android.animation.ObjectAnimator r4 = defpackage.ly9.a(r2, r5, r4)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r6 = 2
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r7 = 0
            r6[r7] = r3
            r3 = 1
            r6[r3] = r4
            r5.playTogether(r6)
            m12 r3 = new m12
            r3.<init>(r2)
            r5.addListener(r3)
            r2 = r5
            goto L_0x0122
        L_0x00f4:
            r1 = r18
            if (r10 != r11) goto L_0x010f
            if (r12 == r13) goto L_0x00fb
            goto L_0x010f
        L_0x00fb:
            vu4 r2 = r1.K0
            float r3 = (float) r14
            float r4 = (float) r9
            float r5 = (float) r15
            float r6 = (float) r8
            r2.getClass()
            android.graphics.Path r2 = defpackage.vu4.q(r3, r4, r5, r6)
            l12 r3 = U0
            android.animation.ObjectAnimator r2 = defpackage.ly9.a(r0, r3, r2)
            goto L_0x0122
        L_0x010f:
            vu4 r2 = r1.K0
            float r3 = (float) r10
            float r4 = (float) r12
            float r5 = (float) r11
            float r6 = (float) r13
            r2.getClass()
            android.graphics.Path r2 = defpackage.vu4.q(r3, r4, r5, r6)
            l12 r3 = V0
            android.animation.ObjectAnimator r2 = defpackage.ly9.a(r0, r3, r2)
        L_0x0122:
            android.view.ViewParent r3 = r0.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0140
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3 = 1
            defpackage.gnf.b(r0, r3)
            w1f r1 = r18.s()
            n12 r3 = new n12
            r3.<init>(r0)
            r1.a(r3)
        L_0x0140:
            return r2
        L_0x0141:
            r0 = 0
        L_0x0142:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.l(android.view.ViewGroup, g2f, g2f):android.animation.Animator");
    }

    public final String[] u() {
        return R0;
    }
}
