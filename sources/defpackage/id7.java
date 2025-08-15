package defpackage;

import android.view.View;
import java.util.Objects;

/* renamed from: id7  reason: default package */
public final class id7 implements zb4 {
    public final View a;
    public final hd7 b;
    public int c = 0;

    public id7(View view, gd7 gd7) {
        this.a = view;
        Objects.requireNonNull(view);
        this.b = new hd7(gd7, new v5(4, view));
    }

    public final void onPause(eh7 eh7) {
        hm9.k("id7", "onPause: unregisterGlobalLayoutListener");
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
    }

    public final void onResume(eh7 eh7) {
        hm9.k("id7", "onResume: registerGlobalLayoutListener");
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(this.b);
    }
}
