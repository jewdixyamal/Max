package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: ng6  reason: default package */
public final class ng6 {
    public final ViewPager2 a;
    public final rg6 b;
    public boolean c;
    public hdc d;
    public mg6 e;
    public pz4 f;

    public ng6(ViewPager2 viewPager2, rg6 rg6) {
        this.a = viewPager2;
        this.b = rg6;
    }

    public final void a() {
        hdc hdc = this.d;
        if (hdc != null) {
            try {
                int j = hdc.j();
                this.b.b(j, j == 0 ? 0 : Math.min(this.a.getCurrentItem(), j - 1));
            } catch (IllegalArgumentException e2) {
                String name = ng6.class.getName();
                String message = e2.getMessage();
                hm9.l0(name, "updatePagesNumber error: " + message, e2);
            }
        }
    }
}
