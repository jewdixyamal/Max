package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: od  reason: default package */
public final class od implements gq1, ri0 {
    public Object X;
    public Object Y;
    public boolean a;
    public Object b;
    public Object c;
    public Object o;

    /* JADX WARNING: type inference failed for: r0v1, types: [cag, java.lang.Object, c8d] */
    public static cag b(xv1 xv1) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) xv1.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError unused) {
                range = null;
            }
            if (range != null) {
                return new zd(xv1);
            }
        }
        ? obj = new Object();
        obj.b = null;
        obj.o = null;
        obj.a = xv1;
        return obj;
    }

    public IOException a(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            g(iOException);
        }
        dp3 dp3 = (dp3) this.o;
        if (z2) {
            if (iOException != null) {
                dp3.getClass();
            } else {
                dp3.getClass();
            }
        }
        if (z) {
            if (iOException != null) {
                dp3.getClass();
            } else {
                dp3.getClass();
            }
        }
        return ((b8c) this.c).i(this, z2, z, iOException);
    }

    public wj8 c(int i) {
        HashMap hashMap = (HashMap) this.o;
        wj8 wj8 = (wj8) hashMap.get(Integer.valueOf(i));
        if (wj8 != null) {
            return wj8;
        }
        wj8 wj82 = (wj8) d(i).get();
        wj82.d((b46) ((mbe) this.Y));
        wj82.b(this.a);
        hashMap.put(Integer.valueOf(i), wj82);
        return wj82;
    }

    public jde d(int i) {
        jde jde;
        jde kc4;
        HashMap hashMap = (HashMap) this.c;
        jde jde2 = (jde) hashMap.get(Integer.valueOf(i));
        if (jde2 != null) {
            return jde2;
        }
        q24 q24 = (q24) this.X;
        q24.getClass();
        Class<wj8> cls = wj8.class;
        if (i != 0) {
            if (i == 1) {
                jde = new kc4(Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(cls), q24, 1);
            } else if (i == 2) {
                jde = new kc4(HlsMediaSource$Factory.class.asSubclass(cls), q24, 2);
            } else if (i == 3) {
                kc4 = new lc4(0, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(cls));
            } else if (i == 4) {
                jde = new kc4(this, q24, 3);
            } else {
                throw new IllegalArgumentException(zr6.h(i, "Unrecognized contentType: "));
            }
            hashMap.put(Integer.valueOf(i), jde);
            return jde;
        }
        kc4 = new kc4(DashMediaSource$Factory.class.asSubclass(cls), q24, 0);
        jde = kc4;
        hashMap.put(Integer.valueOf(i), jde);
        return jde;
    }

    public xic e(boolean z) {
        try {
            xic e = ((u45) this.Y).e(z);
            if (e != null) {
                e.m = this;
            }
            return e;
        } catch (IOException e2) {
            ((dp3) this.o).getClass();
            g(e2);
            throw e2;
        }
    }

    public void f(lq1 lq1, gag gag) {
        sa0 e;
        if (!this.a) {
            synchronized (((hag) this.o)) {
                ((hag) this.o).f(1.0f);
                e = sa0.e((hag) this.o);
            }
            h(e);
            lq1.d(new Exception("Camera is not active."));
            return;
        }
        ((cag) this.Y).f(gag.c(), lq1);
        ((st1) this.b).A();
    }

    public void g(IOException iOException) {
        ((v45) this.X).b(iOException);
        f8c f = ((u45) this.Y).f();
        b8c b8c = (b8c) this.c;
        synchronized (f) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(f.f != null) || (iOException instanceof ConnectionShutdownException)) {
                        f.i = true;
                        if (f.l == 0) {
                            f8c.d(b8c.A0, f.q, iOException);
                            f.k++;
                        }
                    }
                } else if (((StreamResetException) iOException).a == 8) {
                    int i = f.m + 1;
                    f.m = i;
                    if (i > 1) {
                        f.i = true;
                        f.k++;
                    }
                } else if (((StreamResetException) iOException).a != 9 || !b8c.x0) {
                    f.i = true;
                    f.k++;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void h(sa0 sa0) {
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        ci9 ci9 = (ci9) this.X;
        if (myLooper == mainLooper) {
            ci9.k(sa0);
        } else {
            ci9.i(sa0);
        }
    }

    public void i(ph3 ph3) {
        kdg kdg = (kdg) ((ie6) this.Y).u0.get((zk) this.c);
        if (kdg != null) {
            kdg.n(ph3);
        }
    }

    public void m(b8c b8c, yic yic) {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            boolean z = !yic.m();
            if (z) {
                int i = yic.o;
                ad adVar = (ad) ((qd) this.Y).c.a.getValue();
                if (!adVar.a().c()) {
                    adVar.g("HTTP_ERROR", String.valueOf(i));
                }
                if (i == 403 || i == 400) {
                    Pattern pattern = qd.d;
                    Locale locale = Locale.ENGLISH;
                    hm9.p("qd", "Url expired try to get new one. Code = " + i, (Throwable) null);
                    ((pd) this.c).b.d();
                    qd.h((qd) this.Y, (pd) this.c, (File) this.o);
                    qd.g((qd) this.Y, (pd) this.c, ((File) this.o).getAbsolutePath());
                    s5c.m(yic);
                }
            }
            i8c i8c = yic.Z;
            long n = i8c == null ? 0 : i8c.n();
            if (!z && i8c != null) {
                if (i8c.n() >= 0) {
                    Pattern pattern2 = qd.d;
                    hm9.m("qd", "response content length: " + n, new Object[0]);
                    long length = ((File) this.o).length();
                    long j = n + length;
                    InputStream m = i8c.m();
                    try {
                        fileOutputStream = new FileOutputStream((File) this.o, true);
                        try {
                            int i2 = bh3.$EnumSwitchMapping$0[((qd) this.Y).c.c().ordinal()];
                            byte[] bArr = new byte[((i2 == 1 || i2 == 2) ? 32768 : i2 != 3 ? 4096 : 16384)];
                            while (true) {
                                int read = m.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                length += (long) read;
                                synchronized (((pd) this.c).a) {
                                    try {
                                        Iterator it = ((pd) this.c).a.iterator();
                                        while (it.hasNext()) {
                                            ((fq6) it.next()).j((((float) length) / ((float) j)) * 100.0f, j);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            fileOutputStream.flush();
                            qd qdVar = (qd) this.Y;
                            File e = qd.e(qdVar, (File) this.o, (File) this.X, this.a ? qd.f(qdVar, yic) : null);
                            synchronized (((pd) this.c).a) {
                                try {
                                    Iterator it2 = ((pd) this.c).a.iterator();
                                    while (it2.hasNext()) {
                                        fq6 fq6 = (fq6) it2.next();
                                        Pattern pattern3 = qd.d;
                                        hm9.m("qd", "File download completed", new Object[0]);
                                        fq6.e(e);
                                    }
                                } catch (Throwable th2) {
                                    while (true) {
                                    }
                                    throw th2;
                                }
                            }
                            qd.g((qd) this.Y, (pd) this.c, ((File) this.o).getAbsolutePath());
                            s5c.m(yic);
                            s5c.n(m);
                        } catch (Exception e2) {
                            e = e2;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream2 = m;
                            th = th;
                            qd.g((qd) this.Y, (pd) this.c, ((File) this.o).getAbsolutePath());
                            s5c.m(yic);
                            s5c.n(inputStream2);
                            s5c.m(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream = null;
                        Exception exc = e;
                        inputStream = m;
                        e = exc;
                        try {
                            Pattern pattern4 = qd.d;
                            hm9.p("qd", "exception while downloading file: " + e.getMessage(), (Throwable) null);
                            synchronized (((pd) this.c).a) {
                                try {
                                    Iterator it3 = ((pd) this.c).a.iterator();
                                    while (it3.hasNext()) {
                                        ((fq6) it3.next()).f();
                                    }
                                } catch (Throwable th4) {
                                    while (true) {
                                    }
                                    throw th4;
                                }
                            }
                            qd.g((qd) this.Y, (pd) this.c, ((File) this.o).getAbsolutePath());
                            s5c.m(yic);
                            s5c.n(inputStream);
                            s5c.m(fileOutputStream);
                            return;
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream2 = inputStream;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        fileOutputStream = null;
                        inputStream2 = m;
                        th = th;
                        qd.g((qd) this.Y, (pd) this.c, ((File) this.o).getAbsolutePath());
                        s5c.m(yic);
                        s5c.n(inputStream2);
                        s5c.m(fileOutputStream);
                        throw th;
                    }
                    s5c.m(fileOutputStream);
                    return;
                }
            }
            Pattern pattern5 = qd.d;
            Locale locale2 = Locale.ENGLISH;
            hm9.p("qd", "responseFailed = " + z + " response.body().contentLength() = " + n + " tempOutputFile.length() " + ((File) this.o).length(), (Throwable) null);
            ((qd) this.Y).c.d("Exception in FileDownloader onResponse");
            if (qd.d((qd) this.Y, yic, ((File) this.o).length())) {
                qd qdVar2 = (qd) this.Y;
                File e4 = qd.e(qdVar2, (File) this.o, (File) this.X, this.a ? qd.f(qdVar2, yic) : null);
                synchronized (((pd) this.c).a) {
                    try {
                        Iterator it4 = ((pd) this.c).a.iterator();
                        while (it4.hasNext()) {
                            fq6 fq62 = (fq6) it4.next();
                            Pattern pattern6 = qd.d;
                            hm9.m("qd", "File already fully downloaded", new Object[0]);
                            fq62.e(e4);
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                qd.g((qd) this.Y, (pd) this.c, ((File) this.o).getAbsolutePath());
                s5c.m(yic);
            }
            hm9.p("qd", "server response code = " + yic.o + ", download failed", (Throwable) null);
            synchronized (((pd) this.c).a) {
                try {
                    Iterator it5 = ((pd) this.c).a.iterator();
                    while (it5.hasNext()) {
                        ((fq6) it5.next()).a();
                    }
                } catch (Throwable th8) {
                    while (true) {
                    }
                    throw th8;
                }
            }
            ((qd) this.Y).getClass();
            ((File) this.o).delete();
            qd.g((qd) this.Y, (pd) this.c, ((File) this.o).getAbsolutePath());
            s5c.m(yic);
        } catch (Exception e5) {
            e = e5;
            inputStream = null;
            fileOutputStream = null;
        } catch (Throwable th9) {
            th = th9;
            fileOutputStream = null;
            qd.g((qd) this.Y, (pd) this.c, ((File) this.o).getAbsolutePath());
            s5c.m(yic);
            s5c.n(inputStream2);
            s5c.m(fileOutputStream);
            throw th;
        }
    }

    public void q(b8c b8c, IOException iOException) {
        try {
            Pattern pattern = qd.d;
            hm9.r("qd", iOException, "exception while download request: %s", (mhc) this.b);
            ad adVar = (ad) ((qd) this.Y).c.a.getValue();
            if (!adVar.a().c()) {
                adVar.g("HTTP_ERROR", iOException.getClass().getSimpleName());
            }
            synchronized (((pd) this.c).a) {
                try {
                    Iterator it = ((pd) this.c).a.iterator();
                    while (it.hasNext()) {
                        ((fq6) it.next()).f();
                    }
                } catch (Throwable th) {
                    while (true) {
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                Pattern pattern2 = qd.d;
                hm9.p("qd", "onFailure: failed to process on failure", th2);
            } catch (Throwable th3) {
                qd.g((qd) this.Y, (pd) this.c, ((File) this.o).getAbsolutePath());
                throw th3;
            }
        }
        qd.g((qd) this.Y, (pd) this.c, ((File) this.o).getAbsolutePath());
    }

    public void s(ph3 ph3) {
        ((ie6) this.Y).x0.post(new i76((Object) this, (Object) ph3, false, 28));
    }
}
