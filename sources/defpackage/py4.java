package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: py4  reason: default package */
public final class py4 implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ py4(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    public final void afterTextChanged(Editable editable) {
        c4f[] c4fArr;
        Object value;
        q0e q0e;
        Object value2;
        int i;
        Object[] objArr;
        switch (this.a) {
            case 0:
                if (!TextUtils.isEmpty(editable) && !this.b) {
                    this.b = true;
                    String obj = editable.toString();
                    if (!TextUtils.isEmpty(obj)) {
                        for (CharSequence charSequence : ((tx4) this.c).c(obj)) {
                            int indexOf = obj.indexOf(charSequence.toString());
                            if (indexOf >= 0 && ((c4fArr = (c4f[]) editable.getSpans(indexOf, charSequence.length() + indexOf, c4f.class)) == null || c4fArr.length <= 0)) {
                                editable.replace(indexOf, charSequence.length() + indexOf, charSequence);
                            }
                        }
                    }
                    this.b = false;
                    return;
                }
                return;
            default:
                sv8 sv8 = (sv8) this.c;
                q0e q0e2 = sv8.L0;
                do {
                    value = q0e2.getValue();
                    ((Number) value).intValue();
                } while (!q0e2.c(value, Integer.valueOf(sv8.c.getSelectionEnd())));
                do {
                    q0e = sv8.J0;
                    value2 = q0e.getValue();
                    CharSequence charSequence2 = (CharSequence) value2;
                    objArr = null;
                } while (!q0e.c(value2, editable != null ? editable.subSequence(0, editable.length()) : null));
                pq9 pq9 = qp4.u0;
                if (editable == null || w9e.C0(editable)) {
                    sv8.k(pq9.j(sv8));
                } else if (!this.b) {
                    sv8.k(pq9.j(sv8));
                }
                if (editable != null) {
                    try {
                        objArr = editable.getSpans(0, editable.length(), me.class);
                    } catch (Throwable unused) {
                    }
                    if (objArr == null) {
                        objArr = new me[0];
                    }
                    for (me meVar : (me[]) objArr) {
                        ((ak) meVar).s0.start();
                    }
                    return;
                }
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                return;
            default:
                this.b = !(charSequence == null || w9e.C0(charSequence));
                return;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }
}
