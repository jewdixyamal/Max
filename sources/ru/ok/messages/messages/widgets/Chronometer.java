package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Formatter;
import java.util.Locale;

public class Chronometer extends AppCompatTextView {
    public Formatter A0;
    public Locale B0;
    public final Object[] C0 = new Object[1];
    public StringBuilder D0;
    public final StringBuilder E0 = new StringBuilder(8);
    public boolean F0;
    public final re G0 = new re(10, this);
    public long u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public String z0;

    public Chronometer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b3c.Chronometer, 0, 0);
        setFormat(obtainStyledAttributes.getString(b3c.Chronometer_format));
        setCountDown(obtainStyledAttributes.getBoolean(b3c.Chronometer_countDown, false));
        obtainStyledAttributes.recycle();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.u0 = elapsedRealtime;
        k(elapsedRealtime);
    }

    public CharSequence getAccessibilityClassName() {
        return Chronometer.class.getName();
    }

    public long getBase() {
        return this.u0;
    }

    public String getFormat() {
        return this.z0;
    }

    public g13 getOnChronometerTickListener() {
        return null;
    }

    public final void j() {
        boolean z = this.v0 && this.w0 && isShown();
        if (z != this.x0) {
            re reVar = this.G0;
            if (z) {
                k(SystemClock.elapsedRealtime());
                postDelayed(reVar, 1000);
            } else {
                removeCallbacks(reVar);
            }
            this.x0 = z;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|(1:24)) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r2.y0 == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r2.y0 = true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void k(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.F0     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x000b
            long r0 = r2.u0     // Catch:{ all -> 0x0009 }
            long r0 = r0 - r3
            goto L_0x000f
        L_0x0009:
            r3 = move-exception
            goto L_0x0064
        L_0x000b:
            long r0 = r2.u0     // Catch:{ all -> 0x0009 }
            long r0 = r3 - r0
        L_0x000f:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r3
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0019
            long r0 = -r0
        L_0x0019:
            java.lang.StringBuilder r3 = r2.E0     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = android.text.format.DateUtils.formatElapsedTime(r3, r0)     // Catch:{ all -> 0x0009 }
            java.lang.String r4 = r2.z0     // Catch:{ all -> 0x0009 }
            if (r4 == 0) goto L_0x005f
            java.util.Locale$Category r4 = java.util.Locale.Category.DISPLAY     // Catch:{ all -> 0x0009 }
            java.util.Locale r4 = java.util.Locale.getDefault(r4)     // Catch:{ all -> 0x0009 }
            java.util.Formatter r0 = r2.A0     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x0035
            java.util.Locale r0 = r2.B0     // Catch:{ all -> 0x0009 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0009 }
            if (r0 != 0) goto L_0x0040
        L_0x0035:
            r2.B0 = r4     // Catch:{ all -> 0x0009 }
            java.util.Formatter r0 = new java.util.Formatter     // Catch:{ all -> 0x0009 }
            java.lang.StringBuilder r1 = r2.D0     // Catch:{ all -> 0x0009 }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0009 }
            r2.A0 = r0     // Catch:{ all -> 0x0009 }
        L_0x0040:
            java.lang.StringBuilder r4 = r2.D0     // Catch:{ all -> 0x0009 }
            r0 = 0
            r4.setLength(r0)     // Catch:{ all -> 0x0009 }
            java.lang.Object[] r4 = r2.C0     // Catch:{ all -> 0x0009 }
            r4[r0] = r3     // Catch:{ all -> 0x0009 }
            java.util.Formatter r0 = r2.A0     // Catch:{ IllegalFormatException -> 0x0058 }
            java.lang.String r1 = r2.z0     // Catch:{ IllegalFormatException -> 0x0058 }
            r0.format(r1, r4)     // Catch:{ IllegalFormatException -> 0x0058 }
            java.lang.StringBuilder r4 = r2.D0     // Catch:{ IllegalFormatException -> 0x0058 }
            java.lang.String r3 = r4.toString()     // Catch:{ IllegalFormatException -> 0x0058 }
            goto L_0x005f
        L_0x0058:
            boolean r4 = r2.y0     // Catch:{ all -> 0x0009 }
            if (r4 != 0) goto L_0x005f
            r4 = 1
            r2.y0 = r4     // Catch:{ all -> 0x0009 }
        L_0x005f:
            r2.setText(r3)     // Catch:{ all -> 0x0009 }
            monitor-exit(r2)
            return
        L_0x0064:
            monitor-exit(r2)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.messages.widgets.Chronometer.k(long):void");
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0 = false;
        j();
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        j();
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.v0 = i == 0;
        j();
    }

    public void setBase(long j) {
        this.u0 = j;
        k(SystemClock.elapsedRealtime());
    }

    public void setCountDown(boolean z) {
        this.F0 = z;
        k(SystemClock.elapsedRealtime());
    }

    public void setFormat(String str) {
        this.z0 = str;
        if (str != null && this.D0 == null) {
            this.D0 = new StringBuilder(str.length() * 2);
        }
    }

    public void setOnChronometerTickListener(g13 g13) {
    }

    public void setStarted(boolean z) {
        this.w0 = z;
        j();
    }
}
