package defpackage;

import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: od1  reason: default package */
public final class od1 extends mof {
    public final ViewPager2 a;
    public final ViewStub b;
    public final u21 c;
    public final wd1 d;
    public final m56 e;
    public final k56 f;
    public boolean g = true;
    public int h;
    public boolean i;

    public od1(ViewPager2 viewPager2, ViewStub viewStub, u21 u21, wd1 wd1, di1 di1, ci1 ci1) {
        this.a = viewPager2;
        this.b = viewStub;
        this.c = u21;
        this.d = wd1;
        this.e = di1;
        this.f = ci1;
    }

    public final void a(int i2) {
        this.g = i2 == 0;
    }

    public final void b(int i2, float f2, int i3) {
        int i4 = i2;
        if (f2 == 0.0f) {
            this.h = i4;
        }
        int j = this.d.j() - 1;
        int i5 = this.h;
        boolean z = false;
        ViewStub viewStub = this.b;
        u21 u21 = this.c;
        if (j == i5) {
            if (!br7.G(viewStub)) {
                br7.F(viewStub, u21, (k56) null);
            }
            if (this.h > i4) {
                z = true;
            }
            float f3 = 1.0f;
            float f4 = z ? 1.0f - f2 : f2;
            double d2 = (double) f4;
            if (0.1d > d2 || d2 > 0.6d) {
                if (0.6d <= d2 && d2 <= 0.99d && !this.i) {
                    this.i = true;
                    int i6 = Build.VERSION.SDK_INT;
                    ViewPager2 viewPager2 = this.a;
                    if (i6 >= 30) {
                        pag.F(viewPager2, mi6.GESTURE_START);
                    }
                    int i7 = this.h;
                    viewPager2.e(z ? i7 - 1 : i7 + 1, true);
                } else if (br7.G(viewStub)) {
                    u21.setVisibility(8);
                }
            } else if (u21.getVisibility() != 0) {
                ft.g(this.c, true, 0, (m56) null, 6);
            }
            u21.setTranslationY((((Number) this.f.invoke()).floatValue() - ((float) i3)) + (fk4.d().getDisplayMetrics().density * -50.0f));
            int i8 = u21.c;
            float f5 = (((float) (u21.t0 - i8)) * f4) + ((float) i8);
            int i9 = u21.a;
            float f6 = (((float) (u21.o - i9)) * f4) + ((float) i9);
            int i10 = u21.b;
            float f7 = (((float) (u21.s0 - i10)) * f4) + ((float) i10);
            int G = tu0.G(f5);
            v21 v21 = u21.v0;
            v21.setPadding(G, G, G, G);
            ViewGroup.LayoutParams layoutParams = v21.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = tu0.G(f6);
                layoutParams.height = tu0.G(f7);
                v21.setLayoutParams(layoutParams);
                float f8 = f4 * 3.0f;
                if (f8 <= 1.0f) {
                    f3 = f8;
                }
                u21.u0.setAlpha(f3);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (br7.G(viewStub)) {
            u21.setVisibility(8);
        }
        this.i = false;
    }

    public final void c(int i2) {
        vd1 vd1;
        nnf nnf;
        ViewPager2 viewPager2 = this.a;
        boolean z = viewPager2.F0;
        hm9.m("CallModeScrollTag", "viewpager position changed position=" + i2 + " isUserInputEnabled=" + z, new Object[0]);
        if (!(!z || (vd1 = (vd1) this.d.G(i2)) == null || (nnf = vd1.a) == null || nnf == nnf.b)) {
            this.e.invoke(nnf);
        }
        viewPager2.setUserInputEnabled(true);
    }
}
