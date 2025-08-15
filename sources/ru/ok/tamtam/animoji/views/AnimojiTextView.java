package ru.ok.tamtam.animoji.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/animoji/views/AnimojiTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "value", "getAnimojiEnabled", "()Z", "setAnimojiEnabled", "(Z)V", "animojiEnabled", "animoji_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"WrongCall"})
public class AnimojiTextView extends AppCompatTextView {
    public final dk u0;
    public kpa v0;

    public AnimojiTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void j(AnimojiTextView animojiTextView, CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public static void k(AnimojiTextView animojiTextView, Canvas canvas) {
        super.onDraw(canvas);
    }

    public final boolean getAnimojiEnabled() {
        dk dkVar = this.u0;
        if (dkVar != null) {
            return dkVar.b;
        }
        return false;
    }

    public void onDraw(Canvas canvas) {
        dk dkVar = this.u0;
        if (dkVar != null) {
            boolean z = qh.b;
            if (z) {
                qh.a.getClass();
            }
            ((m56) dkVar.Y).invoke(canvas);
            if (z) {
                qh.a.getClass();
            }
        }
    }

    public final void setAnimojiEnabled(boolean z) {
        dk dkVar = this.u0;
        if (dkVar != null) {
            dkVar.b = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        if ((r2 instanceof defpackage.njc) == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setText(java.lang.CharSequence r8, android.widget.TextView.BufferType r9) {
        /*
            r7 = this;
            dk r0 = r7.u0
            if (r0 != 0) goto L_0x0010
            super.setText(r8, r9)
            kpa r0 = new kpa
            r0.<init>(r8, r9)
            r7.v0 = r0
            goto L_0x00ca
        L_0x0010:
            java.lang.Object r7 = r0.X
            a66 r7 = (defpackage.a66) r7
            if (r8 == 0) goto L_0x00c7
            boolean r1 = defpackage.w9e.C0(r8)
            if (r1 == 0) goto L_0x001e
            goto L_0x00c7
        L_0x001e:
            boolean r1 = r0.b
            if (r1 != 0) goto L_0x0024
            goto L_0x00c7
        L_0x0024:
            fj r1 = defpackage.qh.c
            int r2 = r8.length()
            r3 = 0
            r4 = 0
            boolean r5 = r8 instanceof android.text.Spanned     // Catch:{ all -> 0x003e }
            if (r5 == 0) goto L_0x0034
            r5 = r8
            android.text.Spanned r5 = (android.text.Spanned) r5     // Catch:{ all -> 0x003e }
            goto L_0x0035
        L_0x0034:
            r5 = r4
        L_0x0035:
            if (r5 == 0) goto L_0x003e
            java.lang.Class<c4f> r6 = defpackage.c4f.class
            java.lang.Object[] r2 = r5.getSpans(r3, r2, r6)     // Catch:{ all -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r2 = r4
        L_0x003f:
            if (r2 == 0) goto L_0x0047
            int r2 = r2.length
            if (r2 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r2 = r8
            goto L_0x005c
        L_0x0047:
            vw4 r2 = defpackage.vw4.a()     // Catch:{ all -> 0x0050 }
            java.lang.CharSequence r2 = r2.h(r8)     // Catch:{ all -> 0x0050 }
            goto L_0x0057
        L_0x0050:
            r2 = move-exception
            njc r5 = new njc
            r5.<init>(r2)
            r2 = r5
        L_0x0057:
            boolean r5 = r2 instanceof defpackage.njc
            if (r5 == 0) goto L_0x005c
            goto L_0x0045
        L_0x005c:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 != 0) goto L_0x0064
            r7.invoke(r8, r9)
            goto L_0x00ca
        L_0x0064:
            java.util.List r8 = r1.a(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
            boolean r5 = r8.hasNext()
            if (r5 != 0) goto L_0x00bf
            boolean r8 = r2 instanceof android.text.Spannable
            if (r8 != 0) goto L_0x007c
            goto L_0x00bb
        L_0x007c:
            java.lang.Object r8 = r0.o
            android.view.View r8 = (android.view.View) r8
            boolean r4 = r8 instanceof defpackage.ww4
            if (r4 == 0) goto L_0x0090
            r4 = r8
            ww4 r4 = (defpackage.ww4) r4
            boolean r5 = r4.a()
            if (r5 == 0) goto L_0x0090
            r4.setEmojiCompatEnabled(r3)
        L_0x0090:
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ 1
            r0.c = r3
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x00b0
            java.lang.Object r3 = r0.Z
            hj r3 = (defpackage.hj) r3
            if (r3 != 0) goto L_0x00b0
            hj r3 = new hj
            r3.<init>(r8)
            r0.Z = r3
            r3.a()
        L_0x00b0:
            r8 = r2
            android.text.Spannable r8 = (android.text.Spannable) r8
            fj r0 = defpackage.qh.c
            defpackage.fp3.c(r8, r1, r0)
            defpackage.fp3.D(r2)
        L_0x00bb:
            r7.invoke(r2, r9)
            goto L_0x00ca
        L_0x00bf:
            java.lang.Object r7 = r8.next()
            defpackage.au1.r(r7)
            throw r4
        L_0x00c7:
            r7.invoke(r8, r9)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.animoji.views.AnimojiTextView.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }

    public AnimojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u0 = new dk(this, new bk(0, this), new l(9, this));
        kpa kpa = this.v0;
        if (kpa != null) {
            setText((CharSequence) kpa.a, (TextView.BufferType) kpa.b);
        }
        this.v0 = null;
    }
}
