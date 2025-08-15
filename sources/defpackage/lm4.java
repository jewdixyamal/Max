package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: lm4  reason: default package */
public final class lm4 extends ndc {
    public static final int[] X = {16843284};
    public final /* synthetic */ int a;
    public final int b;
    public Object c;
    public final Object o;

    public lm4(Context context) {
        this.a = 0;
        this.o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(X);
        this.c = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.b = 1;
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.c;
                if (drawable == null) {
                    rect.set(0, 0, 0, 0);
                    return;
                } else if (this.b == 1) {
                    rect.set(0, 0, 0, drawable.getIntrinsicHeight());
                    return;
                } else {
                    rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
                    return;
                }
            default:
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                int i = -1;
                if (R != -1) {
                    int i2 = ((o1d) this.c).i(R);
                    if (i2 != 0) {
                        i = r1d.$EnumSwitchMapping$0[au1.s(i2)];
                    }
                    int i3 = this.b;
                    bi9 bi9 = (bi9) this.o;
                    if (i == 1) {
                        if (R != 0) {
                            rect.top = tu0.G(((float) i3) * fk4.d().getDisplayMetrics().density);
                        }
                        bi9.a(R);
                        return;
                    } else if (i != 2) {
                        bi9.h(R);
                        return;
                    } else {
                        if (R != 0) {
                            rect.top = tu0.G(((float) i3) * fk4.d().getDisplayMetrics().density);
                        }
                        bi9.a(R);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, zdc zdc) {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.a) {
            case 0:
                if (recyclerView.getLayoutManager() != null && ((Drawable) this.c) != null) {
                    int i5 = this.b;
                    Rect rect = (Rect) this.o;
                    int i6 = 0;
                    if (i5 == 1) {
                        canvas.save();
                        if (recyclerView.getClipToPadding()) {
                            i3 = recyclerView.getPaddingLeft();
                            i4 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                            canvas.clipRect(i3, recyclerView.getPaddingTop(), i4, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                        } else {
                            i4 = recyclerView.getWidth();
                            i3 = 0;
                        }
                        int childCount = recyclerView.getChildCount();
                        while (i6 < childCount) {
                            View childAt = recyclerView.getChildAt(i6);
                            RecyclerView.V(rect, childAt);
                            int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                            ((Drawable) this.c).setBounds(i3, round - ((Drawable) this.c).getIntrinsicHeight(), i4, round);
                            ((Drawable) this.c).draw(canvas);
                            i6++;
                        }
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    if (recyclerView.getClipToPadding()) {
                        i = recyclerView.getPaddingTop();
                        i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                        canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), i2);
                    } else {
                        i2 = recyclerView.getHeight();
                        i = 0;
                    }
                    int childCount2 = recyclerView.getChildCount();
                    while (i6 < childCount2) {
                        View childAt2 = recyclerView.getChildAt(i6);
                        recyclerView.getLayoutManager().A(rect, childAt2);
                        int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
                        ((Drawable) this.c).setBounds(round2 - ((Drawable) this.c).getIntrinsicWidth(), i, round2, i2);
                        ((Drawable) this.c).draw(canvas);
                        i6++;
                    }
                    canvas.restore();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public lm4(bkg bkg, int i) {
        this.a = 1;
        this.c = bkg;
        this.b = i;
        bi9 bi9 = k37.a;
        this.o = new bi9();
    }
}
