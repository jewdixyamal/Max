package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.google.android.material.chip.Chip;

/* renamed from: e62  reason: default package */
public final class e62 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ e62(View view, int i) {
        this.a = i;
        this.b = view;
    }

    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                if (outline != null) {
                    f62 f62 = (f62) this.b;
                    outline.setRoundRect(0, 0, f62.getWidth(), f62.getHeight(), fk4.d().getDisplayMetrics().density * 12.0f);
                    return;
                }
                return;
            case 1:
                n03 n03 = ((Chip) this.b).s0;
                if (n03 != null) {
                    n03.getOutline(outline);
                    return;
                } else {
                    outline.setAlpha(0.0f);
                    return;
                }
            case 2:
                n63 n63 = (n63) this.b;
                outline.setOval(0, 0, n63.getWidth(), n63.getHeight());
                return;
            case 3:
                if (outline != null) {
                    zt3 zt3 = (zt3) this.b;
                    outline.setRoundRect(zt3.getLeft(), zt3.getTop(), zt3.getRight(), zt3.getBottom(), zt3.a);
                    return;
                }
                return;
            case 4:
                if (outline != null) {
                    ImageView imageView = (ImageView) this.b;
                    outline.setOval(0, 0, imageView.getWidth(), imageView.getHeight());
                    return;
                }
                return;
            case 5:
                if (outline != null) {
                    zre zre = (zre) this.b;
                    outline.setRoundRect(0, 0, zre.getWidth(), zre.getHeight(), fk4.d().getDisplayMetrics().density * 10.0f);
                    return;
                }
                return;
            default:
                if (outline != null) {
                    q8b q8b = (q8b) this.b;
                    outline.setOval(0, 0, view != null ? view.getMeasuredWidth() : q8b.getMeasuredWidth(), view != null ? view.getMeasuredHeight() : q8b.getMeasuredHeight());
                    return;
                }
                return;
        }
    }
}
