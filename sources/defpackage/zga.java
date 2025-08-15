package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;

/* renamed from: zga  reason: default package */
public final /* synthetic */ class zga implements TextView.OnEditorActionListener {
    public final /* synthetic */ AppCompatEditText a;

    public /* synthetic */ zga(AppCompatEditText appCompatEditText) {
        this.a = appCompatEditText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        mr0.I(this.a);
        return true;
    }
}
