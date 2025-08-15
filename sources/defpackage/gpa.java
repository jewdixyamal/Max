package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: gpa  reason: default package */
public final class gpa extends mof {
    public final LinearLayoutManager a;
    public pof b;

    public gpa(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    public final void a(int i) {
    }

    public final void b(int i, float f, int i2) {
        if (this.b != null) {
            float f2 = -f;
            int i3 = 0;
            while (true) {
                LinearLayoutManager linearLayoutManager = this.a;
                if (i3 < linearLayoutManager.w()) {
                    View v = linearLayoutManager.v(i3);
                    if (v != null) {
                        float M = ((float) (a.M(v) - i)) + f2;
                        f9 f9Var = (f9) this.b;
                        xq3 xq3 = ((mh0) f9Var.c).G0;
                        boolean z = xq3.j() > 1;
                        int G = tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density);
                        int G2 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                        int i4 = G + G2;
                        float f3 = M * ((float) (-i4));
                        ViewPager2 viewPager2 = (ViewPager2) f9Var.b;
                        if (viewPager2.getOrientation() == 0) {
                            ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                            if (layoutParams != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (v instanceof aba) {
                                    marginLayoutParams.setMarginStart(0);
                                    marginLayoutParams.setMarginEnd(0);
                                } else if (!z) {
                                    marginLayoutParams.setMarginStart(G2);
                                    marginLayoutParams.setMarginEnd(G2);
                                } else if (viewPager2.getCurrentItem() == 0) {
                                    marginLayoutParams.setMarginStart(G2);
                                    marginLayoutParams.setMarginEnd(i4);
                                } else if (viewPager2.getCurrentItem() == xq3.j() - 1) {
                                    marginLayoutParams.setMarginStart(i4);
                                    marginLayoutParams.setMarginEnd(G2);
                                }
                                v.setLayoutParams(marginLayoutParams);
                                if (!z) {
                                    f3 = 0.0f;
                                } else if (c54.K(viewPager2)) {
                                    f3 = -f3;
                                }
                                v.setTranslationX(f3);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                        }
                        i3++;
                    } else {
                        Locale locale = Locale.US;
                        throw new IllegalStateException(wg0.h("LayoutManager returned a null child at pos ", i3, "/", linearLayoutManager.w(), " while transforming pages"));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void c(int i) {
    }
}
