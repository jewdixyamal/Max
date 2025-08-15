package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

public class Preference implements Comparable<Preference> {
    public final String X;
    public final Object Y;
    public f7b Z;
    public final Context a;
    public final int b;
    public final CharSequence c;
    public final CharSequence o;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.b = Integer.MAX_VALUE;
        this.a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.Preference, i, 0);
        obtainStyledAttributes.getResourceId(t2c.Preference_icon, obtainStyledAttributes.getResourceId(t2c.Preference_android_icon, 0));
        int i2 = t2c.Preference_key;
        int i3 = t2c.Preference_android_key;
        String string = obtainStyledAttributes.getString(i2);
        this.X = string == null ? obtainStyledAttributes.getString(i3) : string;
        int i4 = t2c.Preference_title;
        int i5 = t2c.Preference_android_title;
        CharSequence text = obtainStyledAttributes.getText(i4);
        this.c = text == null ? obtainStyledAttributes.getText(i5) : text;
        int i6 = t2c.Preference_summary;
        int i7 = t2c.Preference_android_summary;
        CharSequence text2 = obtainStyledAttributes.getText(i6);
        this.o = text2 == null ? obtainStyledAttributes.getText(i7) : text2;
        this.b = obtainStyledAttributes.getInt(t2c.Preference_order, obtainStyledAttributes.getInt(t2c.Preference_android_order, Integer.MAX_VALUE));
        int i8 = t2c.Preference_fragment;
        int i9 = t2c.Preference_android_fragment;
        if (obtainStyledAttributes.getString(i8) == null) {
            obtainStyledAttributes.getString(i9);
        }
        obtainStyledAttributes.getResourceId(t2c.Preference_layout, obtainStyledAttributes.getResourceId(t2c.Preference_android_layout, tyb.preference));
        obtainStyledAttributes.getResourceId(t2c.Preference_widgetLayout, obtainStyledAttributes.getResourceId(t2c.Preference_android_widgetLayout, 0));
        obtainStyledAttributes.getBoolean(t2c.Preference_enabled, obtainStyledAttributes.getBoolean(t2c.Preference_android_enabled, true));
        boolean z = obtainStyledAttributes.getBoolean(t2c.Preference_selectable, obtainStyledAttributes.getBoolean(t2c.Preference_android_selectable, true));
        obtainStyledAttributes.getBoolean(t2c.Preference_persistent, obtainStyledAttributes.getBoolean(t2c.Preference_android_persistent, true));
        ote.x(obtainStyledAttributes, t2c.Preference_dependency, t2c.Preference_android_dependency);
        int i10 = t2c.Preference_allowDividerAbove;
        obtainStyledAttributes.getBoolean(i10, obtainStyledAttributes.getBoolean(i10, z));
        int i11 = t2c.Preference_allowDividerBelow;
        obtainStyledAttributes.getBoolean(i11, obtainStyledAttributes.getBoolean(i11, z));
        if (obtainStyledAttributes.hasValue(t2c.Preference_defaultValue)) {
            this.Y = c(obtainStyledAttributes, t2c.Preference_defaultValue);
        } else if (obtainStyledAttributes.hasValue(t2c.Preference_android_defaultValue)) {
            this.Y = c(obtainStyledAttributes, t2c.Preference_android_defaultValue);
        }
        obtainStyledAttributes.getBoolean(t2c.Preference_shouldDisableView, obtainStyledAttributes.getBoolean(t2c.Preference_android_shouldDisableView, true));
        if (obtainStyledAttributes.hasValue(t2c.Preference_singleLineTitle)) {
            obtainStyledAttributes.getBoolean(t2c.Preference_singleLineTitle, obtainStyledAttributes.getBoolean(t2c.Preference_android_singleLineTitle, true));
        }
        obtainStyledAttributes.getBoolean(t2c.Preference_iconSpaceReserved, obtainStyledAttributes.getBoolean(t2c.Preference_android_iconSpaceReserved, false));
        int i12 = t2c.Preference_isPreferenceVisible;
        obtainStyledAttributes.getBoolean(i12, obtainStyledAttributes.getBoolean(i12, true));
        int i13 = t2c.Preference_enableCopying;
        obtainStyledAttributes.getBoolean(i13, obtainStyledAttributes.getBoolean(i13, false));
        obtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        f7b f7b = this.Z;
        return f7b != null ? f7b.k(this) : this.o;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i) {
        return null;
    }

    public final int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = preference.b;
        int i2 = this.b;
        if (i2 != i) {
            return i2 - i;
        }
        CharSequence charSequence = preference.c;
        CharSequence charSequence2 = this.c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            sb.append(a2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ote.m(rsb.preferenceStyle, 16842894, context));
    }
}
