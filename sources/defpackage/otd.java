package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Iterator;

/* renamed from: otd  reason: default package */
public final class otd implements TextWatcher {
    public final /* synthetic */ ptd a;
    public final /* synthetic */ int b;

    public otd(ptd ptd, int i) {
        this.a = ptd;
        this.b = i;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        fg3 fg3;
        l17 H0;
        int length = charSequence != null ? charSequence.length() : 0;
        String obj = charSequence != null ? charSequence.subSequence(i, i3 + i).toString() : null;
        String str = "";
        if (obj == null) {
            obj = str;
        }
        int i4 = this.b;
        ptd ptd = this.a;
        if (length == 2 && obj.length() == 1) {
            jg3 jg3 = (jg3) ptd.G0;
            if (jg3.I0(i4) && obj.length() == 1) {
                l17 H02 = jg3.H0(i4);
                if (H02 != null) {
                    ((ptd) H02).B(obj);
                }
                l17 H03 = jg3.H0(i4 + 1);
                if (H03 != null) {
                    ((ptd) H03).H0.requestFocus();
                }
            }
        } else if (length > 1) {
            ((jg3) ptd.G0).J0(i4, String.valueOf(charSequence));
        } else {
            g17 g17 = ptd.G0;
            String valueOf = String.valueOf(charSequence);
            jg3 jg32 = (jg3) g17;
            if (jg32.I0(i4) && valueOf.length() == 1) {
                if (i4 < jg32.getCountCells() - 1 && (H0 = jg32.H0(i4 + 1)) != null) {
                    ((ptd) H0).H0.requestFocus();
                }
                Iterator it = jg3.G0(jg32).iterator();
                while (it.hasNext()) {
                    str = au1.g(str, ((ptd) ((l17) it.next())).A());
                }
                if (str.length() > 0 && str.length() == jg32.getCountCells() && TextUtils.isDigitsOnly(str) && (fg3 = jg32.W1) != null) {
                    fg3.e(str);
                }
            }
        }
    }
}
