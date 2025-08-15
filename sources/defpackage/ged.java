package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.settings.SettingsAvatarBottomSheet;

/* renamed from: ged  reason: default package */
public final class ged extends LinearLayout implements kre {
    public final AppCompatTextView a;
    public final AppCompatTextView b;
    public final LinkedHashMap c;

    public ged(SettingsAvatarBottomSheet settingsAvatarBottomSheet, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, Context context) {
        super(context);
        AppCompatTextView appCompatTextView;
        bc7[] bc7Arr = SettingsAvatarBottomSheet.C0;
        settingsAvatarBottomSheet.getClass();
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), (AttributeSet) null);
        i4f.c.b(appCompatTextView2, du4.b);
        appCompatTextView2.setText(charSequence);
        appCompatTextView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        bc7 bc7 = SettingsAvatarBottomSheet.C0[1];
        int i = 16;
        layoutParams.bottomMargin = tu0.G((((jqe) settingsAvatarBottomSheet.z0.a(settingsAvatarBottomSheet)) == null ? (float) 16 : (float) 12) * fk4.d().getDisplayMetrics().density);
        addView(appCompatTextView2, layoutParams);
        this.a = appCompatTextView2;
        if (charSequence2 != null) {
            appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
            i4f.n.b(appCompatTextView, du4.b);
            appCompatTextView.setText(charSequence2);
            appCompatTextView.setGravity(17);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            layoutParams2.bottomMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
            addView(appCompatTextView, layoutParams2);
        } else {
            appCompatTextView = null;
        }
        this.b = appCompatTextView;
        int Z = mz7.Z(z53.S(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z >= 16 ? Z : i);
        for (Object next : arrayList) {
            fed fed = (fed) next;
            int i2 = fed.a;
            CharSequence b2 = fed.b.b(getContext());
            AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), (AttributeSet) null);
            i4f.C.b(appCompatTextView3, du4.b);
            appCompatTextView3.setText(b2);
            appCompatTextView3.setGravity(17);
            tu0.K(appCompatTextView3, 300, new elb(settingsAvatarBottomSheet, i2));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 17;
            float f = (float) 15;
            layoutParams3.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
            layoutParams3.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
            addView(appCompatTextView3, layoutParams3);
            linkedHashMap.put(appCompatTextView3, next);
        }
        this.c = linkedHashMap;
        setOrientation(1);
        setGravity(17);
        onThemeChanged(qp4.u0.j(this));
    }

    public final Map<TextView, fed> getButtonViews() {
        return this.c;
    }

    public final TextView getDescriptionView() {
        return this.b;
    }

    public final TextView getTitleView() {
        return this.a;
    }

    public final void onThemeChanged(fka fka) {
        int i;
        this.a.setTextColor(fka.getText().e);
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(fka.getText().g);
        }
        for (Map.Entry entry : this.c.entrySet()) {
            TextView textView = (TextView) entry.getKey();
            int s = au1.s(((fed) entry.getValue()).c);
            if (s == 0) {
                i = fka.getText().j;
            } else if (s == 1) {
                i = fka.getText().h;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            textView.setTextColor(i);
        }
    }
}
