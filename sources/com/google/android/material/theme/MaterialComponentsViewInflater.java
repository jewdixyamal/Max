package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;

public class MaterialComponentsViewInflater extends so {
    public final jm a(Context context, AttributeSet attributeSet) {
        return new u08(context, attributeSet);
    }

    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new l18(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [mn, android.widget.CompoundButton, o18, android.view.View] */
    public final mn d(Context context, AttributeSet attributeSet) {
        int i = tsb.radioButtonStyle;
        int i2 = o18.u0;
        ? mnVar = new mn(y18.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = mnVar.getContext();
        TypedArray d = sre.d(context2, attributeSet, z2c.MaterialRadioButton, i, i2, new int[0]);
        if (d.hasValue(z2c.MaterialRadioButton_buttonTint)) {
            fd3.c(mnVar, ju0.q(context2, d, z2c.MaterialRadioButton_buttonTint));
        }
        mnVar.t0 = d.getBoolean(z2c.MaterialRadioButton_useMaterialThemeColors, false);
        d.recycle();
        return mnVar;
    }

    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(y18.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = appCompatTextView.getContext();
        if (kq0.E(tsb.textAppearanceLineHeightEnabled, context2, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, z2c.MaterialTextView, 16842884, 0);
            int[] iArr = {z2c.MaterialTextView_android_lineHeight, z2c.MaterialTextView_lineHeight};
            int i = -1;
            for (int i2 = 0; i2 < 2 && i < 0; i2++) {
                i = ju0.r(context2, obtainStyledAttributes, iArr[i2], -1);
            }
            obtainStyledAttributes.recycle();
            if (i == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, z2c.MaterialTextView, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(z2c.MaterialTextView_android_textAppearance, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, z2c.MaterialTextAppearance);
                    Context context3 = appCompatTextView.getContext();
                    int[] iArr2 = {z2c.MaterialTextAppearance_android_lineHeight, z2c.MaterialTextAppearance_lineHeight};
                    int i3 = -1;
                    for (int i4 = 0; i4 < 2 && i3 < 0; i4++) {
                        i3 = ju0.r(context3, obtainStyledAttributes3, iArr2[i4], -1);
                    }
                    obtainStyledAttributes3.recycle();
                    if (i3 >= 0) {
                        appCompatTextView.setLineHeight(i3);
                    }
                }
            }
        }
        return appCompatTextView;
    }
}
