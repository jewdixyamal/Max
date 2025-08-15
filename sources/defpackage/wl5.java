package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wl5  reason: default package */
public final class wl5 implements Drawable.Callback {
    public final /* synthetic */ yl5 X;
    public final WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ArrayList o = new ArrayList();

    public wl5(yl5 yl5, WeakHashMap weakHashMap) {
        this.X = yl5;
        this.a = weakHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0016 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invalidateDrawable(android.graphics.drawable.Drawable r12) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicBoolean r12 = r11.c
            r0 = 0
            r1 = 1
            boolean r2 = r12.compareAndSet(r0, r1)
            if (r2 == 0) goto L_0x00b6
            java.util.WeakHashMap r2 = r11.a
            java.util.Set r3 = r2.keySet()
            java.util.ArrayList r4 = r11.o
            java.util.Iterator r3 = r3.iterator()
        L_0x0016:
            boolean r5 = r3.hasNext()
            yl5 r6 = r11.X
            if (r5 == 0) goto L_0x0057
            java.lang.Object r5 = r3.next()
            r7 = r5
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.util.ArrayList r8 = defpackage.qqe.a
            java.lang.CharSequence r8 = r7.getText()
            boolean r9 = r8 instanceof android.text.Spanned
            if (r9 == 0) goto L_0x0032
            android.text.Spanned r8 = (android.text.Spanned) r8
            goto L_0x0033
        L_0x0032:
            r8 = 0
        L_0x0033:
            if (r8 == 0) goto L_0x004f
            int r7 = r7.length()
            java.lang.Class r9 = r6.getClass()
            java.lang.Object[] r7 = r8.getSpans(r0, r7, r9)
            if (r7 == 0) goto L_0x004f
            int r8 = r7.length
            r9 = r0
        L_0x0045:
            if (r9 >= r8) goto L_0x004f
            r10 = r7[r9]
            if (r10 != r6) goto L_0x004d
            r6 = r1
            goto L_0x0050
        L_0x004d:
            int r9 = r9 + r1
            goto L_0x0045
        L_0x004f:
            r6 = r0
        L_0x0050:
            r6 = r6 ^ r1
            if (r6 == 0) goto L_0x0016
            r4.add(r5)
            goto L_0x0016
        L_0x0057:
            int r3 = r4.size()
            r5 = r0
        L_0x005c:
            if (r5 >= r3) goto L_0x0069
            java.lang.Object r7 = r4.get(r5)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.c(r7)
            int r5 = r5 + r1
            goto L_0x005c
        L_0x0069:
            r4.clear()
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0074:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00b6
            java.lang.Object r3 = r2.next()
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            boolean r4 = r4.isCurrentThread()
            if (r4 == 0) goto L_0x009e
            boolean r4 = r6.b
            if (r4 == 0) goto L_0x0097
            tl5 r4 = new tl5
            r4.<init>((android.view.View) r3, (android.widget.TextView) r3, (defpackage.yl5) r6, (defpackage.wl5) r11)
            defpackage.pla.a(r3, r4)
            goto L_0x0074
        L_0x0097:
            r3.invalidate()
            r12.set(r0)
            goto L_0x0074
        L_0x009e:
            android.os.Handler r4 = r3.getHandler()
            if (r4 == 0) goto L_0x00ad
            tl5 r5 = new tl5
            r5.<init>((defpackage.yl5) r6, (android.widget.TextView) r3, (defpackage.wl5) r11, (int) r0)
            r4.postAtFrontOfQueue(r5)
            goto L_0x0074
        L_0x00ad:
            tl5 r4 = new tl5
            r4.<init>((defpackage.yl5) r6, (android.widget.TextView) r3, (defpackage.wl5) r11, (int) r1)
            r3.post(r4)
            goto L_0x0074
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl5.invalidateDrawable(android.graphics.drawable.Drawable):void");
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        yl5 yl5 = this.X;
        boolean z = yl5.b;
        WeakHashMap weakHashMap = this.a;
        if (z) {
            v05 v05 = new v05((Object) runnable, (Object) this, (Object) yl5, 4);
            this.b.put(runnable, v05);
            TextView textView = (TextView) x53.h0(weakHashMap.keySet());
            if (textView != null) {
                textView.postDelayed(v05, j - SystemClock.uptimeMillis());
                return;
            }
            return;
        }
        TextView textView2 = (TextView) x53.h0(weakHashMap.keySet());
        if (textView2 != null) {
            textView2.postDelayed(runnable, j - SystemClock.uptimeMillis());
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        boolean z = this.X.b;
        WeakHashMap weakHashMap = this.a;
        if (z) {
            Runnable runnable2 = (Runnable) this.b.remove(runnable);
            for (TextView textView : weakHashMap.keySet()) {
                if (Looper.getMainLooper().isCurrentThread()) {
                    textView.removeCallbacks(runnable2);
                } else {
                    Handler handler = textView.getHandler();
                    if (handler != null) {
                        handler.postAtFrontOfQueue(new ul5(textView, runnable2, 1));
                    } else {
                        textView.post(new vl5(textView, runnable2, 1));
                    }
                }
            }
            return;
        }
        for (TextView textView2 : weakHashMap.keySet()) {
            if (Looper.getMainLooper().isCurrentThread()) {
                textView2.removeCallbacks(runnable);
            } else {
                Handler handler2 = textView2.getHandler();
                if (handler2 != null) {
                    handler2.postAtFrontOfQueue(new ul5(textView2, runnable, 0));
                } else {
                    textView2.post(new vl5(textView2, runnable, 0));
                }
            }
        }
    }
}
