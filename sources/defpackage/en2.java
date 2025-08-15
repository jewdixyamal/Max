package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: en2  reason: default package */
public final class en2 extends LinearLayout implements hk7, i33 {
    public dn2 a;
    public final kk7 b;
    public final TextView c;

    public en2(Context context) {
        super(context, (AttributeSet) null);
        j33 j33 = new j33(context, this);
        kk7 kk7 = new kk7(this, new md1(13, this), 4);
        this.b = kk7;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        i4f.l.b(textView, du4.b);
        textView.setMovementMethod(j33);
        textView.setTransformationMethod(kk7);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        v3c.y(new v9(3, (Continuation) null, 5), textView);
        textView.setGravity(16);
        this.c = textView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        float f = (float) 12;
        setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        addView(textView);
    }

    public final void b(String str, lk7 lk7, ClickableSpan clickableSpan) {
        dn2 dn2 = this.a;
        if (dn2 != null) {
            ((gaa) ((sy4) dn2).b).G(str, lk7);
        }
    }

    public final boolean d(ClickableSpan clickableSpan, int i, int i2, String str, lk7 lk7, MotionEvent motionEvent) {
        dn2 dn2 = this.a;
        if (dn2 == null) {
            return false;
        }
        ((gaa) ((sy4) dn2).b).H(str, lk7, motionEvent);
        return true;
    }

    public final dn2 getListener() {
        return this.a;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CharSequence text = this.c.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.b.c(spannable);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CharSequence text = this.c.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.b.getClass();
            kk7.a(spannable);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setDescription(java.lang.CharSequence r5) {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.c
            java.lang.CharSequence r1 = r0.getText()
            boolean r2 = r1 instanceof android.text.Spannable
            r3 = 0
            if (r2 == 0) goto L_0x000e
            android.text.Spannable r1 = (android.text.Spannable) r1
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            kk7 r4 = r4.b
            if (r1 != 0) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            r4.getClass()
            defpackage.kk7.a(r1)
        L_0x001a:
            r0.setText(r5)
            r0.setTransformationMethod(r4)
            java.lang.CharSequence r5 = r0.getText()
            boolean r0 = r5 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x002b
            r3 = r5
            android.text.Spannable r3 = (android.text.Spannable) r3
        L_0x002b:
            if (r3 != 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            r4.c(r3)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en2.setDescription(java.lang.CharSequence):void");
    }

    public final void setListener(dn2 dn2) {
        this.a = dn2;
    }
}
