package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: aw4  reason: default package */
public final class aw4 extends qq9 {
    public final /* synthetic */ int w0;

    public /* synthetic */ aw4(int i) {
        this.w0 = i;
    }

    public final void n(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        float f3;
        switch (this.w0) {
            case 0:
                RectF b = qq9.b(tabLayout, view);
                RectF b2 = qq9.b(tabLayout, view2);
                if (b.left < b2.left) {
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    f2 = (float) (1.0d - Math.cos(d));
                    f3 = (float) Math.sin(d);
                } else {
                    double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
                    f2 = (float) Math.sin(d2);
                    f3 = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(og.c((int) b.left, f2, (int) b2.left), drawable.getBounds().top, og.c((int) b.right, f3, (int) b2.right), drawable.getBounds().bottom);
                return;
            default:
                int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
                if (i >= 0) {
                    view = view2;
                }
                RectF b3 = qq9.b(tabLayout, view);
                float b4 = i < 0 ? og.b(1.0f, 0.0f, 0.0f, 0.5f, f) : og.b(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) b3.left, drawable.getBounds().top, (int) b3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b4 * 255.0f));
                return;
        }
    }
}
