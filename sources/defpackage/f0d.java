package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: f0d  reason: default package */
public final class f0d implements View.OnKeyListener {
    public final /* synthetic */ o0d a;

    public f0d(o0d o0d) {
        this.a = o0d;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        o0d o0d = this.a;
        if (o0d.mSearchable == null) {
            return false;
        }
        if (o0d.mSearchSrcTextView.isPopupShowing() && o0d.mSearchSrcTextView.getListSelection() != -1) {
            return o0d.onSuggestionsKey(view, i, keyEvent);
        }
        if (TextUtils.getTrimmedLength(o0d.mSearchSrcTextView.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        o0d.launchQuerySearch(0, (String) null, o0d.mSearchSrcTextView.getText().toString());
        return true;
    }
}
