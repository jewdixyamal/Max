package defpackage;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import org.apache.http.HttpStatus;

/* renamed from: hd7  reason: default package */
public final class hd7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean X;
    public final int a = HttpStatus.SC_BAD_REQUEST;
    public final Rect b = new Rect();
    public final sj3 c;
    public int o;

    public hd7(gd7 gd7, v5 v5Var) {
        this.c = v5Var;
    }

    public final void onGlobalLayout() {
        sj3 sj3 = this.c;
        Rect rect = this.b;
        sj3.accept(rect);
        int height = rect.height();
        int i = this.o;
        if (i != 0) {
            int i2 = this.a;
            if (i > height + i2) {
                this.X = true;
            } else if (i + i2 < height) {
                this.X = false;
            }
        }
        this.o = height;
    }
}
