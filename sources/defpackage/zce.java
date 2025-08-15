package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* renamed from: zce  reason: default package */
public final /* synthetic */ class zce implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuggestionsWidget b;

    public /* synthetic */ zce(SuggestionsWidget suggestionsWidget, int i) {
        this.a = i;
        this.b = suggestionsWidget;
    }

    public final Object invoke() {
        pq9 pq9 = qp4.u0;
        SuggestionsWidget suggestionsWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = SuggestionsWidget.B0;
                return new pce(suggestionsWidget, ((iba) f9g.a.getAccessor().d(iba.class).getValue()).c());
            case 1:
                bc7[] bc7Arr2 = SuggestionsWidget.B0;
                FrameLayout frameLayout = new FrameLayout(suggestionsWidget.getContext());
                frameLayout.setId(lga.D);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(((float) 36) * fk4.d().getDisplayMetrics().density), tu0.G(((float) 5) * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 49;
                layoutParams.topMargin = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 40.0f));
                frameLayout.setBackgroundColor(pq9.j(frameLayout).getIcon().h);
                return frameLayout;
            case 2:
                bc7[] bc7Arr3 = SuggestionsWidget.B0;
                z15 z15 = new z15(suggestionsWidget.getContext(), (AttributeSet) null);
                z15.setId(lga.F);
                z15.setClipToPadding(false);
                z15.setLayoutParams(new ti3(-1, -2));
                z15.getContext();
                z15.setLayoutManager(new LinearLayoutManager());
                z15.setPager(new j81(suggestionsWidget, 10));
                z15.setThreshold(3);
                return z15;
            case 3:
                bc7[] bc7Arr4 = SuggestionsWidget.B0;
                AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), (AttributeSet) null);
                appCompatImageView.setId(lga.z);
                float f = (float) 44;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams2.gravity = 19;
                appCompatImageView.setLayoutParams(layoutParams2);
                int G = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                appCompatImageView.setPadding(G, G, G, G);
                appCompatImageView.setImageResource(yfa.c);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9.j(appCompatImageView).getIcon().f));
                tu0.K(appCompatImageView, 300, new elb(9, (Object) suggestionsWidget));
                int i = pq9.j(appCompatImageView).d().a.a.h;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable));
                return appCompatImageView;
            case 4:
                bc7[] bc7Arr5 = SuggestionsWidget.B0;
                AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), (AttributeSet) null);
                appCompatTextView.setId(lga.G);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, tu0.G(((float) 44) * fk4.d().getDisplayMetrics().density));
                layoutParams3.gravity = 17;
                appCompatTextView.setLayoutParams(layoutParams3);
                i4f.B.b(appCompatTextView, du4.b);
                appCompatTextView.setGravity(17);
                appCompatTextView.setTextColor(pq9.j(appCompatTextView).getText().e);
                appCompatTextView.setText(mga.s);
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                return appCompatTextView;
            case 5:
                bc7[] bc7Arr6 = SuggestionsWidget.B0;
                FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                frameLayout2.setId(lga.A);
                bc7[] bc7Arr7 = SuggestionsWidget.B0;
                bc7 bc7 = bc7Arr7[4];
                frameLayout2.addView((AppCompatImageView) suggestionsWidget.x0.getValue());
                bc7 bc72 = bc7Arr7[5];
                frameLayout2.addView((AppCompatTextView) suggestionsWidget.y0.getValue());
                frameLayout2.setVisibility(8);
                br7.e(frameLayout2);
                return frameLayout2;
            default:
                bc7[] bc7Arr8 = SuggestionsWidget.B0;
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), (AttributeSet) null);
                appCompatTextView2.setId(lga.C);
                appCompatTextView2.setLayoutParams(new ti3(-2, -2));
                i4f.n.b(appCompatTextView2, du4.b);
                appCompatTextView2.setTextColor(pq9.j(appCompatTextView2).getText().h);
                appCompatTextView2.setText(mga.r);
                appCompatTextView2.setMaxLines(1);
                appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView2.setVisibility(8);
                float f2 = (float) 16;
                appCompatTextView2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
                br7.e(appCompatTextView2);
                return appCompatTextView2;
        }
    }
}
