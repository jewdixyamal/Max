package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: f77  reason: default package */
public class f77 extends ndc implements qdc {
    public final ArrayList A0 = new ArrayList();
    public int B0;
    public RecyclerView C0;
    public final q57 D0 = new q57(1, this);
    public VelocityTracker E0;
    public ArrayList F0;
    public ArrayList G0;
    public View H0 = null;
    public fd7 I0;
    public d77 J0;
    public final k71 K0 = new k71(1, this);
    public Rect L0;
    public long M0;
    public float X;
    public float Y;
    public float Z;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public dec c = null;
    public float o;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public int w0 = -1;
    public final e77 x0;
    public int y0 = 0;
    public int z0;

    public f77(e77 e77) {
        this.x0 = e77;
    }

    public static boolean p(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final void b(View view) {
        r(view);
        dec T = this.C0.T(view);
        if (T != null) {
            dec dec = this.c;
            if (dec == null || T != dec) {
                m(T, false);
                if (this.a.remove(T.a)) {
                    this.x0.a(this.C0, T);
                    return;
                }
                return;
            }
            s((dec) null, 0);
        }
    }

    public final void d(View view) {
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        rect.setEmpty();
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, zdc zdc) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        dec dec = this.c;
        ArrayList arrayList = this.A0;
        int i = this.y0;
        e77 e77 = this.x0;
        e77.getClass();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            b77 b77 = (b77) arrayList.get(i2);
            float f4 = b77.a;
            float f5 = b77.c;
            int i3 = (f4 > f5 ? 1 : (f4 == f5 ? 0 : -1));
            dec dec2 = b77.e;
            if (i3 == 0) {
                b77.i = dec2.a.getTranslationX();
            } else {
                b77.i = z7b.f(f5, f4, b77.m, f4);
            }
            float f6 = b77.b;
            float f7 = b77.d;
            if (f6 == f7) {
                b77.j = dec2.a.getTranslationY();
            } else {
                b77.j = z7b.f(f7, f6, b77.m, f6);
            }
            int save = canvas.save();
            ArrayList arrayList2 = arrayList;
            e77.h(canvas, recyclerView, b77.e, b77.i, b77.j, b77.f, false);
            canvas2.restoreToCount(save);
            i2++;
            arrayList = arrayList2;
        }
        if (dec != null) {
            int save2 = canvas.save();
            e77.h(canvas, recyclerView, dec, f2, f, i, true);
            canvas2.restoreToCount(save2);
        }
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        dec dec = this.c;
        ArrayList arrayList = this.A0;
        this.x0.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            int save = canvas.save();
            View view = ((b77) arrayList.get(i)).e.a;
            canvas.restoreToCount(save);
        }
        if (dec != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            b77 b77 = (b77) arrayList.get(i2);
            boolean z2 = b77.l;
            if (z2 && !b77.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.C0;
        if (recyclerView2 != recyclerView) {
            k71 k71 = this.K0;
            if (recyclerView2 != null) {
                recyclerView2.p0(this);
                this.C0.r0(k71);
                this.C0.q0(this);
                ArrayList arrayList = this.A0;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    b77 b77 = (b77) arrayList.get(0);
                    b77.g.cancel();
                    this.x0.a(this.C0, b77.e);
                }
                arrayList.clear();
                this.H0 = null;
                VelocityTracker velocityTracker = this.E0;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.E0 = null;
                }
                d77 d77 = this.J0;
                if (d77 != null) {
                    d77.a = false;
                    this.J0 = null;
                }
                if (this.I0 != null) {
                    this.I0 = null;
                }
            }
            this.C0 = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.Y = resources.getDimension(rtb.item_touch_helper_swipe_escape_velocity);
                this.Z = resources.getDimension(rtb.item_touch_helper_swipe_escape_max_velocity);
                this.B0 = ViewConfiguration.get(this.C0.getContext()).getScaledTouchSlop();
                this.C0.j(this);
                this.C0.l(k71);
                this.C0.k(this);
                this.J0 = new d77(this);
                this.I0 = new fd7(this.C0.getContext(), (GestureDetector.OnGestureListener) this.J0);
            }
        }
    }

    public final int j(dec dec, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 4;
        int i3 = this.s0 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.E0;
        e77 e77 = this.x0;
        if (velocityTracker != null && this.w0 > -1) {
            float f = this.Z;
            e77.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.E0.getXVelocity(this.w0);
            float yVelocity = this.E0.getYVelocity(this.w0);
            if (xVelocity > 0.0f) {
                i2 = 8;
            }
            float abs = Math.abs(xVelocity);
            if ((i2 & i) != 0 && i3 == i2 && abs >= e77.d(this.Y) && abs > Math.abs(yVelocity)) {
                return i2;
            }
        }
        float e = e77.e() * ((float) this.C0.getWidth());
        if ((i & i3) == 0 || Math.abs(this.s0) <= e) {
            return 0;
        }
        return i3;
    }

    public final void k(int i, int i2, MotionEvent motionEvent) {
        View n;
        if (this.c == null && i == 2 && this.y0 != 2) {
            e77 e77 = this.x0;
            if (e77.g() && this.C0.getScrollState() != 1) {
                a layoutManager = this.C0.getLayoutManager();
                int i3 = this.w0;
                dec dec = null;
                if (i3 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i3);
                    float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.o);
                    float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.X);
                    float f = (float) this.B0;
                    if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.e()) && ((abs2 <= abs || !layoutManager.f()) && (n = n(motionEvent)) != null))) {
                        dec = this.C0.T(n);
                    }
                }
                if (dec != null) {
                    RecyclerView recyclerView = this.C0;
                    int i4 = e77.b;
                    int i5 = e77.c;
                    int i6 = i4 | i5;
                    int i7 = (i5 << 16) | (i4 << 8) | i6;
                    WeakHashMap weakHashMap = zmf.a;
                    int b2 = (e77.b(i7, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (b2 != 0) {
                        float x = motionEvent.getX(i2);
                        float y = motionEvent.getY(i2);
                        float f2 = x - this.o;
                        float f3 = y - this.X;
                        float abs3 = Math.abs(f2);
                        float abs4 = Math.abs(f3);
                        float f4 = (float) this.B0;
                        if (abs3 >= f4 || abs4 >= f4) {
                            if (abs3 > abs4) {
                                if (f2 < 0.0f && (b2 & 4) == 0) {
                                    return;
                                }
                                if (f2 > 0.0f && (b2 & 8) == 0) {
                                    return;
                                }
                            } else if (f3 < 0.0f && (b2 & 1) == 0) {
                                return;
                            } else {
                                if (f3 > 0.0f && (b2 & 2) == 0) {
                                    return;
                                }
                            }
                            this.t0 = 0.0f;
                            this.s0 = 0.0f;
                            this.w0 = motionEvent.getPointerId(0);
                            s(dec, 1);
                        }
                    }
                }
            }
        }
    }

    public final int l(dec dec, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 1;
        int i3 = this.t0 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.E0;
        e77 e77 = this.x0;
        if (velocityTracker != null && this.w0 > -1) {
            float f = this.Z;
            e77.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.E0.getXVelocity(this.w0);
            float yVelocity = this.E0.getYVelocity(this.w0);
            if (yVelocity > 0.0f) {
                i2 = 2;
            }
            float abs = Math.abs(yVelocity);
            if ((i2 & i) != 0 && i2 == i3 && abs >= e77.d(this.Y) && abs > Math.abs(xVelocity)) {
                return i2;
            }
        }
        float e = e77.e() * ((float) this.C0.getHeight());
        if ((i & i3) == 0 || Math.abs(this.t0) <= e) {
            return 0;
        }
        return i3;
    }

    public final void m(dec dec, boolean z) {
        ArrayList arrayList = this.A0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b77 b77 = (b77) arrayList.get(size);
            if (b77.e == dec) {
                b77.k |= z;
                if (!b77.l) {
                    b77.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        dec dec = this.c;
        if (dec != null) {
            View view = dec.a;
            if (p(view, x, y, this.u0 + this.s0, this.v0 + this.t0)) {
                return view;
            }
        }
        ArrayList arrayList = this.A0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b77 b77 = (b77) arrayList.get(size);
            View view2 = b77.e.a;
            if (p(view2, x, y, b77.i, b77.j)) {
                return view2;
            }
        }
        return this.C0.H(x, y);
    }

    public final void o(float[] fArr) {
        if ((this.z0 & 12) != 0) {
            fArr[0] = (this.u0 + this.s0) - ((float) this.c.a.getLeft());
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.z0 & 3) != 0) {
            fArr[1] = (this.v0 + this.t0) - ((float) this.c.a.getTop());
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: dec} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(defpackage.dec r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            androidx.recyclerview.widget.RecyclerView r2 = r0.C0
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L_0x000d
            return
        L_0x000d:
            int r2 = r0.y0
            r3 = 2
            if (r2 == r3) goto L_0x0013
            return
        L_0x0013:
            e77 r2 = r0.x0
            r2.getClass()
            float r4 = r0.u0
            float r5 = r0.s0
            float r4 = r4 + r5
            int r4 = (int) r4
            float r5 = r0.v0
            float r6 = r0.t0
            float r5 = r5 + r6
            int r5 = (int) r5
            android.view.View r6 = r1.a
            int r6 = r6.getTop()
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            float r6 = (float) r6
            android.view.View r7 = r1.a
            int r8 = r7.getHeight()
            float r8 = (float) r8
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0055
            int r6 = r7.getLeft()
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            float r6 = (float) r6
            int r8 = r7.getWidth()
            float r8 = (float) r8
            float r8 = r8 * r9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0055
            return
        L_0x0055:
            java.util.ArrayList r6 = r0.F0
            if (r6 != 0) goto L_0x0068
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.F0 = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.G0 = r6
            goto L_0x0070
        L_0x0068:
            r6.clear()
            java.util.ArrayList r6 = r0.G0
            r6.clear()
        L_0x0070:
            float r6 = r0.u0
            float r8 = r0.s0
            float r6 = r6 + r8
            int r6 = java.lang.Math.round(r6)
            float r8 = r0.v0
            float r9 = r0.t0
            float r8 = r8 + r9
            int r8 = java.lang.Math.round(r8)
            int r9 = r7.getWidth()
            int r9 = r9 + r6
            int r10 = r7.getHeight()
            int r10 = r10 + r8
            int r11 = r6 + r9
            int r11 = r11 / r3
            int r12 = r8 + r10
            int r12 = r12 / r3
            androidx.recyclerview.widget.RecyclerView r13 = r0.C0
            androidx.recyclerview.widget.a r13 = r13.getLayoutManager()
            int r14 = r13.w()
            r15 = 0
        L_0x009d:
            if (r15 >= r14) goto L_0x0146
            android.view.View r3 = r13.v(r15)
            if (r3 != r7) goto L_0x00b1
            r19 = r6
            r20 = r8
            r21 = r9
            r18 = r13
        L_0x00ad:
            r17 = 2
            goto L_0x0138
        L_0x00b1:
            r18 = r13
            int r13 = r3.getBottom()
            if (r13 < r8) goto L_0x00cb
            int r13 = r3.getTop()
            if (r13 > r10) goto L_0x00cb
            int r13 = r3.getRight()
            if (r13 < r6) goto L_0x00cb
            int r13 = r3.getLeft()
            if (r13 <= r9) goto L_0x00d2
        L_0x00cb:
            r19 = r6
            r20 = r8
            r21 = r9
            goto L_0x00ad
        L_0x00d2:
            androidx.recyclerview.widget.RecyclerView r13 = r0.C0
            dec r13 = r13.T(r3)
            int r19 = r3.getLeft()
            int r20 = r3.getRight()
            int r20 = r20 + r19
            r17 = 2
            int r20 = r20 / 2
            int r19 = r11 - r20
            int r19 = java.lang.Math.abs(r19)
            int r20 = r3.getTop()
            int r3 = r3.getBottom()
            int r3 = r3 + r20
            int r3 = r3 / 2
            int r3 = r12 - r3
            int r3 = java.lang.Math.abs(r3)
            int r19 = r19 * r19
            int r3 = r3 * r3
            int r3 = r3 + r19
            r19 = r6
            java.util.ArrayList r6 = r0.F0
            int r6 = r6.size()
            r20 = r8
            r21 = r9
            r8 = 0
            r9 = 0
        L_0x0111:
            if (r8 >= r6) goto L_0x012a
            r22 = r6
            java.util.ArrayList r6 = r0.G0
            java.lang.Object r6 = r6.get(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r3 <= r6) goto L_0x012a
            int r9 = r9 + 1
            int r8 = r8 + 1
            r6 = r22
            goto L_0x0111
        L_0x012a:
            java.util.ArrayList r6 = r0.F0
            r6.add(r9, r13)
            java.util.ArrayList r6 = r0.G0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.add(r9, r3)
        L_0x0138:
            int r15 = r15 + 1
            r3 = r17
            r13 = r18
            r6 = r19
            r8 = r20
            r9 = r21
            goto L_0x009d
        L_0x0146:
            java.util.ArrayList r3 = r0.F0
            int r6 = r3.size()
            if (r6 != 0) goto L_0x014f
            return
        L_0x014f:
            int r6 = r7.getWidth()
            int r6 = r6 + r4
            int r8 = r7.getHeight()
            int r8 = r8 + r5
            int r9 = r7.getLeft()
            int r9 = r4 - r9
            int r10 = r7.getTop()
            int r10 = r5 - r10
            int r11 = r3.size()
            r13 = 0
            r14 = -1
            r15 = 0
        L_0x016c:
            if (r15 >= r11) goto L_0x0209
            java.lang.Object r16 = r3.get(r15)
            r12 = r16
            dec r12 = (defpackage.dec) r12
            r16 = r3
            if (r9 <= 0) goto L_0x019f
            android.view.View r3 = r12.a
            int r3 = r3.getRight()
            int r3 = r3 - r6
            r18 = r6
            if (r3 >= 0) goto L_0x019c
            android.view.View r6 = r12.a
            int r6 = r6.getRight()
            r19 = r11
            int r11 = r7.getRight()
            if (r6 <= r11) goto L_0x01a2
            int r3 = java.lang.Math.abs(r3)
            if (r3 <= r14) goto L_0x01a2
            r14 = r3
            r13 = r12
            goto L_0x01a2
        L_0x019c:
            r19 = r11
            goto L_0x01a2
        L_0x019f:
            r18 = r6
            goto L_0x019c
        L_0x01a2:
            if (r9 >= 0) goto L_0x01c1
            android.view.View r3 = r12.a
            int r3 = r3.getLeft()
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x01c1
            android.view.View r6 = r12.a
            int r6 = r6.getLeft()
            int r11 = r7.getLeft()
            if (r6 >= r11) goto L_0x01c1
            int r3 = java.lang.Math.abs(r3)
            if (r3 <= r14) goto L_0x01c1
            r14 = r3
            r13 = r12
        L_0x01c1:
            if (r10 >= 0) goto L_0x01e0
            android.view.View r3 = r12.a
            int r3 = r3.getTop()
            int r3 = r3 - r5
            if (r3 <= 0) goto L_0x01e0
            android.view.View r6 = r12.a
            int r6 = r6.getTop()
            int r11 = r7.getTop()
            if (r6 >= r11) goto L_0x01e0
            int r3 = java.lang.Math.abs(r3)
            if (r3 <= r14) goto L_0x01e0
            r14 = r3
            r13 = r12
        L_0x01e0:
            if (r10 <= 0) goto L_0x01ff
            android.view.View r3 = r12.a
            int r3 = r3.getBottom()
            int r3 = r3 - r8
            if (r3 >= 0) goto L_0x01ff
            android.view.View r6 = r12.a
            int r6 = r6.getBottom()
            int r11 = r7.getBottom()
            if (r6 <= r11) goto L_0x01ff
            int r3 = java.lang.Math.abs(r3)
            if (r3 <= r14) goto L_0x01ff
            r14 = r3
            r13 = r12
        L_0x01ff:
            int r15 = r15 + 1
            r3 = r16
            r6 = r18
            r11 = r19
            goto L_0x016c
        L_0x0209:
            if (r13 != 0) goto L_0x0216
            java.util.ArrayList r1 = r0.F0
            r1.clear()
            java.util.ArrayList r0 = r0.G0
            r0.clear()
            return
        L_0x0216:
            int r3 = r13.g()
            r24.g()
            boolean r1 = r2.i(r1, r13)
            if (r1 == 0) goto L_0x02e2
            androidx.recyclerview.widget.RecyclerView r0 = r0.C0
            androidx.recyclerview.widget.a r1 = r0.getLayoutManager()
            boolean r2 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            android.view.View r4 = r13.a
            if (r2 == 0) goto L_0x0298
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            java.lang.String r0 = "Cannot drop a view during a scroll or layout calculation"
            r1.c(r0)
            r1.R0()
            r1.l1()
            int r0 = androidx.recyclerview.widget.a.M(r7)
            int r2 = androidx.recyclerview.widget.a.M(r4)
            r3 = 1
            if (r0 >= r2) goto L_0x0249
            r0 = r3
            goto L_0x024a
        L_0x0249:
            r0 = -1
        L_0x024a:
            boolean r5 = r1.u
            if (r5 == 0) goto L_0x027a
            if (r0 != r3) goto L_0x0269
            ga7 r0 = r1.r
            int r0 = r0.h()
            ga7 r3 = r1.r
            int r3 = r3.f(r4)
            ga7 r4 = r1.r
            int r4 = r4.d(r7)
            int r4 = r4 + r3
            int r0 = r0 - r4
            r1.n1(r2, r0)
            goto L_0x02e2
        L_0x0269:
            ga7 r0 = r1.r
            int r0 = r0.h()
            ga7 r3 = r1.r
            int r3 = r3.c(r4)
            int r0 = r0 - r3
            r1.n1(r2, r0)
            goto L_0x02e2
        L_0x027a:
            r3 = -1
            if (r0 != r3) goto L_0x0287
            ga7 r0 = r1.r
            int r0 = r0.f(r4)
            r1.n1(r2, r0)
            goto L_0x02e2
        L_0x0287:
            ga7 r0 = r1.r
            int r0 = r0.c(r4)
            ga7 r3 = r1.r
            int r3 = r3.d(r7)
            int r0 = r0 - r3
            r1.n1(r2, r0)
            goto L_0x02e2
        L_0x0298:
            boolean r2 = r1.e()
            if (r2 == 0) goto L_0x02bd
            int r2 = androidx.recyclerview.widget.a.B(r4)
            int r5 = r0.getPaddingLeft()
            if (r2 > r5) goto L_0x02ab
            r0.x0(r3)
        L_0x02ab:
            int r2 = androidx.recyclerview.widget.a.E(r4)
            int r5 = r0.getWidth()
            int r6 = r0.getPaddingRight()
            int r5 = r5 - r6
            if (r2 < r5) goto L_0x02bd
            r0.x0(r3)
        L_0x02bd:
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x02e2
            int r1 = androidx.recyclerview.widget.a.F(r4)
            int r2 = r0.getPaddingTop()
            if (r1 > r2) goto L_0x02d0
            r0.x0(r3)
        L_0x02d0:
            int r1 = androidx.recyclerview.widget.a.z(r4)
            int r2 = r0.getHeight()
            int r4 = r0.getPaddingBottom()
            int r2 = r2 - r4
            if (r1 < r2) goto L_0x02e2
            r0.x0(r3)
        L_0x02e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f77.q(dec):void");
    }

    public final void r(View view) {
        if (view == this.H0) {
            this.H0 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (r2 > 0) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(defpackage.dec r23, int r24) {
        /*
            r22 = this;
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = 8
            dec r0 = r10.c
            if (r11 != r0) goto L_0x0011
            int r0 = r10.y0
            if (r12 != r0) goto L_0x0011
            return
        L_0x0011:
            r0 = -9223372036854775808
            r10.M0 = r0
            int r3 = r10.y0
            r14 = 1
            r10.m(r11, r14)
            r10.y0 = r12
            r15 = 2
            if (r12 != r15) goto L_0x002f
            if (r11 == 0) goto L_0x0027
            android.view.View r0 = r11.a
            r10.H0 = r0
            goto L_0x002f
        L_0x0027:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x002f:
            int r0 = r12 * 8
            int r0 = r0 + r13
            int r0 = r14 << r0
            int r16 = r0 + -1
            dec r9 = r10.c
            e77 r8 = r10.x0
            r7 = 16
            r6 = 0
            if (r9 == 0) goto L_0x0173
            android.view.View r0 = r9.a
            android.view.ViewParent r1 = r0.getParent()
            r5 = 0
            if (r1 == 0) goto L_0x015f
            if (r3 != r15) goto L_0x004d
            r4 = r6
            goto L_0x00bb
        L_0x004d:
            int r0 = r10.y0
            if (r0 != r15) goto L_0x0053
        L_0x0051:
            r2 = r6
            goto L_0x00ba
        L_0x0053:
            androidx.recyclerview.widget.RecyclerView r0 = r10.C0
            int r1 = r8.b
            int r2 = r8.c
            r4 = r1 | r2
            int r1 = r1 << r13
            r1 = r1 | r4
            int r2 = r2 << r7
            r1 = r1 | r2
            java.util.WeakHashMap r2 = defpackage.zmf.a
            int r0 = r0.getLayoutDirection()
            int r0 = defpackage.e77.b(r1, r0)
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            int r0 = r0 >> r13
            if (r0 != 0) goto L_0x0071
            goto L_0x0051
        L_0x0071:
            r1 = r1 & r2
            int r1 = r1 >> r13
            float r2 = r10.s0
            float r2 = java.lang.Math.abs(r2)
            float r4 = r10.t0
            float r4 = java.lang.Math.abs(r4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x009f
            int r2 = r10.j(r9, r0)
            if (r2 <= 0) goto L_0x0098
            r0 = r1 & r2
            if (r0 != 0) goto L_0x00ba
            androidx.recyclerview.widget.RecyclerView r0 = r10.C0
            int r0 = r0.getLayoutDirection()
            int r2 = defpackage.e77.c(r2, r0)
            goto L_0x00ba
        L_0x0098:
            int r2 = r10.l(r9, r0)
            if (r2 <= 0) goto L_0x0051
            goto L_0x00ba
        L_0x009f:
            int r2 = r10.l(r9, r0)
            if (r2 <= 0) goto L_0x00a6
            goto L_0x00ba
        L_0x00a6:
            int r2 = r10.j(r9, r0)
            if (r2 <= 0) goto L_0x0051
            r0 = r1 & r2
            if (r0 != 0) goto L_0x00ba
            androidx.recyclerview.widget.RecyclerView r0 = r10.C0
            int r0 = r0.getLayoutDirection()
            int r2 = defpackage.e77.c(r2, r0)
        L_0x00ba:
            r4 = r2
        L_0x00bb:
            android.view.VelocityTracker r0 = r10.E0
            if (r0 == 0) goto L_0x00c4
            r0.recycle()
            r10.E0 = r5
        L_0x00c4:
            r0 = 4
            r1 = 0
            if (r4 == r14) goto L_0x00ec
            if (r4 == r15) goto L_0x00ec
            if (r4 == r0) goto L_0x00d9
            if (r4 == r13) goto L_0x00d9
            if (r4 == r7) goto L_0x00d9
            r2 = 32
            if (r4 == r2) goto L_0x00d9
            r18 = r1
            r19 = r18
            goto L_0x00fe
        L_0x00d9:
            float r2 = r10.s0
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r10.C0
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r2 = r2 * r0
            r19 = r1
            r18 = r2
            goto L_0x00fe
        L_0x00ec:
            float r0 = r10.t0
            float r0 = java.lang.Math.signum(r0)
            androidx.recyclerview.widget.RecyclerView r2 = r10.C0
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r0 = r0 * r2
            r19 = r0
            r18 = r1
        L_0x00fe:
            if (r3 != r15) goto L_0x0102
            r2 = r13
            goto L_0x0107
        L_0x0102:
            if (r4 <= 0) goto L_0x0106
            r2 = r15
            goto L_0x0107
        L_0x0106:
            r2 = 4
        L_0x0107:
            float[] r0 = r10.b
            r10.o(r0)
            r17 = r0[r6]
            r20 = r0[r14]
            b77 r1 = new b77
            r0 = r1
            r14 = r1
            r1 = r22
            r15 = r2
            r2 = r9
            r21 = r4
            r4 = r17
            r5 = r20
            r6 = r18
            r17 = r7
            r7 = r19
            r18 = r8
            r8 = r21
            r19 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.recyclerview.widget.RecyclerView r0 = r10.C0
            r18.getClass()
            mdc r0 = r0.getItemAnimator()
            if (r0 != 0) goto L_0x0140
            if (r15 != r13) goto L_0x013d
            r0 = 200(0xc8, double:9.9E-322)
            goto L_0x0147
        L_0x013d:
            r0 = 250(0xfa, double:1.235E-321)
            goto L_0x0147
        L_0x0140:
            if (r15 != r13) goto L_0x0145
            long r0 = r0.e
            goto L_0x0147
        L_0x0145:
            long r0 = r0.d
        L_0x0147:
            android.animation.ValueAnimator r2 = r14.g
            r2.setDuration(r0)
            java.util.ArrayList r0 = r10.A0
            r0.add(r14)
            r1 = r19
            r3 = 0
            r1.v(r3)
            r2.start()
            r2 = r18
            r0 = 0
            r6 = 1
            goto L_0x0170
        L_0x015f:
            r3 = r6
            r17 = r7
            r18 = r8
            r1 = r9
            r10.r(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r10.C0
            r2 = r18
            r2.a(r0, r1)
            r0 = 0
        L_0x0170:
            r10.c = r0
            goto L_0x0177
        L_0x0173:
            r3 = r6
            r17 = r7
            r2 = r8
        L_0x0177:
            if (r11 == 0) goto L_0x01b0
            androidx.recyclerview.widget.RecyclerView r0 = r10.C0
            int r1 = r2.b
            int r4 = r2.c
            r5 = r1 | r4
            int r1 = r1 << r13
            r1 = r1 | r5
            int r4 = r4 << 16
            r1 = r1 | r4
            java.util.WeakHashMap r4 = defpackage.zmf.a
            int r0 = r0.getLayoutDirection()
            int r0 = defpackage.e77.b(r1, r0)
            r0 = r0 & r16
            int r1 = r10.y0
            int r1 = r1 * r13
            int r0 = r0 >> r1
            r10.z0 = r0
            android.view.View r0 = r11.a
            int r1 = r0.getLeft()
            float r1 = (float) r1
            r10.u0 = r1
            int r1 = r0.getTop()
            float r1 = (float) r1
            r10.v0 = r1
            r10.c = r11
            r1 = 2
            if (r12 != r1) goto L_0x01b0
            r0.performHapticFeedback(r3)
        L_0x01b0:
            androidx.recyclerview.widget.RecyclerView r0 = r10.C0
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x01c0
            dec r1 = r10.c
            if (r1 == 0) goto L_0x01bd
            r3 = 1
        L_0x01bd:
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x01c0:
            if (r6 != 0) goto L_0x01cb
            androidx.recyclerview.widget.RecyclerView r0 = r10.C0
            androidx.recyclerview.widget.a r0 = r0.getLayoutManager()
            r1 = 1
            r0.f = r1
        L_0x01cb:
            dec r0 = r10.c
            int r1 = r10.y0
            r2.j(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = r10.C0
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f77.s(dec, int):void");
    }

    public final void t(dec dec) {
        e77 e77 = this.x0;
        RecyclerView recyclerView = this.C0;
        int i = e77.b;
        int i2 = e77.c;
        int i3 = i | i2;
        int i4 = (i2 << 16) | (i << 8) | i3;
        WeakHashMap weakHashMap = zmf.a;
        if ((e77.b(i4, recyclerView.getLayoutDirection()) & 16711680) != 0 && dec.a.getParent() == this.C0) {
            VelocityTracker velocityTracker = this.E0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.E0 = VelocityTracker.obtain();
            this.t0 = 0.0f;
            this.s0 = 0.0f;
            s(dec, 2);
        }
    }

    public final void u(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.o;
        this.s0 = f;
        this.t0 = y - this.X;
        if ((i & 4) == 0) {
            this.s0 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.s0 = Math.min(0.0f, this.s0);
        }
        if ((i & 1) == 0) {
            this.t0 = Math.max(0.0f, this.t0);
        }
        if ((i & 2) == 0) {
            this.t0 = Math.min(0.0f, this.t0);
        }
    }
}
