package androidx.media3.exoplayer;

import android.os.Bundle;
import androidx.media3.common.PlaybackException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

public final class ExoPlaybackException extends PlaybackException {
    public static final String B0 = Integer.toString(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, 36);
    public static final String C0 = Integer.toString(1002, 36);
    public static final String D0 = Integer.toString(1003, 36);
    public static final String E0 = Integer.toString(1004, 36);
    public static final String F0 = Integer.toString(1005, 36);
    public static final String G0 = Integer.toString(1006, 36);
    public final boolean A0;
    public final int u0;
    public final String v0;
    public final int w0;
    public final qy5 x0;
    public final int y0;
    public final yj8 z0;

    static {
        int i = oaf.a;
    }

    public ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, i2, (String) null, -1, (qy5) null, 4, false);
    }

    public final boolean a(PlaybackException playbackException) {
        if (!super.a(playbackException)) {
            return false;
        }
        int i = oaf.a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.u0 == exoPlaybackException.u0 && oaf.a(this.v0, exoPlaybackException.v0) && this.w0 == exoPlaybackException.w0 && oaf.a(this.x0, exoPlaybackException.x0) && this.y0 == exoPlaybackException.y0 && oaf.a(this.z0, exoPlaybackException.z0) && this.A0 == exoPlaybackException.A0;
    }

    public final Bundle c() {
        Bundle c = super.c();
        c.putInt(B0, this.u0);
        c.putString(C0, this.v0);
        c.putInt(D0, this.w0);
        qy5 qy5 = this.x0;
        if (qy5 != null) {
            c.putBundle(E0, qy5.d(false));
        }
        c.putInt(F0, this.y0);
        c.putBoolean(G0, this.A0);
        return c;
    }

    public final ExoPlaybackException d(yj8 yj8) {
        String message = getMessage();
        int i = oaf.a;
        return new ExoPlaybackException(message, getCause(), this.a, this.u0, this.v0, this.w0, this.x0, this.y0, yj8, this.b, this.A0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, qy5 qy5, int i4, yj8 yj8, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        int i5 = i2;
        boolean z2 = z;
        boolean z3 = false;
        fm9.f(!z2 || i5 == 1);
        fm9.f((th != null || i5 == 3) ? true : z3);
        this.u0 = i5;
        this.v0 = str2;
        this.w0 = i3;
        this.x0 = qy5;
        this.y0 = i4;
        this.z0 = yj8;
        this.A0 = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExoPlaybackException(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.qy5 r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L_0x0044
            r0 = 1
            if (r4 == r0) goto L_0x0015
            r0 = 3
            if (r4 == r0) goto L_0x0012
            java.lang.String r0 = "Unexpected runtime error"
        L_0x000b:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x004c
        L_0x0012:
            java.lang.String r0 = "Remote error"
            goto L_0x000b
        L_0x0015:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = r17
            r0.append(r5)
            java.lang.String r1 = " error, index="
            r0.append(r1)
            r6 = r18
            r0.append(r6)
            java.lang.String r1 = ", format="
            r0.append(r1)
            r7 = r19
            r0.append(r7)
            java.lang.String r1 = ", format_supported="
            r0.append(r1)
            java.lang.String r1 = defpackage.oaf.z(r20)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x004c
        L_0x0044:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L_0x004c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = ": null"
            java.lang.String r0 = defpackage.au1.g(r0, r1)
        L_0x0059:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlaybackException.<init>(int, java.lang.Throwable, int, java.lang.String, int, qy5, int, boolean):void");
    }
}
