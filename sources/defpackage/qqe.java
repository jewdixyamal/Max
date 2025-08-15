package defpackage;

import android.graphics.drawable.Drawable;
import android.text.DynamicLayout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: qqe  reason: default package */
public abstract class qqe {
    public static final ArrayList a;

    static {
        List m0 = ys.m0(DynamicLayout.class.getDeclaredClasses());
        ArrayList arrayList = new ArrayList();
        for (Object next : m0) {
            if (SpanWatcher.class.isAssignableFrom((Class) next)) {
                arrayList.add(next);
            }
        }
        a = arrayList;
    }

    public static final ecf a(TextView textView) {
        Drawable drawable = textView.getCompoundDrawablesRelative()[2];
        if (drawable instanceof ecf) {
            return (ecf) drawable;
        }
        return null;
    }

    public static final void b(TextView textView, Object obj) {
        int spanEnd;
        CharSequence text = textView.getText();
        Object[] objArr = null;
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            textView.invalidate();
            return;
        }
        int spanStart = spannable.getSpanStart(obj);
        if (spanStart != -1 && (spanEnd = spannable.getSpanEnd(obj)) >= spanStart) {
            CharSequence text2 = textView.getText();
            Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
            if (spanned != null) {
                objArr = spanned.getSpans(0, textView.getText().length(), SpanWatcher.class);
            }
            if (objArr == null) {
                objArr = new SpanWatcher[0];
            }
            SpanWatcher[] spanWatcherArr = (SpanWatcher[]) objArr;
            if (spanWatcherArr.length != 0) {
                for (SpanWatcher spanWatcher : spanWatcherArr) {
                    ArrayList arrayList = a;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Class) it.next()) == spanWatcher.getClass()) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    spanWatcher.onSpanChanged(spannable, obj, spanStart, spanEnd, spanStart, spanEnd);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean c(android.widget.TextView r2) {
        /*
            ecf r0 = a(r2)
            r1 = 0
            if (r0 == 0) goto L_0x0017
            int r0 = r0.a
            if (r0 != 0) goto L_0x000c
            goto L_0x0017
        L_0x000c:
            float r2 = e(r2)
            int r2 = defpackage.i24.I(r2)
            if (r2 == r0) goto L_0x0017
            r1 = 1
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqe.c(android.widget.TextView):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r2.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(android.widget.TextView r1, defpackage.ecf r2) {
        /*
            r0 = 0
            r1.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r0, r2, r0)
            if (r2 == 0) goto L_0x001f
            int r2 = r2.a
            if (r2 == 0) goto L_0x001f
            int r2 = defpackage.h4f.f(r2)
            float r2 = (float) r2
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            int r2 = defpackage.tu0.G(r2)
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            r1.setCompoundDrawablePadding(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqe.d(android.widget.TextView, ecf):void");
    }

    public static final float e(TextView textView) {
        return textView.getPaint().getTextSize() / textView.getResources().getDisplayMetrics().density;
    }
}
