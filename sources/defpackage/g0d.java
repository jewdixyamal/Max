package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: g0d  reason: default package */
public final class g0d implements TextView.OnEditorActionListener {
    public final /* synthetic */ o0d a;

    public g0d(o0d o0d) {
        this.a = o0d;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.onSubmitQuery();
        return true;
    }
}
