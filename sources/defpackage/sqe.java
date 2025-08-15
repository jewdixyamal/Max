package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;

/* renamed from: sqe  reason: default package */
public final class sqe implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ vqe c;

    public /* synthetic */ sqe(View view, vqe vqe, int i) {
        this.a = i;
        this.b = view;
        this.c = vqe;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [njc] */
    /* JADX WARNING: type inference failed for: r4v10, types: [rg7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewAttachedToWindow(android.view.View r4) {
        /*
            r3 = this;
            int r4 = r3.a
            switch(r4) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            android.view.View r4 = r3.b
            r4.removeOnAttachStateChangeListener(r3)
            vqe r3 = r3.c
            t4f r4 = r3.c
            q0e r4 = r4.a
            ap8 r0 = new ap8
            r1 = 15
            r0.<init>(r4, r3, r1)
            tqe r4 = new tqe
            r1 = 0
            r4.<init>(r3, r1)
            zn5 r1 = new zn5
            r2 = 5
            r1.<init>(r0, r4, r2)
            android.widget.TextView r4 = r3.b     // Catch:{ all -> 0x002b }
            rg7 r4 = defpackage.lnf.b(r4)     // Catch:{ all -> 0x002b }
            goto L_0x0032
        L_0x002b:
            r4 = move-exception
            njc r0 = new njc
            r0.<init>(r4)
            r4 = r0
        L_0x0032:
            boolean r0 = r4 instanceof defpackage.njc
            if (r0 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r3 = r4
        L_0x0038:
            sx3 r3 = (defpackage.sx3) r3
            defpackage.od2.L(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqe.onViewAttachedToWindow(android.view.View):void");
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                return;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                vqe vqe = this.c;
                try {
                    CancellationException cancellationException = new CancellationException("onDetach");
                    cancellationException.initCause((Throwable) null);
                    j1e.i(vqe, cancellationException);
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
