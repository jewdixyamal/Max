package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* renamed from: vyc  reason: default package */
public final /* synthetic */ class vyc implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchMessageBottomWidget b;

    public /* synthetic */ vyc(SearchMessageBottomWidget searchMessageBottomWidget, int i) {
        this.a = i;
        this.b = searchMessageBottomWidget;
    }

    public final Object invoke() {
        pq9 pq9 = qp4.u0;
        SearchMessageBottomWidget searchMessageBottomWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = SearchMessageBottomWidget.s0;
                AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext(), (AttributeSet) null);
                appCompatTextView.setId(t8a.d);
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                i4f.n.b(appCompatTextView, du4.b);
                appCompatTextView.setTextColor(ColorStateList.valueOf(pq9.j(appCompatTextView).a().h().d.g));
                appCompatTextView.setText(u8a.g);
                appCompatTextView.setLayoutParams(new ti3(-2, -2));
                return appCompatTextView;
            case 1:
                bc7[] bc7Arr2 = SearchMessageBottomWidget.s0;
                AppCompatImageView appCompatImageView = new AppCompatImageView(searchMessageBottomWidget.getContext(), (AttributeSet) null);
                appCompatImageView.setId(t8a.g);
                float f = (float) 32;
                appCompatImageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                appCompatImageView.setImageResource(s8a.d);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9.j(appCompatImageView).a().h().d.g));
                appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(u8a.i));
                int G = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
                appCompatImageView.setPadding(G, G, G, G);
                tu0.K(appCompatImageView, 300, new wyc(searchMessageBottomWidget, 1));
                int i = pq9.j(appCompatImageView).d().a.a.h;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable));
                return appCompatImageView;
            case 2:
                bc7[] bc7Arr3 = SearchMessageBottomWidget.s0;
                AppCompatImageView appCompatImageView2 = new AppCompatImageView(searchMessageBottomWidget.getContext(), (AttributeSet) null);
                appCompatImageView2.setId(t8a.e);
                float f2 = (float) 32;
                appCompatImageView2.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                appCompatImageView2.setImageResource(s8a.c);
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(pq9.j(appCompatImageView2).a().h().d.g));
                appCompatImageView2.setContentDescription(appCompatImageView2.getContext().getString(u8a.f));
                int G2 = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
                appCompatImageView2.setPadding(G2, G2, G2, G2);
                tu0.K(appCompatImageView2, 300, new wyc(searchMessageBottomWidget, 0));
                int i2 = pq9.j(appCompatImageView2).d().a.a.h;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1);
                appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, shapeDrawable2));
                return appCompatImageView2;
            default:
                bc7[] bc7Arr4 = SearchMessageBottomWidget.s0;
                View view = new View(searchMessageBottomWidget.getContext());
                view.setId(t8a.f);
                view.setLayoutParams(new ti3(tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 18) * fk4.d().getDisplayMetrics().density)));
                view.setBackgroundColor(pq9.j(view).a().h().d.g);
                return view;
        }
    }
}
