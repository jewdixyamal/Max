package defpackage;

import android.widget.ArrayAdapter;

/* renamed from: qc  reason: default package */
public final class qc extends ArrayAdapter {
    public final long getItemId(int i) {
        return (long) i;
    }

    public final boolean hasStableIds() {
        return true;
    }
}
