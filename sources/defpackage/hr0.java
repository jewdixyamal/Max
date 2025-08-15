package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* renamed from: hr0  reason: default package */
public final class hr0 extends cr0 {
    public final Boolean a;
    public final x6g b;
    public Window c;
    public boolean d;

    public hr0(View view, x6g x6g) {
        ColorStateList colorStateList;
        this.b = x6g;
        q18 q18 = BottomSheetBehavior.C(view).i;
        if (q18 != null) {
            colorStateList = q18.a.c;
        } else {
            WeakHashMap weakHashMap = zmf.a;
            colorStateList = omf.g(view);
        }
        if (colorStateList != null) {
            this.a = Boolean.valueOf(mr0.J(colorStateList.getDefaultColor()));
            return;
        }
        ColorStateList r = oag.r(view.getBackground());
        Integer valueOf = r != null ? Integer.valueOf(r.getDefaultColor()) : null;
        if (valueOf != null) {
            this.a = Boolean.valueOf(mr0.J(valueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    public final void a(View view) {
        d(view);
    }

    public final void b(View view) {
        d(view);
    }

    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        x6g x6g = this.b;
        if (top < x6g.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                new a7g(window, window.getDecorView()).b(bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), x6g.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                new a7g(window2, window2.getDecorView()).b(this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c != window) {
            this.c = window;
            if (window != null) {
                this.d = new a7g(window, window.getDecorView()).a.m();
            }
        }
    }
}
