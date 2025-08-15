package defpackage;

import android.view.View;

/* renamed from: d0d  reason: default package */
public final class d0d implements View.OnFocusChangeListener {
    public final /* synthetic */ o0d a;

    public d0d(o0d o0d) {
        this.a = o0d;
    }

    public final void onFocusChange(View view, boolean z) {
        o0d o0d = this.a;
        View.OnFocusChangeListener onFocusChangeListener = o0d.mOnQueryTextFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(o0d, z);
        }
    }
}
