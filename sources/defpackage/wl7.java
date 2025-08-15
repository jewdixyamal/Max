package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* renamed from: wl7  reason: default package */
public class wl7 implements und {
    public AdapterView.OnItemClickListener A0;
    public AdapterView.OnItemSelectedListener B0;
    public final ul7 C0 = new ul7(this, 1);
    public final yb5 D0 = new yb5(1, this);
    public final vl7 E0 = new vl7(this);
    public final ul7 F0 = new ul7(this, 0);
    public final Handler G0;
    public final Rect H0 = new Rect();
    public Rect I0;
    public boolean J0;
    public final ln K0;
    public int X = -2;
    public int Y;
    public int Z;
    public final Context a;
    public ListAdapter b;
    public es4 c;
    public final int o = -2;
    public final int s0 = 1002;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public int w0 = 0;
    public final int x0 = Integer.MAX_VALUE;
    public g04 y0;
    public View z0;

    /* JADX WARNING: type inference failed for: r1v9, types: [ln, android.widget.PopupWindow] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0088, code lost:
        r8 = r6.getResourceId(r7, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wl7(android.content.Context r5, android.util.AttributeSet r6, int r7, int r8) {
        /*
            r4 = this;
            r4.<init>()
            r0 = -2
            r4.o = r0
            r4.X = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r4.s0 = r0
            r0 = 0
            r4.w0 = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r4.x0 = r1
            ul7 r1 = new ul7
            r2 = 1
            r1.<init>(r4, r2)
            r4.C0 = r1
            yb5 r1 = new yb5
            r1.<init>(r2, r4)
            r4.D0 = r1
            vl7 r1 = new vl7
            r1.<init>(r4)
            r4.E0 = r1
            ul7 r1 = new ul7
            r2 = 0
            r1.<init>(r4, r2)
            r4.F0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.H0 = r1
            r4.a = r5
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r5.getMainLooper()
            r1.<init>(r2)
            r4.G0 = r1
            int[] r1 = defpackage.p3c.ListPopupWindow
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1, r7, r8)
            int r2 = defpackage.p3c.ListPopupWindow_android_dropDownHorizontalOffset
            int r2 = r1.getDimensionPixelOffset(r2, r0)
            r4.Y = r2
            int r2 = defpackage.p3c.ListPopupWindow_android_dropDownVerticalOffset
            int r2 = r1.getDimensionPixelOffset(r2, r0)
            r4.Z = r2
            r3 = 1
            if (r2 == 0) goto L_0x0061
            r4.t0 = r3
        L_0x0061:
            r1.recycle()
            ln r1 = new ln
            r1.<init>(r5, r6, r7, r8)
            int[] r2 = defpackage.p3c.PopupWindow
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r2, r7, r8)
            int r7 = defpackage.p3c.PopupWindow_overlapAnchor
            boolean r7 = r6.hasValue(r7)
            if (r7 == 0) goto L_0x0080
            int r7 = defpackage.p3c.PopupWindow_overlapAnchor
            boolean r7 = r6.getBoolean(r7, r0)
            defpackage.i6b.c(r1, r7)
        L_0x0080:
            int r7 = defpackage.p3c.PopupWindow_android_popupBackground
            boolean r8 = r6.hasValue(r7)
            if (r8 == 0) goto L_0x0093
            int r8 = r6.getResourceId(r7, r0)
            if (r8 == 0) goto L_0x0093
            android.graphics.drawable.Drawable r5 = defpackage.s36.n(r5, r8)
            goto L_0x0097
        L_0x0093:
            android.graphics.drawable.Drawable r5 = r6.getDrawable(r7)
        L_0x0097:
            r1.setBackgroundDrawable(r5)
            r6.recycle()
            r4.K0 = r1
            r1.setInputMethodMode(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl7.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final boolean a() {
        return this.K0.isShowing();
    }

    public final Drawable b() {
        return this.K0.getBackground();
    }

    public final int c() {
        return this.Y;
    }

    public final void d(int i) {
        this.Y = i;
    }

    public final void dismiss() {
        ln lnVar = this.K0;
        lnVar.dismiss();
        lnVar.setContentView((View) null);
        this.c = null;
        this.G0.removeCallbacks(this.C0);
    }

    public final void f() {
        int i;
        int i2;
        es4 es4;
        es4 es42 = this.c;
        ln lnVar = this.K0;
        Context context = this.a;
        if (es42 == null) {
            es4 q = q(context, !this.J0);
            this.c = q;
            q.setAdapter(this.b);
            this.c.setOnItemClickListener(this.A0);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new rl7(0, this));
            this.c.setOnScrollListener(this.E0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.B0;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            lnVar.setContentView(this.c);
        } else {
            ViewGroup viewGroup = (ViewGroup) lnVar.getContentView();
        }
        Drawable background = lnVar.getBackground();
        int i3 = 0;
        Rect rect = this.H0;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.t0) {
                this.Z = -i4;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = sl7.a(lnVar, this.z0, this.Z, lnVar.getInputMethodMode() == 2);
        int i5 = this.o;
        if (i5 == -1) {
            i2 = a2 + i;
        } else {
            int i6 = this.X;
            int a3 = this.c.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            i2 = a3 + (a3 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = this.K0.getInputMethodMode() == 2;
        i6b.d(lnVar, this.s0);
        if (!lnVar.isShowing()) {
            int i7 = this.X;
            if (i7 == -1) {
                i7 = -1;
            } else if (i7 == -2) {
                i7 = this.z0.getWidth();
            }
            if (i5 == -1) {
                i5 = -1;
            } else if (i5 == -2) {
                i5 = i2;
            }
            lnVar.setWidth(i7);
            lnVar.setHeight(i5);
            tl7.b(lnVar, true);
            lnVar.setOutsideTouchable(true);
            lnVar.setTouchInterceptor(this.D0);
            if (this.v0) {
                i6b.c(lnVar, this.u0);
            }
            tl7.a(lnVar, this.I0);
            lnVar.showAsDropDown(this.z0, this.Y, this.Z, this.w0);
            this.c.setSelection(-1);
            if ((!this.J0 || this.c.isInTouchMode()) && (es4 = this.c) != null) {
                es4.setListSelectionHidden(true);
                es4.requestLayout();
            }
            if (!this.J0) {
                this.G0.post(this.F0);
            }
        } else if (this.z0.isAttachedToWindow()) {
            int i8 = this.X;
            if (i8 == -1) {
                i8 = -1;
            } else if (i8 == -2) {
                i8 = this.z0.getWidth();
            }
            if (i5 == -1) {
                i5 = z ? i2 : -1;
                if (z) {
                    lnVar.setWidth(this.X == -1 ? -1 : 0);
                    lnVar.setHeight(0);
                } else {
                    if (this.X == -1) {
                        i3 = -1;
                    }
                    lnVar.setWidth(i3);
                    lnVar.setHeight(-1);
                }
            } else if (i5 == -2) {
                i5 = i2;
            }
            lnVar.setOutsideTouchable(true);
            View view = this.z0;
            int i9 = this.Y;
            int i10 = this.Z;
            if (i8 < 0) {
                i8 = -1;
            }
            lnVar.update(view, i9, i10, i8, i5 < 0 ? -1 : i5);
        }
    }

    public final void i(Drawable drawable) {
        this.K0.setBackgroundDrawable(drawable);
    }

    public final es4 j() {
        return this.c;
    }

    public final void l(int i) {
        this.Z = i;
        this.t0 = true;
    }

    public final int o() {
        if (!this.t0) {
            return 0;
        }
        return this.Z;
    }

    public void p(ListAdapter listAdapter) {
        g04 g04 = this.y0;
        if (g04 == null) {
            this.y0 = new g04(1, this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(g04);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.y0);
        }
        es4 es4 = this.c;
        if (es4 != null) {
            es4.setAdapter(this.b);
        }
    }

    public es4 q(Context context, boolean z) {
        return new es4(context, z);
    }

    public final void r(int i) {
        Drawable background = this.K0.getBackground();
        if (background != null) {
            Rect rect = this.H0;
            background.getPadding(rect);
            this.X = rect.left + rect.right + i;
            return;
        }
        this.X = i;
    }
}
