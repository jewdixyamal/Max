package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: o60  reason: default package */
public final class o60 implements ybc, MediaRecorder.OnInfoListener {
    public MediaRecorder X;
    public ubc Y;
    public volatile String Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;

    public o60(je7 je7, je7 je72, je7 je73) {
        khe d = f9g.a.getAccessor().d(y7d.class);
        this.a = je7;
        this.b = d;
        this.c = je72;
        this.o = je73;
    }

    public final int a() {
        MediaRecorder mediaRecorder = this.X;
        if (mediaRecorder == null) {
            return 0;
        }
        try {
            return mediaRecorder.getMaxAmplitude();
        } catch (RuntimeException e) {
            hm9.p(o60.class.getName(), "Can't getRecorderAmplitude illegal state", e);
            return 0;
        }
    }

    public final boolean b() {
        return this.X != null;
    }

    public final boolean c(int i, int i2, Integer num, String str) {
        try {
            MediaRecorder j = Build.VERSION.SDK_INT >= 31 ? m30.j((Context) this.a.getValue()) : new MediaRecorder();
            this.X = j;
            j.setAudioSource(1);
            j.setOutputFormat(6);
            j.setAudioEncoder(i);
            j.setOnInfoListener(this);
            qyc qyc = (qyc) ((y7d) this.b.getValue());
            qyc.getClass();
            j.setMaxDuration(((int) qyc.q(PmsKey.f64maxaudiolength, (long) 3600)) * 1000);
            j.setAudioSamplingRate(i2);
            if (num != null) {
                j.setAudioEncodingBitRate(num.intValue());
            }
            j.setAudioChannels(1);
            j.setOutputFile(str);
            j.prepare();
            j.start();
            return true;
        } catch (RuntimeException e) {
            String name = o60.class.getName();
            ir6 ir6 = hm9.m;
            if (ir6 == null || !ir6.c()) {
                return false;
            }
            us7 us7 = us7.s0;
            String message = e.getMessage();
            ir6.d(us7, name, message + " encoder: " + i, (Throwable) null);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r0 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        r4.X = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        if (r0 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r4 = this;
            android.media.MediaRecorder r0 = r4.X
            if (r0 == 0) goto L_0x0032
            r1 = 0
            if (r0 == 0) goto L_0x002d
            r0.stop()     // Catch:{ RuntimeException -> 0x000d }
            goto L_0x002d
        L_0x000b:
            r0 = move-exception
            goto L_0x0023
        L_0x000d:
            r0 = move-exception
            java.lang.Class<o60> r2 = defpackage.o60.class
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x000b }
            java.lang.String r3 = "Can't stopRecordAudio"
            defpackage.hm9.p(r2, r3, r0)     // Catch:{ all -> 0x000b }
            android.media.MediaRecorder r0 = r4.X
            if (r0 == 0) goto L_0x0020
        L_0x001d:
            r0.release()
        L_0x0020:
            r4.X = r1
            goto L_0x0032
        L_0x0023:
            android.media.MediaRecorder r2 = r4.X
            if (r2 == 0) goto L_0x002a
            r2.release()
        L_0x002a:
            r4.X = r1
            throw r0
        L_0x002d:
            android.media.MediaRecorder r0 = r4.X
            if (r0 == 0) goto L_0x0020
            goto L_0x001d
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o60.d():void");
    }

    public final void e() {
        MediaRecorder mediaRecorder = this.X;
        if (mediaRecorder != null) {
            mediaRecorder.resume();
        }
    }

    public final Object f(long j, Continuation continuation) {
        String absolutePath = ((kk5) ((zi5) this.o.getValue())).d(j).getAbsolutePath();
        e5f e5f = e5f.a;
        if (absolutePath == null) {
            hm9.m(o60.class.getName(), "Couldn't create a file for the audio message", new Object[0]);
            return e5f;
        }
        this.Z = absolutePath;
        if (!c(3, 90000, new Integer(60000), absolutePath) && !c(3, 45000, new Integer(30000), absolutePath) && !c(3, 16000, (Integer) null, absolutePath)) {
            c(0, 16000, (Integer) null, absolutePath);
        }
        return e5f;
    }

    public final Object g(xbc xbc) {
        String str;
        if (!(xbc instanceof vbc) || (str = this.Z) == null) {
            return null;
        }
        vbc vbc = (vbc) xbc;
        return new j50(str, vbc.a, vbc.b);
    }

    public final void h() {
        MediaRecorder mediaRecorder = this.X;
        if (mediaRecorder != null) {
            mediaRecorder.pause();
        }
    }

    public final boolean i() {
        return ((eua) this.c.getValue()).b(eua.h);
    }

    public final void j(cbc cbc) {
        this.Y = cbc;
    }

    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        ubc ubc;
        if ((i == 800 || i == 801) && (ubc = this.Y) != null) {
            ((cbc) ubc).y();
        }
    }
}
