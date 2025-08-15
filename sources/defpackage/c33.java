package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: c33  reason: default package */
public final class c33 extends LinearLayout implements kre {
    public final AppCompatTextView a;
    public final OneMeButton b;
    public final OneMeButton c;

    public c33(FrameLayout frameLayout, ClearRecentSearchBottomSheet clearRecentSearchBottomSheet, Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        appCompatTextView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(appCompatTextView.getContext().getString(r8a.w));
        i4f.c.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().e);
        this.a = appCompatTextView;
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(View.generateViewId());
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c7a c7a = c7a.c;
        oneMeButton.setSize(c7a);
        b7a b7a = b7a.o;
        oneMeButton.setMode(b7a);
        oneMeButton.setAppearance(z6a.b);
        oneMeButton.setText(r8a.v);
        tu0.K(oneMeButton, 300, new b33(clearRecentSearchBottomSheet, 0));
        this.b = oneMeButton;
        OneMeButton oneMeButton2 = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton2.setId(View.generateViewId());
        oneMeButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton2.setSize(c7a);
        oneMeButton2.setMode(b7a);
        oneMeButton2.setAppearance(z6a.o);
        oneMeButton2.setText(r8a.u);
        tu0.K(oneMeButton2, 300, new b33(clearRecentSearchBottomSheet, 1));
        this.c = oneMeButton2;
        setOrientation(1);
        addView(appCompatTextView);
        addView(oneMeButton);
        addView(oneMeButton2);
        float f = (float) 12;
        frameLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(((float) 26) * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
    }

    public final OneMeButton getCancel() {
        return this.c;
    }

    public final OneMeButton getConfirm() {
        return this.b;
    }

    public final AppCompatTextView getTitle() {
        return this.a;
    }

    public final void onThemeChanged(fka fka) {
        this.a.setTextColor(fka.getText().e);
        this.b.onThemeChanged(fka);
        this.c.onThemeChanged(fka);
    }
}
