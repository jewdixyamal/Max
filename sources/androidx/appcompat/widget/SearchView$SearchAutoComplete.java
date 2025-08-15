package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;

public class SearchView$SearchAutoComplete extends jm {
    public int s0 = getThreshold();
    public o0d t0;
    public boolean u0;
    public final q57 v0 = new q57(22, this);

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, vsb.autoCompleteTextViewStyle);
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i < 600) {
            return (i < 640 || i2 < 480) ? 160 : 192;
        }
        return 192;
    }

    public final boolean enoughToFilter() {
        return this.s0 <= 0 || super.enoughToFilter();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.u0) {
            q57 q57 = this.v0;
            removeCallbacks(q57);
            post(q57);
        }
        return onCreateInputConnection;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.t0.onTextFocusChanged();
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.t0.clearFocus();
                    setImeVisibility(false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.t0.hasFocus() && getVisibility() == 0) {
            this.u0 = true;
            if (o0d.isLandscapeMode(getContext())) {
                h0d.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                }
            }
        }
    }

    public final void performCompletion() {
    }

    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        q57 q57 = this.v0;
        if (!z) {
            this.u0 = false;
            removeCallbacks(q57);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else if (inputMethodManager.isActive(this)) {
            this.u0 = false;
            removeCallbacks(q57);
            inputMethodManager.showSoftInput(this, 0);
        } else {
            this.u0 = true;
        }
    }

    public void setSearchView(o0d o0d) {
        this.t0 = o0d;
    }

    public void setThreshold(int i) {
        super.setThreshold(i);
        this.s0 = i;
    }
}
