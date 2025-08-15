package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

public class ListPreference extends DialogPreference {
    public final CharSequence[] t0;
    public final String u0;

    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Object, oz7] */
    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.ListPreference, i, 0);
        int i2 = t2c.ListPreference_entries;
        int i3 = t2c.ListPreference_android_entries;
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(i2);
        this.t0 = textArray == null ? obtainStyledAttributes.getTextArray(i3) : textArray;
        int i4 = t2c.ListPreference_entryValues;
        int i5 = t2c.ListPreference_android_entryValues;
        if (obtainStyledAttributes.getTextArray(i4) == null) {
            obtainStyledAttributes.getTextArray(i5);
        }
        int i6 = t2c.ListPreference_useSimpleSummaryProvider;
        if (obtainStyledAttributes.getBoolean(i6, obtainStyledAttributes.getBoolean(i6, false))) {
            if (oz7.o == null) {
                oz7.o = new Object();
            }
            this.Z = oz7.o;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t2c.Preference, i, 0);
        this.u0 = ote.x(obtainStyledAttributes2, t2c.Preference_summary, t2c.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    public final CharSequence a() {
        f7b f7b = this.Z;
        if (f7b != null) {
            return f7b.k(this);
        }
        Object d = d();
        CharSequence a = super.a();
        String str = this.u0;
        if (str == null) {
            return a;
        }
        if (d == null) {
            d = "";
        }
        String format = String.format(str, new Object[]{d});
        return TextUtils.equals(format, a) ? a : format;
    }

    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final CharSequence d() {
        return null;
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ote.m(rsb.dialogPreferenceStyle, 16842897, context));
    }
}
