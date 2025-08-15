package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: xe7  reason: default package */
public final class xe7 extends z04 {
    public final /* synthetic */ int e;
    public final SideSheetBehavior f;

    public /* synthetic */ xe7(SideSheetBehavior sideSheetBehavior, int i) {
        this.e = i;
        this.f = sideSheetBehavior;
    }

    public final int A() {
        switch (this.e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    public final int C() {
        switch (this.e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.f.m;
        }
    }

    public final int D() {
        switch (this.e) {
            case 0:
                return this.f.o;
            default:
                return this.f.m;
        }
    }

    public final int E() {
        switch (this.e) {
            case 0:
                return -this.f.l;
            default:
                return A();
        }
    }

    public final int F(View view) {
        switch (this.e) {
            case 0:
                return view.getRight() + this.f.o;
            default:
                return view.getLeft() - this.f.o;
        }
    }

    public final int G(CoordinatorLayout coordinatorLayout) {
        switch (this.e) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final int H() {
        switch (this.e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean M(float f2) {
        switch (this.e) {
            case 0:
                return f2 > 0.0f;
            default:
                return f2 < 0.0f;
        }
    }

    public final boolean N(View view) {
        switch (this.e) {
            case 0:
                return view.getRight() < (A() - C()) / 2;
            default:
                return view.getLeft() > (A() + this.f.m) / 2;
        }
    }

    public final boolean Q(float f2, float f3) {
        switch (this.e) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f.getClass();
                    if (abs > ((float) 500)) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f.getClass();
                    if (abs2 > ((float) 500)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final boolean X(View view, float f2) {
        switch (this.e) {
            case 0:
                return Math.abs((f2 * this.f.k) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f2 * this.f.k) + ((float) view.getRight())) > 0.5f;
        }
    }

    public final void a0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.e) {
            case 0:
                marginLayoutParams.leftMargin = i;
                return;
            default:
                marginLayoutParams.rightMargin = i;
                return;
        }
    }

    public final void b0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.e) {
            case 0:
                if (i <= this.f.m) {
                    marginLayoutParams.leftMargin = i2;
                    return;
                }
                return;
            default:
                int i3 = this.f.m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    return;
                }
                return;
        }
    }

    public final int h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final float i(int i) {
        switch (this.e) {
            case 0:
                float C = (float) C();
                return (((float) i) - C) / (((float) A()) - C);
            default:
                float f2 = (float) this.f.m;
                return (f2 - ((float) i)) / (f2 - ((float) A()));
        }
    }

    public final int z(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }
}
