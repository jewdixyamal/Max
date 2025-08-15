package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;

/* renamed from: lu3  reason: default package */
public final class lu3 extends qy8 {
    public ey1 I0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: android.text.Spannable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(one.me.messages.list.loader.MessageModel r8, java.util.List r9) {
        /*
            r7 = this;
            int r9 = r8.I0
            ry8 r0 = new ry8
            r0.<init>(r9)
            r7.H0 = r0
            r9 = 0
            android.view.View r0 = r7.a
            pw8 r1 = r8.y0
            if (r1 == 0) goto L_0x0023
            long r2 = r1.a
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0023
            tb r2 = new tb
            r3 = 26
            r2.<init>((java.lang.Object) r7, (int) r3, (java.lang.Object) r1)
            defpackage.tu0.K(r0, 300, r2)
            goto L_0x0029
        L_0x0023:
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setOnClickListener(r9)
        L_0x0029:
            java.lang.CharSequence r1 = r8.o
            boolean r2 = r1 instanceof android.text.Spannable
            if (r2 == 0) goto L_0x0032
            r9 = r1
            android.text.Spannable r9 = (android.text.Spannable) r9
        L_0x0032:
            if (r9 == 0) goto L_0x0054
            int r2 = r9.length()
            r3 = 0
            java.lang.Class<al3> r4 = defpackage.al3.class
            java.lang.Object[] r9 = r9.getSpans(r3, r2, r4)
            al3[] r9 = (defpackage.al3[]) r9
            if (r9 == 0) goto L_0x0054
            int r2 = r9.length
        L_0x0044:
            if (r3 >= r2) goto L_0x0054
            r4 = r9[r3]
            v02 r5 = new v02
            r6 = 26
            r5.<init>(r6, r7)
            r4.b = r5
            int r3 = r3 + 1
            goto L_0x0044
        L_0x0054:
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setText(r1)
            r7.F(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu3.E(one.me.messages.list.loader.MessageModel, java.util.List):void");
    }

    public final void e(v83 v83) {
        TextView textView = (TextView) this.a;
        textView.setTextColor(v83.g.a);
        Drawable background = textView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(v83.b.v);
        }
    }
}
