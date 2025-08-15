package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;

public class DropDownPreference extends ListPreference {
    public final ArrayAdapter v0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, rsb.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.v0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.t0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    public final void b() {
        ArrayAdapter arrayAdapter = this.v0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
