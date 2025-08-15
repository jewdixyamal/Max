package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.fm;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class AppBarLayout$BaseBehavior<T extends fm> extends bof {
    public wi3 c;
    public OverScroller d;
    public boolean e;
    public int f = -1;
    public int g;
    public int h = -1;
    public VelocityTracker i;
    public int j;
    public int k;
    public ValueAnimator l;
    public bm m;
    public WeakReference n;

    public AppBarLayout$BaseBehavior() {
    }

    public static View A(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, CoordinatorLayout coordinatorLayout) {
        appBarLayout$BaseBehavior.getClass();
        int childCount = coordinatorLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = coordinatorLayout.getChildAt(i2);
            if (((rw3) childAt.getLayoutParams()).a instanceof AppBarLayout$ScrollingViewBehavior) {
                return childAt;
            }
        }
        return null;
    }

    public static View C(CoordinatorLayout coordinatorLayout) {
        int childCount = coordinatorLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = coordinatorLayout.getChildAt(i2);
            if ((childAt instanceof in9) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void M(androidx.coordinatorlayout.widget.CoordinatorLayout r8, defpackage.fm r9, int r10, int r11, boolean r12) {
        /*
            r0 = 1
            int r1 = java.lang.Math.abs(r10)
            int r2 = r9.getChildCount()
            r3 = 0
            r4 = r3
        L_0x000b:
            r5 = 0
            if (r4 >= r2) goto L_0x0021
            android.view.View r6 = r9.getChildAt(r4)
            int r7 = r6.getTop()
            if (r1 < r7) goto L_0x001f
            int r7 = r6.getBottom()
            if (r1 > r7) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            int r4 = r4 + r0
            goto L_0x000b
        L_0x0021:
            r6 = r5
        L_0x0022:
            if (r6 == 0) goto L_0x005d
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            dm r1 = (defpackage.dm) r1
            int r1 = r1.a
            r2 = r1 & 1
            if (r2 == 0) goto L_0x005d
            java.util.WeakHashMap r2 = defpackage.zmf.a
            int r2 = r6.getMinimumHeight()
            if (r11 <= 0) goto L_0x004b
            r11 = r1 & 12
            if (r11 == 0) goto L_0x004b
            int r10 = -r10
            int r11 = r6.getBottom()
            int r11 = r11 - r2
            int r1 = r9.getTopInset()
            int r11 = r11 - r1
            if (r10 < r11) goto L_0x005d
        L_0x0049:
            r10 = r0
            goto L_0x005e
        L_0x004b:
            r11 = r1 & 2
            if (r11 == 0) goto L_0x005d
            int r10 = -r10
            int r11 = r6.getBottom()
            int r11 = r11 - r2
            int r1 = r9.getTopInset()
            int r11 = r11 - r1
            if (r10 < r11) goto L_0x005d
            goto L_0x0049
        L_0x005d:
            r10 = r3
        L_0x005e:
            boolean r11 = r9.z0
            if (r11 == 0) goto L_0x006a
            android.view.View r10 = C(r8)
            boolean r10 = r9.h(r10)
        L_0x006a:
            boolean r10 = r9.g(r10)
            if (r12 != 0) goto L_0x00ad
            if (r10 == 0) goto L_0x00d4
            die r8 = r8.b
            java.lang.Object r8 = r8.b
            qpd r8 = (defpackage.qpd) r8
            java.lang.Object r8 = r8.get(r9)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 != 0) goto L_0x0081
            goto L_0x0086
        L_0x0081:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r8)
        L_0x0086:
            if (r5 != 0) goto L_0x008c
            java.util.List r5 = java.util.Collections.emptyList()
        L_0x008c:
            int r8 = r5.size()
        L_0x0090:
            if (r3 >= r8) goto L_0x00d4
            java.lang.Object r10 = r5.get(r3)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            rw3 r10 = (defpackage.rw3) r10
            ow3 r10 = r10.a
            boolean r11 = r10 instanceof com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            if (r11 == 0) goto L_0x00ab
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior) r10
            int r8 = r10.f
            if (r8 == 0) goto L_0x00d4
            goto L_0x00ad
        L_0x00ab:
            int r3 = r3 + r0
            goto L_0x0090
        L_0x00ad:
            android.graphics.drawable.Drawable r8 = r9.getBackground()
            if (r8 == 0) goto L_0x00ba
            android.graphics.drawable.Drawable r8 = r9.getBackground()
            r8.jumpToCurrentState()
        L_0x00ba:
            android.graphics.drawable.Drawable r8 = r9.getForeground()
            if (r8 == 0) goto L_0x00c7
            android.graphics.drawable.Drawable r8 = r9.getForeground()
            r8.jumpToCurrentState()
        L_0x00c7:
            android.animation.StateListAnimator r8 = r9.getStateListAnimator()
            if (r8 == 0) goto L_0x00d4
            android.animation.StateListAnimator r8 = r9.getStateListAnimator()
            r8.jumpToCurrentState()
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.M(androidx.coordinatorlayout.widget.CoordinatorLayout, fm, int, int, boolean):void");
    }

    public final void B(CoordinatorLayout coordinatorLayout, fm fmVar, int i2) {
        int abs = Math.abs(D() - i2);
        float abs2 = Math.abs(0.0f);
        int round = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) fmVar.getHeight())) + 1.0f) * 150.0f);
        int D = D();
        if (D == i2) {
            ValueAnimator valueAnimator = this.l;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.l.cancel();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.l;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.l = valueAnimator3;
            valueAnimator3.setInterpolator(og.e);
            this.l.addUpdateListener(new zl(this, coordinatorLayout, fmVar, 0));
        } else {
            valueAnimator2.cancel();
        }
        this.l.setDuration((long) Math.min(round, 600));
        this.l.setIntValues(new int[]{D, i2});
        this.l.start();
    }

    public final int D() {
        return x() + this.j;
    }

    /* renamed from: E */
    public void o(CoordinatorLayout coordinatorLayout, fm fmVar, View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        int i6;
        if (i3 != 0) {
            if (i3 < 0) {
                i5 = -fmVar.getTotalScrollRange();
                i6 = fmVar.getDownNestedPreScrollRange() + i5;
            } else {
                i5 = -fmVar.getUpNestedPreScrollRange();
                i6 = 0;
            }
            int i7 = i5;
            int i8 = i6;
            if (i7 != i8) {
                iArr[1] = J(coordinatorLayout, fmVar, D() - i3, i7, i8);
            }
        }
        if (fmVar.z0) {
            fmVar.g(fmVar.h(view));
        }
    }

    /* renamed from: F */
    public void p(CoordinatorLayout coordinatorLayout, fm fmVar, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i5 < 0) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            fm fmVar2 = fmVar;
            iArr[1] = J(coordinatorLayout2, fmVar2, D() - i5, -fmVar.getDownNestedScrollRange(), 0);
        }
        if (i5 == 0) {
            WeakHashMap weakHashMap = zmf.a;
            if (umf.a(coordinatorLayout) == null) {
                zmf.j(coordinatorLayout, new am(this, fmVar, coordinatorLayout));
            }
        }
    }

    /* renamed from: G */
    public boolean u(CoordinatorLayout coordinatorLayout, fm fmVar, View view, View view2, int i2, int i3) {
        ValueAnimator valueAnimator;
        boolean z = (i2 & 2) != 0 && (fmVar.z0 || (fmVar.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= fmVar.getHeight()));
        if (z && (valueAnimator = this.l) != null) {
            valueAnimator.cancel();
        }
        this.n = null;
        this.k = i3;
        return z;
    }

    /* renamed from: H */
    public void v(CoordinatorLayout coordinatorLayout, fm fmVar, View view, int i2) {
        if (this.k == 0 || i2 == 1) {
            L(coordinatorLayout, fmVar);
            if (fmVar.z0) {
                fmVar.g(fmVar.h(view));
            }
        }
        this.n = new WeakReference(view);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [z, bm] */
    public final bm I(Parcelable parcelable, fm fmVar) {
        boolean z = true;
        int x = x();
        int childCount = fmVar.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = fmVar.getChildAt(i2);
            int bottom = childAt.getBottom() + x;
            if (childAt.getTop() + x > 0 || bottom < 0) {
                i2++;
            } else {
                if (parcelable == null) {
                    parcelable = z.b;
                }
                ? zVar = new z(parcelable);
                boolean z2 = x == 0;
                zVar.o = z2;
                zVar.c = !z2 && (-x) >= fmVar.getTotalScrollRange();
                zVar.X = i2;
                WeakHashMap weakHashMap = zmf.a;
                if (bottom != fmVar.getTopInset() + childAt.getMinimumHeight()) {
                    z = false;
                }
                zVar.Z = z;
                zVar.Y = ((float) bottom) / ((float) childAt.getHeight());
                return zVar;
            }
        }
        return null;
    }

    public final int J(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        int i5;
        ArrayList arrayList;
        int i6;
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        int i7 = i3;
        int i8 = 1;
        fm fmVar = (fm) view;
        int D = D();
        int i9 = 0;
        if (i7 == 0 || D < i7 || D > i4) {
            this.j = 0;
        } else {
            int p = z04.p(i2, i3, i4);
            if (D != p) {
                if (fmVar.s0) {
                    int abs = Math.abs(p);
                    int childCount = fmVar.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        }
                        View childAt = fmVar.getChildAt(i10);
                        dm dmVar = (dm) childAt.getLayoutParams();
                        Interpolator interpolator = dmVar.c;
                        if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                            i10++;
                        } else if (interpolator != null) {
                            int i11 = dmVar.a;
                            if ((i11 & 1) != 0) {
                                i6 = childAt.getHeight() + dmVar.topMargin + dmVar.bottomMargin;
                                if ((i11 & 2) != 0) {
                                    WeakHashMap weakHashMap = zmf.a;
                                    i6 -= childAt.getMinimumHeight();
                                }
                            } else {
                                i6 = 0;
                            }
                            WeakHashMap weakHashMap2 = zmf.a;
                            if (childAt.getFitsSystemWindows()) {
                                i6 -= fmVar.getTopInset();
                            }
                            if (i6 > 0) {
                                float f2 = (float) i6;
                                i5 = (childAt.getTop() + Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f2) * f2)) * Integer.signum(p);
                            }
                        }
                    }
                }
                i5 = p;
                boolean z = z(i5);
                int i12 = D - p;
                this.j = p - i5;
                if (z) {
                    for (int i13 = 0; i13 < fmVar.getChildCount(); i13 += i8) {
                        dm dmVar2 = (dm) fmVar.getChildAt(i13).getLayoutParams();
                        h7b h7b = dmVar2.b;
                        if (!(h7b == null || (dmVar2.a & i8) == 0)) {
                            View childAt2 = fmVar.getChildAt(i13);
                            Rect rect = (Rect) h7b.b;
                            childAt2.getDrawingRect(rect);
                            fmVar.offsetDescendantRectToMyCoords(childAt2, rect);
                            rect.offset(0, -fmVar.getTopInset());
                            float abs2 = ((float) rect.top) - Math.abs((float) x());
                            if (abs2 <= 0.0f) {
                                float o = 1.0f - z04.o(Math.abs(abs2 / ((float) rect.height())), 0.0f, 1.0f);
                                float height = (-abs2) - ((((float) rect.height()) * 0.3f) * (1.0f - (o * o)));
                                childAt2.setTranslationY(height);
                                Rect rect2 = (Rect) h7b.c;
                                childAt2.getDrawingRect(rect2);
                                rect2.offset(0, (int) (-height));
                                if (height >= ((float) rect2.height())) {
                                    childAt2.setVisibility(4);
                                } else {
                                    childAt2.setVisibility(0);
                                }
                                WeakHashMap weakHashMap3 = zmf.a;
                                childAt2.setClipBounds(rect2);
                            } else {
                                WeakHashMap weakHashMap4 = zmf.a;
                                childAt2.setClipBounds((Rect) null);
                                childAt2.setTranslationY(0.0f);
                                childAt2.setVisibility(0);
                            }
                            i8 = 1;
                        }
                    }
                }
                if (!z && fmVar.s0 && (arrayList = (ArrayList) ((qpd) coordinatorLayout2.b.b).get(fmVar)) != null && !arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        View view2 = (View) arrayList.get(i14);
                        ow3 ow3 = ((rw3) view2.getLayoutParams()).a;
                        if (ow3 != null) {
                            ow3.h(coordinatorLayout2, view2, fmVar);
                        }
                    }
                }
                fmVar.e(x());
                M(coordinatorLayout2, fmVar, p, p < D ? -1 : 1, false);
                i9 = i12;
            }
        }
        WeakHashMap weakHashMap5 = zmf.a;
        if (umf.a(coordinatorLayout) == null) {
            zmf.j(coordinatorLayout2, new am(this, fmVar, coordinatorLayout2));
        }
        return i9;
    }

    public final void K(CoordinatorLayout coordinatorLayout, View view, int i2) {
        J(coordinatorLayout, view, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final void L(CoordinatorLayout coordinatorLayout, fm fmVar) {
        int paddingTop = fmVar.getPaddingTop() + fmVar.getTopInset();
        int D = D() - paddingTop;
        int childCount = fmVar.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            View childAt = fmVar.getChildAt(i2);
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            dm dmVar = (dm) childAt.getLayoutParams();
            if ((dmVar.a & 32) == 32) {
                top -= dmVar.topMargin;
                bottom += dmVar.bottomMargin;
            }
            int i3 = -D;
            if (top <= i3 && bottom >= i3) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            View childAt2 = fmVar.getChildAt(i2);
            dm dmVar2 = (dm) childAt2.getLayoutParams();
            int i4 = dmVar2.a;
            if ((i4 & 17) == 17) {
                int i5 = -childAt2.getTop();
                int i6 = -childAt2.getBottom();
                if (i2 == 0) {
                    WeakHashMap weakHashMap = zmf.a;
                    if (fmVar.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i5 -= fmVar.getTopInset();
                    }
                }
                if ((i4 & 2) == 2) {
                    WeakHashMap weakHashMap2 = zmf.a;
                    i6 += childAt2.getMinimumHeight();
                } else if ((i4 & 5) == 5) {
                    WeakHashMap weakHashMap3 = zmf.a;
                    int minimumHeight = childAt2.getMinimumHeight() + i6;
                    if (D < minimumHeight) {
                        i5 = minimumHeight;
                    } else {
                        i6 = minimumHeight;
                    }
                }
                if ((i4 & 32) == 32) {
                    i5 += dmVar2.topMargin;
                    i6 -= dmVar2.bottomMargin;
                }
                if (D < (i6 + i5) / 2) {
                    i5 = i6;
                }
                B(coordinatorLayout, fmVar, z04.p(i5 + paddingTop, -fmVar.getTotalScrollRange(), 0));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r5 = (android.view.View) r5.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r7.h
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.h = r0
        L_0x0012:
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L_0x0040
            boolean r0 = r7.e
            if (r0 == 0) goto L_0x0040
            int r0 = r7.f
            if (r0 != r3) goto L_0x0025
            return r4
        L_0x0025:
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002c
            return r4
        L_0x002c:
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            int r1 = r7.g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r7.h
            if (r1 <= r5) goto L_0x0040
            r7.g = r0
            return r2
        L_0x0040:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto L_0x009c
            r7.f = r3
            float r0 = r10.getX()
            int r0 = (int) r0
            float r1 = r10.getY()
            int r1 = (int) r1
            r5 = r9
            fm r5 = (defpackage.fm) r5
            java.lang.ref.WeakReference r5 = r7.n
            if (r5 == 0) goto L_0x006d
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x0075
            boolean r6 = r5.isShown()
            if (r6 == 0) goto L_0x0075
            boolean r3 = r5.canScrollVertically(r3)
            if (r3 != 0) goto L_0x0075
        L_0x006d:
            boolean r8 = r8.h(r9, r0, r1)
            if (r8 == 0) goto L_0x0075
            r8 = r2
            goto L_0x0076
        L_0x0075:
            r8 = r4
        L_0x0076:
            r7.e = r8
            if (r8 == 0) goto L_0x009c
            r7.g = r1
            int r8 = r10.getPointerId(r4)
            r7.f = r8
            android.view.VelocityTracker r8 = r7.i
            if (r8 != 0) goto L_0x008c
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r7.i = r8
        L_0x008c:
            android.widget.OverScroller r8 = r7.d
            if (r8 == 0) goto L_0x009c
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto L_0x009c
            android.widget.OverScroller r7 = r7.d
            r7.abortAnimation()
            return r2
        L_0x009c:
            android.view.VelocityTracker r7 = r7.i
            if (r7 == 0) goto L_0x00a3
            r7.addMovement(r10)
        L_0x00a3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3;
        fm fmVar = (fm) view;
        super.l(coordinatorLayout, fmVar, i2);
        int pendingAction = fmVar.getPendingAction();
        bm bmVar = this.m;
        if (bmVar == null || (pendingAction & 8) != 0) {
            if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -fmVar.getUpNestedPreScrollRange();
                    if (z) {
                        B(coordinatorLayout, fmVar, i4);
                    } else {
                        K(coordinatorLayout, fmVar, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        B(coordinatorLayout, fmVar, 0);
                    } else {
                        K(coordinatorLayout, fmVar, 0);
                    }
                }
            }
        } else if (bmVar.c) {
            K(coordinatorLayout, fmVar, -fmVar.getTotalScrollRange());
        } else if (bmVar.o) {
            K(coordinatorLayout, fmVar, 0);
        } else {
            View childAt = fmVar.getChildAt(bmVar.X);
            int i5 = -childAt.getBottom();
            if (this.m.Z) {
                WeakHashMap weakHashMap = zmf.a;
                i3 = fmVar.getTopInset() + childAt.getMinimumHeight() + i5;
            } else {
                i3 = Math.round(((float) childAt.getHeight()) * this.m.Y) + i5;
            }
            K(coordinatorLayout, fmVar, i3);
        }
        fmVar.t0 = 0;
        this.m = null;
        z(z04.p(x(), -fmVar.getTotalScrollRange(), 0));
        M(coordinatorLayout, fmVar, x(), 0, true);
        fmVar.e(x());
        WeakHashMap weakHashMap2 = zmf.a;
        if (umf.a(coordinatorLayout) == null) {
            zmf.j(coordinatorLayout, new am(this, fmVar, coordinatorLayout));
        }
        return true;
    }

    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        fm fmVar = (fm) view;
        if (((rw3) fmVar.getLayoutParams()).height != -2) {
            return false;
        }
        coordinatorLayout.q(fmVar, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0));
        return true;
    }

    public final void r(View view, Parcelable parcelable) {
        fm fmVar = (fm) view;
        if (parcelable instanceof bm) {
            this.m = (bm) parcelable;
        } else {
            this.m = null;
        }
    }

    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        bm I = I(absSavedState, (fm) view);
        return I == null ? absSavedState : I;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w(androidx.coordinatorlayout.widget.CoordinatorLayout r23, android.view.View r24, android.view.MotionEvent r25) {
        /*
            r22 = this;
            r6 = r22
            r7 = r24
            r8 = r25
            int r0 = r25.getActionMasked()
            r9 = 0
            r10 = -1
            r11 = 1
            r12 = 0
            if (r0 == r11) goto L_0x0068
            r1 = 2
            if (r0 == r1) goto L_0x0034
            r1 = 3
            if (r0 == r1) goto L_0x00ea
            r1 = 6
            if (r0 == r1) goto L_0x001a
            goto L_0x0065
        L_0x001a:
            int r0 = r25.getActionIndex()
            if (r0 != 0) goto L_0x0022
            r0 = r11
            goto L_0x0023
        L_0x0022:
            r0 = r12
        L_0x0023:
            int r1 = r8.getPointerId(r0)
            r6.f = r1
            float r0 = r8.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.g = r0
            goto L_0x0065
        L_0x0034:
            int r0 = r6.f
            int r0 = r8.findPointerIndex(r0)
            if (r0 != r10) goto L_0x003d
            return r12
        L_0x003d:
            float r0 = r8.getY(r0)
            int r0 = (int) r0
            int r1 = r6.g
            int r1 = r1 - r0
            r6.g = r0
            r0 = r7
            fm r0 = (defpackage.fm) r0
            int r2 = r0.getDownNestedScrollRange()
            int r2 = -r2
            int r0 = r0.getTopInset()
            int r4 = r0 + r2
            int r0 = r22.D()
            int r3 = r0 - r1
            r5 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r0.J(r1, r2, r3, r4, r5)
        L_0x0065:
            r0 = r12
            goto L_0x00f8
        L_0x0068:
            android.view.VelocityTracker r0 = r6.i
            if (r0 == 0) goto L_0x00ea
            r0.addMovement(r8)
            android.view.VelocityTracker r0 = r6.i
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r1)
            android.view.VelocityTracker r0 = r6.i
            int r1 = r6.f
            float r0 = r0.getYVelocity(r1)
            r1 = r7
            fm r1 = (defpackage.fm) r1
            int r2 = r1.getTotalScrollRange()
            int r2 = -r2
            wi3 r3 = r6.c
            if (r3 == 0) goto L_0x008f
            r7.removeCallbacks(r3)
            r6.c = r9
        L_0x008f:
            android.widget.OverScroller r3 = r6.d
            if (r3 != 0) goto L_0x009e
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r4 = r24.getContext()
            r3.<init>(r4)
            r6.d = r3
        L_0x009e:
            android.widget.OverScroller r13 = r6.d
            int r15 = r22.x()
            int r17 = java.lang.Math.round(r0)
            r19 = 0
            r21 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = r2
            r13.fling(r14, r15, r16, r17, r18, r19, r20, r21)
            android.widget.OverScroller r0 = r6.d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00d4
            wi3 r13 = new wi3
            r1 = 2
            r5 = 0
            r0 = r13
            r2 = r22
            r3 = r23
            r4 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.c = r13
            java.util.WeakHashMap r0 = defpackage.zmf.a
            r7.postOnAnimation(r13)
            goto L_0x00e8
        L_0x00d4:
            r0 = r23
            r6.L(r0, r1)
            boolean r2 = r1.z0
            if (r2 == 0) goto L_0x00e8
            android.view.View r0 = C(r23)
            boolean r0 = r1.h(r0)
            r1.g(r0)
        L_0x00e8:
            r0 = r11
            goto L_0x00eb
        L_0x00ea:
            r0 = r12
        L_0x00eb:
            r6.e = r12
            r6.f = r10
            android.view.VelocityTracker r1 = r6.i
            if (r1 == 0) goto L_0x00f8
            r1.recycle()
            r6.i = r9
        L_0x00f8:
            android.view.VelocityTracker r1 = r6.i
            if (r1 == 0) goto L_0x00ff
            r1.addMovement(r8)
        L_0x00ff:
            boolean r1 = r6.e
            if (r1 != 0) goto L_0x0107
            if (r0 == 0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r11 = r12
        L_0x0107:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.w(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
    }
}
