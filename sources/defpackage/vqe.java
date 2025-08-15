package defpackage;

import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: vqe  reason: default package */
public final class vqe implements sx3 {
    public final /* synthetic */ ContextScope a;
    public final TextView b;
    public final t4f c;
    public final float o;

    public vqe(TextView textView, t4f t4f) {
        hde a2 = f46.a();
        jd4 jd4 = ql4.a;
        this.a = new ContextScope(a2.plus(MainDispatcherLoader.dispatcher));
        this.b = textView;
        this.c = t4f;
        this.o = textView.getTextSize();
        if (!textView.isAttachedToWindow()) {
            try {
                CancellationException cancellationException = new CancellationException("onDetach");
                cancellationException.initCause((Throwable) null);
                j1e.i(this, cancellationException);
            } catch (Throwable unused) {
            }
        } else {
            textView.addOnAttachStateChangeListener(new sqe(textView, this, 1));
        }
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [njc] */
    /* JADX WARNING: type inference failed for: r0v7, types: [rg7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r5 = this;
            t4f r0 = r5.c
            q0e r1 = r0.a
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            android.widget.TextView r2 = r5.b
            r2.getContext()
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            r4 = 2
            float r1 = android.util.TypedValue.applyDimension(r4, r1, r3)
            float r3 = r5.o
            float r1 = r1 + r3
            r3 = 0
            r2.setTextSize(r3, r1)
            boolean r1 = r2.isAttachedToWindow()
            if (r1 == 0) goto L_0x005a
            q0e r0 = r0.a
            ap8 r1 = new ap8
            r3 = 15
            r1.<init>(r0, r5, r3)
            tqe r0 = new tqe
            r3 = 0
            r0.<init>(r5, r3)
            zn5 r3 = new zn5
            r4 = 5
            r3.<init>(r1, r0, r4)
            rg7 r0 = defpackage.lnf.b(r2)     // Catch:{ all -> 0x0047 }
            goto L_0x004e
        L_0x0047:
            r0 = move-exception
            njc r1 = new njc
            r1.<init>(r0)
            r0 = r1
        L_0x004e:
            boolean r1 = r0 instanceof defpackage.njc
            if (r1 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r5 = r0
        L_0x0054:
            sx3 r5 = (defpackage.sx3) r5
            defpackage.od2.L(r3, r5)
            goto L_0x0063
        L_0x005a:
            sqe r0 = new sqe
            r1 = 0
            r0.<init>(r2, r5, r1)
            r2.addOnAttachStateChangeListener(r0)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqe.a():void");
    }

    public final lx3 getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}
