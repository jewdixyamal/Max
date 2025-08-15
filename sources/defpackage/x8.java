package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Range;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.serialization.MissingFieldException;
import org.json.HTTP;

/* renamed from: x8  reason: default package */
public final class x8 implements mde, u45 {
    public Object X;
    public Object Y;
    public int a;
    public final Object b;
    public final Object c;
    public Object o;

    public x8(ja7 ja7, g9g g9g, l0f l0f, r6d r6d, sw0 sw0) {
        qa7 qa7;
        this.b = ja7;
        this.c = g9g;
        this.o = l0f;
        this.a = -1;
        la7 la7 = ja7.a;
        this.X = la7;
        if (la7.f) {
            qa7 = null;
        } else {
            qa7 = new qa7(r6d);
        }
        this.Y = qa7;
    }

    public int A(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.o;
        int size = arrayList.size();
        while (i2 < size) {
            w8 w8Var = (w8) arrayList.get(i2);
            int i3 = w8Var.a;
            if (i3 == 8) {
                int i4 = w8Var.b;
                if (i4 == i) {
                    i = w8Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (w8Var.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = w8Var.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = w8Var.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += w8Var.d;
                }
            }
            i2++;
        }
        return i;
    }

    public ColorStateList B() {
        qh3 qh3 = (qh3) this.X;
        if (qh3 != null) {
            return (ColorStateList) qh3.d;
        }
        return null;
    }

    public PorterDuff.Mode C() {
        qh3 qh3 = (qh3) this.X;
        if (qh3 != null) {
            return (PorterDuff.Mode) qh3.e;
        }
        return null;
    }

    public boolean D() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void E(AttributeSet attributeSet, int i) {
        ColorStateList h;
        View view = (View) this.b;
        k8g x = k8g.x(view.getContext(), attributeSet, p3c.ViewBackgroundHelper, i, 0);
        TypedArray typedArray = (TypedArray) x.b;
        View view2 = (View) this.b;
        Context context = view2.getContext();
        int[] iArr = p3c.ViewBackgroundHelper;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(view2, context, iArr, attributeSet, (TypedArray) x.b, i, 0);
        try {
            if (typedArray.hasValue(p3c.ViewBackgroundHelper_android_background)) {
                this.a = typedArray.getResourceId(p3c.ViewBackgroundHelper_android_background, -1);
                gn gnVar = (gn) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (gnVar) {
                    h = gnVar.a.h(context2, i2);
                }
                if (h != null) {
                    N(h);
                }
            }
            if (typedArray.hasValue(p3c.ViewBackgroundHelper_backgroundTint)) {
                omf.q(view, x.l(p3c.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArray.hasValue(p3c.ViewBackgroundHelper_backgroundTintMode)) {
                omf.r(view, hq4.c(typedArray.getInt(p3c.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
            x.z();
        } catch (Throwable th) {
            x.z();
            throw th;
        }
    }

    public xo6 F(long j) {
        if (this.a == 4) {
            this.a = 5;
            return new xo6(this, j);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [w8, java.lang.Object] */
    public w8 G(Object obj, int i, int i2, int i3) {
        w8 w8Var = (w8) ((u5b) this.b).f();
        if (w8Var == null) {
            ? obj2 = new Object();
            obj2.a = i;
            obj2.b = i2;
            obj2.d = i3;
            obj2.c = obj;
            return obj2;
        }
        w8Var.a = i;
        w8Var.b = i2;
        w8Var.d = i3;
        w8Var.c = obj;
        return w8Var;
    }

    public void H() {
        this.a = -1;
        N((ColorStateList) null);
        i();
    }

    public void I(int i) {
        ColorStateList colorStateList;
        this.a = i;
        gn gnVar = (gn) this.c;
        if (gnVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (gnVar) {
                colorStateList = gnVar.a.h(context, i);
            }
        } else {
            colorStateList = null;
        }
        N(colorStateList);
        i();
    }

    public void J(w8 w8Var) {
        ((ArrayList) this.o).add(w8Var);
        int i = w8Var.a;
        k61 k61 = (k61) this.X;
        if (i == 1) {
            k61.d(w8Var.b, w8Var.d);
        } else if (i == 2) {
            int i2 = w8Var.b;
            int i3 = w8Var.d;
            RecyclerView recyclerView = k61.a;
            recyclerView.d0(i2, i3, false);
            recyclerView.v1 = true;
        } else if (i == 4) {
            k61.c(w8Var.b, w8Var.d, w8Var.c);
        } else if (i == 8) {
            k61.e(w8Var.b, w8Var.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + w8Var);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:176:0x000d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r0.Y
            y8 r2 = (defpackage.y8) r2
            r2.getClass()
        L_0x000d:
            int r3 = r1.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0014:
            r7 = -1
            r8 = 8
            if (r3 < 0) goto L_0x002a
            java.lang.Object r9 = r1.get(r3)
            w8 r9 = (defpackage.w8) r9
            int r9 = r9.a
            if (r9 != r8) goto L_0x0026
            if (r6 == 0) goto L_0x0027
            goto L_0x002b
        L_0x0026:
            r6 = r4
        L_0x0027:
            int r3 = r3 + -1
            goto L_0x0014
        L_0x002a:
            r3 = r7
        L_0x002b:
            r6 = 0
            r9 = 4
            r10 = 2
            if (r3 == r7) goto L_0x01d5
            int r8 = r3 + 1
            java.lang.Object r11 = r1.get(r3)
            w8 r11 = (defpackage.w8) r11
            java.lang.Object r12 = r1.get(r8)
            w8 r12 = (defpackage.w8) r12
            int r13 = r12.a
            if (r13 == r4) goto L_0x01ab
            java.lang.Object r7 = r2.a
            x8 r7 = (defpackage.x8) r7
            if (r13 == r10) goto L_0x00af
            if (r13 == r9) goto L_0x004b
            goto L_0x000d
        L_0x004b:
            int r5 = r11.d
            int r10 = r12.b
            if (r5 >= r10) goto L_0x0056
            int r10 = r10 + -1
            r12.b = r10
            goto L_0x0068
        L_0x0056:
            int r13 = r12.d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0068
            int r13 = r13 + -1
            r12.d = r13
            int r5 = r11.b
            java.lang.Object r10 = r12.c
            w8 r4 = r7.G(r10, r9, r5, r4)
            goto L_0x0069
        L_0x0068:
            r4 = r6
        L_0x0069:
            int r5 = r11.b
            int r10 = r12.b
            if (r5 > r10) goto L_0x0074
            int r10 = r10 + 1
            r12.b = r10
            goto L_0x0088
        L_0x0074:
            int r13 = r12.d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0088
            int r10 = r10 - r5
            int r5 = r5 + 1
            java.lang.Object r13 = r12.c
            w8 r5 = r7.G(r13, r9, r5, r10)
            int r9 = r12.d
            int r9 = r9 - r10
            r12.d = r9
            goto L_0x0089
        L_0x0088:
            r5 = r6
        L_0x0089:
            r1.set(r8, r11)
            int r8 = r12.d
            if (r8 <= 0) goto L_0x0094
            r1.set(r3, r12)
            goto L_0x00a3
        L_0x0094:
            r1.remove(r3)
            r7.getClass()
            r12.c = r6
            java.lang.Object r6 = r7.b
            u5b r6 = (defpackage.u5b) r6
            r6.e(r12)
        L_0x00a3:
            if (r4 == 0) goto L_0x00a8
            r1.add(r3, r4)
        L_0x00a8:
            if (r5 == 0) goto L_0x000d
            r1.add(r3, r5)
            goto L_0x000d
        L_0x00af:
            int r9 = r11.b
            int r13 = r11.d
            if (r9 >= r13) goto L_0x00c4
            int r14 = r12.b
            if (r14 != r9) goto L_0x00c2
            int r14 = r12.d
            int r9 = r13 - r9
            if (r14 != r9) goto L_0x00c2
            r5 = r4
        L_0x00c0:
            r9 = 0
            goto L_0x00d4
        L_0x00c2:
            r5 = 0
            goto L_0x00c0
        L_0x00c4:
            int r14 = r12.b
            int r15 = r13 + 1
            if (r14 != r15) goto L_0x00d2
            int r14 = r12.d
            int r9 = r9 - r13
            if (r14 != r9) goto L_0x00d2
            r5 = r4
            r9 = r5
            goto L_0x00d4
        L_0x00d2:
            r9 = r4
            r5 = 0
        L_0x00d4:
            int r14 = r12.b
            if (r13 >= r14) goto L_0x00dd
            int r14 = r14 + -1
            r12.b = r14
            goto L_0x00ff
        L_0x00dd:
            int r15 = r12.d
            int r14 = r14 + r15
            if (r13 >= r14) goto L_0x00ff
            int r15 = r15 + -1
            r12.d = r15
            r11.a = r10
            r11.d = r4
            int r3 = r12.d
            if (r3 != 0) goto L_0x000d
            r1.remove(r8)
            r7.getClass()
            r12.c = r6
            java.lang.Object r3 = r7.b
            u5b r3 = (defpackage.u5b) r3
            r3.e(r12)
            goto L_0x000d
        L_0x00ff:
            int r4 = r11.b
            int r13 = r12.b
            if (r4 > r13) goto L_0x010a
            int r13 = r13 + 1
            r12.b = r13
            goto L_0x011e
        L_0x010a:
            int r14 = r12.d
            int r13 = r13 + r14
            if (r4 >= r13) goto L_0x011e
            int r13 = r13 - r4
            int r4 = r4 + 1
            w8 r4 = r7.G(r6, r10, r4, r13)
            int r10 = r11.b
            int r13 = r12.b
            int r10 = r10 - r13
            r12.d = r10
            goto L_0x011f
        L_0x011e:
            r4 = r6
        L_0x011f:
            if (r5 == 0) goto L_0x0135
            r1.set(r3, r12)
            r1.remove(r8)
            r7.getClass()
            r11.c = r6
            java.lang.Object r3 = r7.b
            u5b r3 = (defpackage.u5b) r3
            r3.e(r11)
            goto L_0x000d
        L_0x0135:
            if (r9 == 0) goto L_0x0166
            if (r4 == 0) goto L_0x014f
            int r5 = r11.b
            int r6 = r4.b
            if (r5 <= r6) goto L_0x0144
            int r6 = r4.d
            int r5 = r5 - r6
            r11.b = r5
        L_0x0144:
            int r5 = r11.d
            int r6 = r4.b
            if (r5 <= r6) goto L_0x014f
            int r6 = r4.d
            int r5 = r5 - r6
            r11.d = r5
        L_0x014f:
            int r5 = r11.b
            int r6 = r12.b
            if (r5 <= r6) goto L_0x015a
            int r6 = r12.d
            int r5 = r5 - r6
            r11.b = r5
        L_0x015a:
            int r5 = r11.d
            int r6 = r12.b
            if (r5 <= r6) goto L_0x0194
            int r6 = r12.d
            int r5 = r5 - r6
            r11.d = r5
            goto L_0x0194
        L_0x0166:
            if (r4 == 0) goto L_0x017e
            int r5 = r11.b
            int r6 = r4.b
            if (r5 < r6) goto L_0x0173
            int r6 = r4.d
            int r5 = r5 - r6
            r11.b = r5
        L_0x0173:
            int r5 = r11.d
            int r6 = r4.b
            if (r5 < r6) goto L_0x017e
            int r6 = r4.d
            int r5 = r5 - r6
            r11.d = r5
        L_0x017e:
            int r5 = r11.b
            int r6 = r12.b
            if (r5 < r6) goto L_0x0189
            int r6 = r12.d
            int r5 = r5 - r6
            r11.b = r5
        L_0x0189:
            int r5 = r11.d
            int r6 = r12.b
            if (r5 < r6) goto L_0x0194
            int r6 = r12.d
            int r5 = r5 - r6
            r11.d = r5
        L_0x0194:
            r1.set(r3, r12)
            int r5 = r11.b
            int r6 = r11.d
            if (r5 == r6) goto L_0x01a1
            r1.set(r8, r11)
            goto L_0x01a4
        L_0x01a1:
            r1.remove(r8)
        L_0x01a4:
            if (r4 == 0) goto L_0x000d
            r1.add(r3, r4)
            goto L_0x000d
        L_0x01ab:
            int r4 = r11.d
            int r6 = r12.b
            if (r4 >= r6) goto L_0x01b3
            r5 = r7
            goto L_0x01b4
        L_0x01b3:
            r5 = 0
        L_0x01b4:
            int r7 = r11.b
            if (r7 >= r6) goto L_0x01ba
            int r5 = r5 + 1
        L_0x01ba:
            if (r6 > r7) goto L_0x01c1
            int r6 = r12.d
            int r7 = r7 + r6
            r11.b = r7
        L_0x01c1:
            int r6 = r12.b
            if (r6 > r4) goto L_0x01ca
            int r7 = r12.d
            int r4 = r4 + r7
            r11.d = r4
        L_0x01ca:
            int r6 = r6 + r5
            r12.b = r6
            r1.set(r3, r12)
            r1.set(r8, r11)
            goto L_0x000d
        L_0x01d5:
            int r2 = r1.size()
            r3 = 0
        L_0x01da:
            if (r3 >= r2) goto L_0x02b0
            java.lang.Object r11 = r1.get(r3)
            w8 r11 = (defpackage.w8) r11
            int r12 = r11.a
            if (r12 == r4) goto L_0x02a8
            java.lang.Object r13 = r0.X
            k61 r13 = (defpackage.k61) r13
            if (r12 == r10) goto L_0x024d
            if (r12 == r9) goto L_0x01f7
            if (r12 == r8) goto L_0x01f2
            goto L_0x02ab
        L_0x01f2:
            r0.J(r11)
            goto L_0x02ab
        L_0x01f7:
            int r12 = r11.b
            int r14 = r11.d
            int r14 = r14 + r12
            r15 = r12
            r5 = 0
        L_0x01fe:
            if (r12 >= r14) goto L_0x022e
            dec r16 = r13.b(r12)
            if (r16 != 0) goto L_0x021c
            boolean r16 = r0.k(r12)
            if (r16 == 0) goto L_0x020d
            goto L_0x021c
        L_0x020d:
            if (r7 != r4) goto L_0x021a
            java.lang.Object r7 = r11.c
            w8 r5 = r0.G(r7, r9, r15, r5)
            r0.J(r5)
            r15 = r12
            r5 = 0
        L_0x021a:
            r7 = 0
            goto L_0x022a
        L_0x021c:
            if (r7 != 0) goto L_0x0229
            java.lang.Object r7 = r11.c
            w8 r5 = r0.G(r7, r9, r15, r5)
            r0.x(r5)
            r15 = r12
            r5 = 0
        L_0x0229:
            r7 = r4
        L_0x022a:
            int r5 = r5 + r4
            int r12 = r12 + 1
            goto L_0x01fe
        L_0x022e:
            int r12 = r11.d
            if (r5 == r12) goto L_0x0241
            java.lang.Object r12 = r11.c
            r11.c = r6
            java.lang.Object r13 = r0.b
            u5b r13 = (defpackage.u5b) r13
            r13.e(r11)
            w8 r11 = r0.G(r12, r9, r15, r5)
        L_0x0241:
            if (r7 != 0) goto L_0x0248
            r0.x(r11)
            goto L_0x02ab
        L_0x0248:
            r0.J(r11)
            goto L_0x02ab
        L_0x024d:
            int r5 = r11.b
            int r7 = r11.d
            int r7 = r7 + r5
            r12 = r5
            r14 = 0
            r15 = -1
        L_0x0255:
            if (r12 >= r7) goto L_0x028d
            dec r16 = r13.b(r12)
            if (r16 != 0) goto L_0x0273
            boolean r16 = r0.k(r12)
            if (r16 == 0) goto L_0x0264
            goto L_0x0273
        L_0x0264:
            if (r15 != r4) goto L_0x026f
            w8 r15 = r0.G(r6, r10, r5, r14)
            r0.J(r15)
            r15 = r4
            goto L_0x0270
        L_0x026f:
            r15 = 0
        L_0x0270:
            r16 = 0
            goto L_0x0281
        L_0x0273:
            if (r15 != 0) goto L_0x027e
            w8 r15 = r0.G(r6, r10, r5, r14)
            r0.x(r15)
            r15 = r4
            goto L_0x027f
        L_0x027e:
            r15 = 0
        L_0x027f:
            r16 = r4
        L_0x0281:
            if (r15 == 0) goto L_0x0287
            int r12 = r12 - r14
            int r7 = r7 - r14
            r14 = r4
            goto L_0x0289
        L_0x0287:
            int r14 = r14 + 1
        L_0x0289:
            int r12 = r12 + r4
            r15 = r16
            goto L_0x0255
        L_0x028d:
            int r7 = r11.d
            if (r14 == r7) goto L_0x029e
            r11.c = r6
            java.lang.Object r7 = r0.b
            u5b r7 = (defpackage.u5b) r7
            r7.e(r11)
            w8 r11 = r0.G(r6, r10, r5, r14)
        L_0x029e:
            if (r15 != 0) goto L_0x02a4
            r0.x(r11)
            goto L_0x02ab
        L_0x02a4:
            r0.J(r11)
            goto L_0x02ab
        L_0x02a8:
            r0.J(r11)
        L_0x02ab:
            int r3 = r3 + 1
            r7 = -1
            goto L_0x01da
        L_0x02b0:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x8.K():void");
    }

    public void L(w8 w8Var) {
        w8Var.c = null;
        ((u5b) this.b).e(w8Var);
    }

    public void M(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            L((w8) list.get(i));
        }
        list.clear();
    }

    public void N(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((qh3) this.o) == null) {
                this.o = new qh3(2);
            }
            qh3 qh3 = (qh3) this.o;
            qh3.d = colorStateList;
            qh3.c = true;
        } else {
            this.o = null;
        }
        i();
    }

    public void O(ColorStateList colorStateList) {
        if (((qh3) this.X) == null) {
            this.X = new qh3(2);
        }
        qh3 qh3 = (qh3) this.X;
        qh3.d = colorStateList;
        qh3.c = true;
        i();
    }

    public void P(PorterDuff.Mode mode) {
        if (((qh3) this.X) == null) {
            this.X = new qh3(2);
        }
        qh3 qh3 = (qh3) this.X;
        qh3.e = mode;
        qh3.b = true;
        i();
    }

    public int Q(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.o;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w8 w8Var = (w8) arrayList.get(size);
            int i5 = w8Var.a;
            if (i5 == 8) {
                int i6 = w8Var.b;
                int i7 = w8Var.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            w8Var.b = i6 + 1;
                            w8Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            w8Var.b = i6 - 1;
                            w8Var.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        w8Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        w8Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        w8Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        w8Var.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = w8Var.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= w8Var.d;
                    } else if (i5 == 2) {
                        i += w8Var.d;
                    }
                } else if (i2 == 1) {
                    w8Var.b = i8 + 1;
                } else if (i2 == 2) {
                    w8Var.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            w8 w8Var2 = (w8) arrayList.get(size2);
            if (w8Var2.a == 8) {
                int i9 = w8Var2.d;
                if (i9 == w8Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    w8Var2.c = null;
                    ((u5b) this.b).e(w8Var2);
                }
            } else if (w8Var2.d <= 0) {
                arrayList.remove(size2);
                w8Var2.c = null;
                ((u5b) this.b).e(w8Var2);
            }
        }
        return i;
    }

    public void R(cj6 cj6, String str) {
        if (this.a == 0) {
            eu0 eu0 = (eu0) this.Y;
            eu0.L(str).L(HTTP.CRLF);
            int size = cj6.size();
            for (int i = 0; i < size; i++) {
                eu0.L(cj6.b(i)).L(": ").L(cj6.d(i)).L(HTTP.CRLF);
            }
            eu0.L(HTTP.CRLF);
            this.a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    public yud a(yic yic) {
        if (!mq6.a(yic)) {
            return F(0);
        }
        String a2 = yic.Y.a(org.apache.http.protocol.HTTP.TRANSFER_ENCODING);
        if (a2 == null) {
            a2 = null;
        }
        if (org.apache.http.protocol.HTTP.CHUNK_CODING.equalsIgnoreCase(a2)) {
            vq6 vq6 = yic.a.b;
            if (this.a == 4) {
                this.a = 5;
                return new wo6(this, vq6);
            }
            throw new IllegalStateException(("state: " + this.a).toString());
        }
        long j = naf.j(yic);
        if (j != -1) {
            return F(j);
        }
        if (this.a == 4) {
            this.a = 5;
            ((f8c) this.o).k();
            return new uo6(this);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    public void b() {
        ((eu0) this.Y).flush();
    }

    public ksd c(mhc mhc, long j) {
        tfg tfg = mhc.e;
        if (org.apache.http.protocol.HTTP.CHUNK_CODING.equalsIgnoreCase(mhc.d.a(org.apache.http.protocol.HTTP.TRANSFER_ENCODING))) {
            if (this.a == 1) {
                this.a = 2;
                return new vo6(this);
            }
            throw new IllegalStateException(("state: " + this.a).toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.a == 1) {
            this.a = 2;
            return new gg4(this);
        } else {
            throw new IllegalStateException(("state: " + this.a).toString());
        }
    }

    public void cancel() {
        Socket socket = ((f8c) this.o).b;
        if (socket != null) {
            naf.d(socket);
        }
    }

    public long d(yic yic) {
        if (!mq6.a(yic)) {
            return 0;
        }
        String a2 = yic.Y.a(org.apache.http.protocol.HTTP.TRANSFER_ENCODING);
        if (a2 == null) {
            a2 = null;
        }
        if (org.apache.http.protocol.HTTP.CHUNK_CODING.equalsIgnoreCase(a2)) {
            return -1;
        }
        return naf.j(yic);
    }

    public xic e(boolean z) {
        g03 g03 = (g03) this.b;
        int i = this.a;
        if (i == 1 || i == 3) {
            try {
                String G = ((fu0) g03.c).G(g03.b);
                g03.b -= (long) G.length();
                jn v = xfg.v(G);
                int i2 = v.b;
                xic xic = new xic();
                xic.b = (sob) v.c;
                xic.c = i2;
                xic.d = (String) v.o;
                xic.f = g03.Y().c();
                if (z && i2 == 100) {
                    return null;
                }
                if (i2 == 100) {
                    this.a = 3;
                    return xic;
                }
                this.a = 4;
                return xic;
            } catch (EOFException e) {
                throw new IOException(wg0.i("unexpected end of stream on ", ((f8c) this.o).q.a.a.g()), e);
            }
        } else {
            throw new IllegalStateException(("state: " + this.a).toString());
        }
    }

    public f8c f() {
        return (f8c) this.o;
    }

    public void g(mhc mhc) {
        Proxy.Type type = ((f8c) this.o).q.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(mhc.c);
        sb.append(' ');
        vq6 vq6 = mhc.b;
        if (vq6.a || type != Proxy.Type.HTTP) {
            String b2 = vq6.b();
            String d = vq6.d();
            if (d != null) {
                b2 = b2 + '?' + d;
            }
            sb.append(b2);
        } else {
            sb.append(vq6);
        }
        sb.append(" HTTP/1.1");
        R(mhc.d, sb.toString());
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, z23] */
    public Object get() {
        Range range = ((o90) this.o).a;
        fa0 fa0 = (fa0) this.Y;
        int i = fa0.c;
        n90 n90 = (n90) this.X;
        int E = wmd.E(i, n90.c, fa0.e, n90.b, fa0.d, range);
        ? obj = new Object();
        obj.b = -1;
        String str = (String) this.b;
        if (str != null) {
            obj.a = str;
            obj.b = Integer.valueOf(this.a);
            bue bue = (bue) this.c;
            if (bue != null) {
                obj.c = bue;
                obj.f = Integer.valueOf(n90.c);
                obj.e = Integer.valueOf(n90.b);
                obj.d = Integer.valueOf(E);
                return obj.b();
            }
            throw new NullPointerException("Null inputTimebase");
        }
        throw new NullPointerException("Null mimeType");
    }

    public void h() {
        ((eu0) this.Y).flush();
    }

    public void i() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((qh3) this.o) != null) {
                if (((qh3) this.Y) == null) {
                    this.Y = new qh3(2);
                }
                qh3 qh3 = (qh3) this.Y;
                qh3.d = null;
                qh3.c = false;
                qh3.e = null;
                qh3.b = false;
                WeakHashMap weakHashMap = zmf.a;
                ColorStateList g = omf.g(view);
                if (g != null) {
                    qh3.c = true;
                    qh3.d = g;
                }
                PorterDuff.Mode h = omf.h(view);
                if (h != null) {
                    qh3.b = true;
                    qh3.e = h;
                }
                if (qh3.c || qh3.b) {
                    gn.e(background, qh3, view.getDrawableState());
                    return;
                }
            }
            qh3 qh32 = (qh3) this.X;
            if (qh32 != null) {
                gn.e(background, qh32, view.getDrawableState());
                return;
            }
            qh3 qh33 = (qh3) this.o;
            if (qh33 != null) {
                gn.e(background, qh33, view.getDrawableState());
            }
        }
    }

    public x8 j(r6d r6d) {
        x8 x8Var;
        ja7 ja7 = (ja7) this.b;
        g9g G = fp3.G(ja7, r6d);
        l0f l0f = (l0f) this.o;
        jn jnVar = (jn) l0f.o;
        int i = jnVar.b + 1;
        jnVar.b = i;
        Object[] objArr = (Object[]) jnVar.c;
        if (i == objArr.length) {
            int i2 = i * 2;
            jnVar.c = Arrays.copyOf(objArr, i2);
            jnVar.o = Arrays.copyOf((int[]) jnVar.o, i2);
        }
        ((Object[]) jnVar.c)[i] = r6d;
        l0f.m(G.a);
        if (l0f.N() != 4) {
            int ordinal = G.ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                x8Var = new x8((ja7) this.b, G, (l0f) this.o, r6d, (sw0) null);
            } else if (((g9g) this.c) == G && ja7.a.f) {
                return this;
            } else {
                x8Var = new x8((ja7) this.b, G, (l0f) this.o, r6d, (sw0) null);
            }
            return x8Var;
        }
        l0f.u(l0f, "Unexpected leading comma", 0, (String) null, 6);
        throw null;
    }

    public boolean k(int i) {
        ArrayList arrayList = (ArrayList) this.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            w8 w8Var = (w8) arrayList.get(i2);
            int i3 = w8Var.a;
            if (i3 == 8) {
                if (A(w8Var.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = w8Var.b;
                int i5 = w8Var.d + i4;
                while (i4 < i5) {
                    if (A(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((k61) this.X).a((w8) arrayList.get(i));
        }
        M(arrayList);
        this.a = 0;
    }

    public void m() {
        l();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            w8 w8Var = (w8) arrayList.get(i);
            int i2 = w8Var.a;
            k61 k61 = (k61) this.X;
            if (i2 == 1) {
                k61.a(w8Var);
                k61.d(w8Var.b, w8Var.d);
            } else if (i2 == 2) {
                k61.a(w8Var);
                int i3 = w8Var.b;
                int i4 = w8Var.d;
                RecyclerView recyclerView = k61.a;
                recyclerView.d0(i3, i4, true);
                recyclerView.v1 = true;
                recyclerView.s1.d += i4;
            } else if (i2 == 4) {
                k61.a(w8Var);
                k61.c(w8Var.b, w8Var.d, w8Var.c);
            } else if (i2 == 8) {
                k61.a(w8Var);
                k61.e(w8Var.b, w8Var.d);
            }
        }
        M(arrayList);
        this.a = 0;
    }

    public boolean n() {
        boolean z;
        boolean z2;
        l0f l0f = (l0f) this.o;
        int T = l0f.T();
        String str = (String) l0f.c;
        if (T != str.length()) {
            if (str.charAt(T) == '\"') {
                T++;
                z = true;
            } else {
                z = false;
            }
            int P = l0f.P(T);
            if (P >= str.length() || P == -1) {
                l0f.u(l0f, "EOF", 0, (String) null, 6);
                throw null;
            }
            int i = P + 1;
            char charAt = str.charAt(P) | ' ';
            if (charAt == 'f') {
                l0f.j(i, "alse");
                z2 = false;
            } else if (charAt == 't') {
                l0f.j(i, "rue");
                z2 = true;
            } else {
                l0f.u(l0f, "Expected valid boolean literal prefix, but had '" + l0f.o() + '\'', 0, (String) null, 6);
                throw null;
            }
            if (z) {
                if (l0f.b == str.length()) {
                    l0f.u(l0f, "EOF", 0, (String) null, 6);
                    throw null;
                } else if (str.charAt(l0f.b) == '\"') {
                    l0f.b++;
                } else {
                    l0f.u(l0f, "Expected closing quotation mark", 0, (String) null, 6);
                    throw null;
                }
            }
            return z2;
        }
        l0f.u(l0f, "EOF", 0, (String) null, 6);
        throw null;
    }

    public boolean o(r6d r6d, int i) {
        return n();
    }

    public int p(r6d r6d) {
        qa7 qa7;
        int j;
        boolean z;
        boolean z2;
        boolean z3;
        String O;
        r6d r6d2 = r6d;
        g9g g9g = (g9g) this.c;
        int ordinal = g9g.ordinal();
        l0f l0f = (l0f) this.o;
        boolean z4 = true;
        int i = 0;
        Throwable th = null;
        char c2 = ':';
        ja7 ja7 = (ja7) this.b;
        int i2 = -1;
        if (ordinal == 0) {
            boolean U = l0f.U();
            while (true) {
                boolean i3 = l0f.i();
                qa7 = (qa7) this.Y;
                if (i3) {
                    la7 la7 = (la7) this.X;
                    String p = la7.c ? l0f.p() : l0f.k();
                    l0f.m(c2);
                    j = tu0.j(r6d2, ja7, p);
                    boolean z5 = la7.c;
                    if (j != -3) {
                        if (!la7.h) {
                            break;
                        }
                        boolean j2 = r6d2.j(j);
                        r6d i4 = r6d2.i(j);
                        if (!j2 || i4.c() || !l0f.V(z4)) {
                            if (!tpa.f(i4.e(), w6d.f) || ((i4.c() && l0f.V(false)) || (O = l0f.O(z5)) == null)) {
                                break;
                            }
                            int j3 = tu0.j(i4, ja7, O);
                            boolean z6 = !ja7.a.f && i4.c();
                            if (j3 != -3 || (!j2 && !z6)) {
                                break;
                            }
                            l0f.n();
                        }
                        z = l0f.U();
                        z2 = false;
                    } else {
                        z = false;
                        z2 = true;
                    }
                    if (z2) {
                        boolean z7 = la7.b;
                        String str = (String) l0f.c;
                        if (z7) {
                            ArrayList arrayList = new ArrayList();
                            byte N = l0f.N();
                            if (N == 8 || N == 6) {
                                while (true) {
                                    byte N2 = l0f.N();
                                    z3 = true;
                                    if (N2 != 1) {
                                        if (N2 == 8 || N2 == 6) {
                                            arrayList.add(Byte.valueOf(N2));
                                        } else {
                                            jn jnVar = (jn) l0f.o;
                                            if (N2 == 9) {
                                                if (((Number) x53.p0(arrayList)).byteValue() == 8) {
                                                    d63.Z(arrayList);
                                                } else {
                                                    throw xfg.b("found ] instead of } at path: " + jnVar, str, l0f.b);
                                                }
                                            } else if (N2 == 7) {
                                                if (((Number) x53.p0(arrayList)).byteValue() == 6) {
                                                    d63.Z(arrayList);
                                                } else {
                                                    throw xfg.b("found } instead of ] at path: " + jnVar, str, l0f.b);
                                                }
                                            } else if (N2 == 10) {
                                                l0f.u(l0f, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, (String) null, 6);
                                                throw null;
                                            }
                                        }
                                        l0f.l();
                                        if (arrayList.size() == 0) {
                                            break;
                                        }
                                    } else if (z5) {
                                        l0f.o();
                                    } else {
                                        l0f.k();
                                    }
                                }
                            } else {
                                l0f.o();
                                z3 = true;
                            }
                            U = l0f.U();
                            z4 = z3;
                        } else {
                            l0f.t(w9e.F0(p, str.subSequence(0, l0f.b).toString(), 6), "Encountered an unknown key '" + p + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw null;
                        }
                    } else {
                        U = z;
                        z4 = true;
                    }
                    th = null;
                    c2 = ':';
                } else if (!U || ja7.a.n) {
                    if (qa7 != null) {
                        bw4 bw4 = qa7.a;
                        r6d r6d3 = (r6d) bw4.b;
                        int f = r6d3.f();
                        while (true) {
                            long j4 = bw4.a;
                            long j5 = -1;
                            int i5 = (j4 > -1 ? 1 : (j4 == -1 ? 0 : -1));
                            a66 a66 = (a66) bw4.c;
                            if (i5 != 0) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j4);
                                bw4.a |= 1 << numberOfTrailingZeros;
                                if (((Boolean) a66.invoke(r6d3, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i2 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (f > 64) {
                                long[] jArr = (long[]) bw4.o;
                                int length = jArr.length;
                                loop3:
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    int i6 = i + 1;
                                    int i7 = i6 * 64;
                                    long j6 = jArr[i];
                                    while (j6 != j5) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j6);
                                        j6 |= 1 << numberOfTrailingZeros2;
                                        int i8 = numberOfTrailingZeros2 + i7;
                                        if (((Boolean) a66.invoke(r6d3, Integer.valueOf(i8))).booleanValue()) {
                                            jArr[i] = j6;
                                            i2 = i8;
                                            break loop3;
                                        }
                                        j5 = -1;
                                    }
                                    jArr[i] = j6;
                                    i = i6;
                                    j5 = -1;
                                }
                            }
                        }
                    }
                    i2 = -1;
                } else {
                    xfg.r(l0f);
                    throw th;
                }
            }
            if (qa7 != null) {
                bw4 bw42 = qa7.a;
                if (j < 64) {
                    bw42.a |= 1 << j;
                } else {
                    int i9 = (j >>> 6) - 1;
                    long[] jArr2 = (long[]) bw42.o;
                    jArr2[i9] = jArr2[i9] | (1 << (j & 63));
                }
            }
            i2 = j;
        } else if (ordinal != 2) {
            boolean U2 = l0f.U();
            if (l0f.i()) {
                int i10 = this.a;
                if (i10 == -1 || U2) {
                    i2 = i10 + 1;
                    this.a = i2;
                } else {
                    l0f.u(l0f, "Expected end of the array or comma", 0, (String) null, 6);
                    throw null;
                }
            } else if (U2 && !ja7.a.n) {
                xfg.q(l0f, "array");
                throw null;
            }
        } else {
            int i11 = this.a;
            boolean z8 = i11 % 2 != 0;
            if (!z8) {
                l0f.m(':');
            } else if (i11 != -1) {
                i = l0f.U();
            }
            if (l0f.i()) {
                if (z8) {
                    if (this.a == -1) {
                        int i12 = i ^ 1;
                        int i13 = l0f.b;
                        if (i12 == 0) {
                            l0f.u(l0f, "Unexpected leading comma", i13, (String) null, 4);
                            throw null;
                        }
                    } else {
                        int i14 = l0f.b;
                        if (i == 0) {
                            l0f.u(l0f, "Expected comma after the key-value pair", i14, (String) null, 4);
                            throw null;
                        }
                    }
                }
                i2 = this.a + 1;
                this.a = i2;
            } else if (i != 0 && !ja7.a.n) {
                xfg.r(l0f);
                throw null;
            }
        }
        if (g9g != g9g.MAP) {
            jn jnVar2 = (jn) l0f.o;
            ((int[]) jnVar2.o)[jnVar2.b] = i2;
        }
        return i2;
    }

    public int q(r6d r6d) {
        return tu0.k(r6d, (ja7) this.b, v(), " at path ".concat(((jn) ((l0f) this.o).o).u()));
    }

    public boolean r() {
        qa7 qa7 = (qa7) this.Y;
        return !(qa7 != null ? qa7.b : false) && !((l0f) this.o).V(true);
    }

    public Object s(r6d r6d, int i, String str) {
        s9e s9e = s9e.a;
        s9e s9e2 = s9e.a;
        if (r()) {
            return u(s9e);
        }
        return null;
    }

    public Object t(r6d r6d, int i, cc7 cc7, Object obj) {
        boolean z = ((g9g) this.c) == g9g.MAP && (i & 1) == 0;
        l0f l0f = (l0f) this.o;
        if (z) {
            jn jnVar = (jn) l0f.o;
            int i2 = jnVar.b;
            if (((int[]) jnVar.o)[i2] == -2) {
                ((Object[]) jnVar.c)[i2] = nd2.X;
            }
        }
        Object u = u(cc7);
        if (z) {
            jn jnVar2 = (jn) l0f.o;
            int i3 = jnVar2.b;
            if (((int[]) jnVar2.o)[i3] != -2) {
                int i4 = i3 + 1;
                jnVar2.b = i4;
                Object[] objArr = (Object[]) jnVar2.c;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    jnVar2.c = Arrays.copyOf(objArr, i5);
                    jnVar2.o = Arrays.copyOf((int[]) jnVar2.o, i5);
                }
            }
            int i6 = jnVar2.b;
            ((Object[]) jnVar2.c)[i6] = u;
            ((int[]) jnVar2.o)[i6] = -2;
        }
        return u;
    }

    public Object u(cc7 cc7) {
        try {
            return cc7.a(this);
        } catch (MissingFieldException e) {
            if (w9e.p0(e.getMessage(), "at path", false)) {
                throw e;
            }
            throw new MissingFieldException((ArrayList) e.a, e.getMessage() + " at path: " + ((jn) ((l0f) this.o).o).u(), e);
        }
    }

    public String v() {
        boolean z = ((la7) this.X).c;
        l0f l0f = (l0f) this.o;
        return z ? l0f.p() : l0f.n();
    }

    public String w(r6d r6d, int i) {
        return v();
    }

    public void x(w8 w8Var) {
        int i;
        int i2 = w8Var.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int Q = Q(w8Var.b, i2);
        int i3 = w8Var.b;
        int i4 = w8Var.a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + w8Var);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < w8Var.d; i6++) {
            int Q2 = Q((i * i6) + w8Var.b, w8Var.a);
            int i7 = w8Var.a;
            if (i7 == 2 ? Q2 != Q : !(i7 == 4 && Q2 == Q + 1)) {
                w8 G = G(w8Var.c, i7, Q, i5);
                y(G, i3);
                G.c = null;
                ((u5b) this.b).e(G);
                if (w8Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                Q = Q2;
            } else {
                i5++;
            }
        }
        Object obj = w8Var.c;
        w8Var.c = null;
        ((u5b) this.b).e(w8Var);
        if (i5 > 0) {
            w8 G2 = G(obj, w8Var.a, Q, i5);
            y(G2, i3);
            G2.c = null;
            ((u5b) this.b).e(G2);
        }
    }

    public void y(w8 w8Var, int i) {
        k61 k61 = (k61) this.X;
        k61.a(w8Var);
        int i2 = w8Var.a;
        if (i2 == 2) {
            int i3 = w8Var.d;
            RecyclerView recyclerView = k61.a;
            recyclerView.d0(i, i3, true);
            recyclerView.v1 = true;
            recyclerView.s1.d += i3;
        } else if (i2 == 4) {
            k61.c(i, w8Var.d, w8Var.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(defpackage.r6d r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            ja7 r0 = (defpackage.ja7) r0
            la7 r1 = r0.a
            boolean r1 = r1.b
            r2 = -1
            if (r1 == 0) goto L_0x0017
            int r1 = r5.f()
            if (r1 != 0) goto L_0x0017
        L_0x0011:
            int r1 = r4.p(r5)
            if (r1 != r2) goto L_0x0011
        L_0x0017:
            java.lang.Object r5 = r4.o
            l0f r5 = (defpackage.l0f) r5
            boolean r1 = r5.U()
            if (r1 == 0) goto L_0x002f
            la7 r0 = r0.a
            boolean r0 = r0.n
            if (r0 == 0) goto L_0x0028
            goto L_0x002f
        L_0x0028:
            java.lang.String r4 = ""
            defpackage.xfg.q(r5, r4)
            r4 = 0
            throw r4
        L_0x002f:
            java.lang.Object r4 = r4.c
            g9g r4 = (defpackage.g9g) r4
            char r4 = r4.b
            r5.m(r4)
            java.lang.Object r4 = r5.o
            jn r4 = (defpackage.jn) r4
            int r5 = r4.b
            java.lang.Object r0 = r4.o
            int[] r0 = (int[]) r0
            r1 = r0[r5]
            r3 = -2
            if (r1 != r3) goto L_0x004c
            r0[r5] = r2
            int r5 = r5 + r2
            r4.b = r5
        L_0x004c:
            int r5 = r4.b
            if (r5 == r2) goto L_0x0053
            int r5 = r5 + r2
            r4.b = r5
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x8.z(r6d):void");
    }

    public x8(View view) {
        this.a = -1;
        this.b = view;
        this.c = gn.a();
    }

    public x8(String str, int i, o90 o90, n90 n90, fa0 fa0) {
        bue bue = bue.a;
        this.b = str;
        this.a = i;
        this.c = bue;
        this.o = o90;
        this.X = n90;
        this.Y = fa0;
    }

    public x8(u2a u2a, f8c f8c, fu0 fu0, eu0 eu0) {
        this.c = u2a;
        this.o = f8c;
        this.X = fu0;
        this.Y = eu0;
        this.b = new g03(fu0);
    }

    public x8(k61 k61) {
        this.b = new u5b(30);
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.a = 0;
        this.X = k61;
        this.Y = new y8((Object) this);
    }
}
