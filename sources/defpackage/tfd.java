package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: tfd  reason: default package */
public final class tfd extends AppCompatTextView {
    public final /* synthetic */ ufd u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tfd(Context context, AttributeSet attributeSet, ufd ufd) {
        super(context, attributeSet);
        this.u0 = ufd;
        setId(pga.g);
        setLayoutParams(new ti3(-2, -2));
        i4f.j.b(this, du4.b);
        setPadding(0, 0, 0, 0);
        setMaxLines(2);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.Shader] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSizeChanged(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            ufd r5 = r2.u0
            jfd r6 = r5.W0
            jfd r0 = defpackage.jfd.Y
            r1 = 0
            if (r6 != r0) goto L_0x0032
            android.graphics.Matrix r6 = r5.getTitleGradientMatrix()
            r6.reset()
            float r3 = (float) r3
            float r4 = (float) r4
            r6.setScale(r3, r4)
            r3 = 0
            r6.postTranslate(r3, r3)
            android.text.TextPaint r2 = r2.getPaint()
            android.graphics.Shader r2 = r2.getShader()
            boolean r3 = r2 instanceof android.graphics.LinearGradient
            if (r3 == 0) goto L_0x0028
            r1 = r2
            android.graphics.LinearGradient r1 = (android.graphics.LinearGradient) r1
        L_0x0028:
            if (r1 == 0) goto L_0x0039
            android.graphics.Matrix r2 = r5.getTitleGradientMatrix()
            r1.setLocalMatrix(r2)
            goto L_0x0039
        L_0x0032:
            android.text.TextPaint r2 = r2.getPaint()
            r2.setShader(r1)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfd.onSizeChanged(int, int, int, int):void");
    }
}
