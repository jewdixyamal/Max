package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public abstract class DialogPreference extends Preference {
    public final Drawable s0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.DialogPreference, i, 0);
        ote.x(obtainStyledAttributes, t2c.DialogPreference_dialogTitle, t2c.DialogPreference_android_dialogTitle);
        ote.x(obtainStyledAttributes, t2c.DialogPreference_dialogMessage, t2c.DialogPreference_android_dialogMessage);
        int i2 = t2c.DialogPreference_dialogIcon;
        int i3 = t2c.DialogPreference_android_dialogIcon;
        Drawable drawable = obtainStyledAttributes.getDrawable(i2);
        this.s0 = drawable == null ? obtainStyledAttributes.getDrawable(i3) : drawable;
        ote.x(obtainStyledAttributes, t2c.DialogPreference_positiveButtonText, t2c.DialogPreference_android_positiveButtonText);
        ote.x(obtainStyledAttributes, t2c.DialogPreference_negativeButtonText, t2c.DialogPreference_android_negativeButtonText);
        obtainStyledAttributes.getResourceId(t2c.DialogPreference_dialogLayout, obtainStyledAttributes.getResourceId(t2c.DialogPreference_android_dialogLayout, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ote.m(rsb.dialogPreferenceStyle, 16842897, context));
    }
}
