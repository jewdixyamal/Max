package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: ir0  reason: default package */
public class ir0 extends fn {
    public cjg A0;
    public final gr0 B0;
    public BottomSheetBehavior Y;
    public FrameLayout Z;
    public CoordinatorLayout s0;
    public FrameLayout t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public hr0 y0;
    public final boolean z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ir0(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x0019
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = defpackage.tsb.bottomSheetDialogTheme
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0017
            int r5 = r5.resourceId
            goto L_0x0019
        L_0x0017:
            int r5 = defpackage.m2c.Theme_Design_Light_BottomSheetDialog
        L_0x0019:
            r3.<init>(r4, r5)
            r3.v0 = r0
            r3.w0 = r0
            gr0 r4 = new gr0
            r5 = 0
            r4.<init>(r5, r3)
            r3.B0 = r4
            rm r4 = r3.d()
            r4.f(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = defpackage.tsb.enableEdgeToEdge
            int[] r5 = new int[]{r5}
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            r5 = 0
            boolean r4 = r4.getBoolean(r5, r5)
            r3.z0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.<init>(android.content.Context, int):void");
    }

    public final void cancel() {
        BottomSheetBehavior h = h();
        if (!this.u0 || h.L == 5) {
            super.cancel();
        } else {
            h.K(5);
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [cjg, java.lang.Object] */
    public final void g() {
        if (this.Z == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), vyb.design_bottom_sheet_dialog, (ViewGroup) null);
            this.Z = frameLayout;
            this.s0 = (CoordinatorLayout) frameLayout.findViewById(ivb.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.Z.findViewById(ivb.design_bottom_sheet);
            this.t0 = frameLayout2;
            BottomSheetBehavior C = BottomSheetBehavior.C(frameLayout2);
            this.Y = C;
            gr0 gr0 = this.B0;
            ArrayList arrayList = C.W;
            if (!arrayList.contains(gr0)) {
                arrayList.add(gr0);
            }
            this.Y.I(this.v0);
            BottomSheetBehavior bottomSheetBehavior = this.Y;
            FrameLayout frameLayout3 = this.t0;
            ? obj = new Object();
            int i = Build.VERSION.SDK_INT;
            obj.a = i >= 34 ? new Object() : i >= 33 ? new Object() : null;
            obj.b = bottomSheetBehavior;
            obj.c = frameLayout3;
            this.A0 = obj;
        }
    }

    public final BottomSheetBehavior h() {
        if (this.Y == null) {
            g();
        }
        return this.Y;
    }

    public final FrameLayout i(View view, int i, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.Z.findViewById(ivb.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        if (this.z0) {
            FrameLayout frameLayout = this.t0;
            bkg bkg = new bkg(4, this);
            WeakHashMap weakHashMap = zmf.a;
            omf.u(frameLayout, bkg);
        }
        this.t0.removeAllViews();
        if (layoutParams == null) {
            this.t0.addView(view);
        } else {
            this.t0.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(ivb.touch_outside).setOnClickListener(new e0d(3, this));
        zmf.j(this.t0, new fr0(0, this));
        this.t0.setOnTouchListener(new qjf(2));
        return this.Z;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.z0 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.Z;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.s0;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            kp.A(window, !z);
            hr0 hr0 = this.y0;
            if (hr0 != null) {
                hr0.e(window);
            }
        }
        cjg cjg = this.A0;
        if (cjg != null) {
            boolean z2 = this.v0;
            View view = (View) cjg.c;
            x08 x08 = (x08) cjg.a;
            if (z2) {
                if (x08 != null) {
                    x08.b((w08) cjg.b, view, false);
                }
            } else if (x08 != null) {
                x08.c(view);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public final void onDetachedFromWindow() {
        x08 x08;
        hr0 hr0 = this.y0;
        if (hr0 != null) {
            hr0.e((Window) null);
        }
        cjg cjg = this.A0;
        if (cjg != null && (x08 = (x08) cjg.a) != null) {
            x08.c((View) cjg.c);
        }
    }

    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.Y;
        if (bottomSheetBehavior != null && bottomSheetBehavior.L == 5) {
            bottomSheetBehavior.K(4);
        }
    }

    public final void setCancelable(boolean z) {
        cjg cjg;
        super.setCancelable(z);
        if (this.v0 != z) {
            this.v0 = z;
            BottomSheetBehavior bottomSheetBehavior = this.Y;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.I(z);
            }
            if (getWindow() != null && (cjg = this.A0) != null) {
                boolean z2 = this.v0;
                View view = (View) cjg.c;
                x08 x08 = (x08) cjg.a;
                if (z2) {
                    if (x08 != null) {
                        x08.b((w08) cjg.b, view, false);
                    }
                } else if (x08 != null) {
                    x08.c(view);
                }
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.v0) {
            this.v0 = true;
        }
        this.w0 = z;
        this.x0 = true;
    }

    public final void setContentView(int i) {
        super.setContentView((View) i((View) null, i, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view) {
        super.setContentView((View) i(view, 0, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView((View) i(view, 0, layoutParams));
    }
}
