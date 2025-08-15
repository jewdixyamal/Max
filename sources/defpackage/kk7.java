package defpackage;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: kk7  reason: default package */
public final class kk7 implements TransformationMethod {
    public hk7 a;
    public final boolean b;
    public final boolean c;
    public final k56 d;
    public final l7 e;

    public kk7(hk7 hk7, k56 k56, int i) {
        hk7 = (i & 1) != 0 ? null : hk7;
        boolean z = (i & 2) != 0;
        this.a = hk7;
        this.b = z;
        this.c = false;
        this.d = k56;
        this.e = new l7(0);
    }

    public static void a(CharSequence charSequence) {
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    if (obj instanceof gk7) {
                        ((gk7) obj).a = null;
                    } else if (obj instanceof cmb) {
                        ((cmb) obj).o = null;
                    } else if (obj instanceof ti6) {
                        ((ti6) obj).c = null;
                    } else if (obj instanceof cq0) {
                        ((cq0) obj).c = null;
                    } else if (obj instanceof qu8) {
                        ((qu8) obj).c = null;
                    } else if (obj instanceof ek7) {
                        ((ek7) obj).c = null;
                    }
                }
            }
        }
    }

    public final void b(View view, String str, lk7 lk7, ClickableSpan clickableSpan) {
        long currentTimeMillis = System.currentTimeMillis();
        l7 l7Var = this.e;
        if (currentTimeMillis - l7Var.c > l7Var.b) {
            l7Var.c = currentTimeMillis;
            hk7 hk7 = this.a;
            if (hk7 == null) {
                hk7 = view instanceof hk7 ? (hk7) view : null;
            }
            if (hk7 != null) {
                hk7.b(str, lk7, clickableSpan);
            }
        }
    }

    public final void c(CharSequence charSequence) {
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
            if (spans != null) {
                for (Object d2 : spans) {
                    d(d2);
                }
            }
        }
    }

    public final void d(Object obj) {
        if (obj != null) {
            if (obj instanceof gk7) {
                ((gk7) obj).a = this.a;
            } else if (obj instanceof cmb) {
                ((cmb) obj).o = new ik7(this);
            } else if (obj instanceof ti6) {
                ((ti6) obj).c = new fk7(this, obj);
            } else if (obj instanceof cq0) {
                ((cq0) obj).c = new fk7(this, obj);
            } else if (obj instanceof qu8) {
                ((qu8) obj).c = new jk7(this);
            } else if (obj instanceof ek7) {
                ((ek7) obj).c = new fk7(this, obj);
            }
        }
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        Spannable k = qx7.k(charSequence, ((Number) this.d.invoke()).intValue(), this.b, this.c, new jy2(26, this));
        return k == null ? charSequence : k;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
