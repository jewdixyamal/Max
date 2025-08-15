package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: r5f  reason: default package */
public final class r5f extends ndc implements kre {
    public final Rect X = new Rect();
    public FrameLayout Y;
    public du4 Z = du4.b;
    public final m29 a;
    public final RecyclerView b;
    public long c;
    public final gaa o = new gaa(17);

    public r5f(m29 m29, EndlessRecyclerView2 endlessRecyclerView2) {
        this.a = m29;
        this.b = endlessRecyclerView2;
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        super.f(rect, view, recyclerView, zdc);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        gaa gaa = this.o;
        if (R >= 0) {
            m29 m29 = this.a;
            if (R < m29.o.f.size()) {
                long j = this.c;
                if (j != 0) {
                    int K = m29.K(j);
                    MessageModel L = m29.L(K);
                    Long valueOf = L != null ? Long.valueOf(L.c) : null;
                    if (K == R && (valueOf == null || valueOf.longValue() != j)) {
                        rect.top = i().getMeasuredHeight() + rect.top;
                    }
                }
                gaa.E(rect, view, recyclerView);
                return;
            }
        }
        gaa.E(rect, view, recyclerView);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int K;
        MessageModel L;
        if (recyclerView.getChildCount() > 0) {
            m29 m29 = this.a;
            if (m29.j() > 0) {
                long j = this.c;
                if (j != 0 && (K = m29.K(j)) != -1) {
                    int i = 0;
                    while (true) {
                        if (i < recyclerView.getChildCount()) {
                            int i2 = i + 1;
                            View childAt = recyclerView.getChildAt(i);
                            if (childAt != null) {
                                int R = RecyclerView.R(childAt);
                                if (R == K && (L = m29.L(R)) != null) {
                                    if (L.c != this.c) {
                                        View i3 = i();
                                        gaa gaa = this.o;
                                        Rect rect = this.X;
                                        gaa.x(rect, childAt, R);
                                        int i4 = rect.top;
                                        ViewGroup.LayoutParams layoutParams = i3.getLayoutParams();
                                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                                        int i5 = ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) / 2) + i4;
                                        canvas.save();
                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) i3.getLayoutParams();
                                        int i6 = marginLayoutParams2.leftMargin;
                                        c54.L(i6, marginLayoutParams2.topMargin, (i3.getMeasuredWidth() + i6) - marginLayoutParams2.rightMargin, (i3.getMeasuredHeight() + marginLayoutParams2.topMargin) - marginLayoutParams2.bottomMargin, i3, this.b);
                                        canvas.translate(0.0f, (float) i5);
                                        i3.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                                i = i2;
                            } else {
                                throw new IndexOutOfBoundsException();
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final View i() {
        FrameLayout frameLayout = this.Y;
        if (frameLayout != null) {
            return frameLayout;
        }
        RecyclerView recyclerView = this.b;
        int measuredWidth = recyclerView.getMeasuredWidth();
        int measuredHeight = recyclerView.getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return new Space(recyclerView.getContext());
        }
        FrameLayout frameLayout2 = new FrameLayout(recyclerView.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = (float) 8;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams.topMargin = G;
        layoutParams.bottomMargin = G;
        frameLayout2.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        pq9 pq9 = qp4.u0;
        gradientDrawable.setColors(pq9.j(frameLayout2).a().s().b.w);
        frameLayout2.setBackground(gradientDrawable);
        TextView textView = new TextView(recyclerView.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 17);
        int G2 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        layoutParams2.topMargin = G2;
        layoutParams2.bottomMargin = G2;
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setTextColor(pq9.j(textView).a().s().g.b);
        textView.setText(textView.getContext().getString(oda.o0));
        os2.f.b(textView, this.Z);
        frameLayout2.addView(textView);
        frameLayout2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredHeight(), 0, frameLayout2.getLayoutParams().height));
        this.Y = frameLayout2;
        return frameLayout2;
    }

    public final void onThemeChanged(fka fka) {
        FrameLayout frameLayout = this.Y;
        if (frameLayout != null) {
            Drawable background = frameLayout.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(fka.a().s().b.w);
            }
            ((TextView) frameLayout.getChildAt(0)).setTextColor(fka.a().s().g.b);
        }
    }
}
