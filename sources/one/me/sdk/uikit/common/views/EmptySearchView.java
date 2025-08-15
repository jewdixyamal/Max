package one.me.sdk.uikit.common.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0011\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\rJ\u001b\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lone/me/sdk/uikit/common/views/EmptySearchView;", "Landroid/widget/LinearLayout;", "Lkre;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "drawableRes", "Le5f;", "setImage", "(I)V", "titleRes", "setTitle", "descriptionRes", "setDescription", "", "description", "(Ljava/lang/String;)V", "buttonTitle", "setButtonTitle", "Lkotlin/Function0;", "action", "setButtonAction", "(Lk56;)V", "", "visible", "setIsButtonVisible", "(Z)V", "common_release"}, k = 1, mv = {2, 0, 0})
public final class EmptySearchView extends LinearLayout implements kre {
    public static final /* synthetic */ int s0 = 0;
    public final AppCompatImageView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final OneMeButton o;

    public EmptySearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 188;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.setMargins(0, 0, 0, tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density));
        appCompatImageView.setLayoutParams(layoutParams);
        setGravity(17);
        pq9 pq9 = qp4.u0;
        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9.j(appCompatImageView).getIcon().h));
        this.a = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, 0, tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density));
        appCompatTextView.setLayoutParams(layoutParams2);
        i4f.d.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(pq9.j(appCompatTextView).getText().e);
        appCompatTextView.setGravity(17);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density));
        appCompatTextView2.setLayoutParams(layoutParams3);
        i4f.n.b(appCompatTextView2, du4.b);
        appCompatTextView2.setTextColor(pq9.j(appCompatTextView2).getText().g);
        appCompatTextView2.setGravity(17);
        this.c = appCompatTextView2;
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        oneMeButton.setSize(c7a.b);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.a);
        setGravity(17);
        this.o = oneMeButton;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setPaddingRelative(tu0.F(((double) fk4.d().getDisplayMetrics().density) * 21.5d), 0, tu0.F(((double) fk4.d().getDisplayMetrics().density) * 21.5d), 0);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(oneMeButton);
    }

    public final void onThemeChanged(fka fka) {
        this.a.setImageTintList(ColorStateList.valueOf(fka.getIcon().h));
        this.b.setTextColor(fka.getText().e);
        this.c.setTextColor(fka.getText().g);
    }

    public final void setButtonAction(k56 k56) {
        tu0.K(this.o, 300, new m6(9, k56));
    }

    public final void setButtonTitle(int i) {
        this.o.setText(i);
    }

    public final void setDescription(int i) {
        this.c.setText(z7.B(getContext(), i));
    }

    public final void setImage(int i) {
        this.a.setImageDrawable(kt3.b(getContext(), i));
    }

    public final void setIsButtonVisible(boolean z) {
        this.o.setVisibility(z ? 0 : 8);
    }

    public final void setTitle(int i) {
        this.b.setText(z7.B(getContext(), i));
    }

    public final void setDescription(String str) {
        this.c.setText(str);
    }
}
